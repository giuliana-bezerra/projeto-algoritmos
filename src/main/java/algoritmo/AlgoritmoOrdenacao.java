package algoritmo;

import java.util.List;

/**
 * Representa um algoritmo de ordenação.
 * 
 * @author giuliana.bezerra
 *
 * @param <T>
 */
public interface AlgoritmoOrdenacao<T extends Comparable<T>> {
	public List<T> ordenar(List<T> lista);
}
