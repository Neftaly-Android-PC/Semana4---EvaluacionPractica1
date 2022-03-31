
package ControlDePersonal_ITCA;

import java.util.Scanner;

public class Recursos_Humanos {
    private Scanner desde_teclado;
    private String Nnombre,direccion_d,numEdificio;
    private int Cargo,edad;
    private double salario,salario_Final,AFP,ISSS,renta;
    

    
   public void inicializar() {
        desde_teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado:");
        Nnombre=desde_teclado.next();
        System.out.print("Ingrese la edad del empleado:");
        edad=desde_teclado.nextInt();
        System.out.print("Ingrese el salario bruto:");
        salario=desde_teclado.nextDouble();
        System.out.print("Digite 1 si su cargo es por servicio y 2 si es permanente:");
        Cargo =desde_teclado.nextInt();
          System.out.print("Ingrese la direccion del empleado:");
        direccion_d=desde_teclado.next();
          System.out.print("Ingrese el numero de edificio:");
        numEdificio=desde_teclado.next();
    }

    public void imprimir_datos() {
        System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("Los datos del empleado son los siguientes");
        System.out.println("Nombre:" + Nnombre);
        System.out.println("Edad:" + edad + "años");
         System.out.println("direccion: " + direccion_d);
         System.out.println("numero de edificio :" +numEdificio );
    }
    public void cargo() {
        if (Cargo==1) {
            renta= (salario * 0.10);
             salario_Final= (salario-renta);
             System.out.println("");
            System.out.print("El cargo del empleado " + Nnombre + " es por servicio y su salario final es : $" + salario_Final + "\n");
            
        } else if(Cargo==2){
             renta= (salario * 0.10);
             ISSS= (salario* 0.14);
             AFP= (salario * 0.10);
             salario_Final= (salario-renta-ISSS-AFP);
           
            System.out.print("\n" + "El cargo del empleado " + Nnombre + " es permanente y su salario final es : $" + salario_Final + "\n");
        }
        }
    public static void main(String[] args) {
        Edificio objeto= new Edificio();
        Recursos_Humanos datosPersona1es;
        datosPersona1es=new Recursos_Humanos();
        datosPersona1es.inicializar();
        datosPersona1es.imprimir_datos();
        datosPersona1es.cargo();
        
         System.out.println("");
         
        objeto.getUbicacion();
        objeto.getNomb();
        objeto.getCantidad_Dep();
        objeto.getCantidadDePisos();
        
         
         Codigo_Area  codigo= new Codigo_Area();
         codigo.getComputos();
         codigo.getBibliotecaW();
         codigo.getCancha();
         codigo.getLabo();
         codigo.getZona_Verde();
         
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
}
}



