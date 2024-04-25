package edu.badpals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumber {
    private final String romanNumber;
    private int decimalNumber;
    private static Pattern REGEXRESTA = Pattern.compile("I(?=[XV])|X(?=[LC])|C(?=[DM])");

    private  String grupoResta;
    private String grupoSuma;


    public RomanNumber(String numeroRomano) {
        this.romanNumber = numeroRomano;
        this.decimalNumber = decimalNumber;
    }

    public String getRomanNumber() {
        return romanNumber;
    }

    public int getDecimalNumber() {
        return decimalNumber;
    }

    public int toDecimal(String numeroRomano) {

        int sumaValores = 0;

        for (int i = 0; i < numeroRomano.length(); i++) {
            char letraRomana = numeroRomano.charAt(i);
            String letraRomanaParseada= String.valueOf(letraRomana);

            try {
                int valorDecimalNumeroRomano = RomanSymbols.valueOf(letraRomanaParseada).getValorDecimal();
                sumaValores += valorDecimalNumeroRomano;
            } catch (IllegalArgumentException e) {
                System.out.println("El símbolo '" + letraRomanaParseada + "' no es válido.");

            }
        }
        return sumaValores;
    }

    public int  romanCalculator () {

        Matcher matcher = REGEXRESTA.matcher(this.romanNumber);
        int resultadoFinal = 0;
        int sumaDecimal = 0;
        int restaDecimal = 0;

        if(!matcher.find()){
            grupoSuma = this.romanNumber;
            sumaDecimal = toDecimal(grupoSuma);
            resultadoFinal = sumaDecimal;
        }
        else{
            while (matcher.find()) {
                grupoResta = matcher.group();
                grupoSuma = matcher.replaceAll("");
                sumaDecimal = toDecimal(grupoSuma);
                restaDecimal = toDecimal(grupoResta);
                resultadoFinal = sumaDecimal-restaDecimal;
            }
        }

        System.out.println("El numero romano " + this.romanNumber + " representa en decimal el numero " + resultadoFinal);

        return resultadoFinal;
    }

}
