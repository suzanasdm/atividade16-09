/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade1609;

import java.util.Scanner;

/**
 *
 * @author suzana
 */
public class Atividade1609 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int mes;
       
       System.out.print("ensira o mes:");
       mes = scan.nextInt();
       switch(mes){
           case 1 :
               System.out.println("janeira esse mes ja passou");
               break;
                case 2 :
               System.out.println(" fevereiro esse mes ja passou");
               break;
               
                case 3 :
               System.out.println("Marco esse mes ja passou");
               break;
                case 4 :
               System.out.println("Abril esse mes ja passou");
               break;
                case 5 :
               System.out.println("maio esse mes ja passou");
               break;
                case 6 :
               System.out.println("junho esse mes ja passou");
               break;
                case 7 :
               System.out.println("Julho esse mes ja passou");
               break;
                case 8 :
               System.out.println("Agosto esse mes ja passou");
               break;
                case 9 :
               System.out.println("Setembro esse mes ja passou");
               break;
                case 10 :
               System.out.println("outubro esse mes ja passou");
               break;
                case 11 :
               System.out.println("novembro esse mes ja passou");
               break;
                case 12 :
               System.out.println("Dezembro esse mes ja passou");
               break;
           default:
               System.out.println("valor invalido");
             
                     
       }
    }
}
