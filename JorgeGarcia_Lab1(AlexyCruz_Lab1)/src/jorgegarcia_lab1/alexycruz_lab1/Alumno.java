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
    String n_cuenta;
    String carrera;
    int edad;
    private double dinero;
    private String usuario;
    private String contraseña;
    private ArrayList<String> clases;
    private ArrayList<Clase> clasesA;
    ArrayList<String> alumnos;
    
    public Alumno(){
        clases = new ArrayList();
        clasesA = new ArrayList();
    }
    
    public void setName(String nombre){
        this.nombre = nombre;
    }
    
    public String getName(){
        return nombre;
    }
    
    public void setCuenta(String n_cuenta){
        this.n_cuenta = n_cuenta;
    }
    
    public String getCuenta(){
        return n_cuenta;
    }
    
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    
    public String getCarrera(){
        return carrera;
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
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setFondos(double dinero){
        this.dinero = dinero;
    }
    
    public double getFondos(){
        return dinero;
    }
    
    public void setClases(String c){
        this.clases.add(c);
    }
    
    public void clasesString(){
        for (int i = 0; i < clasesA.size() ; i++) {
            clases.add(clasesA.get(i).getSeccion());
        }
    }
}
