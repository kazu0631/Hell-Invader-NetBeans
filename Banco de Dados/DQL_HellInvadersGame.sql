select * from gameobject where vely > 5;
select * from gameobject where height < 8;
select * from gameobject where coordx >= 60;
select * from enemy where hp between 2 and 4;
select * from gameobject where id_gameobject in (1, 2, 3, 5, 8, 13)
order by coordy;