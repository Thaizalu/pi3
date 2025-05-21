package com.gacci.gacci_data_generator.repository;

import com.gacci.gacci_data_generator.model.EstadoCivilCount;
import com.gacci.gacci_data_generator.model.FaixaEtariaCount;
import com.gacci.gacci_data_generator.model.FaixaEtariaResult;
import com.gacci.gacci_data_generator.model.NovosPacientes;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.locator.UseClasspathSqlLocator;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@UseClasspathSqlLocator
public interface DashboardRepository {

    @SqlQuery
    @RegisterBeanMapper(NovosPacientes.class)
    public List<NovosPacientes> getNovosPacientes();


    @SqlQuery
    @RegisterBeanMapper(EstadoCivilCount.class)
    List<EstadoCivilCount> getEstadoCivil();

    @SqlQuery
    @RegisterBeanMapper(FaixaEtariaResult.class)
    FaixaEtariaResult getFaixaEtaria();
}
