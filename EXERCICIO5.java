import java.util.Scanner;

public class EX5 {

    public static void main(String[] args) {
        int n, l, valor, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Numero inteiro positivo:");
        n = s.nextInt();

        for (l = 1; l <= n; l++) {
            valor = 1;
            System.out.print(valor);
            System.out.println("  ");

            if (n != 1) {
                for (l = 1; l < n; l++) {
                    valor = 1;
                    System.out.print(valor + " ");

                    for (c = 1; c <= l; c++) {
                        valor = (valor * (l - c + 1)) / c;
                        System.out.print(valor + " ");
                    }
                    System.out.println("  ");
                }
            }
        }
    }
}
