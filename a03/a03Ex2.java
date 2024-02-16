// Ordenações em Java
// Quick Sort

public class a03Ex2 {
    
    public static void quicksort (int p, int q, int vetor[]) {
        int x;
        
        if (p < q){
            x = particao(p, q, vetor);
            quicksort(p, x-1, vetor);
            quicksort(x + 1, q, vetor);   
        }
    }
    
    
    public static void main(String args[]) {
        System.out.print("iniciando");
        
        }
        System.exit(0);
    }


