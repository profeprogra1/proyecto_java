package proyectojava_git;

import com.proyectojava.conexion.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class ProyectoJava_git {

    public static void main(String[] args) {
        Conexion con=new Conexion();
        con.ejecutarConsulta("insert into Usuarios(nombre,apellido) values('GIT','HUB')");
    }

}
