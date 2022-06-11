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
        
        //Salida de Datos de Java
        
      //Mostrar un número por consola

     System.out.println(10);

      //Mostrar una suma de 4 números por consola

     System.out.println(5+4+7+9);
     System.out.println("====================="); 
     
     //Variables en Java + Salida de Datos en java
//Mostrar por consola la suma de 3 números enteros creando 3 variables;

int miNumero1 = 6,  miNumero2 = 9, miNumero3 = 12;
System.out.println(miNumero1+miNumero2+miNumero3);
System.out.println("====================="); 
//Mostrar por consola tus nombres completos creando más de 2 variables;

String miNombre1 = "Claudio", miApellido1 = "Solar", miApellido2 = "Torres";
System.out.println(miNombre1+" "+miApellido1+" "+miApellido2);
System.out.println("====================="); 	
//Mostrar por consola tu Nombre solo utilizando variables CHAR;
	
char miCaracter1 = 'C';
char miCaracter2 = 'l';
char miCaracter3 = 'a';
char miCaracter4 = 'u';
char miCaracter5 = 'd';
char miCaracter6 = 'i';
char miCaracter7 = 'o';
System.out.print(miCaracter1);
System.out.print(miCaracter2);
System.out.print(miCaracter3);
System.out.print(miCaracter4);
System.out.print(miCaracter5);
System.out.print(miCaracter6);
System.out.println(miCaracter7);
System.out.println("====================="); 

//Mostrar por consola la suma de 4 números doubles creando 4 variables;

double numeroDouble1, numeroDouble2, numeroDouble3, numeroDouble4;
numeroDouble1=1.5;
numeroDouble2=1.4;
numeroDouble3=1.7;
numeroDouble4=1.9;
System.out.println(numeroDouble1+numeroDouble2+numeroDouble3+numeroDouble4);
System.out.println("====================="); 

//Mostrar por consola la suma de 2 números flotantes creando 2 variables;

	
float miNumeroFloat1 = 6.87f, miNumeroFloat2 = 7.85f;
System.out.println(miNumeroFloat1 + miNumeroFloat2);

//Definir 1 variable tipo Int y una variable de tipo Double, sumarlo, convertirlo a Int y mostrarlo por Consola

int operadorEntero=10;
double operadorDouble6=1.5;
System.out.println((int)(operadorEntero + operadorDouble6));

        
//Mostrar por consola la suma de 4 números doubles creando 4 variables;
	
//Utilizar la notación Camel Lower Case para las variables
        
        /*Operadores en Java
         Realizar las siguientes operaciones con 4 números y mostrarlo por consola (Utilizar una variable para cada número a calcular)
         Suma de números
         Resta de números
         Multiplicación de números
         División de números
         Incremento en 1 de la multiplicación
         Decremento en 1 de división*/
        
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
          
         /*Cadenas de Texto
         Realizar los siguientes ejercicios de cadenas de texto y mostrarlos por consola
         Crear una variable con tu nombre en minúscula y mostrarlo en mayúscula
         Crear 3 variables con tu nombre completo en mayúscula y mostrarlo en minúscula
         Crear una variable con la siguiente frase “Java no es tan complicado” y encontrar la posición de la palabra “no”*/
         
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
         System.out.println("=====================");
        
         /*Concatenación de cadenas de textos
         Crear las variables que consideres correspondientes y muestra el siguiente resultado, concatenando las variables “nombre(espacio) apellido(espacio)está(espacio) aprendiendo(espacio)Java”
         */
          String cadenaComillas="\"";
          String nombreConcat="Claudio";
          String espacio=" ";
          String apellidoConcat="Solar";
          String estaConcat="esta";
          String aprendiendoConcat="aprendiendo";
          String javaConcat="Java";

          System.out.println(cadenaComillas.concat(nombreConcat).concat(espacio).concat(apellidoConcat).concat(espacio).concat(estaConcat).concat(espacio).concat(aprendiendoConcat).concat(espacio).concat(javaConcat).concat(cadenaComillas));
           System.out.println("=====================");
           
          /*Operaciones entre números y cadenas de texto
          ¿Muestran el mismo resultado? ¿Si o no y por qué sucede eso?*/
          
          int numeroSuma1 = 10;
          int numeroSuma2 = 20;
          int resultadoSuma = numeroSuma1+ numeroSuma2;  
          System.out.println(resultadoSuma);
          
          String cadenaNumero1 = "10";
          String cadenaNumero2 = "20";
          String resultadoSumaCdena = cadenaNumero1+ cadenaNumero2;  
          System.out.println(resultadoSumaCdena);
          System.out.println("=====================");
          /*Rpta:No, porque cuando son números se suman, y cuando son textos se concatenan*/
          
         /*15.	Caracteres especiales en Java
-	Mostrar por consola los siguientes enunciados
          Java es un “Lenguaje de Programación” */
         String cadena="Java es un \"Lenguaje de Programacion\"";
         System.out.println(cadena);
         System.out.println("=====================");
         /*Secuencias extras en Java
          Mostrar los siguientes enunciados por consola
          Hoy inicia mi camino 
          En JAVA
          Hoy inicia	mi camino en Java*/
         
         String cadenaExtra1="Hoy inicia mi camino";
         String cadenaExtra2="En JAVA";
         System.out.println(cadenaExtra1+"\n"+cadenaExtra2);
         System.out.println("=====================");
         
         /*Funciones matemáticas en Java
          Mostrar por consola los siguientes resultados
          Hallar el número mayor entre 99 y 200
          Hallar el número menor entre 10 y 20
          Hallar la raíz cuadra de 25
          Hallar el valor absoluto de -6.2
          Mostrar un número aleatorio entre 10-50*/
         
         //Valor máximo
         System.out.println(Math.max(99, 200));

         //Valor minimo 
          System.out.println(Math.min(10, 20));

         //Raiz cuadrada
          System.out.println(Math.sqrt(25));

         //Valor absoluto
         System.out.println(Math.abs(-6.2));

         // Numero aleatorio
          int n = (int) (Math.random() * (50 - 10)) + 10;
          System.out.println(n);
          System.out.println("=====================");
   
         /*Expresiones Booleanas
         Mostrar el resultado por consola las siguientes expresiones Booleanas de las siguientes operaciones
         30 >10
         30<10
         10=10
         */
         int valorComparacion1=30;
         int valorComparacion2=10;
           
         System.out.println(valorComparacion1>valorComparacion2);
           
         System.out.println(valorComparacion1<valorComparacion2);
           
         System.out.println(valorComparacion1==valorComparacion2);
   
   
    }
}
