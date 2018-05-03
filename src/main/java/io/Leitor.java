package io;

import java.io.InputStream;
import java.util.List;

/**
 * Interface responsável pela leitura de dados do usuário.
 * 
 * @author giuliana.bezerra
 *
 */
public interface Leitor {
	public int lerInt(InputStream inputStream);

	public void close();

	public List<String> lerLista(InputStream inputStream);
}
