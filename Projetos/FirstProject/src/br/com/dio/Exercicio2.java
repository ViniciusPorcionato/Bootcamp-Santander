package br.com.dio;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamando do lado do quadrado: ");
        double lado = sc.nextDouble();

        double area = lado * lado;

        System.out.println("Área do quadrado: " + lado + " * " + lado + " = " + area);
    }
}
