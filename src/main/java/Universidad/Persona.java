package Universidad;

public class Persona {
	private String nombre;
	private String rut;
	private String eCivil;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getECivil() {
		return this.eCivil;
	}

	public void setECivil(String eCivil) {
		this.eCivil = eCivil;
	}

	public Persona(String nombre, String rut, String eCivil) {
		throw new UnsupportedOperationException();
	}
}