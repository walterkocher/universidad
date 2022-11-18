package Universidad;

import java.util.ArrayList;
import Universidad.Asignatura;

public class Profesor extends PersonalContratado {
	private Departamento departamento;
	private ArrayList<Asignatura> asignatura = new ArrayList<Asignatura>();

	public Profesor(String nombre, String rut, String eCivil, String añoIncorporacion) {
		super(nombre,rut, eCivil);
	}

	public void agregarAsignatura(Asignatura asignatura) {
		throw new UnsupportedOperationException();
	}
}