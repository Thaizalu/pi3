
 select estado_civil as estadoCivil, count(*) as quantidade 
 from pessoa p group by estado_civil
 order by count(*) desc, estado_civil 