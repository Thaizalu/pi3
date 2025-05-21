select YEAR(datacadastro) AS ano,
    MONTH(datacadastro) AS mes,
    count(*) as quantidade
   FROM pessoa p
   where datacadastro >= datacadastro-365
  group by YEAR(datacadastro) ,    MONTH(datacadastro)
order by YEAR(datacadastro) DESC ,    MONTH(datacadastro) DESC
limit 12