/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VerificarParImpar;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ConverterCelsius {
    public static void main(String[] args) {
        String temperaturaStr = JOptionPane.showInputDialog("Digite a temperatura em Celsius:");
        int temperatura = Integer.parseInt(temperaturaStr);
        
        double converter = temperatura * 1.8 + 32;
        JOptionPane.showMessageDialog(null, "A temeperatura em Fahrenheit eh " + converter);
    }
}
