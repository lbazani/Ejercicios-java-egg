
package guia4;

import java.util.Scanner;


public class Guia4_ejercicio2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nombre,opc;
        int edad,persona,vueltas;
        System.out.println("Ingrese la cantidad de personas");
        persona = sc.nextInt();
        vueltas = 0;
        for (int i = 0; i < persona; i++) {
            System.out.println("Ingrese el nombre de la persona, seguido de su edad");
        nombre = sc.next();
        edad = sc.nextInt();
        mostrarinfo(nombre,edad);
        vueltas++;
            if (vueltas < persona) {
                System.out.println("Desea seguir ingresando peronsas?(Si/No)");
            opc = sc.next();
            if ("No".equals(opc)) {
                persona = 0;
            } 
            }   
        }
    }
    public static void mostrarinfo(String nombre,int edad){
        
        if(edad>=18){
             System.out.println(nombre+" de "+edad+" años es mayor de edad");
        }else{
            System.out.println(nombre+" de "+edad+" años es menor de edad");
        }
    }
}
