/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mijavaesencial1;

/**
 *
 * @author victo
 */
public class MiJavaEsencial1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int operador1=15;
        int operador2=20;
        int operador3=22;
        int operador4=25;
        
          int suma;
          int resta;
          int multiplicacion;
          int division;
          int modulo;
          int incremento;
          int decremento;  
          
          suma=operador1+operador2+operador3+operador4;
          resta=operador1-operador2-operador3-operador4;
          multiplicacion=operador1*operador2*operador3*operador4;
          division=operador1/operador2/operador3/operador4;
          modulo=operador1%operador2%operador3%operador4;
          incremento=multiplicacion+1;
          decremento=division-1;
          
          System.out.println(suma);
          System.out.println(resta);
          System.out.println(multiplicacion);
          System.out.println(division);
          System.out.println(modulo);
          System.out.println(incremento);
          System.out.println(decremento);
          System.out.println("====================="); 
        
        String nombreMinuscula = "claudio";
        System.out.println(nombreMinuscula.toUpperCase());
        System.out.println("=====================");
        
        String nombreMayuscula ="CLAUDIO";
        String apellidoMayuscula1="SOLAR";
        String apellidoMayuscula2="TORRES";
        
        System.out.println(nombreMayuscula.toLowerCase()+" "+apellidoMayuscula1.toLowerCase()+" "+apellidoMayuscula2.toLowerCase());
        System.out.println("=====================");
        
        String cadenaCompleto= "Java no es tan complicado";
        System.out.println(cadenaCompleto.indexOf("no"));
          
    }
}
