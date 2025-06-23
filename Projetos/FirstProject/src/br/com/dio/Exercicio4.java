package br.com.dio;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade da 1º pessoa: ");
        int idade1 = sc.nextInt();

        System.out.println("Digite a idade da 2º pessoa: ");
        int idade2 = sc.nextInt();

        int diferenca;

        if (idade1 > idade2){
            diferenca = idade1 - idade2;
            System.out.println("A diferença de idades é igual: " + diferenca);
        }else{
            diferenca = idade2 - idade1;
            System.out.println("A diferença de idades é igual: " + diferenca);
        }
    }
}
