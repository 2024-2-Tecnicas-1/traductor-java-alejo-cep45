package com.mycompany.traductorjava;

import java.util.Scanner;
import java.util.HashMap;

public class TraductorJava {
    private static final HashMap<Integer, String> numESP = new HashMap<>();
    private static final HashMap<Integer, String> numEN = new HashMap<>();
    public static void main(String[] args) {
        
        numESP.put(0, "cero");
        numESP.put(1, "uno");
        numESP.put(2, "dos");
        numESP.put(3, "tres");
        numESP.put(4, "cuatro");
        numESP.put(5, "cinco");
        numESP.put(6, "seis");
        numESP.put(7, "siete");
        numESP.put(8, "ocho");
        numESP.put(9, "nueve");
        numESP.put(10, "diez");
        numESP.put(11, "once");
        numESP.put(12, "doce");
        numESP.put(13, "trece");
        numESP.put(14, "catorce");
        numESP.put(15, "quince");
        numESP.put(16, "dieciseis");
        numESP.put(17, "diecisiete");
        numESP.put(18, "dieciocho");
        numESP.put(19, "diecinueve");
        numESP.put(20, "veinte");
        numESP.put(21, "veinte");
        numESP.put(22, "veinte");
        numESP.put(23, "veinte");
        numESP.put(24, "veinte");
        numESP.put(25, "veinte");
        numESP.put(26, "veinte");
        numESP.put(27, "veinte");
        numESP.put(28, "veinte");
        numESP.put(29, "veinte");
        numESP.put(30, "treinta");
        numESP.put(40, "cuarenta");
        numESP.put(50, "cincuenta");
        numESP.put(60, "sesenta");
        numESP.put(70, "setenta");
        numESP.put(80, "ochenta");
        numESP.put(90, "noventa");
        numESP.put(100, "cien");
        numESP.put(200, "doscientos");

        
        numEN.put(0, "zero");
        numEN.put(1, "one");
        numEN.put(2, "two");
        numEN.put(3, "three");
        numEN.put(4, "four");
        numEN.put(5, "five");
        numEN.put(6, "six");
        numEN.put(7, "seven");
        numEN.put(8, "eight");
        numEN.put(9, "nine");
        numEN.put(10, "ten");
        numEN.put(11, "eleven");
        numEN.put(12, "twelve");
        numEN.put(13, "thirteen");
        numEN.put(14, "fourteen");
        numEN.put(15, "fifteen");
        numEN.put(16, "sixteen");
        numEN.put(17, "seventeen");
        numEN.put(18, "eighteen");
        numEN.put(19, "nineteen");
        numEN.put(20, "twenty");
        numEN.put(30, "thirty");
        numEN.put(40, "fourty");
        numEN.put(50, "fifty");
        numEN.put(60, "sixty");
        numEN.put(70, "seventy");
        numEN.put(80, "eighty");
        numEN.put(90, "ninety");
        numEN.put(100, "one hundred");
        numEN.put(200, "two hundred");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int suma= num1+num2;
        //convertir(num1);
        //convertir(num2);
        //convertir(suma);
            
        
        System.out.println("La suma de "+numESP.get(num1)+" más "+numESP.get(num2)+" es "+numESP.get(suma));
        System.out.println("The sum of "+numEN.get(num1)+" plus "+numEN.get(num2)+" is "+numEN.get(suma));
    }
    
       /*public static String convertir(int a) {
        if (a < 20) {
            return numESP.get(a);
        } else if (a < 100) {
            int sobra = a % 10;
            int sobra2 = a - sobra;
            //return numESP.get(sobra2) + " y " + numESP.get(sobra);
            if (sobra == 0) {
                return numESP.get(sobra2);

            } else {
                return numESP.get(sobra2) + " y " + numESP.get(sobra);
            }

        }
        
    }

    System.out.println("La suma de "+numESP.get(sobra2)+" más "+numESP.get(num2)+" es "+numESP.get(suma));
    */
}
