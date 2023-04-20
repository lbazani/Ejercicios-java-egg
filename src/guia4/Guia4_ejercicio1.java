
package guia4;

import java.util.Scanner;


public class Guia4_ejercicio1 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int num1,num2,suma,resta,multi,divi;
       int opc;
        System.out.println("Ingrese dos numeros");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println(" MENU "
                    + " 1.Sumar "
                    + " 2.Restar "
                    + " 3.Multiplicar "
                    + " 4.Dividir "
                    + " Elija opción: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    suma = sumar (num1,num2);
                    System.out.println("Usted eligió la suma " + suma);
                    break;
                case 2:
                    resta = restar (num1,num2);
                    System.out.println("Usted eligió la resta " + resta);
                    break;
                case 3:
                    multi = multiplic (num1,num2);
                    System.out.println("Usted eligió la multiplicación " + multi);
                    break;
                case 4:
                    divi = division (num1,num2);
                    System.out.println("Usted eligió la división " + divi);
                    break;
            }
       
    }
    public static int sumar(int num1,int num2) {
                int suma;
                suma = num1 + num2;
                return suma;
    }
    public static int restar(int num1,int num2) {
        int resta;
        resta = num1 - num2;
        return resta;
    }
    public static int multiplic(int num1,int num2) {
        int multi;
        multi = num1 * num2;
        return multi;
    }
    public static int division(int num1,int num2) {
        int divi;
        divi = num1 / num2;
        return divi;
    }
}
