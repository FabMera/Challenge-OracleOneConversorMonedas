import conversor_monedas.ConversionOption;
import conversor_temp.ConversionOptionTemp;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        ConversionOption conversion = new ConversionOption();
        ConversionOptionTemp conversionT = new ConversionOptionTemp();
        Object[] menu = {"Conversor de Monedas", "Conversor de Temperatura"};
        boolean respuesta = true;

        while (respuesta) {
            String options = JOptionPane.showInputDialog(null, "Seleccione una opcion para convertir", "Menu Conversion", JOptionPane.QUESTION_MESSAGE, null, menu, "Seleccionar").toString();

            try {
                if (Objects.equals(options, "Conversor de Monedas")) {

                    String input = JOptionPane.showInputDialog(null, "Ingrese el valor $ a convertir");
                    double valor = Double.parseDouble(input);
                    conversion.ConversionDeMonedas(valor);
                    int res = JOptionPane.showConfirmDialog(null, "¿Desea continuar con otra conversion?");
                    if (JOptionPane.OK_OPTION == res) {
                        System.out.println("Entrar");
                    } else {
                        JOptionPane.showMessageDialog(null, "Haz salido del programa");
                        respuesta = false;
                    }
                } else if (Objects.equals(options, "Conversor de Temperatura ")) {
                    String input = JOptionPane.showInputDialog(null, "Ingrese el valor °T que desea convertir");
                    double valorT = Double.parseDouble(input);
                    conversionT.conversionDeTemp(valorT);
                    int res = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion de T°");
                    if (JOptionPane.OK_OPTION == res) {
                        System.out.println("Entrar");
                    } else {
                        JOptionPane.showMessageDialog(null, "Haz salido del programa");
                        respuesta = false;
                    }
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Debes ingresar solo NÚMEROS");
                System.out.println(ex);
                respuesta = true;

            }
        }

    }
}