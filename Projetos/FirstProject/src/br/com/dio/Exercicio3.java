package br.com.dio;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura do retângulo");
        int altura = sc.nextInt();

        System.out.println("Digite a base do retângulo");
        int base = sc.nextInt();

        int area = altura * base;

        System.out.println("A área do retângulo é igual a : " + area);

    }
}
