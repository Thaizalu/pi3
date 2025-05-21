package com.gacci.gacci_data_generator.controller;

import com.gacci.gacci_data_generator.model.EstadoCivilCount;
import com.gacci.gacci_data_generator.model.FaixaEtariaCount;
import com.gacci.gacci_data_generator.model.NovosPacientes;
import com.gacci.gacci_data_generator.service.DashboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
@RequiredArgsConstructor
public class DashboardController {

    private final DashboardService dashboardService;

    // linha temporal
    @GetMapping("/novosPacientes")
    public List<NovosPacientes> getNovosPacientes(){
        return dashboardService.getNovosPacientes();
    }

    // pizza
    @GetMapping("/estadocivil")
    public List<EstadoCivilCount> getEstadoCivil(){
        return dashboardService.getEstadoCivil();
    }



    // Barra
    @GetMapping("/faixaEtaria")
    public List<FaixaEtariaCount> getFaixaEtaria(){
        return dashboardService.getFaixaEtaria();
    }


}
