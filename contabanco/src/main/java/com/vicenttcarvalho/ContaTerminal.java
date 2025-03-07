package com.vicenttcarvalho;

import java.util.Locale;
import  java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o núemero da Agência: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite a Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo R$"+saldo+" já está disponível para saque.");


        scanner.close();
    }
}