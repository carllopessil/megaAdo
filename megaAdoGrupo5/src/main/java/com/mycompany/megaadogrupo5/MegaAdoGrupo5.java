/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
//

package com.mycompany.megaadogrupo5;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class MegaAdoGrupo5 {

    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int grade;
        System.out.println("escolha entre uma das opções:");
        System.out.println("1- Desenvolver fluxograma para decidir se podemos ir para o Guarujá no final de semana");
        System.out.println("2- Desenvolver fluxograma para calcular 10% de desconto no preço total de um produto ao \n" +
"comprar 10 ou mais unidades ou o preço total cheio se tiver menos de 10 unidades");
        System.out.println("3- Calcular o IMC (Índice de massa corpórea) de uma determinada pessoa");
        System.out.println("4- Dado a quantidade de kWh consumidos e o preço unitário por kWh \n" +
"(Enel/SP), calcular a tarifa da conta de luz (desconsiderar impostos e \n" +
"extras)");
        System.out.println("5- Dado o volume consumido e as faixas de tarifas por m3 (Sabesp/SP), \n" +
"calcular a tarifa de água e esgoto (desconsiderar impostos)");
        System.out.println("6- Mostrar o nome completo de todos os integrantes do grupo (tela de \n" +
"créditos)");
        System.out.println("7- sair do programa.");
        System.out.print("qual a opção desejada?");
        grade=input.nextInt();
        
        switch(grade){        
        
            case 1:
            
            case 2:    
        
            case 3:
                
            case 4:   
                  double kwh, valorASerPago;
                  System.out.println("consumo em kwh:");
                  kwh=input.nextFloat();
                     
                  //o valor atribuido ao kwh foi adiquirido no site: https://www.enel.com.br/pt-saopaulo/Para_Voce/tarifa-de-energia-eletrica.html
                  //considerando o desafio proposto pelo exercicio, considernado apenas a tarifa RESIDENCIAL, sem extras e imposotos chegamos a este simples calculo.
                  //porém se fizer necessario temos uma variante que calcula o valor de uma tarifa RESIDENCIAL BAIXA RENDA, que tem variaveis de consumo*valor. 
                  valorASerPago=(kwh*0.59449);
                  
                  System.out.println("o valor a ser pago pelo consumo " + kwh + " é: " + valorASerPago);
                  
            case 5:
            
            case 6:
                
            case 7: 
                System.out.println("programa encerrado");
                break;
    }
    }
}
