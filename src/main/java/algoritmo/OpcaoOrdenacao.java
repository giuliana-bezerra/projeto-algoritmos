package algoritmo;

import java.util.Collections;
import java.util.List;

import io.Menu;
import ordenacao.Quicksort;

/**
 * Representa a opção de algoritmo que será testada do catálogo.
 * 
 * @author giuliana.bezerra
 *
 */
public class OpcaoOrdenacao<T extends Comparable<T>> implements OpcaoAlgoritmo<T> {

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
	public List<T> executar(Menu<T> menu, int opcao) {
		AlgoritmoOrdenacao<T> algoritmoOrdenacao;
		if (isOrdenacaoQuicksort(opcao)) {
			algoritmoOrdenacao = new Quicksort<>();
		} else {
			return Collections.emptyList();
		}
		List<T> itens = lerItensParaOrdenar(menu);
		return algoritmoOrdenacao.ordenar(itens);
	}

	private List<T> lerItensParaOrdenar(Menu<T> menu) {
		String menuTexto = "[-------- Lista para ordenação ---------]";
		menuTexto += "\nInforme a lista para ordenação: ";
		return menu.exibirMenuLeituraListaOrdenavel(menuTexto);
	}
}
