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
public class Calculadora {
    public static void main(String[] args) {
        String numStr = JOptionPane.showInputDialog("Digite o primeiro numero:");
        double num = Double.parseDouble(numStr);
        
        String num2Str = JOptionPane.showInputDialog("Digite o segundo numero:");
        double num2 = Double.parseDouble(num2Str);
        
        String operadorStr = JOptionPane.showInputDialog("Digite o operador do calculo desejado");
        char operador = operadorStr.charAt(0);
        
        double resultado = 0;
        switch(operador) {
            case '+':
                resultado = num + num2;
                break;
            case '-':
                resultado = num - num2;
                break;
            case '*':
                resultado = num * num2;
                break;
            case '/':
                resultado = num / num2;
                break;
        }
        
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}
