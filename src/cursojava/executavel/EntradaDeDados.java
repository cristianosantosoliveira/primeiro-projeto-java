package cursojava.executavel;

import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[] args) {
		// Entrada de Dados em Java

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carro? ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas? ");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoaNumero);

		double resto = carroNumero % pessoaNumero;

		JOptionPane.showMessageDialog(null,
				"Divis�o para pessoa deu " + divisao + " carros e sobrou " + resto + " carros");

	}

}