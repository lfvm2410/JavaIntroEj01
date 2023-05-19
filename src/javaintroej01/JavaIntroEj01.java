/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej01;
import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class JavaIntroEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JavaIntroEj01 javaIntroEj01 = new JavaIntroEj01();
        //javaIntroEj01.Ejercicio1_2();
        //javaIntroEj01.DeteccionErrores1();
        //javaIntroEj01.DeteccionErrores2();
        //javaIntroEj01.Ejercicio3();
        //javaIntroEj01.Ejercicio4();
        //javaIntroEj01.Ejercicio5();
        //javaIntroEj01.DeteccionErrores3();
        //javaIntroEj01.Ejercicio6();
        javaIntroEj01.Ejercicio7();
        // Pagina actual #24. Estructuras repetitivas
    }
    
    public void Ejercicio1_2(){
        int a = 1;
        double b = 0.0;
        float c = 0;
        char d = 'A';
        String e = "Hola";
        System.out.println("Ejercicio 1 y 2");
    }
    
    public void DeteccionErrores1(){
        String nombre;
        boolean bandera;
        char letra;
        System.out.println("Deteccion de errores 1");
    }
    
    public void DeteccionErrores2(){
        int numero = 48;
        double decimales = 3.55;
        boolean bandera = false;
        System.out.println("Deteccion de errores 2");
    }
    
    public void Ejercicio3(){
        int num1 = 10;
        int num2 = 14;
        int suma = num1 + num2;
        int resta = num1 - num2;
        num1--;
        num2++;
        boolean num2Mayor = num2 > num1;
        boolean num1Menor = num1 < num2;
        System.out.println("Ejercicio 3");
    }
    
    public void Ejercicio4(){
        System.out.print("Luis Fernando");
        System.out.println(" Vargas Menéndez");
        System.out.println("Ejercicio 4");
    }
    
    public void Ejercicio5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor booleano: ");
        boolean bool = scanner.nextBoolean();
        System.out.println("Ingrese un valor flotante: ");
        double doubl = scanner.nextDouble();
        System.out.println("Ingrese un valor de caracter: ");
        String a = scanner.next();
        char chr = a.charAt(0);
    }
    
    public void DeteccionErrores3(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();
        System.out.println("Deteccion de errores 3");
    }
    
    public void Ejercicio6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = scanner.nextInt();
        if (num1 > 25 && num2 > 25){
            System.out.println("Ambos numeros son mayores que 25!");
        }else if(num1 > 25){
            System.out.println("El primer numero es mayor que 25!");
        }else if(num2 > 25){
            System.out.println("El segundo numero es mayor que 25!");
        }else{
            System.out.println("Ningun numero es mayor que 25!");
        }
    }
    
    public void Ejercicio7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor entre 1 y 4:");
        int valor = scanner.nextInt();
        switch (valor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
                break;
        }
    }
}
