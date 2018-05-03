package algoritmo;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.Menu;
import io.MenuPrinter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { OpcaoOrdenacao.class })
public class OpcaoOrdenacaoTest {
	@Autowired
	private OpcaoOrdenacao<String> opcaoOrdenacaoInt;

	@Test
	public void testExibirMenu() {
		String input = "1";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		Menu<String> menu = new MenuPrinter(in);
		assertEquals(input, String.valueOf(opcaoOrdenacaoInt.exibirMenu(menu)));
	}

	@Test
	public void testExecutarOpcaoSair() {
		String input = "\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		Menu<String> menu = new MenuPrinter(in);
		assertEquals(Collections.emptyList(), opcaoOrdenacaoInt.executar(menu, 2));
	}

	@Test
	public void testExecutarListaVazia() {
		String input = "\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		Menu<String> menu = new MenuPrinter(in);
		assertEquals(Collections.emptyList(), opcaoOrdenacaoInt.executar(menu, 1));
	}

	@Test
	public void testExecutarListaDesordenadaQuicksort() {
		String input = "2 3 4 1";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		Menu<String> menu = new MenuPrinter(in);
		assertEquals(Arrays.asList(new Integer[] { 1, 2, 3, 4 }).toString(),
				opcaoOrdenacaoInt.executar(menu, 1).toString());
	}
}
