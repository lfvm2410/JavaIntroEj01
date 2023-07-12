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
    
    public String [] equipo;

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
        //javaIntroEj01.Ejercicio7();
        //javaIntroEj01.Ejercicio8();
        //javaIntroEj01.Ejercicio9();
        //javaIntroEj01.Ejercicio10();
        //javaIntroEj01.Ejercicio11();
        //javaIntroEj01.Ejercicio12();
        //javaIntroEj01.Ejercicio13();
        //javaIntroEj01.Ejercicio14();
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
    
    public void Ejercicio8(){
        Scanner scanner = new Scanner(System.in);
        int nota = 11;
        while (nota < 0 || nota > 10){
            System.out.println("Ingrese una nota entre 0 y 10: ");
            nota = scanner.nextInt();
        }
    }
    
    public void Ejercicio9(){
        Scanner scanner = new Scanner(System.in);
        int num;
        int contadorNumeros = 1, resultado = 0;
        do{
            System.out.println("Ingrese el numero #" + contadorNumeros + ":");
            num = scanner.nextInt();
            if(num > 0){
                resultado += num;
            }else if(num == 0){
                System.out.println("Se capturó el numero cero");
                break;
            }
            contadorNumeros++;
        }while(contadorNumeros < 20);
        System.out.println("Resultado de sumatoria: " + resultado);
    }
    
    public void Ejercicio10(){
        Scanner scanner = new Scanner(System.in);
        int num;
        int contadorNumeros = 1;
        do{
            System.out.println("Ingrese el numero #" + contadorNumeros + ":");
            num = scanner.nextInt();
            if(num >= 1 && num <= 20){
                System.out.print(num);
                for(int i = 0; i < num; i++){
                    System.out.print("*");
                }
                System.out.println("");
                contadorNumeros++;
            }else{
                System.out.println("Ingrese un numero valido comprendido entre 1 y 20!");
            }
        }while(contadorNumeros <= 4);
    }
    
    public void Ejercicio11(){
        Scanner scanner = new Scanner(System.in);
        String frase, output = "";
        do{
            System.out.println("Ingrese una frase (debe terminar con .): ");
            frase = scanner.nextLine();
        }while(frase.charAt(frase.length()-1) != '.');
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.toLowerCase().charAt(i)){
                case 'a':
                    output += "@";
                    break;
                case 'e':
                    output += "#";
                    break;
                case 'i':
                    output += "$";
                    break;
                case 'o':
                    output += "%";
                    break;
                case 'u':
                    output += "*";
                    break;
                default:
                    output += frase.charAt(i);
                    break;
            }
        }
        System.out.println("Frase resultado: " + output);
    }
    
    public void Ejercicio12(){
        Scanner scanner = new Scanner(System.in);
        int numero_1, numero_2 = 0;
        System.out.println("Ingreso el primer numero: ");
        numero_1 = scanner.nextInt();
        System.out.println("Ingreso el segundo numero: ");
        numero_2 = scanner.nextInt();
        if (numero_1 % numero_2 == 0){
            System.out.println("El numero '" + numero_1 + "' es multiplo del numero '" + numero_2 + "'");
        }else{
            System.out.println("El numero '" + numero_1 + "' no es multiplo del numero '" + numero_2 + "'");
        }
    }
    
    public void Ejercicio13(){
        this.equipo = new String [5];
    }
    
    public void Ejercicio14(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.equipo.length; i++) {
            System.out.println("Ingrese el integrante #" + (i + 1) + " del equipo");
            this.equipo[i] = scanner.nextLine();
        }
    }
}