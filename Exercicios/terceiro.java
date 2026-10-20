import java.util.Scanner;

public class terceiro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número da tabuada que você quer: ");
        int numero = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

        }

        entrada.close();
    }
}