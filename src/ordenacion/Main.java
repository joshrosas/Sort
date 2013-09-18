package ordenacion;

public class Main {
	public static void ordenar(Alumno[] a, Comparador c) {
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<i; j++) {
				if (c.comparar(a[i],a[j]) < 0) {
					Alumno t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		
	}

	public static void imprimir(Alumno[] a) {
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		Alumno[] b = {
			new Alumno("C2", "Roberto Sanchez",10 ),
			new Alumno ("B1", "Alberto Ruiz", 12),
			new Alumno ("A1", "Maria Castro", 14),
			new Alumno ("D4", "Juan  Salpio", 19),
			new Alumno ("E5", "Marlon Ccara", 18),
		};
	
		System.out.println( "Comparando por Codigo ");
		ordenar (b, new ComparadorCodigo());
		imprimir(b);
		System.out.println( "Comparando por Nombres ");
		ordenar (b, new ComparadorNombres());
		imprimir(b);
		System.out.println( "Comparando por Notas ");
		ordenar (b, new ComparadorNotasAsc());
		imprimir(b);
		
	}
}
