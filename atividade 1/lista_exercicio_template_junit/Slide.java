package slide.atividade;
import java.util.Scanner;


public class Slide {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int option;
		String name;
		
		System.out.print("Por favor, insira seu nome: ");
		name = input.next();

		System.out.println("Olá, " + name + "! Seja bem-vindo(a).");
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1 - Calcular o Índice de Massa Corporal (IMC)");
		System.out.println("2 - Estimar o Metabolismo Basal");
		System.out.println("3 - Checar se um número é par ou ímpar");
		option = input.nextInt();

		switch (option) {
		    case 1:
		        calcularIMC();
		        break;
		    case 2:
		        calcularMetabolismoBasal();
		        break;
		    case 3:
		        verificarNumeroParImpar();
		        break;
		    default:
		        System.err.println("Opção não reconhecida. Tente novamente.");
		        break;
		}
		input.close();

	}
	
	
	public static void calcularIMC() {
	    Scanner input2 = new Scanner(System.in);
	    double peso, altura, imc;

	    System.out.println("Vamos calcular o seu IMC:");
	    System.out.print("Informe o seu peso (em kg): ");
	    peso = input2.nextDouble();
	    System.out.print("Informe a sua altura (em metros): ");
	    altura = input2.nextDouble();

	    imc = peso / (Math.pow(altura, 2));
	    if (imc < 18.5) {
	        System.out.println("Você está abaixo do peso ideal. Seu IMC é: " + imc);
	    } else if (imc < 25) {
	        System.out.println("Seu peso está na faixa ideal. Seu IMC é: " + imc);
	    } else if (imc < 30) {
	        System.out.println("Você está acima do peso ideal. Seu IMC é: " + imc);
	    } else if (imc < 40) {
	        System.out.println("Você está na faixa de obesidade. Seu IMC é: " + imc);
	    } else {
	        System.out.println("Você está com obesidade grave. Seu IMC é: " + imc);
	    }
	    input2.close();
	}
	
	
		private static void calcularMetabolismoBasal() {
		    Scanner input3 = new Scanner(System.in);
		    String sexo;
		    int idade;
		    double peso, metabolismo;
		
		    System.out.println("Cálculo do Metabolismo Basal:");
		    System.out.print("Digite seu peso (kg): ");
		    peso = input3.nextDouble();
		    System.out.print("Digite sua idade (anos): ");
		    idade = input3.nextInt();
		    System.out.print("Informe seu sexo ('M' para masculino ou 'F' para feminino): ");
		    sexo = input3.next();
		
		    if (sexo.equals("M")) {
		        if (idade < 30) {
		            metabolismo = (15.057 * peso) + 679;
		        } else if (idade < 60) {
		            metabolismo = (11.6 * peso) + 879;
		        } else {
		            metabolismo = (13.5 * peso) + 487;
		        }
		    } else if (sexo.equals("F")) {
		        if (idade < 30) {
		            metabolismo = (14.7 * peso) + 486.6;
		        } else if (idade < 60) {
		            metabolismo = (8.7 * peso) + 829;
		        } else {
		            metabolismo = (10.5 * peso) + 597;
		        }
		    } else {
		        System.err.println("Entrada de sexo inválida. Use 'M' ou 'F'.");
		        input3.close();
		        return;
		    }
		    System.out.println("Seu metabolismo basal estimado é: " + metabolismo + " calorias por dia.");
		    input3.close();
		}

	
		public static void verificarNumeroParImpar() {
		    Scanner input4 = new Scanner(System.in);
		    int num;

		    System.out.print("Digite o número que deseja verificar: ");
		    num = input4.nextInt();

		    if (num % 2 == 0) {
		        System.out.println(num + " é um número par.");
		    } else {
		        System.out.println(num + " é um número ímpar.");
		    }
		    input4.close();
		}
}

