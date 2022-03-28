public class Exercicio2 {
    public static void main(String[] args) {
            int vetor[] = {15, 20, 55, 10, 85, 36, 77, 56, 66, 25};
            int menorvalor = vetor[0];
            int maiorvalor = vetor[0];

            for(int i = 0;i < 10;i++){
                if(vetor[i] < menorvalor){
                    menorvalor = vetor[i];   
                }
                if(vetor[i] > maiorvalor){
                    maiorvalor = vetor[i];
                }

                //System.out.println(vetor[i]);
            }
            System.out.println("Menor Valor: " + menorvalor);
            System.out.println("Maior Valor: " + maiorvalor);
        }
    
}
