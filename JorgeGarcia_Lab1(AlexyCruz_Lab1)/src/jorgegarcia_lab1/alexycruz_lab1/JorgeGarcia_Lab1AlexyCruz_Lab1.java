/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgegarcia_lab1.alexycruz_lab1;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author JorgeLuis
 */
public class JorgeGarcia_Lab1AlexyCruz_Lab1 {
    
    static ArrayList<Clase> clases = new ArrayList();
    static ArrayList<Maestro> maestros = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resp = 0;
        clases = new ArrayList();
        maestros = new ArrayList();
        do{
            switch( ingresarOpcion() ){
                case 1:
                    administracion();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    resp = 1;
            }
            resp = JOptionPane.showConfirmDialog(null, 
                            "Desea regresar al menu?"
            );
        } while (resp == 0);
    }
    
    public static int ingresarOpcion(){
        String opcion= "";
        int op = 0;
        do{
            opcion = JOptionPane.showInputDialog(""
                                + "Bienvenido a nuestro Sistema\nde Matrícula!\n" 
                                + "1) Administración\n"
                                + "2) Matrícula\n"
                                + "3) Log in\n"
            );
        }while (soloDigitos(opcion) == false);
        op = Integer.parseInt(opcion);
        return op;
    }
    
    public static boolean soloDigitos(String cadena){
        try{
            for (int x=0 ; x < cadena.length() ; x++){
                if ( !Character.isDigit(cadena.charAt(x)) ){
                    return false;
                }
            }
            if ( Integer.parseInt(cadena) < 1 || Integer.parseInt(cadena) > 3){
                return false;
            }
        }catch (NullPointerException exception){
            JOptionPane.showMessageDialog(null, "Tenga Buen Día!");
            return true;
        }
        return true;
    }
    
    public static void administracion(){
        String opcion = "";
        while ( !opcion.equals("3") ){
            opcion = JOptionPane.showInputDialog(""
                        + "Administración:"
                        + "1) Crear Clases"
                        + "2) Crear Maestros"
                        + "3) Salir"
            );
            switch ( opcion ){
                case "1":
                    crearClases();
                    break;
                case "2":
                    if (clases.size() > 0){
                        
                    }else{
                        JOptionPane.showMessageDialog(null,
                                "No se hay creado ninguna clase aún"
                        );
                    }
                    break;
            }
        }
    }
    
    public static void crearClases(){
        
    }
            
}
