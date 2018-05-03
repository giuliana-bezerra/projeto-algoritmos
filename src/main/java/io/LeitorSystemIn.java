package io;

import java.io.InputStream;
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
	private Scanner leitura;

	@Override
	public int lerInt(InputStream inputStream) {
		leitura = new Scanner(inputStream);
		return leitura.nextInt();
	}

	@Override
	public void close() {
		leitura.close();
	}

	@Override
	public List<String> lerLista(InputStream inputStream) {
		List<String> lista = new ArrayList<>();
		leitura = new Scanner(inputStream);
		String listaStr = leitura.nextLine();
		StringTokenizer stringTokenizer = new StringTokenizer(listaStr, " ");
		while (stringTokenizer.hasMoreTokens())
			lista.add(stringTokenizer.nextElement().toString());
		return lista;
	}

}
