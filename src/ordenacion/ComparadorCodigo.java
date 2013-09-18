package ordenacion;


public  class ComparadorCodigo implements Comparador  {

	public int comparar( Alumno a1 , Alumno a2) {
		 int resultado = a1.codigo.compareTo(a2.codigo);

			return resultado;
	
	}
}