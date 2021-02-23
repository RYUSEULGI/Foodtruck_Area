create table member(
    id integer auto_increment primary key not null,
    userEmail varchar(50) not null,
    userPw varchar(25) not null,
    userPhoneNumber varchar(50) not null
);