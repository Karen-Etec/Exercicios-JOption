/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificarnumero;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class VerificarNumero {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Digite seu numero:");
        int numero = Integer.parseInt(numeroStr);
        
        if(numero != 0 && numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O numero " + numero + " eh par");
        } else if(numero != 0 && numero % 2 != 0) {
            JOptionPane.showMessageDialog(null, "O numero " + numero + " eh impar");
        } else{
            JOptionPane.showMessageDialog(null, "O numero eh zero");
        }
    }
    
}
