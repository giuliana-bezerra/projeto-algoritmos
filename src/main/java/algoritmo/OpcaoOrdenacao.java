package algoritmo;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.Menu;
import ordenacao.Quicksort;

/**
 * Representa a opção de algoritmo que será testada do catálogo.
 * 
 * @author giuliana.bezerra
 *
 */
public class OpcaoOrdenacao<T extends Comparable<T>> implements OpcaoAlgoritmo<T> {
	private static final Logger LOGGER = Logger.getLogger(OpcaoOrdenacao.class.getName());

	public int exibirMenu(Menu<T> menu) {
		String menuTexto = "[-------- Ordenacao ---------]";
		menuTexto += "\n[1] - QuickSort";
		menuTexto += "\n[2] - Sair";
		menuTexto += "\n[ ------------------------- ]";
		menuTexto += "\nInforme sua opcao: ";
		return menu.exibirMenuOpcao(menuTexto);
	}

	private boolean isOrdenacaoQuicksort(int opcao) {
		return opcao == 1;
	}

	@Override
	public void executar(Menu<T> menu) {
		AlgoritmoOrdenacao<T> algoritmoOrdenacao;
		int opcao = exibirMenu(menu);
		if (isOrdenacaoQuicksort(opcao)) {
			algoritmoOrdenacao = new Quicksort<>();
		} else {
			return;
		}
		List<T> itens = lerItensParaOrdenar(menu);
		String listaOrdenadaStr = algoritmoOrdenacao.ordenar(itens).toString();
		LOGGER.log(Level.INFO, listaOrdenadaStr);
	}

	private List<T> lerItensParaOrdenar(Menu<T> menu) {
		String menuTexto = "[-------- Lista para ordenação ---------]";
		menuTexto += "\nInforme a lista para ordenação: ";
		return menu.exibirMenuLeituraListaOrdenavel(menuTexto);
	}
}
