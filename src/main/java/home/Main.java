package home;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import algoritmo.OpcaoAlgoritmo;
import algoritmo.OpcaoOrdenacao;
import io.Menu;
import io.MenuPrinter;

/**
 * Programa que permite a execução de algoritmos para o ensino do seu
 * funcionamento através de uma abordagem prática. A ideia é permitir que o
 * usuário veja o funcionamento do algoritmo e assim seja capaz de implementá-lo
 * adicinando variações necessárias. A interface com o usuário poderá ser
 * customizada sem maiores dificuldades já que a mesma é referenciada como uma
 * abstração.
 * 
 * @author giuliana.bezerra
 *
 */
public class Main {
	private static Menu<String> menu = new MenuPrinter(System.in);
	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	/**
	 * Essa etapa é necessária para customizar o formato do log a ser adotado.
	 */
	static {
		InputStream stream = Main.class.getClassLoader().getResourceAsStream("logging.properties");
		try {
			LogManager.getLogManager().readConfiguration(stream);

		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
		}
	}

	public static void main(String[] args) {
		OpcaoAlgoritmo<String> opcaoAlgoritmo = null;
		int opcaoMenuPrincipal = exibirMenuDeAlgoritmos();

		if (isOrdenacao(opcaoMenuPrincipal)) {
			opcaoAlgoritmo = new OpcaoOrdenacao<>();
		} else {
			fecharPrograma();
		}
		int opcaoMenuAlgoritmos = opcaoAlgoritmo.exibirMenu(menu);
		String listaOrdenada = opcaoAlgoritmo.executar(menu, opcaoMenuAlgoritmos).toString();
		LOGGER.info(listaOrdenada);
	}

	private static void fecharPrograma() {
		System.exit(0);
	}

	public static int exibirMenuDeAlgoritmos() {
		String textoMenu = "[-------- Algoritmos ---------]";
		textoMenu += "\n[1] - Ordenacao";
		textoMenu += "\n[2] - Sair";
		textoMenu += "\n[ ------------------------- ]";
		textoMenu += "\nInforme sua opcao: ";
		return menu.exibirMenuOpcao(textoMenu);
	}

	public static boolean isOrdenacao(int opcao) {
		return opcao == 1;
	}

}
