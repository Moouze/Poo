package exPoo;

import java.util.Scanner;

public class testeVizinhos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		vizinhos v1 = new vizinhos();
		
		
		System.out.println(" lista de vizinhos: ");
		
		v1.setNome("Iago");
		v1.setNumeroDaCasa(47);
		v1.setNumeroDeTelefone("11999999999");
		
		System.out.println("Meu vizinho se chama "+v1.getNome());
		System.out.println("O numero da casa do meu vizinho é: "+v1.getNumeroDaCasa());
		System.out.println("O numero de telefone do meu vizinho é: "+v1.getNumeroDeTelefone());
		
		
		
		
		
		
		
		

	}

}
