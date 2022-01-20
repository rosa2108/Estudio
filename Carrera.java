package tp3_ejercicio_10;

import java.util.ArrayList;

public class Carrera {

	private String fecha;
	private int hora;
	private Dificultad dificultad;
	private ArrayList<Piloto>pilotos;
	
	public Carrera(String fecha, int hora, Dificultad dificultad) {
		this.fecha = fecha;
		this.hora = hora;
		this.dificultad = dificultad;
		this.pilotos= new ArrayList<>();
	}
	// GET PILOTOS
	private  ArrayList<Piloto> getPilotos() {
		return pilotos;
	}
	//GET FECHA
	public String getFecha() {
		return fecha;
	}
	//GET HORA
	private int getHora() {
		return hora;
	}
	//GET DIFICULTAD
	private Dificultad getDificultad() {
		return dificultad;
	}
	//BUSCAR PILOTOS
	public Piloto buscarPilotos(String dni) {
		Piloto piloto=null;
		int index=0;
		
		while(index<this.getPilotos().size() && piloto==null) {
			if(this.getPilotos().get(index).getDni().equals(dni)) {
				piloto=this.getPilotos().get(index);
			}else {
				index++;
			}
		}
		return piloto;
	}
	//AGREGAR PILOTO A CARRERA
	public boolean agregarPilotoCarrera(String nombre,String dni) {
		boolean pudo=false;
		Piloto piloto=this.buscarPilotos(dni);
	
		if(piloto==null) {
			this.getPilotos().add(new Piloto(nombre,dni));
			pudo=true;
		}
		return pudo;
	}
	
	// BUSCAR PILOTO POR DEBAJO DE
	public ArrayList<Piloto> buscarPilotosPorDebajoDe(double tiempoSeg) {
		ArrayList<Piloto> pilotosNuevo = new ArrayList<>();

		if (this.getPilotos().size() > 0) {
			for (Piloto piloto : this.getPilotos()) {
				if (piloto.cantVueltas() >= 10 && piloto.calcularPromedio() <= tiempoSeg) {
					pilotosNuevo.add(piloto);
				}
			}
		} else {
			System.out.println("No hay Pilotos Registrados");
		}
		return pilotosNuevo;
	}
	
	// CANTIDAD DE PILOTOS
	public int cantidadPilotos() {
		return this.getPilotos().size();
	}
	
	// MOSTRAR MENOR PROMEDIO
	public void mostrarMenorPromedio() {
		double auxiliar=0;
		double menorPromedio=Double.MAX_VALUE;
		Piloto pilotoM=null;
		
		for(Piloto piloto:this.getPilotos()) {
			if(piloto.calcularPromedio()<menorPromedio) {
				menorPromedio=piloto.calcularPromedio();
				auxiliar= menorPromedio;
				pilotoM= piloto; 
			}
		}
		System.out.println("Piloto con menor Promedio.\nNombre: "+pilotoM.getNombre()+"  Dni: "+pilotoM.getDni()+" con: "+auxiliar);
	}

	@Override
	public String toString() {
		return "Carrera. Fecha=" + this.getFecha() + ", Hora=" + this.getHora() + ", Dificultad=" + this.getDificultad() + ".\nPilotos=" + this.getPilotos();
	}
	
	
	
}
	
	
