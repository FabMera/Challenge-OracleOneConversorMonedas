import conversor_monedas.ConversionOption;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ConversionOption conversion = new ConversionOption();
        Object[] titulos = {"Conversor de Monedas", "Conversor de Temperatura"};
        boolean respuesta = true;
        while (respuesta) {
            String options = JOptionPane.showInputDialog(null, "Seleccione una opcion para convertir", "Menu", JOptionPane.PLAIN_MESSAGE, null, titulos, "Seleccionar").toString();

            switch (options) {
                case "Conversor de Monedas":
                    String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
                    double valor = Double.parseDouble(input);
                    conversion.ConvertirMonedas(valor);

                    int res = JOptionPane.showConfirmDialog(null, "¿Desea continuar con otra conversion?");
                    if (JOptionPane.OK_OPTION == res) {
                        System.out.println("Entrar");
                    } else {
                        JOptionPane.showMessageDialog(null, "Haz salido del programa");
                        respuesta = false;
                    }
                    break;
                case "Conversor de Temperatura ":
                    System.out.println("No implementado");
                    JOptionPane.showMessageDialog(null, "NO IMPLEMENTADO");
            }


        }
    }
}