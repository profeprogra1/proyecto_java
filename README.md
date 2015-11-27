# proyecto_java
```
create database test01;
use test01;

Database changed
mysql> create table usuarios(
    -> usuario_id int(10) primary key not null auto_increment,
    -> nombre varchar(250),
    -> apellido varchar(250),
    -> ciudad_id int(10));

mysql> create table paises(
    -> pais_id int(10) primary key not null auto_increment,
    -> nombre varchar(250));
Query OK, 0 rows affected (0.14 sec)

mysql> create table ciudades(
    -> ciudad_id int(10) primary key not null auto_increment,
    -> nombre varchar(250),
    -> pais_id int(10));
    
mysql> insert into paises(nombre) values('CHILE');
Query OK, 1 row affected (0.10 sec)

mysql> insert into paises(nombre) values('PERU');
Query OK, 1 row affected (0.04 sec)

mysql> insert into paises(nombre) values('ARGENTINA');
Query OK, 1 row affected (0.01 sec)    

mysql> insert into ciudades(nombre,pais_id) values('SANTIAGO',1);
Query OK, 1 row affected (0.03 sec)

mysql> insert into ciudades(nombre,pais_id) values('ARICA',1);
Query OK, 1 row affected (0.00 sec)

mysql> insert into ciudades(nombre,pais_id) values('TACNA',2);
Query OK, 1 row affected (0.00 sec)

mysql> insert into ciudades(nombre,pais_id) values('RIO GALLEGOS',3);
Query OK, 1 row affected (0.00 sec)

mysql> insert into usuarios(nombre,apellido,ciudad_id) 
    -> values('JUAN','PEREZ',1);
Query OK, 1 row affected (0.00 sec)

mysql> insert into usuarios(nombre,apellido,ciudad_id)  values('PETER','CONTRERAS',2);
Query OK, 1 row affected (0.00 sec)

mysql> insert into usuarios(nombre,apellido,ciudad_id)  values('ROBERTO','ROJAS',3);
Query OK, 1 row affected (0.00 sec)

mysql> insert into usuarios(nombre,apellido,ciudad_id)  values('PABLO','RIVAS',4);
Query OK, 1 row affected (0.00 sec)

```

