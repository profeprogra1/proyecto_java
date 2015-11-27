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

```

