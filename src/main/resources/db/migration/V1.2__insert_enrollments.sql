insert into ENROLLMENT(ID_DISCIPLINE, ID_STUDENT, GRADE)
values ((select id from disciplines where disciplines.name = 'Основи Java'),
        (select id from student where student.fio = 'Федюченок М.І.'), 91),
       ((select id from disciplines where disciplines.name = 'Функціональне програмування'),
        (select id from student where student.fio = 'Федюченок М.І.'), 85),
       ((select id from disciplines where disciplines.name = 'Логічне програмування'),
        (select id from student where student.fio = 'Федюченок М.І.'), 96),
       ((select id from disciplines where disciplines.name = 'Основи технології блокчейн'),
        (select id from student where student.fio = 'Федюченок М.І.'), 91),
       ((select id from disciplines where disciplines.name = 'Функціональне програмування'),
        (select id from student where student.fio = 'Нарович І.А.'), 85),
       ((select id from disciplines where disciplines.name = 'Логічне програмування'),
        (select id from student where student.fio = 'Нарович І.А.'), 96),
       ((select id from disciplines where disciplines.name = 'Основи технології блокчейн'),
        (select id from student where student.fio = 'Нарович І.А.'), 85);