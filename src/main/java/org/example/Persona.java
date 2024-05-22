// Crear un programa em java donde se cree un objeto de tipo Persona
package org.example;
/*
*Nombre del programador: Joel Caza, Kevin Chiguano
*Materia: Lenguajes de programacion 2
*Fecha: 8/5/2023
**/
public class Persona {
    String nombres;
    String apellidos;
    int edad;
    String dni;
    String f_nacimiento;


// costructor
     Persona(String nombres, String apellidos, int edad, String dni, String f_nacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.f_nacimiento = f_nacimiento;


    }

    public void obtenerDatos(){
        System.out.println("El nombre del alumno es: "+nombres+"\nEl apellido del alumno es:"+apellidos+"\nLa edad del alumno es: "+edad+"\nLa cedula es: "+dni+"\nla fecha de nacimiento es: "+f_nacimiento);


    }
}
