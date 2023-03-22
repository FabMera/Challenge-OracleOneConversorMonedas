package conversor_monedas;

import javax.swing.*;

public class ConversionOption {
    ConvertirMonedas monedas = new ConvertirMonedas();
    Object[] monedasMenu = {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés", "De Pesos a Won SurCoreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras  a Pesos", "De Yen a Pesos", "De Won  a Pesos"};

    public void ConversionDeMonedas(double input) {
        String opcion = (JOptionPane.showInputDialog(null, "Elige el tipo de cambio que deseas realizar : ", "Monedas", JOptionPane.PLAIN_MESSAGE, null, monedasMenu, "SELECCION")).toString();


        switch (opcion) {
            case "De Pesos a Dólar":
                monedas.ConvertirPesosCHaDolares(input);
                break;
            case "De Pesos a Euro":
                monedas.ConvertirPesosCHaEuros(input);
                break;
            case "De Pesos a Libras Esterlinas":
                monedas.ConvertirPesosCHaLibras(input);
                break;
            case "De Pesos a Yen Japonés":
                monedas.ConvertirPesosCHaYenes(input);
                break;
            case "De Pesos a Won SurCoreano":
                monedas.ConvertirPesosCHaWon(input);
                break;
            case "De Dólar a Pesos":
                monedas.ConvertirDolaresAPesoCH(input);
                break;
            case "De Euro a Pesos":
                monedas.ConvertirEurosAPesosCH(input);
                break;
            case "De Libras  a Pesos":
                monedas.ConvertirLibrasAPesoCH(input);
                break;
            case "De Yen a Pesos":
                monedas.ConvertirYenAPesoCH(input);
                break;
            case "De Won  a Pesos":
                monedas.ConvertirWonAPesoCH(input);
                break;

        }
    }
}
