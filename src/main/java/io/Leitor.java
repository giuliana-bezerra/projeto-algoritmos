package io;

import java.util.List;

/**
 * Interface responsável pela leitura de dados do usuário.
 * 
 * @author giuliana.bezerra
 *
 */
public interface Leitor {
	public int lerInt();

	public void close();

	public List<String> lerLista();
}
