package com.gacci.gacci_data_generator.service;

import com.gacci.gacci_data_generator.model.EstadoCivilCount;
import com.gacci.gacci_data_generator.model.FaixaEtariaCount;
import com.gacci.gacci_data_generator.model.FaixaEtariaResult;
import com.gacci.gacci_data_generator.model.NovosPacientes;
import com.gacci.gacci_data_generator.repository.DashboardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DashboardService {

    private DashboardRepository  repository;


    public List<NovosPacientes> getNovosPacientes(){
        Set<NovosPacientes> todos = new TreeSet<>();

        LocalDate d = LocalDate.now().withDayOfMonth(1);
        for(int i =1;i<=12;i++){

            todos.add( new NovosPacientes(d.getMonthValue(), d.getYear(), 0));
            d = d.minusMonths(1);
        }

        List<NovosPacientes> novosPacientes = repository.getNovosPacientes();
        novosPacientes.forEach(todos::remove);
        todos.addAll(novosPacientes);

        novosPacientes=  new ArrayList<>(todos);
        while(novosPacientes.size() > 12){
            novosPacientes.remove(0);
        }

        return novosPacientes;
    }

    public List<EstadoCivilCount> getEstadoCivil(){
        return repository.getEstadoCivil();
    }


    public List<FaixaEtariaCount> getFaixaEtaria() {
        FaixaEtariaResult faixaEtariaResult = repository.getFaixaEtaria();
        List<FaixaEtariaCount> faixaEtariaCounts = new ArrayList<>();
        faixaEtariaCounts.add(new FaixaEtariaCount("0-15", faixaEtariaResult.getAtequinze()));;
        faixaEtariaCounts.add(new FaixaEtariaCount("16-30", faixaEtariaResult.getQuinzetrinta()));;
        faixaEtariaCounts.add(new FaixaEtariaCount("31-45", faixaEtariaResult.getTrintaqrcinco()));;
        faixaEtariaCounts.add(new FaixaEtariaCount("45-60", faixaEtariaResult.getQrcincosessenta()));;
        faixaEtariaCounts.add(new FaixaEtariaCount("60>", faixaEtariaResult.getSessenta()));;
        return faixaEtariaCounts;

    }
}
