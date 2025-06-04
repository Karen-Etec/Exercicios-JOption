/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades;

import javax.swing.JOptionPane;

/**
 *
 * @author musas
 */
public class VerificarVoto {
    public static void main(String[] args) {
        String idadeStr = JOptionPane.showInputDialog("Digite sua idade:");
        int idade = Integer.parseInt(idadeStr);
        String nacionalidade = JOptionPane.showInputDialog("Digite sua nacionalidade:");
        
        //essa funcao ignora os maiusculos e minusculos
        if(idade >= 16 && nacionalidade.equalsIgnoreCase("brasileira")) {
            JOptionPane.showMessageDialog(null, "Voce pode votar");
        } else{
            JOptionPane.showMessageDialog(null, "Voce nao pode votar");
        }
    }
    
}
