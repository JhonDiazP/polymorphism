/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aves;

/**
 *
 * @author jhon
 */
public class Aves {
    public static void main(String[] args) {
        TestAves test = new TestAves();
        
        System.out.println("Ejecutando Test del Avesturz\n");
        test.avestruzTest();
        System.out.println("\n\n");
        System.out.println("Ejecutando Test del Canario");
        test.canarioTest();
        System.out.println("\n\n");
        System.out.println("Ejecutando Test de la Gallina");
        test.gallinaTest();
    }
}
