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
public class exercicio4 {public static void main (String []args){
    
        int qtdPessoas;
        String tamanhoPizza;
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("quantidade de pessoas:");
        qtdPessoas = s.nextInt();
        
        System.out.println(" tamanho da pizza:");
        System.out.println("broto - pequena - media - grande");
        tamanhoPizza = s.next();
        
        switch (tamanhoPizza){
            case "broto":
                System.out.println("A quantidade de pizzas necessária : " + qtdPessoas);
                break;
            case "pequena":
                System.out.println("A quantidade de pizzas necessária : " + (qtdPessoas/2));
                    if (qtdPessoas % 2 == 1){
                        System.out.println("+ 1 broto");
                    }
                break;
            case "media":
                System.out.println("A quantidade de pizzas necessária : " + (qtdPessoas/3));
                    if (qtdPessoas % 3 == 1){
                        System.out.println("+ 1 broto");
                    } else if (qtdPessoas % 3 == 2){
                        System.out.println("+ 1 pequena");
                    }
                break;
            case "grande":
                System.out.println("A quantidade de pizzas necessária é: " + (qtdPessoas/4));
                    if (qtdPessoas % 4 == 1){
                        System.out.println("+ 1 broto");
                    } else if ( qtdPessoas % 4 == 2){
                        System.out.println(" + 1 pequena");
                    } else if (qtdPessoas % 4 == 3){
                        System.out.println(" + 1 media");
                    }
                break;
                
        }
        
    }
    
}
    

