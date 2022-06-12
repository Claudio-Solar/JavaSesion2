/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javasesion2;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class JavaSesion2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        System.out.println("Hello Java");
        
        //Ingreso de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        /*Programacion estática
        int num1=10;
        int num2=10;
        
        int Resultado=num1+num2;
        System.out.println("El resultado es: "+Resultado);*/
        
        //Suma de dos números dinámiucos por teclados
        
        /*int num1;
        int num2;
        int resultado;
        
        System.out.println("ingrese el primer numero");
        num1=sc.nextInt();
        System.out.println("====================="); 
        System.out.println("ingrese el segundo numero");
        num2=sc.nextInt();
        System.out.println("====================="); 
        resultado=num1+num2;
        System.out.println("El resultado es: "+resultado);
        System.out.println("=====================");*/ 
        
        //edad y sueldo
        
        
        String nombre;
        int edadingreso;
        Double Sueldo;
        
        System.out.println("ingrese su nombre");
        nombre=sc.nextLine();
        System.out.println("====================="); 
        
        System.out.println("ingrese su edad");
        edadingreso=sc.nextInt();
        System.out.println("====================="); 
        
        System.out.println("ingrese su sueldo");
        Sueldo=sc.nextDouble();
        System.out.println("=====================");
        
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edadingreso);
        System.out.println("el sueldo es: "+Sueldo);
        System.out.println("====================="); 
        
    }
}
