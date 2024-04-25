/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.badpals;

import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> numerosRomanos= List.of("MMMDCCCLXXXVIII", // 3888
                "MMDCCLXXVII",  // 2777
                "CDXLIV", // 444
                "CDXXXIX" // 439
                 );

        for (String numero : numerosRomanos) {
            RomanNumber romanNumber = new RomanNumber(numero);
            romanNumber.romanCalculator();
        }
    }
}
