package proyectojava_git;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class ProyectoJava_git {

    public static void main(String[] args) {
        String usuario = "root";
        String clave = "123456";
        Scanner in = new Scanner(System.in);
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            String url = "jdbc:mysql://localhost:3306/test01";
            Connection con = DriverManager.getConnection(url, usuario, clave);
            Statement stmt = con.createStatement();
            //INSERTAR
            stmt.executeUpdate("insert into Usuarios(nombre,apellido) values('A','B')");
            //ELIMINAR
            stmt.executeUpdate("delete from Usuarios where usuario_id=1");
            //ACTUALIZAR
            stmt.executeUpdate("update Usuarios set nombre='ALGO' where usuario_id=1");

        } catch (Exception ex) {
            System.out.println("ERROR:" + ex.getMessage());
        }
    }

}
