set names utf8;

drop database if exists dg;

create database dg charset utf8;
use dg;

drop table if exists app;
create table app(
	id int primary key auto_increment,
	name varchar(32),
	`describe` varchar(255),
	leader varchar(8),
	contact varchar(16),
	unit varchar(16));

insert into app values(null,"名称1","描述1","负责人1","1378776","厂商1");
insert into app values(null,"名称2","描述2","负责人2","1588776","厂商2");
insert into app values(null,"名称3","描述3","负责人3","1178776","厂商3");
