/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ricardo.negocio;

import com.ricardo.Conexion.Conexion;

/**
 *
 * @author ricardo
 */
public class Usuario {
    private int usuario_id;
    private String nombre;
    private String apellido;
    Conexion con;
    public Usuario() {
        con=new Conexion();
    }

    public int getUsuario_id() {
        return usuario_id;
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
    public void save(){
        con.setEjecutar("insert into usuarios(nombre,apellido) values('"+this.nombre+"','"+this.apellido+"')");
    }
}
