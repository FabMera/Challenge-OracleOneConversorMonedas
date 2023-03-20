package conversor_monedas;

import javax.swing.*;

public class ConvertirMonedas {
    /*valor dolar actual CHILE: $814,84 =>   18/03/2023*/
    /*valor euro actual CHILE: $876,13 */
    /*valor libra actual CHILE : $993,71 */
    /* valor won actual :$0,62*/
    /* valor yen : $6,18 */
    public void ConvertirPesosCHaDolares(double valor) {
        double dolarMoneda = valor / 814.84;
        dolarMoneda = (double) Math.round(dolarMoneda * 100d / 100);
        JOptionPane.showMessageDialog(null, "Tienes $ :" + " " + dolarMoneda + " " + "dolares");
    }

    public void ConvertirPesosCHaEuros(double valor) {
        double euroMoneda = valor / 876.13;
        euroMoneda = (double) Math.round(euroMoneda * 100d / 100);
        JOptionPane.showMessageDialog(null, "Tienes $ :" + " " + euroMoneda + " " + "euros");
    }

    public void ConvertirPesosCHaLibras(double valor) {
        double libraMoneda = valor / 993.71;
        libraMoneda = (double) Math.round(libraMoneda * 100d / 100);
        JOptionPane.showMessageDialog(null, "Tienes $ :" + " " + libraMoneda + " " + "libras");
    }

    public void ConvertirPesosCHaWon(double valor) {
        double wonMoneda = valor / 0.62;
        wonMoneda = (double) Math.round(wonMoneda * 100d / 100);
        JOptionPane.showMessageDialog(null, "Tienes $ :" + " " + wonMoneda + " " + "won SurCoreanos");
    }

    public void ConvertirPesosCHaYenes(double valor) {
        double yenMoneda = valor / 6.18;
        yenMoneda = (double) Math.round(yenMoneda * 100d / 100);
        JOptionPane.showMessageDialog(null, "Tienes $ :" + " " + yenMoneda + " " + "yen Japones");
    }

    /*METODOS INVERSOS*/
    public void ConvertirDolaresAPesoCH(double valor) {
        double dolarMoneda = valor * 814.84;
        dolarMoneda = (double) Math.round(dolarMoneda * 100d / 100);
        JOptionPane.showMessageDialog(null, "Tienes" + " " + dolarMoneda + " " + "pesos Chilenos");
    }

    public void ConvertirEurosAPesosCH(double valor) {
        double euroMoneda = valor * 876.13;
        euroMoneda = (double) Math.round(euroMoneda * 100d / 100);
        JOptionPane.showMessageDialog(null, "Tienes" + " " + euroMoneda + " " + "pesos Chilenos");
    }

    public void ConvertirLibrasAPesoCH(double valor) {
        double libraMoneda = valor * 993.71;
        libraMoneda = (double) Math.round(libraMoneda * 100d / 100);
        JOptionPane.showMessageDialog(null, "Tienes" + " " + libraMoneda + " " + "pesos Chilenos");
    }

    public void ConvertirWonAPesoCH(double valor) {
        double wonMoneda = valor * 0.62;
        wonMoneda = (double) Math.round(wonMoneda * 100d / 100);
        JOptionPane.showMessageDialog(null, "Tienes" + " " + wonMoneda + " " + "pesos Chilenos");
    }

    public void ConvertirYenAPesoCH(double valor) {
        double yenMoneda = valor * 6.18;
        yenMoneda = (double) Math.round(yenMoneda * 100d / 100);
        JOptionPane.showMessageDialog(null, "Tienes" + " " + yenMoneda + " " + "pesos Chilenos");
    }


}