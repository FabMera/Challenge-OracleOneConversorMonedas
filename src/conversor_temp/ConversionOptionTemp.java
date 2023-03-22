package conversor_temp;

import javax.swing.*;

public class ConversionOptionTemp {
    ConvertirTemp conversionTemp = new ConvertirTemp();
    Object[] menuTemp = {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Celsius a Rankine",
            "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Fahrenheit a Rankine"};

    public void conversionDeTemp(double input) {

        String option = (JOptionPane.showInputDialog(null, "Elige el tipo de conversion de T ° que deseas realizar : ", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, menuTemp, "SELECCION")).toString();

        switch (option) {
            case "De Celsius a Fahrenheit":
                conversionTemp.CelciusAFarenheit(input);
                break;

            case "De Celsius a Kelvin":
                conversionTemp.CelciusAKelvin(input);
                break;

            case "De Celsius a Rankine":
                conversionTemp.CelciusARankine(input);
                break;

            case "De Fahrenheit a Celsius":
                conversionTemp.FahrenheitACelcius(input);
                break;

            case "De Fahrenheit a Kelvin":
                conversionTemp.FarenheitAKelvin(input);
                break;

            case "De Fahrenheit a Rankine":
                conversionTemp.FahrenheitARankine(input);
                break;
        }
    }
}