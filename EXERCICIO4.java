mport java.util.Arrays;
import java.util.Scanner;

public class EXERCICIO4 {
    // Faça um programa que leia dois vetores de 10 elementos. Crie um vetor que seja a união entre
    //os 2 vetores anteriores, ou seja, que contém os números dos dois vetores. Não deve conter
    //números repetidos.

    public static void main(String[] args) {
        int[] vetA = new int[10];
        int[] vetB = new int[10];
        int[] vetAB = new int[20];
        int[] uniao = new int[20];
        int cont=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("------ Vetor A ------");
        for(int i=0; i<vetA.length;i++){
            System.out.println("-Digite o "+(i+1)+" numero: ");
            vetA[i]= scanner.nextInt();
        }
        System.out.println("_______________________");
        System.out.println("------ Vetor B ------");
        for (int i=0; i<vetB.length;i++){
            System.out.println("-Digite o "+(i+1)+" numero: ");
            vetB[i]= scanner.nextInt();
        }
      for (int j=0; j<10;j++){
          vetAB[cont]=vetA[j];
          cont=(cont+1);
          vetAB[cont]=vetA[j];
          cont=(cont+1);
      }
        Arrays.sort(vetAB);
cont=0;
        for (int i=0; i<vetAB.length;i++){
            if (vetAB[i] != uniao[cont]){
                cont=cont+1;
                uniao[cont]= vetAB[i];
            }
        }
        for (int i=0; i<vetAB.length;i++) {
            if(uniao[i] != 0) {
                System.out.print(uniao[i] + " - ");
            }
        }
    }
}
