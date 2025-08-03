package ex_3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria o scanner

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Lê uma linha de texto

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Lê um número inteiro

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

        scanner.close(); // Fecha o scanner (boa prática)
    }
}

// essa é uma meneira de fazer input em java

