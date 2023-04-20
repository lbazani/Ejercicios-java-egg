
package guia4;

import java.util.Scanner;


public class Guia4_ejercicio3 {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      double euro;
      String dolar,libra,yen,moneda;
        System.out.println("Ingrese la cantidad de euros a convertir");
        euro = sc.nextDouble();
        
        System.out.println("Ingrese a que moneda quiere convertirlo: "
                + " D. dolares "
                + " L. libras "
                + " Y. yenes ");
        moneda = sc.next();
        switch (moneda) {
            case "D":
                dolares(euro,moneda);
                break;
            case "L":
                dolares(euro,moneda);
                break;
            case "Y":
                dolares(euro,moneda);
                break;
        }
        
    }
   public static void dolares(double euro,String moneda) {
       double retorno;
       if (moneda.equals("D")) {
           retorno = euro * 1.28611;
           System.out.println("Los euros convertidos a dolares son: " + retorno + " dolares");
       } else if (moneda.equals("L")) {
           retorno = euro * 0.86;
           System.out.println("Los euros convertidos a libras son: " + retorno + " libras");
       } else if(moneda.equals("Y")){
           retorno = euro * 129.852;
           System.out.println("Los euros convertidos a yenes son: " + retorno + " yenes");
       }
   }
}
