package aplicação;

import entidades.QuartoPessoa;
import java.util.Arrays;
import java.util.Collection;
import static java.util.Collections.list;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pensão John People ");
        System.out.println("Quartos disponiveis: 10 quartos");
        System.out.println("");
        System.out.print("Quantos quartos serão alugados: ");
        int tamanho = teclado.nextInt();
        QuartoPessoa[] vetor = new QuartoPessoa[10];
        for (int i = 0; i < tamanho; i++) {
            System.out.println("");
            teclado.nextLine();
            System.out.println("Aluguel #" + (i + 1) + ":");
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
            if (vetor[i] != null) {
                System.out.println(i + ": " + vetor[i]);
            }
        }
        System.out.println("Quartos disponiveis");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] == null) {
                System.out.println("Quarto: " + i + ": " + " Disponivel");
            }
        }
        System.out.println("");
        System.out.println("Deseja alugar mais quartos? (s/n): ");
        char resposta = teclado.next().charAt(0);
        if (resposta == 's') {
            for (int i = 0; i < tamanho; i++) {
                System.out.println("");
                teclado.nextLine();
                System.out.println("Aluguel #" + (i + 1) + ":");
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
                if (vetor[i] != null) {
                    System.out.println(i + ": " + vetor[i]);
                }
            }
        }

        teclado.close();
    }

}
