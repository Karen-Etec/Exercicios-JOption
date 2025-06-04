/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CompararNumero;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class CompararNumero {
    public static void main(String[] args) {
        String n1Str = JOptionPane.showInputDialog("Digite o primeiro numero:");
        int n1 = Integer.parseInt(n1Str);
        String n2Str = JOptionPane.showInputDialog("Digite o segundo numero");
        int n2 = Integer.parseInt(n2Str);
        
        if(n1 > n2) {
            JOptionPane.showMessageDialog(null, "O numero " + n1 + " eh maior que " + n2);
        } else if(n1 < n2) {
            JOptionPane.showMessageDialog(null, "O numero " + n2 + " eh maior que " + n1);
        } else{
            JOptionPane.showMessageDialog(null, "Os numeros sao iguais");
        }
    }
}
