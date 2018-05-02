package io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Leitor de dados a partir da entrada padrão do sistema.
 * 
 * @author giuliana.bezerra
 *
 */
public class LeitorSystemIn implements Leitor {
	private static Scanner leitura = new Scanner(System.in);

	@Override
	public int lerInt() {
		return leitura.nextInt();
	}

	@Override
	public void close() {
		leitura.close();
	}

	@Override
	public List<String> lerLista() {
		List<String> lista = new ArrayList<>();
		// Consumir caractere de quebra de linha
		leitura.nextLine();
		String listaStr = leitura.nextLine();
		StringTokenizer stringTokenizer = new StringTokenizer(listaStr, " ");
		while (stringTokenizer.hasMoreTokens())
			lista.add(stringTokenizer.nextElement().toString());
		return lista;
	}

}
