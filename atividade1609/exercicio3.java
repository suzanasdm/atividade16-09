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
public class exercicio3 {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        
        double valorCompra = 1000.0;
        int codigo = 3;

        double valorFinal = valorCompra;
        int parcelas = 1;

        if (codigo == 1) {
            valorFinal = valorCompra * 0.90;
        } else if (codigo == 2) {
            valorFinal = valorCompra * 0.92;
        } else if (codigo == 3) {
            parcelas = 5;
        } else if (codigo == 4) {
            valorFinal = valorCompra * 1.05;
            parcelas = 10;
        } else {
            System.out.println("Código inválido.");
            return;
        }

        double valorParcela = valorFinal / parcelas;

        System.out.printf("Valor total: R$ %.2f%n", valorFinal);
        System.out.printf("Parcelas: %d x R$ %.2f%n", parcelas, valorParcela);
    }
}
    


