package ordenacao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Quicksort.class })
public class QuicksortTest {
	@Autowired
	private Quicksort<Integer> quicksortInteger;

	@Test
	public void testOrdenarListaVazia() {
		List<Integer> listaParaOrdenar = new ArrayList<>();
		List<Integer> listaOrdenada = quicksortInteger.ordenar(listaParaOrdenar);
		assertEquals(Collections.emptyList(), listaOrdenada);
	}

	@Test
	public void testOrdenarUmElemento() {
		List<Integer> listaParaOrdenar = new ArrayList<>();
		listaParaOrdenar.add(1);
		List<Integer> listaOrdenada = quicksortInteger.ordenar(listaParaOrdenar);
		assertEquals(Arrays.asList(new Integer[] { 1 }), listaOrdenada);
	}

	@Test
	public void testOrdenarListaOrdenada() {
		List<Integer> listaParaOrdenar = new ArrayList<>();
		listaParaOrdenar.add(1);
		listaParaOrdenar.add(2);
		listaParaOrdenar.add(3);
		List<Integer> listaOrdenada = quicksortInteger.ordenar(listaParaOrdenar);
		assertEquals(Arrays.asList(new Integer[] { 1, 2, 3 }), listaOrdenada);
	}

	@Test
	public void testOrdenarListaDesordenada() {
		List<Integer> listaParaOrdenar = new ArrayList<>();
		listaParaOrdenar.add(3);
		listaParaOrdenar.add(1);
		listaParaOrdenar.add(2);
		List<Integer> listaOrdenada = quicksortInteger.ordenar(listaParaOrdenar);
		assertEquals(Arrays.asList(new Integer[] { 1, 2, 3 }), listaOrdenada);
	}

	@Test
	public void testOrdenarListaElementosIguais() {
		List<Integer> listaParaOrdenar = new ArrayList<>();
		listaParaOrdenar.add(3);
		listaParaOrdenar.add(3);
		listaParaOrdenar.add(2);
		List<Integer> listaOrdenada = quicksortInteger.ordenar(listaParaOrdenar);
		assertEquals(Arrays.asList(new Integer[] { 2, 3, 3 }), listaOrdenada);
	}
}
