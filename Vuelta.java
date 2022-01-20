package tp3_ejercicio_10;

public class Vuelta {

	private int tiempo;

	public Vuelta(int tiempo) {
		this.tiempo = tiempo;
	}
	// GET TIEMPO
	public int getTiempo() {
		return tiempo;
	}

	@Override
	public String toString() {
		return "\nTiempo=" + tiempo;
	}


}
