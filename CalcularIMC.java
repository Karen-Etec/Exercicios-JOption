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
public class CalcularIMC {
    public static void main(String[] args) {
        String pesoStr = JOptionPane.showInputDialog("Digite seu peso:");
        int peso = Integer.parseInt(pesoStr);
        String alturaStr = JOptionPane.showInputDialog("Digite sua altura :");
        float altura = Float.parseFloat(alturaStr);
        
        double imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, "Seu IMC eh " + imc);
    }
}
