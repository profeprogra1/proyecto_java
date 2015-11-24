package proyectojava_git;

import com.ricardo.Conexion.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProyectoJava_git {

    public static void main(String[] args) {
        Conexion con=new Conexion();
        con.setEjecutar("insert into usuarios(nombre,apellido) values('LA','PO')");

    }

}
