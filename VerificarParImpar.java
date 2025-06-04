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
public class VerificarParImpar {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Digite seu numero:");
        int numero = Integer.parseInt(numeroStr);
        
        if(numero % 2 == 0){
            JOptionPane.showMessageDialog(null, "O numero eh par");
        } else{
            JOptionPane.showMessageDialog(null, "O numero eh impar");
        }
    }
}
