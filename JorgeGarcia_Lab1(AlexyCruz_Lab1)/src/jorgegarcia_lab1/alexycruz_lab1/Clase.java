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
    String nombre;
    String seccion;
    int max_alumnos;
    String maestro;
    int unidades_val;
    ArrayList<String> alumnos;
    private int cost;
    
    public Clase(){
        alumnos = new ArrayList();
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
    
    public void addAlumnos(String alumno){
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
   
}
