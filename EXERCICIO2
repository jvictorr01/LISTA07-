import java.util.Scanner;

public class EXERCICIO2 {
// Faça um programa que preencha um vetor de tamanho 100 com os 100 primeiros naturais
// que não são múltiplos de 7 ou que terminam com 7.

    public static void main(String[] args) {
        int num[] = new int[100];
        int numero, cont=0;
        Scanner scanner = new Scanner(System.in);


        do{
            System.out.println("");
            System.out.println("informe um numero: ");
            numero = scanner.nextInt();
            System.out.println("");
             if (numero % 7 == 0){
                 System.out.println("numero "+numero+" e multiplo de 7 e nao sera inserido no vetor");
             }
            else if((numero+3) % 10 == 0){
                 System.out.println("numero "+numero+"  termina em 7 e nao sera inserido no vetor");
            }
            else{
                num[cont] = numero;
                 System.out.println("numero "+numero+" foi inserido na posicao "+(cont+1)+" de 100 do vetor");
                 cont = cont+1;
             }
        }while (cont!=99);
        for(int i=0;i<num.length;i++){
            System.out.println("posição "+(i+1)+" : "+num[i]);
        }
    }
}
