insert into gameobject
values (1, 62, 75, 4, 8, 18, 0),
       (2, 0, 30, 128, 4, 0, 4),
       (3, 40, 30, 20, 4, 0, 4),
       (4, 20, 14, 4, 8, 0, 7),
       (5, 60, 34, 4, 8, 0, 7),
       (6, 12, 72, 4, 8, 0, 7),
       (7, 62, 90, 4, 4, 0, 20),
       (8, 62, 86, 4, 4, 0, 20),
       (9, 62, 82, 4, 4, 0, 20),
       (10, 62, 76, 4, 4, 0, 20),
       (11, 20, 8, 4, 4, 0, 6),
       (12, 60, 28, 4, 4, 0, 6),
       (13, 12, 66, 4, 4, 0, 6),
       (14, 60, 6, 4, 4, 0, 6);
       
insert into player
values (1, default, 4, default, 'right');

insert into wall
values (1, default, 40);

insert into passage
values (1);

insert into enemy
values (1, default, 68, default),
       (2, 1, 0, default),
       (3, 3, 9, default);
       
insert into bullet
values (1),
       (2),
       (3),
       (4);
       
insert into enemy_bullet
values (1),
       (2),
       (3),
       (4);