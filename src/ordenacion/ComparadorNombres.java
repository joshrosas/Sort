package ordenacion;


public  class ComparadorNombres implements Comparador  {

	public int comparar( Alumno a1 , Alumno a2) {
		 int result = a1.nombres.compareTo(a2.nombres);

			return result;
	
	}
}