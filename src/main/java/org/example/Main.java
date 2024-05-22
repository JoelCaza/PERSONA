package org.example;
import java.util.Scanner;

/*

 */
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        Persona persona = new Persona("Carlos","Sanchez",45,"1224445554","1975/05/10");
        Persona persona1 = new Persona("Maria","Perez",35,"175432560","1987/10/03");
        System.out.println("\tPersona 1");
        persona.obtenerDatos();

        System.out.println("\tPersona 2");
        persona1.obtenerDatos();

        System.out.println("\tPersona 3");
        System.out.print("\nIngrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("\nIngrese el apellido: ");
        String apellido = sc.nextLine();
        System.out.print("\nIngrese la edad: ");
        int edad = sc.nextInt();
        System.out.print("\nIngreso la cedula: ");
        String dni = sc.next();
        System.out.print("\nIngrese la fecha de nacimiento: ");
        String fechaNacimiento = sc.next();

        Persona persona3= new Persona(nombre,apellido,edad,dni,fechaNacimiento);
        persona3.obtenerDatos();

    }
}