package io;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PreDestroy;

/**
 * Menu do tipo impressor de informações no console para o usuário. Ele realiza
 * a leitura através da entrada padrão do sistema.
 * 
 * @author giuliana.bezerra
 *
 */
public class MenuPrinter implements Menu<String> {
	private static final Logger LOGGER = Logger.getLogger(MenuPrinter.class.getName());
	private static Leitor leitor = new LeitorSystemIn();

	@Override
	public int exibirMenuOpcao(String texto) {
		LOGGER.log(Level.INFO, texto);
		return leitor.lerInt();
	}

	@PreDestroy
	public void close() {
		leitor.close();
	}

	@Override
	public List<String> exibirMenuLeituraListaOrdenavel(String texto) {
		LOGGER.log(Level.INFO, texto);
		return leitor.lerLista();
	}
}
