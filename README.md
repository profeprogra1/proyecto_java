# proyecto_java
```
create database test01;
use test01;

Database changed
mysql> describe usuarios;
+------------+-------------+------+-----+---------+----------------+
| Field      | Type        | Null | Key | Default | Extra          |
+------------+-------------+------+-----+---------+----------------+
| usuario_id | int(10)     | NO   | PRI | NULL    | auto_increment |
| nombre     | varchar(50) | YES  |     | NULL    |                |
| apellido   | varchar(50) | YES  |     | NULL    |                |
+------------+-------------+------+-----+---------+----------------+
3 rows in set (0.03 sec)

mysql> create table paises(
    -> pais_id int(10) primary key not null auto_increment,
    -> nombre varchar(250));
Query OK, 0 rows affected (0.14 sec)

mysql> create table ciudades(
    -> ciudad_id int(10) primary key not null auto_increment,
    -> nombre varchar(250),
    -> pais_id int(10));

```

