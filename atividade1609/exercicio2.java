/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade1609;

import java.util.Scanner;

/**
 *
 * @author suzana
 */
public class exercicio2 {public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Informe sua altura (em metros): ");
        double altura = input.nextDouble();
        
        System.out.print("Informe seu peso (em kg): ");
        double peso = input.nextDouble();
        
        System.out.print("Informe seu sexo (masculino/feminino): ");
        String sexo = input.next().toLowerCase();

        double pesoIdeal;

        
        if (sexo.equals("masculino")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equals("feminino")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido.");
            return;
        }

        
        if (peso < pesoIdeal) {
            System.out.println("Você está abaixo do peso ideal.");
        } else if (peso == pesoIdeal) {
            System.out.println("Você está no peso ideal.");
        } else {
            System.out.println("Você está acima do peso ideal.");
        }

        System.out.printf("Seu peso ideal é: %.2f kg\n", pesoIdeal);
    }
}