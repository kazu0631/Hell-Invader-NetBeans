use hellinvader;

create table GameObject (
    ID_GameObject int primary key,
    coordX int not null,
    coordY int not null,
    width int,
    height int,
    velX int,
    velY int
    );

create table Player(
    ID_Player int primary key,
    foreign key(id_player) references gameobject(id_gameobject),
    hp int default 5,
    threshold int default 6,
    boost double default 1.2,
    direction varchar(5) default "idle"
    );
    
create table Bullet(
    ID_bullet int primary key,
    foreign key(id_bullet) references gameobject(id_gameobject)
    );
    
create table Enemy(
    ID_Enemy int primary key,
    foreign key(id_enemy) references gameobject(id_gameobject),
    hp int default 5,
    threshold int default 100,
    timer int default 0
    );
    
create table Enemy_Bullet(
    ID_Enemy_Bullet int primary key,
    foreign key(id_enemy_bullet) references gameobject(id_gameobject)
    );
    
create table Wall(
    ID_Wall int not null primary key,
    foreign key(id_wall) references gameobject(id_gameobject),
    timer int default 0,
    passageX int
    );
    
create table Passage(
    ID_Passage int not null primary key,
    foreign key(id_passage) references gameobject(id_gameobject)
    );