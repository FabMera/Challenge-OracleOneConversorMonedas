package conversor_temp;

import javax.swing.*;

public class ConvertirTemp {
    /*CELCIUS*/
    public void CelciusAFarenheit(double temp) {
        double CF = (temp * 9 / 5) + 32;
        CF = (double) Math.round(CF * 100d) / 100;
        JOptionPane.showMessageDialog(null, temp + "°C" + "son" + CF + "°F");
    }

    public void CelciusAKelvin(double temp) {
        double CK = (temp) + 273.15;
        CK = (double) Math.round(CK * 100d) / 100;
        JOptionPane.showMessageDialog(null, temp + "°C" + "son" + CK + "°K");
    }

    public void CelciusARankine(double temp) {
        double CR = (temp * 9 / 5) + 491.67;
        CR = (double) Math.round(CR * 100d) / 100;
        JOptionPane.showMessageDialog(null, temp + "°C" + "son" + CR + "°R");
    }

    /*  fahrenheit */

    public void FahrenheitACelcius(double temp) {
        double FC = (temp - 32) * 5 / 9;
        FC = (double) Math.round(FC * 100d) / 100;
        JOptionPane.showMessageDialog(null, temp + "°F" + "son" + FC + "°C");
    }

    public void FarenheitAKelvin(double temp) {
        double FK = (temp + 459.67) * 5 / 9;
        FK = (double) Math.round(FK * 100d) / 100;
        JOptionPane.showMessageDialog(null, temp + "°F" + "son" + FK + "°K");
    }

    public void FahrenheitARankine(double temp) {
        double FR = temp + 459.67;
        FR = (double) Math.round(FR * 100d) / 100;
        JOptionPane.showMessageDialog(null, temp + "°F" + "son" + FR + "°R");
    }

}
