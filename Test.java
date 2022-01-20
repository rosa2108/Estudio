package tp3_ejercicio_10;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empresa em= new Empresa("CorreCaminos");
		
		
		em.agregarCarrera("25/09/2021", 7, Dificultad.PRINCIPIANTE);
		em.agregarCarrera("26/09/2021", 7, Dificultad.AVANZADO);
		em.agregarCarrera("27/09/2021", 7, Dificultad.AS_DEL_VOLANTE);
		
		em.agregarPilotoACarrera("25/09/2021", "Mario", "11111");
		em.agregarPilotoACarrera("25/09/2021", "Luis", "222222");
		em.agregarPilotoACarrera("25/09/2021", "Jose", "333333");
		//25.66
		em.agregarVueltasPiloto("25/09/2021", "11111",20);
		em.agregarVueltasPiloto("25/09/2021", "11111", 28);
		em.agregarVueltasPiloto("25/09/2021", "11111", 29);
		//34.66
		em.agregarVueltasPiloto("25/09/2021", "222222", 40);
		em.agregarVueltasPiloto("25/09/2021", "222222", 38);
		em.agregarVueltasPiloto("25/09/2021", "222222", 26);
		//18.66
		em.agregarVueltasPiloto("25/09/2021", "333333", 15);
		em.agregarVueltasPiloto("25/09/2021", "333333", 18);
		em.agregarVueltasPiloto("25/09/2021", "333333", 23);
		
		
		System.out.println(em.pilotosPorCarrera());
		em.mostrarPilotoMenorPromedio("25/09/2021");
		
		
	}

}
