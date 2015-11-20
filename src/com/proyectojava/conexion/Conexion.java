package com.proyectojava.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Conexion {
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    String usuario = "root";
    String clave = "123456";
    //CONSTRUCTOR CONEXION -> Al momento de crear el objeto se crea la conexion
    public Conexion() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            String url = "jdbc:mysql://localhost:3306/test01";
            con = DriverManager.getConnection(url, usuario, clave);
        } catch (Exception ex) {
            System.out.println("ERROR:" + ex.getMessage());
        }
    }
    //Metodo para ejecutar consultas -> insert,delete,update
    public void ejecutarConsulta(String sql){
        try{
            stmt=con.createStatement();
            stmt.executeUpdate(sql);
        }catch(Exception ex){
            System.out.println("ERROR:"+ex.getMessage());
        }
    }
    //Metodo para ejecutar consultas-> select
    public void ejecutarSelect(String sql){
        try{
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
        }catch(Exception ex){
            System.out.println("EROR:"+ex.getMessage());
        }
    }
    //Metodo que devuelve el resultset
    public ResultSet getResultSet(){
        return rs;
    }

}
