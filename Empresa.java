package tp3_ejercicio_10;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private ArrayList<Carrera>carreras;
	
	public Empresa(String nombre) {
		this.nombre=nombre;
		this.carreras= new ArrayList<>();
	}
	//GET NOMBRE
	private String getNombre() {
		return nombre;
	}
	// GET CARRERAS
	private ArrayList<Carrera> getCarreras() {
		return carreras;
	}
	//BUSCAR CARRERA
	private Carrera buscarCarrera(String fecha) {
		Carrera carrera= null;
		int index=0;
		
		while(index< this.getCarreras().size() && carrera==null) {
			if(this.getCarreras().get(index).getFecha().equals(fecha)) {
				carrera=this.getCarreras().get(index);
			}else {
				index++;
			}
		}
		return carrera;
	}
	//AGREGAR CARRERA
	public boolean agregarCarrera(String fecha, int hora, Dificultad dificultad) {
		Carrera carrera= this.buscarCarrera(fecha);
		boolean pudo=false;
		
		if(carrera==null) {
			this.getCarreras().add(new Carrera(fecha,hora,dificultad));
			pudo=true;
		}
		return pudo;
	}

	//AGREGAR PILOTO A CARRERA
	public boolean agregarPilotoACarrera(String fecha,String nombre, String dni) {
		Carrera carrera= this.buscarCarrera(fecha);
		boolean pudo=false;
		
		if(carrera!= null) {
			carrera.agregarPilotoCarrera(nombre,dni);
			pudo=true;
		}
		return pudo;
	}
	//AGREGAR VUELTAS A PILOTO
	public boolean agregarVueltasPiloto(String fecha,String dni, int tiempo) {
		Carrera carrera= this.buscarCarrera(fecha);
		boolean pudo=false;
		
		if(carrera!= null) {
			Piloto piloto= carrera.buscarPilotos(dni);
			if(piloto!=null) {
				piloto.agregarVueltas(tiempo);
				pudo=true;
			}
		}
		return pudo;
	}
	//MOSTRAR PILOTOS  POR DEJABA DE UN TIEMPO
	public ArrayList<Piloto> pilotosPorDebajoDe(String fecha, int tiempo){
		Carrera carrera= this.buscarCarrera(fecha);
		ArrayList<Piloto>pilotosV=new ArrayList<>();
		
		if(carrera!= null) {
			pilotosV= carrera.buscarPilotosPorDebajoDe(tiempo);
		}
		return pilotosV;
	}
	//PILOTO POR CARRERA - CANTIDAD
	public ArrayList<Integer> pilotosPorCarrera(){
		ArrayList<Integer>cantidad= new ArrayList<>();
		
		if(this.getCarreras().size()>0) {
			System.out.println("Carreras: ");
			for(Carrera carrera:this.getCarreras()) {
				cantidad.add(carrera.cantidadPilotos());
			}
		}
		return cantidad;
	}
	//MOSTRAR PILOTO CON MENOR PROMEDIO
	public void mostrarPilotoMenorPromedio(String fecha) {
		Carrera carrera= this.buscarCarrera(fecha);
		if(carrera!= null) {
			carrera.mostrarMenorPromedio();
		}
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Empresa.\nNombre=" +this.getNombre()+ ".\nCarreras=" + this.getCarreras();
	}
	
	
	
}
