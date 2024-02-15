
import javax.swing.JOptionPane;

public class a02ex2 {
    public static void main(String args[]) {
        int VetSoma [][] , a, b , soma = 0;
        VetSoma = new int [2][2];
        
        
         for (a = 0 ; a <= 1 ; a++) {
             for( b = 0; b <= 1; b++){
                 VetSoma[a][b] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
                 soma = soma + VetSoma[a][b];
             }
        }
        System.out.println("A soma dos 4 valores digitados é: " + soma);
        JOptionPane.showMessageDialog(null,"A soma dos 4 valores digitados é: " + soma);
        System.exit(0);
    }
}
