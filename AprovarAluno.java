/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AprovarAluno;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class AprovarAluno {
    public static void main(String[] args) {
        String notaStr = JOptionPane.showInputDialog("Digite a nota do aluno:");
        int nota = Integer.parseInt(notaStr);
        
        if(nota >= 7) {
            JOptionPane.showMessageDialog(null, "Aprovado");
        } else if(nota >= 5 && nota <= 6.9) {
            JOptionPane.showMessageDialog(null, "Em recuperacao");
        } else{
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
    
}
