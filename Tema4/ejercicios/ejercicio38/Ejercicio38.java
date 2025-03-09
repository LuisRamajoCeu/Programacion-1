package ejercicio38;

public class Ejercicio38 {

	public static void main(String[] args) {
		//1. Crea un objeto pila.
		PilaCadenas pila = new PilaCadenas();
		System.out.println(pila);
		
		//2. Añade a la pila las palabras “primero” y “segundo”
		pila.añadirCadena("primero");
		pila.añadirCadena("segundo");
		System.out.println(pila);
		
		//3. Saca de la pila un elemento e imprímelo.
		String elemento = pila.sacarCadena();
		System.out.println(elemento);
		System.out.println(pila);
		
		//4. Añade a la pila la palabra “tercero”
		pila.añadirCadena("tercero");
		System.out.println(pila);
		
		//5. Saca todos los elementos que queden en la pila e imprímelos.
		while(pila.getTamaño() > 0) {
			elemento = pila.sacarCadena();
			System.out.println(elemento);
		}
		System.out.println(pila);
		
		//6. Añade a la pila la palabra cuarto.
		pila.añadirCadena("cuarto");
		System.out.println(pila);
	}

}
