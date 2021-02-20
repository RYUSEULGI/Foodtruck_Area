create table community(
    list_no int not null auto_increment,
    contents text null,
    writer varchar(50) not null,
    reg_date timestamp not null default now(),
    primary key(list_no)
);
