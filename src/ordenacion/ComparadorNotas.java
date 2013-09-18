package ordenacion;

public class ComparadorNotas implements Comparador {
	
	public int comparar(Alumno a1, Alumno a2) {
		return (int)(100*a1.nota - 100*a2.nota);
	}
}
