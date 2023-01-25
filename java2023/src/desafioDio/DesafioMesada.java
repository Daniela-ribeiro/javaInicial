package Desafios;

import java.util.Scanner;

/*
 * Desafio
  Seu sobrinho começou a ganhar mesada dos pais.
  No auge dos seus 8 anos recebendo 50 reais por mês, 
  ele quer saber quanto terá se juntar todo o dinheiro,
  sem gastar nada, durante alguns meses. E você, como 
  um bom tio com habilidades de programação, vai criar 
  um programa que com as entradas do seu sobrinho vai 
  calcular automaticamente a quantidade de dinheiro 
  que ele terá em X meses.
 */
public class DesafioMesada {
public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int valorMesada = 50;
	int quantosMeses;
	int montanteMesada;
	
	System.out.println("Quantos meses você guardou sua mesada? ");
	quantosMeses = leia.nextInt();
	
	montanteMesada = quantosMeses * valorMesada;
	
	System.out.println(" O valor que você jutou foi de: " + montanteMesada + " R$");
	
	
}
}
