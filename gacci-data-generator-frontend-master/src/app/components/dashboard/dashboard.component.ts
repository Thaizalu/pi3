import {Component, OnInit} from '@angular/core';

import {ChartModule} from 'primeng/chart';
import {Router} from "@angular/router";
import {HttpClient} from "@angular/common/http";
import {PessoaService} from "../../services/pessoa.service";
import {DashboardService} from "../../services/dashboard.service";
import {NovosPacientes} from "../../model/novosPacientes";
import {FaixaEtariaCount} from "../../model/faixaEtariaCount";
import {EstadoCivilCount} from "../../model/estadoCivilCount";

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [ChartModule],
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.css'
})
export class DashboardComponent implements OnInit {

  constructor(private dashboardService: DashboardService) {
  }

  crescimentoPacientesData: any;
  pacientesFaixaEtariaData: any;
  estadoCivilFaixaData: any;

  ngOnInit(): void {
    this.initCrescimentoPacientesData();
    this.initPacientesFaixaEtariaData();
    this.initEstadoCivilData();
  }

  initCrescimentoPacientesData() {

    this.dashboardService.getNovosPacientes().subscribe((data: NovosPacientes[]) => {
      const meses = data.map(item => item.mes + "/" + item.ano);
      const quantidades = data.map(item => item.quantidade);

      this.crescimentoPacientesData = {
        labels: meses,
        datasets: [
          {
            label: 'Pacientes',
            data: quantidades,
            fill: false,
            borderColor: '#42A5F5',
            tension: 0.1
          }
        ]
      }
    });
  }

  initPacientesFaixaEtariaData() {

    this.dashboardService.getFaixaEtaria().subscribe((data: FaixaEtariaCount[]) => {


      const idades = data.map(item => item.faixaEtaria);
      const quantidades = data.map(item => item.quantidade);

      this.pacientesFaixaEtariaData = {
        labels: idades,
        datasets: [
          {
            label: "Faixa etária",
            data: quantidades,
          }
        ]
      }
    });
  }

  initEstadoCivilData() {
    this.dashboardService.getEstadocivil().subscribe((data: EstadoCivilCount[]) => {


      const estadoCivil = data.map(item => item.estadoCivil );
      const quantidades = data.map(item => item.quantidade);


      this.estadoCivilFaixaData = {
        labels: estadoCivil,
        datasets: [
          {
            label: 'Estado civil',
            data: quantidades,
          }
        ]
      };
    });
  }
}
