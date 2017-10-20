/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgegarcia_lab1.alexycruz_lab1;

import java.util.ArrayList;

/**
 *
 * @author JorgeLuis
 */
public class Alumno {
    String nombre;
    String seccion;
    int max_alumnos;
    String maestro;
    String unidades_val;
    ArrayList<String> alumnos;
    
    public Alumno(){
        clase = new ArrayList();
    }
    
    public void setName(String nombre){
        this.nombre = nombre;
    }
    
    public String getName(){
        return nombre;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setMaestría(String maestria){
        this.maestria = maestria;
    }
    
    public String getMaestria(){
        return maestria;
    }
    
    public void setUser(String usuario){
        this.usuario = usuario;
    }
    
    public String getUser(){
        return usuario;
    }
    
    public void setPassword(String constraseña){
        this.contraseña = contraseña; 
    }
    
    public String getPassword(){
        return contraseña;
    }
    
    public void setMaxClases(int max_clases){
        this.max_clases = max_clases;
    }
    
    public int getMaxClases(){
        return max_clases;
    }
    
    public void setClase(String clase){
        this.clase.add(clase);
    }
    
    public ArrayList getClase(){
        return clase;
    }
    
    public void setSalary(int salario){
        this.salario = salario;
    }
}
