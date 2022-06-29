package media_alunos;
import java.util.Scanner;

public class media_alunos {
 
	public static void main(String[] args) {
		System.out.println("==========================================================");
		Scanner input = new Scanner(System.in); // Criando um novo Scanner
		
		System.out.println("Digite o nome do aluno: ");// Mensagem no terminal
		String nome = input.nextLine();// Declarou a variavel cunho o valor é igual a linha que o usuário digitou capiturada pelo scanner.
		
		System.out.println("Bem Vindo " + nome + "!");
		System.out.println("==========================================================");
		
		System.out.println("Digite a Primeira Nota: ");
		int nota1 = input.nextInt();
		System.out.println("Digite a Segunda Nota: ");
		int nota2 = input.nextInt();
		
		double media = (nota1 + nota2) /2;
		
		if (media < 6) {
			System.out.println("O Aluno foi Reprovado ");
			
		} else {
			if (media < 10) {
				System.out.println("O Aluno foi Aprovado");
				
			} else {
				System.out.println("O Aluno foi Aprovado com Destinção ");
				System.out.println("==========================================================");
			}
		}
	}
	
}
