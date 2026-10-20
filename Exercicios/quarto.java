/*# Questão 4: Soma de Números com while

Desenvolva um programa que leia números inteiros do usuário em um laço while até que ele digite 0 (zero). 
Ao final, exiba a soma de todos os números digitados. Utilize try/catch para tratar entradas inválidas. */

import java.util.Scanner;
import java.util.InputMismatchException;
 
public class quarto {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    int soma = 0;
    int numero;

    do {

        try {

        System.out.println("Informe um número: ");
        numero = entrada.nextInt();
        soma = soma + numero;}
    
        catch (InputMismatchException e) {
            System.out.println("A idade digitada é inválida");
        }

         while (numero != 0)

        System.out.print("A soma dos numeros digitados é: " + soma);

          entrada.close();


    }

}


