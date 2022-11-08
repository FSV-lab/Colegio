

package colegio;

import java.util.Scanner;


public class Alumnos {
    String nombre,apellido1,apellido2,direccion;
    int edad;

  
 void verDatos(){
System.out.println("Nombre"+" "+ nombre);
System.out.println("Primer Apellido" +" "+ apellido1);
System.out.println("Segundo Apellido"+" "+ apellido2);
System.out.println("Dirección:"+" "+ direccion);
System.out.println("Edad"+" "+ edad);

 }
 void ingresarNuevoEstudiante(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Ingrese Nombre del Estudiante:");
     String estudiante = sc.nextLine();
     
      
     System.out.println("Ingrese Apellido:");
     String Apellido = sc.nextLine();
     
     System.out.println("Ingrese Edad:");
     String edad1 = sc.nextLine();
    
     System.out.println("Datos del Estudiante:"+ " "+estudiante +" "+ Apellido +" "+ edad1);
 }
}

