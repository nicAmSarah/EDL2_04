package view;

import javax.swing.JOptionPane;

import controller.Fatorial;

public class Main {
	
	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor que seja impar"));
		
		do {
			if (num % 2 != 1 || num < 0) {
				JOptionPane.showMessageDialog(null, "Valor deve ser impar e maior que zero");
		}
			
		}while(num <= 0 || num % 2 == 0);
		
		Fatorial fat = new Fatorial();
		
		long resultado = fat.FatorialDup(num);
		
		JOptionPane.showMessageDialog(null, "o fatorial do valor " + num + " é igual a " + resultado);
	}
	
}
