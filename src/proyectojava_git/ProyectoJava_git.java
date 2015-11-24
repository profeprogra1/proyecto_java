package proyectojava_git;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProyectoJava_git {

    public static void main(String[] args) {
        try {
            Connection con;
            Statement stmt;
            ResultSet rs;
            String usuario = "root";
            String clave = "123456";

            Class.forName("org.gjt.mm.mysql.Driver");
            String url = "jdbc:mysql://localhost:3306/test01";
            con = DriverManager.getConnection(url, usuario, clave);
        } catch (Exception ex) {
            System.out.println("ERROR:" + ex.getMessage());
        }

    }

}
