/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescriturametodos2;
/**
 *
 * @author FERNANDO PADILLA
 * @author MEDARDO CHANGO
 */
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Scanner;

class Vehiculo{
    private String nombrePropietario;
    private int numeroCedula;
    private int edadPropietario;
    private String marca;
    private String tecnologia;
    private int modelo;
    public Vehiculo(){
        nombrePropietario="";
        numeroCedula=0;
        edadPropietario=0;
        marca="";
        tecnologia="";
        modelo=0;
    }
    public Vehiculo(String nombrePropietario,int numeroCedula,
            int edadPropietario,String marca, String tecnologia, int modelo){
        this.nombrePropietario=nombrePropietario;
        this.numeroCedula=numeroCedula;
        this.edadPropietario=edadPropietario;
        this.marca=marca;
        this.tecnologia=tecnologia;
        this.modelo=modelo;
    }
    public String getNombrePropietario(){
        return nombrePropietario;
    }
    public int getNumeroCedula(){
        return numeroCedula;
    }
    public int getEdadPropietario(){
        return edadPropietario;
    }
    public String getMarca(){
        return marca;
    }
    public String getTecnologia(){
        return tecnologia;
    }
    public int getModelo(){
        return modelo;
    }
}
class Automovil extends Vehiculo{
    private String matriculaAutomovil;
    public Automovil(){
        super();
        matriculaAutomovil="Desconocido";
    }
    public Automovil(String nombrePropietario,int numeroCedula,
            int edadPropietario, String marca, String tecnologia, int modelo){
        super(nombrePropietario,numeroCedula,edadPropietario,marca,tecnologia,modelo);
        matriculaAutomovil="Desconocido";
    }
    public void setMatriculaAutomovil(String matriculaAutomovil){
        this.matriculaAutomovil=matriculaAutomovil;
    }
    public String getMatriculaAutomovil(){
        return matriculaAutomovil;
    }
    public void mostrarDatos(){
        System.out.println("Datos del Automovil:\nMARCA DEL AUTOMOVIL: "+
                getMarca()+"\n"+getTecnologia()+
                "MATRICULA DEL AUTOMOVIL: "+getMatriculaAutomovil());
    }
    public void mostrarDatos1(){
        System.out.println("Datos del Propietario:\nNOMBRE DEL PROPIETARIO: "+
                getNombrePropietario()+"\nNÚMERO DE CÉDULA:"+getNumeroCedula()+
                "\nEDAD: "+getEdadPropietario());
    }
}
class AutomovilAutonomo extends Automovil{
    private Calendar fechaComienzoFabricacionAutonomia;
    public AutomovilAutonomo(Calendar fechaComienzoFabricacionAutonomia){
        super();
        fechaComienzoFabricacionAutonomia=fechaComienzoFabricacionAutonomia; 
    }
public AutomovilAutonomo(String nombrePropietario,int numeroCedula,
        int edadPropietario, String marca,String tecnologia, int modelo,
            Calendar fechaComienzoFabricacionAutonomia){
        super(nombrePropietario,numeroCedula,edadPropietario,marca,tecnologia,modelo);
        this.fechaComienzoFabricacionAutonomia=fechaComienzoFabricacionAutonomia;
    }
    public Calendar getFechaComienzoFabricacionAutonomia(){
        return fechaComienzoFabricacionAutonomia;
    }
    public void mostrarDatos(){
        System.out.println("Datos del Automovil Autonomo:\n MARCA DEL AUTOMOVIL: "+
                getMarca()+"\n"+getTecnologia()+
                "MATRICULA DEL AUTOMOVIL: "+getMatriculaAutomovil()+"\nFECHA DE FABRICACION: "
               +fechaComienzoFabricacionAutonomia.getTime().toString());
    }
    public void mostrarDatos1(){
        System.out.println("Datos del Propietario:\nNOMBRE DEL PROPIETARIO: "+
                getNombrePropietario()+"\nNÚMERO DE CÉDULA:"+getNumeroCedula()+
                "\nEDAD: "+getEdadPropietario());
    } 
} 
class ListadoAutomoviles{
    private ArrayList<Automovil>ListadoAutomoviles;
    //Constructor
    public ListadoAutomoviles(){
        ListadoAutomoviles=new ArrayList<Automovil>();
    }
    //Métodos
    public void addAutomovil(Automovil automovil){
        ListadoAutomoviles.add(automovil);
    }//Cierre método addAutomovil
    public void Listar(){
        System.out.println("DATOS DE LOS AUTOMOVILES EXISTENTE EN EL LISTADO: \n");
        for(Automovil ObjetoTmp:ListadoAutomoviles){//Uso de for extendido
            ObjetoTmp.mostrarDatos();{
            }
        }
    }  
}

class ListadoPropietarios{
    private ArrayList<Automovil>ListadoPropietarios;
    //Constructor
    public ListadoPropietarios(){
        ListadoPropietarios=new ArrayList<Automovil>();
    }
    //Métodos
    public void addAutomovil(Automovil automovil){
        ListadoPropietarios.add(automovil);
    }//Cierre método addAutomovil
    public void Listar(){
        System.out.println("DATOS DE LOS PROPIETARIOS EXISTENTE EN EL LISTADO: \n");
        for(Automovil ObjetoTmp:ListadoPropietarios){//Uso de for extendido
            ObjetoTmp.mostrarDatos1();{
            }
        }
    }  
}       

public class SobreEscrituraMetodos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                System.out.println("       UNIVERDIDAD DE LAS FUERZAS ARMADAS ");
        System.out.println("                ESPE-L            ");
        System.out.println("MATERIA:PROGRAMACION");
        System.out.println("NRC: 7450");
        System.out.println("DOCENTE: ING LUIS GUERRA");
    
        System.out.println("ESTUDIANTES  - MEDARDO CHANGO");
        System.out.println("             - FERNANDO PADILLA");
        Scanner objeto=new Scanner(System.in);//new reserva espacio de memoria
        String inicio = objeto.nextLine();   
        System.out.println("\t MENU DE OPCIONES ");
        String tecla = objeto.nextLine();
        System.out.println("Escriba la opcion que desee consultar\n");
        System.out.println("1: Datos de los Automoviles"
                         + "\n2: Datos de los Propietarios\n");
        Scanner eleccion = new Scanner(System.in);
      int a, b, c;         
    a = eleccion.nextInt();       
        switch(a){      
            case 1:
    System.out.println("\tDATOS DE LOS AUTOMOVILES DE LAS MARCAS: ");
    System.out.println("1.FORD");
    System.out.println("2.NISSAN\n");
    System.out.print("");
        b = eleccion.nextInt();
        switch(b){
           
        case 1:
       Automovil automovil1=new Automovil("",0,0,"FORD","TECNOLOGIA: Canadiense\n",2018);
       automovil1.setMatriculaAutomovil("Ontario ABZM-264-20\n");
       ListadoAutomoviles listado1=new ListadoAutomoviles();
       listado1.addAutomovil(automovil1);     
       listado1.Listar();   
       break;       
       case 2:
       
       Calendar fecha1=Calendar.getInstance();
       fecha1.set(2019,10,22);
       AutomovilAutonomo autonomo1=new AutomovilAutonomo("",0,0,"NISSAN","TECNOLOGIA: EUROPEA\n",
       2020,fecha1);      
       ListadoAutomoviles listado2=new ListadoAutomoviles();
       listado2.addAutomovil(autonomo1);     
       listado2.Listar();      
       break;
        }
        break;     
            case 2:
            System.out.println("\t\tDATOS DE LOS PROPIETARIOS DE VEHICULOS.");
    System.out.println("1.PROPIETARIO DEL VEHICULO 1");
    System.out.println("2.PROPIETARIO DEL VEHICULO AUTONOMO\n");
    System.out.print("Ingrese la opción deseada: ");
        c= eleccion.nextInt();
        switch(c){
           
        case 1: 
       Automovil automovil2=new Automovil("MEDARDO CHANGO",1804726949,22,"","",0);
       automovil2.setMatriculaAutomovil("Ontario ABZM-264-20\n");
       ListadoPropietarios listado3=new ListadoPropietarios();
       listado3.addAutomovil(automovil2);
       listado3.Listar();
            
    break;      
       case 2:      
       Automovil autonomo2=new Automovil("FERNANDO PADILLA",550348379,20,"","",0);
       autonomo2.setMatriculaAutomovil("Ontario ABZM-264-20\n");
       ListadoPropietarios listado4=new ListadoPropietarios();
       listado4.addAutomovil(autonomo2);
       listado4.Listar();     
    break;
    } 
    break;
    }
         int numero ;
       Scanner reader = new Scanner(System.in);
       System.out.println("\n\nDesea volver a consultar otra opcion.?"
               + "\n1: Si"
               + "\n2: No");
       numero = reader.nextInt();
        if(numero == 1){
            System.out.println("Escriba la opcion que desee consultar\n");
        System.out.println("1: Datos de los automoviles"
                         + "\n2: Datos de los propietarios\n");          
    a = eleccion.nextInt();     
        switch(a){      
            case 1:
    System.out.println("\tDATOS DEL AUTOMOVIL DE LA MARCA MAZDA Y UN AUTOMOVIL AUTÓNOMO DE LA MARCA TESLA.");
    System.out.println("1.FORD");
    System.out.println("2.NISSAN\n");
    System.out.print("");
        b = eleccion.nextInt();
        switch(b){          
        case 1:
       Automovil automovil1=new Automovil("",0,0,"FORD","TECNOLOGIA: Canadiense\n",2018);
       automovil1.setMatriculaAutomovil("Ontario ABZM-264-20\n");
       ListadoAutomoviles listado1=new ListadoAutomoviles();
       listado1.addAutomovil(automovil1);      
       listado1.Listar();       
       break;
       
       case 2:      
       Calendar fecha1=Calendar.getInstance();
       fecha1.set(2019,10,22);//Los meses van de 0 a 11, luego 10 representa noviembre
       AutomovilAutonomo autonomo1=new AutomovilAutonomo("",0,0,"NISSAN","TECNOLOGIA: EUROPEA\n",
       2020,fecha1);      
       ListadoAutomoviles listado2=new ListadoAutomoviles();
       listado2.addAutomovil(autonomo1);      
       listado2.Listar();     
       break;
        }
        break;
        
            case 2:
            System.out.println("\t\tDATOS DE LOS PROPIETARIOS DE VEHICULOS.");
    System.out.println("1.PROPIETARIO DEL VEHICULO 1");
    System.out.println("2.PROPIETARIO DEL VEHICULO AUTONOMO\n");
    System.out.print("Ingrese la opción deseada: ");
        c= eleccion.nextInt();
        switch(c){
           
        case 1: 
       Automovil automovil2=new Automovil("MEDARDO CHANGO",1804726949,22,"","",0);
       automovil2.setMatriculaAutomovil("Ontario ABZM-264-20\n");
       ListadoPropietarios listado3=new ListadoPropietarios();
       listado3.addAutomovil(automovil2);
       listado3.Listar();           
         break;
       
       case 2:      
       Automovil autonomo2=new Automovil("FERNANDO PADILLA ",550348379,20,"","",0);
       autonomo2.setMatriculaAutomovil("Ontario ABZM-264-20\n");
       ListadoPropietarios listado4=new ListadoPropietarios();
       listado4.addAutomovil(autonomo2);
       listado4.Listar();     
         break;
        } 
       break;
     }
    }
  }    
}
