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
public class CalcularTresMedias {
    public static void main(String[] args) {
        String n1Str = JOptionPane.showInputDialog("Digite o primeiro numero:");
        int n1 = Integer.parseInt(n1Str);
        String n2Str = JOptionPane.showInputDialog("Digite o segungo numero:");
        int n2 = Integer.parseInt(n2Str);
        String n3Str = JOptionPane.showInputDialog("Digite o terceiro numero:");
        int n3 = Integer.parseInt(n3Str);
        
        double media = (n1 + n2 + n3) / 3;
        JOptionPane.showMessageDialog(null, "A media eh " + media);
    }
}
