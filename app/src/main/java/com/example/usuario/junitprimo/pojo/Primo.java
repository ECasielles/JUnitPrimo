package com.example.usuario.junitprimo.pojo;

/**
 * Simula la clase Math, que es final y con
 * métodos estáticos
 */

public final class Primo {

    /**
     * Método que comprueba si un número es primo
     * @param numero
     * @return
     */
    public static boolean esPrimo(int numero){
        boolean esPrimo = true; //1
        if (numero < 0)         //2
            esPrimo = false;    //3
        else if (numero < 2)    //4
            esPrimo = false;    //5
        else
            for (int i = 2; i < numero; i++)    //6, 7, 10
                if(numero % i == 0)             //8
                    esPrimo = false;            //9
        return esPrimo;                         //11

        /**
         * Ciclos:
         * 1,2,3,11;            Entero negativo
         * 1,2,4,5,11;          Entero no negativo no primo menor que 2
         * 1,2,4,6,7,11         Entero no negativo primo igual a 2
         * 1,2,4,6,7,8,10,6,7,11;   Entero no negativo no primo
         * 1,2,4,6,7,8,9,10,6,7,11; Entero no negativo primo
         *
         * Valores de entrada para test: -1, [0,1], 2, 4, 3
         */
    }
}
