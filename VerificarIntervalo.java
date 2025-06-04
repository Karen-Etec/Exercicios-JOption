/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

import javax.swing.JOptionPane;

/**
 *
 * @author musas
 */
public class VerificarIntervalo {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Digite seu numero:");
        int numero = Integer.parseInt(numeroStr);
        
        if(numero >=10 && numero <=20) {
            JOptionPane.showMessageDialog(null, "O numero esta dentro do intervalo");
        } else{
            JOptionPane.showMessageDialog(null, "O numero nao esta dentro do intervalo");
        }
    }
}
