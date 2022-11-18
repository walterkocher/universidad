package Universidad;

public class PersonalContratado extends Persona {
	public PersonalContratado(String nombre, String rut, String eCivil) {
		super(nombre,rut, eCivil);
	}
	private int añoIncorporacion;

	public int getAñoIncorporacion() {
		return this.añoIncorporacion;
	}

	public void setAñoIncorporacion(int añoIncorporacion) {
		this.añoIncorporacion = añoIncorporacion;
	}
}