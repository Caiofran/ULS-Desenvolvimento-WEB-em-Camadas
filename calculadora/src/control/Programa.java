package control;

import java.util.Scanner;

public class Programa {
//	https://docs.oracle.com/en/java/javase/11/docs/api/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a operação desejada: 1-somar; 2- subtrair; 3-multiplicar; 4-dividir");
		int operacao = teclado.nextInt();
		
		System.out.println("Informe o primeiro valor");
		double valor1 = teclado.nextDouble();
		
		System.out.println("Informe o segundo valor");
		double valor2 = teclado.nextDouble();
		
		if(operacao == 1) {
			System.out.println(calc.somar(valor1, valor2));
		}
		else if(operacao == 2) {
			System.out.println(calc.subtrair(valor1, valor2));
		}
		else if(operacao == 3) {
			System.out.println(calc.multiplicar(valor1, valor2));
		}
		else if(operacao == 4) {
			System.out.println(calc.dividir(valor1, valor2));
		}
		else {
			System.out.println("Informe uma operacao valida");
		}
//		System.out.println(calc.somar(2, 2));
//		System.out.println(calc.subtrair(3, 2));
//		System.out.println(calc.dividir(10, 2));
//		System.out.println(calc.multiplicar(2, 4));
		
	}

}
