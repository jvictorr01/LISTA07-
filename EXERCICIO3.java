import java.util.Scanner;

public class EXERCICIO3 {
    public static void main(String[] args) {


        //Faça um programa que receba 6 números inteiros e mostre:
        //• Os números pares digitados;
        //• A soma dos números pares digitados;
        //• Os números ímpares digitados;
        //• A quantidade de números ímpares digitados;

        int[] par = new int[6];
        int[] impar = new int[6];
        int j=0, k=0, soma=0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("digite o "+(i+1)+" numero:");
            int num = scanner.nextInt();
            if(num % 2 == 0){
                par[j]= num;
                j++;
            }
            else{
                impar[k]=num;
                k++;
            }
        }
        System.out.println("================================================");
        System.out.println("");
        System.out.print(" -Numeros pares digitados: ");
        for (int i=0; i < par.length;i++){
            if(par[i]!=0) {
                System.out.print(par[i] + "   ");
                soma = (soma + par[i]);
            }
        }
        System.out.println("");
        System.out.println(" -A soma dos pares: "+soma);
        System.out.println("");
        System.out.println("================================================");
        System.out.println("");
        System.out.print(" -Os numeros impares digitados: ");
        for (int i=0;i<impar.length;i++) {
            if (impar[i] != 0) {
                System.out.print(impar[i] + "   ");
            }
        }
        System.out.println("");
        System.out.println(" -Quantidade de impares: "+k);
    }
}
