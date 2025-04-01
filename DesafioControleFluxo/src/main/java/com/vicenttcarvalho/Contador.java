package com.vicenttcarvalho;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm < parametroDois){
            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
            for (int indice = 1; indice <= contagem; indice++){
                System.out.println("Imprimindo o número " + indice);
            }
        } else {
          throw  new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
}