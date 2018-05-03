package entidade;

import java.util.ArrayList;
import java.util.List;

public class ElementosMaioresMenoresPivo<T> {
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