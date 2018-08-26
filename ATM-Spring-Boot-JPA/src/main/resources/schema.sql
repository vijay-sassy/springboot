create table if not exists atm (
id int not null auto_increment,
name varchar(30) not null,
pin_number int not null,
balance_amount double not null,
primary key(id));