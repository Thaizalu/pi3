select  sum(case when (idade <=15) then (quantidade) else 0  end) as atequinze,
		sum(case when (idade >15 and idade <=30) then (quantidade) else 0 end) as quinzetrinta,
		sum(case when (idade >30 and idade <= 45) then  (quantidade) else 0 end) as trintaqrcinco,
		sum(case when (idade >45 and idade <= 60) then (quantidade) else 0 end ) as qrcincosessenta,
		sum(case when (idade >60) then (quantidade) else 0 end ) as sessenta
from(
select  TIMESTAMPDIFF(YEAR, DATE(nascimento), CURDATE()) as idade,
 count(*) as quantidade
 from pessoa p
group by TIMESTAMPDIFF(YEAR, DATE(nascimento), CURDATE())
order by count(*) desc, idade asc
) as aux