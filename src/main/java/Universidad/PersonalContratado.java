package Universidad;

public class PersonalContratado extends Persona {
	public PersonalContratado(String nombre, String rut, String eCivil) {
		super(nombre,rut, eCivil);
	}
	private int a�oIncorporacion;

	public int getA�oIncorporacion() {
		return this.a�oIncorporacion;
	}

	public void setA�oIncorporacion(int a�oIncorporacion) {
		this.a�oIncorporacion = a�oIncorporacion;
	}
}