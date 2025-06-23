package br.com.dio;

import java.util.Scanner;

public class Exercicio1 {

    private final static String WELCOME_MESSAGE = "Olá, informe seu nome";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        var nome = sc.nextLine();
        System.out.println("Digite seu nome: ");
        var idade = sc.nextInt();

        System.out.println("Olá " + nome + ", você tem " + idade + " anos");

    }
}