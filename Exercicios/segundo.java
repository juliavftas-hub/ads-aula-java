import java.util.Scanner;

 
public class segundo {
    public static void main(String[] args){

        // Entrada de Informação
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos anos você tem: ");

        try {
        int idade = entrada.nextInt();
 
        if (idade < 0) {
        System.out.println("Idade não pode ser negativa");

        } else if (idade >= 18 && idade < 60) 
        System.out.println("Você é maior de idade");
        

        else if (idade <= 17) 
        System.out.println("Você é menor de idade");
        

        else if (idade > 60) 
        System.out.println("Você é idoso");
        
         }  catch (InputMismatchException e) {
            System.out.println("A idade digitada é inválida");
        }
 
        entrada.close();
    }
}