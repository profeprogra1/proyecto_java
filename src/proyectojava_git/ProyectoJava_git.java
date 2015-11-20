package proyectojava_git;

import com.proyectojava.conexion.Conexion;

public class ProyectoJava_git {

    public static void main(String[] args) {
        Conexion con=new Conexion();
        con.ejecutarConsulta("insert into Usuarios(nombre,apellido) values('GIT','HUB')");
    }

}
