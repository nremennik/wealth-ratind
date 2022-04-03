create table persons(ID INT PRIMARY KEY auto_increment, firstname varchar(255), lastname varchar(255), fortune double);
create table evaluate(city varchar(255) PRIMARY KEY, evaluatecity int);
create table wealth_threshold(ID INT PRIMARY KEY, wealth int);

drop table persons;

insert into persons (id, firstname,lastname, fortune) values (1,'Robert','Pearson', 2000000);
insert into persons (id, firstname,lastname, fortune) values (2,'Lawrence','Chambers', 3000000);
commit;

insert into evaluate (city, evaluateCity) values ('Tel Aviv',5);
insert into evaluate (city, evaluateCity) values ('Kiev', 3);
insert into evaluate (city, evaluateCity) values ('Washington', 4);

commit;

insert into wealth_threshold (id, wealth) values (1,500);
select * from evaluate;