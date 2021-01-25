package com.ejemplo.Kyosuke;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
        int contadorPar = 0, contadorImpar = 0, contadorCero =0;
        System.out.println("Indique cuantos enteros vas a ingresar: ");
        int numMaximo = teclado.nextInt();
        for (int i = 0; i < numMaximo; i++) {
            System.out.println("Entero #" + (i+1) + ": ");
            int numero = teclado.nextInt();
            if (numero != 0 && numero % 2 == 0) {
                contadorPar ++;
            }
            else if (numero % 2 != 0 && numero % 2 != 0) {
                contadorImpar ++;
            }
            else if (numero == 0){
                contadorCero ++;
            }
        }
        System.out.println("Numero de pares: "+contadorPar);
        System.out.println("Numero de impares: "+contadorImpar);
        System.out.println("Numero de ceros: "+contadorCero);
    }
}