package tp3_ejercicio_10;

import java.util.ArrayList;

public class Piloto {

	private String nombre;
	private String dni;
	private ArrayList<Vuelta>vueltas;
	
	public Piloto(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.vueltas= new ArrayList<>();
	}
	//GET DNI
	public String getDni() {
		return dni;
	}
	
	//GET NOMBRE
	public String getNombre() {
		return nombre;
	}
	//GET VUELTAS
	private ArrayList<Vuelta> getVueltas() {
		return vueltas;
	}
	//CANTIDAD DE VUELTAS
	public int cantVueltas() {
		return this.getVueltas().size();
	}
	//TIEMPO DE VUELTAS
	private int tiempoVueltas() {
		int acum=0;
		for(Vuelta vuelta:this.getVueltas()) {
			acum=acum+vuelta.getTiempo();
		}
		return acum;
	}
	//CALCULAR PROMEDIO
	public double calcularPromedio() {
		return (double)(this.tiempoVueltas()/this.cantVueltas());
	}
	//AGREGAR VUELTAS
	public void agregarVueltas(int tiempo) {
	 this.getVueltas().add(new Vuelta(tiempo));
	}
	

	@Override
	public String toString() {
		return "\nPiloto. Nombre=" + this.getNombre() + ", Dni=" + this.getDni() + ".\nVueltas=" + this.getVueltas();
	}
	
	
}
