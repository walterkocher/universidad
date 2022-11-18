package Universidad;

import java.util.ArrayList;
import Universidad.Estudiante;

public class Asignatura {
	private String codigo;
	private ArrayList<Estudiante> estudiante = new ArrayList<Estudiante>();

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void agregarEstudiante(Estudiante estudiante) {
		throw new UnsupportedOperationException();
	}
}