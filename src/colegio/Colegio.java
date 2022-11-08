
package colegio;

//Nombre de la Clase "Colegio"
public class Colegio {


  
    public static void main(String[] args) {
        //Se toma el nombre de la clase lo abrevio y se estancia por objeto y atributos de la clase
   Alumnos Alum1=new Alumnos();
   Alumnos Alum2=new Alumnos();
   Alumnos NuevoEstudiante = new Alumnos();
   Alum1.nombre="Fernando";
   Alum1.apellido1="Saldaña";
   Alum1.apellido2="Villalba";
   Alum1.direccion="calle 128 a 234 d 23";
   Alum1.edad=33;
   Alum1.verDatos();//al final se coloca la abreviatura del objeto . y el metodo .
                    //si queremos un segundo alumno solo se debe agregar al principo el nuevo objeto y se repite el mismo paso
   Alum2.nombre= "Anderson";
   Alum2.apellido1="Morales";
   Alum2.apellido2="Pastrana";
   Alum2.direccion="Calle 129 a 34 d 123";
   Alum2.edad=29;
   Alum2.verDatos();
   
   NuevoEstudiante.ingresarNuevoEstudiante();
   
    }
    
}
