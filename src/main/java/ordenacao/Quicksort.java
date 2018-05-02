package ordenacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ThreadLocalRandom;

import algoritmo.AlgoritmoOrdenacao;
import algoritmo.NaturalComparator;

/**
 * Implementa o algoritmo de ordenação Quicksort. Para tal, os seguintes passos
 * são seguidos: <br/>
 * 1 - Escolha do <b>pivô</b> </br>
 * 2 - <b>Particiona</b> a lista em 2, sendo a primeira de todos os elementos
 * menores que o pivô, e a segunda com todos os maiores que o pivô. </br>
 * 3 - <b>Recursivamente</b> repete a operação para as sublistas restantes.
 * 
 * @author giuliana.bezerra
 *
 */
public class Quicksort<T extends Comparable<T>> implements AlgoritmoOrdenacao<T> {

	@Override
	public List<T> ordenar(List<T> lista) {
		List<T> elementos = new ArrayList<>();

		if (lista.size() == 1 || lista.isEmpty())
			return lista;

		int posicaoPivo = escolherPivo(lista);
		ElementosMaioresMenoresPivo<T> elementosMaioresMenoresPivo = particionar(posicaoPivo, lista,
				new NaturalComparator<T>());
		elementos.addAll(ordenar(elementosMaioresMenoresPivo.getElementosMenoresPivo()));
		elementos.add(lista.get(posicaoPivo));
		elementos.addAll(ordenar(elementosMaioresMenoresPivo.getElementosMaioresPivo()));
		return elementos;
	}

	private int escolherPivo(List<T> lista) {
		return ThreadLocalRandom.current().nextInt(0, lista.size());
	}

	private ElementosMaioresMenoresPivo<T> particionar(int posicaoPivo, List<T> lista, Comparator<T> comparator) {
		ElementosMaioresMenoresPivo<T> elementosMaioresMenoresPivo = new ElementosMaioresMenoresPivo<>();
		ListIterator<T> iterator = lista.listIterator();
		while (iterator.hasNext()) {
			T elemento = iterator.next();
			if (iterator.nextIndex() - 1 == posicaoPivo)
				continue;
			else if (comparator.compare(elemento, lista.get(posicaoPivo)) < 0)
				elementosMaioresMenoresPivo.getElementosMenoresPivo().add(elemento);
			else
				elementosMaioresMenoresPivo.getElementosMaioresPivo().add(elemento);
		}
		return elementosMaioresMenoresPivo;
	}
}

class ElementosMaioresMenoresPivo<T> {
	private List<T> elementosMaioresPivo = new ArrayList<>();
	private List<T> elementosMenoresPivo = new ArrayList<>();

	public List<T> getElementosMaioresPivo() {
		return elementosMaioresPivo;
	}

	public void setElementosMaioresPivo(List<T> elementosMaioresPivo) {
		this.elementosMaioresPivo = elementosMaioresPivo;
	}

	public List<T> getElementosMenoresPivo() {
		return elementosMenoresPivo;
	}

	public void setElementosMenoresPivo(List<T> elementosMenoresPivo) {
		this.elementosMenoresPivo = elementosMenoresPivo;
	}
}
