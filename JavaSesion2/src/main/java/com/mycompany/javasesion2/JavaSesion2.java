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
        
        
        /*String nombre;
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
        System.out.println("=====================");*/ 
        
        //Condicionales
        //CONDIONALES IF
        
        /*if (10>5) {
            System.out.println("10 es mayor a 5"); 
        }
        
        int condicionalNum1=10;
        int condicionalNum2=8;
        
        if (condicionalNum1>condicionalNum2) {
            System.out.println("10 es mayor a 8");
        }*/
    //Condicional IF ELSE
    
    /*int edad=15;
        if (edad<18) {
            System.out.println("usted es MENOR de edad");
            
        }
        else{
            System.out.println("usted es MAYOR de edad");
        }*/
    //cONDICIONALES ANIDADAS
    
    /*int hora=11;
        if (hora<=11) {
            System.out.println("Es mañana");
         
        }
        else if(hora==12){
            System.out.println("Es el medio día");
        }
        else{
            System.out.println("Es noche");
        }*/
    
       // Condicionales utilixanddo operadores ternarios
       
       /*int edad2=5;
       String ResultadoEdad=(edad2<18)?"Menor de Edad": "Mayor de edad";
       System.out.println(ResultadoEdad);*/
       
       //Switch Case
       
       /*int diaSemana=5;
       switch (diaSemana){
           case 1:
                System.out.println("Es Lunes");
                break;
                
                case 2:
                System.out.println("Es Martes");
                break;
                
                case 3:
                System.out.println("Es Miercoles");
                break;
                
                case 4:
                System.out.println("Es Jueves");
                break;
                
                case 5:
                System.out.println("Es Viernes");
                break;
                
                case 6:
                System.out.println("Es Sabado");
                break;
                
                case 7:
                System.out.println("Es Domingo");
                break;
                
                default: 
                    System.out.println("No ingreso un dia valido");
       }
       //Ciclos infinitos While
       
       int contadorWhile=0;
       //Se ejecutara siempre y cuando la condicion sea verdadera
       
        while (contadorWhile<10) { 
            System.out.println(contadorWhile);
            //contadorWhile++;
            
            contadorWhile=contadorWhile+1;  
        }
       
       */
       //Do While
       //Aqui siempre se ejecuta una vez la instruccion como minimo
       
      /* int contadorDoWhile=0;
        do {            
            System.out.println(contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile<5);*/
        
        //cICLOS FINITOS FOR
        /*int i;
        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //FOR EACH nos sirve para recorrer arreglos, vectores, matrices
        
        String [] AlumnosForEch = {"Frank","Liliana", "Claudio", "Vinicio"};
        //Mostrar todos los registros
       for(String iForeach:AlumnosForEch){
           System.out.println(iForeach);
       }
        */
        //Matrices unidimensionales
        
       /* String [] matrizAutos={"Tyota","BMW","Ford"};
        
        int[] matrizNumero={10,11,12,13,14,15};
        //Mostrando valores de la matriz por posicion
        
        System.out.println(matrizAutos[1]);
    System.out.println("=====================");*/
       
       //Matrices multidimensionales
       /*int[][] matrizMultidimensional = {{1,2,3,4},{5,6,7,8}};
       
       int misElementos = matrizMultidimensional[0][1];
        System.out.println("misElementos");
        
        //Mostrando Todos los datos de mi matriz multidimensioanl
        for (int i2 = 0; i2 < matrizMultidimensional.length; i2++) {
            
           System.out.println("\n");
           
          for (int j2= 0; j2< matrizMultidimensional[i2].length; j2++) {  
              System.out.println(matrizMultidimensional[i2][j2]);
          }*/
         //Metodos  
         
         
        
        
            
        
        

    }
    
}
