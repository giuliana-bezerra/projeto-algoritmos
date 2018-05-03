package io;

import java.io.InputStream;
import java.util.List;

/**
 * Interface que representa um menu de opções para o usuário.
 * 
 * @author giuliana.bezerra
 *
 */
public abstract class Menu<T> {
	protected InputStream inputStream;
	
	public InputStream getInputStream() {
		return inputStream;
	}
	
	public abstract int exibirMenuOpcao(String texto);

	public abstract List<T> exibirMenuLeituraListaOrdenavel(String texto);
}
