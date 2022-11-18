package Universidad;

import java.util.ArrayList;
import Universidad.Estudiante;
import Universidad.Administrativo;
import Universidad.Profesor;

public class Departamento {
	private String nombre;
	private String codigo;
	private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
	private ArrayList<Administrativo> administrativo = new ArrayList<Administrativo>();
	private ArrayList<Profesor> profesor = new ArrayList<Profesor>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Departamento(String nombre, String codigo) {
		throw new UnsupportedOperationException();
	}
}