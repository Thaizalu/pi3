package com.gacci.gacci_data_generator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NovosPacientes implements Comparable<NovosPacientes> {

    private Integer mes;
    private Integer ano;
    private Integer quantidade;


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NovosPacientes that = (NovosPacientes) o;
        return Objects.equals(mes, that.mes) && Objects.equals(ano, that.ano);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mes, ano);
    }

    @Override
    public int compareTo(NovosPacientes o) {

        if (o.ano.equals(ano)) {
            return mes.compareTo(o.mes);
        }

        return ano.compareTo(o.ano);
    }
}
