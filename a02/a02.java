/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import javax.swing.*;

public class a02 {

    public static void main(String args[]) {
        System.out.println("Rei deu bom");
        int VetSoma [] , i , soma = 0;
        VetSoma = new int [10];
        
        for (i = 0 ; i <= 9 ; i++) {;
            VetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            soma = soma + VetSoma[i];
        }
        System.out.println("A soma dos 10 valores digitados é: " + soma);
        JOptionPane.showMessageDialog(null,"A soma dos 10 valores digitados é: " + soma);
        System.exit(0);
    }
}
