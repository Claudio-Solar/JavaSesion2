/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javasesion2;

/**
 *
 * @author victo
 */
public class Csesion2 {
    public static void main(String[] args) {

    sumaDosNumerosVOID();
    
        System.out.println(sumaDosNumerosEnteros());
        sumaDosNumerosArgumentos(5,10);
        
        retornaDatos("Claudio", "Peru");
    }
    public static void sumaDosNumerosVOID(){
        int num1=5;
        int num2=4;
        int resultado= num1+num2;
        
        System.out.println("La suma es: "+ resultado);
        
    }
    public static int sumaDosNumerosEnteros(){
        int num1=5;
        int num2=4;
        int resultado= num1+num2;
        return resultado;
        
       
    }
     //Metodo que retorna con argumentos
    
       public static void sumaDosNumerosArgumentos(int numero1,int numero2){

        int resultado= numero1+numero2;
        //return resultado;
        System.out.println("La suma es "+resultado);
        
       
    }
       
       public static void retornaDatos(String nombre,String nacionalidad){
           System.out.println("mi nombre es "+nombre+" mi nacionalidad es "+nacionalidad);
       } 
    
    
}
