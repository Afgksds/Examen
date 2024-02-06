package examen;

public class Process {
	public void exe() {
    String frase = "hasta luego cocodrilo";

		Palabras may = new Palabras (frase);
		System.out.println(may.primeraMayuscula());


		System.out.println(may.invertirCadena());


		System.out.println(may.vocalesMayuscula());

		System.out.println(may.palindromo());
	frase = "anitalavalatina";
    Palabras ani = new Palabras (frase);
	System.out.println(ani.primeraMayuscula());


	System.out.println(ani.invertirCadena());


	System.out.println(ani.vocalesMayuscula());


	System.out.println(ani.palindromo());
	}
}
