create table persons(ID INT PRIMARY KEY, firstname varchar(255), lastname varchar(255), fortune double);

insert into persons (id, firstname,lastname, fortune) values (1,'Robert','Pearson',2000000);
insert into persons (id, firstname,lastname, fortune) values (2,'Lawrence','Chambers',3000000);
commit;

select * from persons;