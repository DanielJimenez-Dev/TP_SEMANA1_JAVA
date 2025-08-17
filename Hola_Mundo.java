/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola_mundo;

import java.util.Scanner;

/**
 *
 * @author jimen
 */
public class Hola_Mundo {

    public static void main(String[] args) {
        // 1. Escribe un programa que im´rima el mensaje ¡Hola Java!
        
        //System.out.println("¡Hola Java!");
        
        //---------------------------------------------------------------------------------
        
        /*  2. Crea un programa que declare las siguientes variables con valores asignados:
            - String nombre
            - int edad
            - double altura
            - boolean estudiante
        */
        
        // Declaramos la variables con valores asignados
        //String nombre = "Daniel";
        //int edad = 38;
        //double altura = 1.83;
        //boolean estudiante = true;
        
        // Mostramos valores usando System.out.println
        //System.out.println("Nombre: " + nombre);
        //System.out.println("Edad: " + edad);
        //System.out.println("Altura: " + altura);
        //System.out.println("¿Es estudiante?: : " + estudiante);
        
        //----------------------------------------------------------------
        
        // 3. Escribe un programa que solicite al usuario ingresar su nombre y edad, 
        //y luego los muestre en pantalla. Usa Scanner para capturar los datos.
        
         //Scanner input = new Scanner(System.in);
         
         // Solicitamos al usuario ingresar el nombre
         //System.out.println(" Ingrese su nombre: ");
         //String nombre = input.nextLine();
         
         // Solicitar edad
         //System.out.println(" Ingrese su edad: ");
         //int edad = input.nextInt();
         
         //Mostramos los datos
         //System.out.println("Hola, " + nombre + " . Tienes: " + edad + " años");
         
         //---------------------------------------------------------------------------
         
         // 4. Escribe un programa que solicite al usuario ingresar su nombre y edad, 
         //y luego los muestre en pantalla. Usa Scanner para capturar los datos.
         
         // Creamos un objeto scanner para leer los datos del usuario
         //Scanner input = new Scanner(System.in);
           
         // Solicitamos al usuario que ingrese el nombre.
         //System.out.println("Ingrese su nombre: ");
         //String nombre = input.nextLine();
         
         //System.out.println("Ingrese su edad: ");
         //int edad = input.nextInt();
         
         // Imprimimos los datos ingresados
         //System.out.println("Su nombre es: " + nombre + ", Su edad es: " + edad);
         
         //--------------------------------------------------------------------------
         
         /*  5. Escribe un programa que solicite dos números enteros y realice las siguientes operaciones:
            - Suma
            - Resta
            - Multiplicación
            - División
            Muestra los resultados en la consola.
        */
         //Scanner input = new Scanner(System.in);
         
         // Solicitamos el primer numero
         //System.out.println(" Ingrese el primer Numero entero: ");
         //int num1 = input.nextInt();
         
         // Solicitamos el segundo numero
         //System.out.println(" Ingrese el segundo Numero entero: ");
         //int num2 = input.nextInt();
         
         // Operaciones
         //int suma = num1 + num2;
         //int resta = num1 - num2;
         //int multiplicacion = num1 * num2;
         //int division = num2 / num2;
         
         // Mostramos los resultados
         //System.out.println("Los resultados de: " + num1 + " y " + num2 + " es de: ");
         //System.out.println("Suma: " + suma);
         //System.out.println("Resta: " + resta);
         //System.out.println("Multiplicacion: " + multiplicacion);
         //System.out.println("Division: " + division);
         
         //-------------------------------------------------------------------------
         
         /* 6. Escribe un programa que muestre el siguiente mensaje en consola:
           - Nombre: Juan Pérez Edad: 30 años
           - Dirección: "Calle Falsa 123"
           - Usa caracteres de escape (\n, \") en System.out.println().
         */
         
         //System.out.println("Nombre: Juan Perez \nEdad: 30 \nDireccion: \"Calle Falsa 123\"");
         
         //---------------------------------------------------------------------
         
         /* 8. Manejar conversiones de tipo y división en Java.
            - Escribe un programa que divida dos números enteros ingresados por el usuario.
            - Modifica el código para usar double en lugar de int y compara los resultados.
         */
         Scanner input = new Scanner(System.in);
         
         // Solicitamos al usuario ingresar 2 numeros enteros
         System.out.println("Ingrese el primer numero entero: ");
         int num1 = input.nextInt();
         
         System.out.println("Ingrese el segundo numero entero: ");
         int num2 = input.nextInt();
         
         // Division con entero
         int divisionEntera = num1 / num2;
         System.out.println("Division entera: " + divisionEntera);
         
         // Division usando doble (conversion explicita)
         double divisionDecimal = (double) num1 / num2;
         System.out.println("Division decimal: " + divisionDecimal);
         

         
         
        
         
         
    }
    
}
