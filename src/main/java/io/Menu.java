package io;

import java.util.List;

/**
 * Interface que representa um menu de opções para o usuário.
 * 
 * @author giuliana.bezerra
 *
 */
public interface Menu<T> {
	public int exibirMenuOpcao(String texto);

	public List<T> exibirMenuLeituraListaOrdenavel(String texto);
}
