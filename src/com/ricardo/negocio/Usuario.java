/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ricardo.negocio;

import com.ricardo.Conexion.Conexion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricardo
 */
public class Usuario {

    private int usuario_id;
    private String nombre;
    private String apellido;
    private int ciudad_id;
    Conexion con;

    public Usuario() {
        con = new Conexion();
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public int getCiudad_id() {
        return ciudad_id;
    }

    public void setCiudad_id(int ciudad_id) {
        this.ciudad_id = ciudad_id;
    }

    public Conexion getCon() {
        return con;
    }

    public void setCon(Conexion con) {
        this.con = con;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void save() {
        con.setEjecutar("insert into usuarios(nombre,apellido,ciudad_id) values('" + this.nombre + "','" + this.apellido + "','"+this.ciudad_id+"')");
    }

    public void delete() {
        con.setEjecutar("delete from usuarios where usuario_id='" + this.usuario_id + "'");
    }

    public void update() {
        con.setEjecutar("update usuarios set nombre='" + this.nombre + "',apellido='" + this.apellido + "',ciudad_id='"+this.ciudad_id+"' where  usuario_id='" + this.usuario_id + "'");
    }
    public List list(){
        List<Usuario> lista=new ArrayList<Usuario>();
        con.setSeleccion("select * from usuarios");
        Usuario user;
        try{
            while(con.getRs().next()){
                user=new Usuario();
                user.setUsuario_id(con.getRs().getInt("usuario_id"));
                user.setNombre(con.getRs().getString("nombre"));
                user.setApellido(con.getRs().getString("apellido"));
                lista.add(user);
            }
        }catch(Exception ex){
            System.out.println("ERROr"+ex.getMessage());
        }
        return lista;
    }
    
}
