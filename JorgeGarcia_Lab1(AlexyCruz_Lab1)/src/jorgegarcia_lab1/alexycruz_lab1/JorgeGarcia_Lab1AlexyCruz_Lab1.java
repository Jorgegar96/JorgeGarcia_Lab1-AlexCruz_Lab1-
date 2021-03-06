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
    
    static String lista;
    static ArrayList<Clase> clases = new ArrayList();
    static ArrayList<Maestro> maestros = new ArrayList();
    static ArrayList<Alumno> alumnos = new ArrayList();
    static Alumno logged = new Alumno();
    static Maestro loggedm = new Maestro();

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
                    matricula(new Alumno());
                    break;
                case 3:
                    logIn();
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
                        + "Administración:\n\n"
                        + "1) Administrar Clases\n"
                        + "2) Administrar Maestros\n"
                        + "3) Salir"
            );
            switch ( opcion ){
                case "1":
                    adminClases();
                    break;
                case "2":
                    if (clases.size() > 0){
                        adminMaestros();
                    }else{
                        JOptionPane.showMessageDialog(null,
                                "No se hay creado ninguna clase aún"
                        );
                    }
                    break;
            }
        }
    }
    
    public static void adminClases(){
        String opcion = "";
        while ( !opcion.contains("3") ){
            opcion = JOptionPane.showInputDialog(""
                        + "Clases:\n\n"
                        + "1) Crear\n"
                        + "2) Lista\n"
                        + "3) Salir"
            );
            switch (opcion){
                case "1":
                    clases.add( crearClases(new Clase() ) );
                    break;
                case "2":
                    listarClases();
                    break;
            }
        }
    }
    
    public static Clase crearClases(Clase c){
        c.setName(JOptionPane.showInputDialog(""
                + "Ingrese el nombre de la clase:"
                )
        );
        c.setSeccion( seccion(c) );
        c.setMaxAlumnos(Integer.parseInt(JOptionPane.showInputDialog(""
                + "Ingrese la cantidad maxima de alumnos de la clase:"
                )
        ));
        c.setUnidadesV(Integer.parseInt(JOptionPane.showInputDialog(""
                + "Ingrese las unidades valorativas de la clase:"
                )
        ));
        c.setCost(Integer.parseInt(JOptionPane.showInputDialog(""
                + "Ingrese el costo de la clase:"
                )
        ));
        return c;
    }
    
    public static String seccion(Clase c){
        boolean repetida = true;
        String seccion = "";
        while (repetida == true ){
        seccion = (JOptionPane.showInputDialog(""
                + "Ingrese la seccion de la clase:"
                )
        );
        repetida = existe(seccion);
        }
        return seccion;
    }
    
    public static boolean existe(String seccion){
        for (int i = 0; i < clases.size(); i++) {
            if (clases.get(i).getSeccion().equals("seccion")){
                return true;
            }
        }
        return false;
    }
    
    public static void listarClases(){
        lista = "Clases / Seccion\n\n";
        for (int x=0 ; x < clases.size() ; x++){
            lista += (x + 1) + ") " + (clases.get(x).getName()) 
                        + " / " + (clases.get(x).getSeccion()) + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }     
    
    public static void adminMaestros(){
        String opcion = "";
        while ( !opcion.contains("3") ){
            opcion = JOptionPane.showInputDialog(""
                        + "Clases:\n\n"
                        + "1) Crear\n"
                        + "2) Lista\n"
                        + "3) Salir"
            );
            switch (opcion){
                case "1":
                    maestros.add( crearMaestro(new Maestro() ) );
                    break;
                case "2":
                    listarMaestros();
                    break;
            }
        }
    }
    
    public static void listarMaestros(){
        
    }
    
    public static Maestro crearMaestro(Maestro m){
        m.setName(JOptionPane.showInputDialog(""
                + "Ingrese el nombre del maestro"
                )
        );
        m.setTitulo(JOptionPane.showInputDialog(""
                + "Ingrese el titulo:"
                )
        );
        m.setMaestria(JOptionPane.showInputDialog(""
                + "Ingrese la maestria"
                )
        );
        m.setUser(JOptionPane.showInputDialog(""
                + "Ingrese el usuario"
                )
        );
        m.setPassword(JOptionPane.showInputDialog(""
                + "Ingrese la contraseña"
                )
        );
        m.setMaxClases(Integer.parseInt(JOptionPane.showInputDialog(""
                + "Ingrese la cantidad máxima de clases"
                )
        ));
        asignarClases(m);
        m.setSalary(Integer.parseInt(JOptionPane.showInputDialog(""
                + "Ingrese el salario"
                )
        ));
        return m;
    }
    
    public static void asignarClases(Maestro m){
        int clases_asignadas = 0;
        String clase = "";
        String lista_disp = "";
        while (clases_asignadas <= m.getMaxClases() || !clase.equals("s") ){
            lista_disp = "Clases Disponibles\n\n" + 
                    clasesDisp(lista_disp) + "\n Clases Asignadas = "
                    + clases_asignadas + " de " + m.getMaxClases()
                    + "\nIngrese 's' para terminar";
            clase = JOptionPane.showInputDialog(""
                    + lista_disp
            );
            if (existe(clase, m) == true){
                m.addClase(clase);
                clases_asignadas ++;
            }
        }
    }
    
    public static boolean existe(String seccion, Maestro m){
        for (int x=0 ; x < clases.size() ; x++){
            if ( clases.get(x).getSeccion().equals(seccion) 
                    && clases.get(x).estado() == false){
                clases.get(x).asignarClase();
                clases.get(x).setMaestro(m.getName());
                m.addClassA(clases.get(x));
                return true;
            }
        }
        return false;
    }
    
    public static String clasesDisp(String lista){
        String lista2 = "";
        for (int x =0 ; x < clases.size() ; x++){
            if ( clases.get(x).estado() == false ){
                lista2 += (x + 1) + ") " + (clases.get(x).getName() 
                            + " / " + clases.get(x).getSeccion() + "\n" );
            }
        }
        return lista2;
    }
    
    public static void matricula(Alumno a){
        a.setName(JOptionPane.showInputDialog("Ingrese su nombre"));
        a.setCuenta(JOptionPane.showInputDialog("Ingrese numero de cuneta"));
        a.setCarrera(JOptionPane.showInputDialog("Ingrese su carrera:"));
        a.setFondos(Double.parseDouble(JOptionPane.showInputDialog("Ingrese su edad")));
        a.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus fondos")));
        a.setUser(JOptionPane.showInputDialog("Ingrese su Usuario"));
        a.setPassword(JOptionPane.showInputDialog("Ingrese una contraseña"));
        agregarClases(a);
        alumnos.add(a);
    } 
    
    public static String agregarClases(Alumno a){
        String seccion = "";
        double fondos_restantes = a.getFondos();
        while (!seccion.equals("n" )){
            seccion = JOptionPane.showInputDialog("Ingrese las clases que desea agregar\n"
                        + "Presione 'n' para salir");
            for (int i = 0; i < clases.size() ; i++) {
                if (clases.get(i).getSeccion().equals(seccion)){
                    if (clases.get(i).llena() == false){
                        if (clases.get(i).valorTotal() <= fondos_restantes){
                            a.setClases(clases.get(i));
                            System.out.println(clases.get(i).valorTotal());
                            clases.get(i).addAlumnos(a);
                            fondos_restantes -= clases.get(i).valorTotal();
                        }else{
                            JOptionPane.showMessageDialog(null, "Fondos insuficientes");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Clase llena");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Clase no existe");
                }
            }
        }
        
        return seccion;
    }
    
    public static void logIn(){
        boolean usuario = false;
        boolean contraseña = false;
        String user = "";
        String pass = "";
        while (usuario == false || contraseña == false){
            while (usuario == false){
                user = JOptionPane.showInputDialog("Ingrese su usuario");
                usuario = usuarioValido(user);
            }
            while (contraseña == false){
                pass = JOptionPane.showInputDialog("Ingrese la contraseña");
                contraseña = contraseñaValida(user, pass);
                if (contraseña == false){
                    JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
                }
            }
            String opcion = "";
            if (loggedm != null ){
                while (!opcion.equals("7")){
                    JOptionPane.showInputDialog("1)Modificar Nombre\n"+
                            "2) Modificar Salario" + 
                            "3) Modificar Usuario" +
                            "4) Modificar Contraseña" +
                            "5) Modificar Titulo" +
                            "6) Modificar Maestria" +
                            "7) Salir");
                    switch (opcion){
                        case "2":
                            loggedm.setSalary(Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo salario")));
                            break;
                        case "3":
                            loggedm.setUser(JOptionPane.showInputDialog("Ingrese nuevo usuario"));
                            break;
                        case "4":
                            loggedm.setPassword((JOptionPane.showInputDialog("Ingrese nueva contraseña")));
                            break;
                        case "5":
                            loggedm.setTitulo(JOptionPane.showInputDialog("Ingrese nuevo titulo"));
                            break;
                        case "6":
                            loggedm.setMaestria(JOptionPane.showInputDialog("Ingrese la nueva maestria"));
                            break;
                        case "1":
                            loggedm.setName(JOptionPane.showInputDialog("Ingrese nuevo nombre"));
                    }
                }
            }
        }
    }
    
    public static boolean usuarioValido(String user){
        for (int i = 0; i < alumnos.size() ; i++) {
            if (alumnos.get(i).getUser().equals(user)){
                logged = alumnos.get(i);
                return true;
            }else if (maestros.get(i).getUser().equals(user)){
                loggedm = maestros.get(i);
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
    
    public static boolean contraseñaValida(String user, String pass){
        for (int i = 0; i < alumnos.size() ; i++) {
            if ((alumnos.get(i).getPassword().equals(pass) && alumnos.get(i).getUser().equals(user))
                    || (maestros.get(i).getPassword().equals(pass) && maestros.get(i).getUser().equals(user))){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    
    
}
