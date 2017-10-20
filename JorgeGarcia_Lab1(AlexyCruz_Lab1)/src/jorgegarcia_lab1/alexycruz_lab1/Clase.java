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
public class Clase {
    private String nombre;
    private String seccion;
    private int max_alumnos;
    private String maestro;
    private int unidades_val;
    private ArrayList<Alumno> alumnos;
    private int cost;
    private boolean asignada = false;
    private int cant_alumnos;
    
    public void asignarClase(){
        asignada = true;
    }
    
    public boolean estado(){
        return asignada;
    }
    
    public Clase(){
        alumnos = new ArrayList();
        cant_alumnos = 0;
    }
    
    public void setName(String nombre){
        this.nombre = nombre;
    }
    
    public String getName(){
        return nombre;
    }
    
    public void setSeccion(String seccion){
        this.seccion = seccion;
    }
    
    public String getSeccion(){
        return seccion;
    }
    
    public void setMaxAlumnos(int max_alumnos){
        this.max_alumnos = max_alumnos;
    }
    
    public int getMaxAlumnos(){
        return max_alumnos;
    }
    
    public void setMaestro(String maestro){
        this.maestro = maestro;
    }
    
    public String getMaestro(){
        return maestro;
    }
    
    public void setUnidadesV(int unidades_val){
        this.unidades_val = unidades_val; 
    }
    
    public int getUnidadesV(){
        return unidades_val;
    }
    
    public void addAlumnos(Alumno alumno){
        cant_alumnos++;
        alumnos.add(alumno);
    }
    
    public ArrayList getAlumnos(){
        return alumnos;
    }
    
    public void setCost(int cost){
        this.cost = cost;
    }
    
    public int getCost(){
        return cost;
    }
    
    public String toString(){
        return nombre;
    }
    
    public boolean llena(){
        if (cant_alumnos <= max_alumnos){
            return false;
        }else{
            return true;
        }
    }
    
    public double valorTotal(){
        int costo_t = cost;
        for (int i = 0; i < 5; i++) {
            costo_t *= (costo_t * (0.2 * i) );
        }
        return costo_t;
    }
   
}
