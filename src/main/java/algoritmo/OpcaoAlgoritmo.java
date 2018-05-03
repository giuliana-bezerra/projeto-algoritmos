package algoritmo;

import java.util.List;

import io.Menu;

public interface OpcaoAlgoritmo<T> {
	public int exibirMenu(Menu<T> menu);
	public List<T> executar(Menu<T> menu, int opcao);
}
