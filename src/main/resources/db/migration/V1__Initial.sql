create table if not exists disciplines
(
    id      INT auto_increment primary key,
    name    VARCHAR(50) not null,
    credits INT         not null
);

create table if not exists student
(
    id     INT auto_increment primary key,
    fio    VARCHAR(50) not null,
    course INT         not null
);

create table if not exists ENROLLMENT
(
    ID            INT auto_increment,
    ID_DISCIPLINE INT not null,
    ID_STUDENT    INT not null,
    GRADE         INT not null,
    constraint ENROLLMENT_PK
        primary key (ID),
    constraint ID_DISCIPLINE
        foreign key (ID_DISCIPLINE) references DISCIPLINES (ID),
    constraint ID_STUDENT
        foreign key (ID_STUDENT) references STUDENT (ID)
);

insert into STUDENT (FIO, COURSE)
VALUES ('Федюченок М.І.', 3),
       ('Морозенко О.П.', 2),
       ('Карпович В.Л.', 2),
       ('Нарович І.А.', 3),
       ('Варковенко Л.М.', 1),
       ('Алітов О.О.', 2),
       ('Маркович Ф.М.', 4),
       ('Чан Д.В.', 1);

insert into DISCIPLINES (name, credits)
VALUES ('Основи Java', 4),
       ('Функціональне програмування', 3),
       ('Логічне програмування', 4),
       ('Основи технології блокчейн', 3);
