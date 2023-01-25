package aplicação;

import entidades.QuartoPessoa;
import java.util.Arrays;
import java.util.Collection;
import static java.util.Collections.list;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantos quartos serão alugados: ");
        int tamanho = teclado.nextInt();
        QuartoPessoa[] vetor = new QuartoPessoa[10];
        for (int i = 0; i < tamanho; i++) {
            System.out.println("");
            teclado.nextLine();
            System.out.println("Aluguel #"+(i+1)+":");
            System.out.print("Nome: ");
            String nome = teclado.nextLine();
            System.out.print("Email: ");
            String email = teclado.nextLine();
            System.out.print("Quarto: ");
            int numero = teclado.nextInt();
            vetor[numero] = new QuartoPessoa(nome, email);
        }
        System.out.println("");
        System.out.println("Quartos Alugados: ");
        for (int i = 0; i < 10; i++) {
            if (vetor[i]!= null) {
                System.out.println(i+": "+vetor[i]);
                
            }
        }
     
        teclado.close();
    }

}
