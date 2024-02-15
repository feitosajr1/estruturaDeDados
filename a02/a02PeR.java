// Francisco de Assis Feitosa Sales Junior.
// Atividade prática aula 2. 

import javax.swing.*;

public class a02PeR {
    public static void main(String args[]) {
        int VetSoma [] , i , media, soma = 0;
        VetSoma = new int [50];
        for (i = 0 ; i <= 49 ; i++) {
            VetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor n° " + i + " do vetor."));
            soma = soma + VetSoma[i];
        }
        media = soma / 50;
        System.out.println("A soma dos 50 valores digitados é " + soma + ", a média aritimética é " + media);
        JOptionPane.showMessageDialog(null,"A soma dos 50 valores digitados é " + soma + ", a média aritimética é " + media);
        
        System.exit(0);
    }
}