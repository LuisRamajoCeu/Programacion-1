package Ejercicios;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
	// Preparación del juego
	 String[] palabras = {"azulejo", "tenedor", "saltamontes", "carretilla",
		 "molinero", "sofisticado", "terremoto", "culinario",
		 "teclado", "primavera"
	 };
	 Random random = new Random();
	 int indiceAleatorio = random.nextInt(palabras.length);
	 String palabraSecreta = palabras[indiceAleatorio];
	 char[] letrasAdivinadas = new char[palabraSecreta.length()];
	 letrasAdivinadas[0] = palabraSecreta.charAt(0); // Primera letra revelada
	 int intentosFallidos = 0;
	 boolean juegoTerminado = false;
	 // Desarrollo del juego
	 Scanner scanner = new Scanner(System.in);
	 while (!juegoTerminado) {
	 // Mostrar letras adivinadas
	    for (char letra : letrasAdivinadas) {
	      if (letra == '\u0000') { // Si la letra no ha sido adivinada
	            System.out.print("_ ");
	     } else {
		       System.out.print(letra + " ");      }
		            }
		       System.out.println(); // Nueva línea
     // Solicitar una letra
          System.out.print("Introduce una letra: ");
           char letra = scanner.nextLine().charAt(0);
     // Comprobar si está en la palabra
           if (palabraSecreta.indexOf(letra) != -1) {
     // Rellenar las posiciones correctas
		for (int i = 0; i < palabraSecreta.length(); i++) {
		      if (palabraSecreta.charAt(i) == letra) {
		          letrasAdivinadas[i] = letra;                 }
		                }
		            } else {
	// Incrementar intentos fallidos
		   intentosFallidos++;
		   System.out.println("Letra incorrecta. Intentos fallidos: " + intentosFallidos);
		            }
		// Comprobar si el juego ha terminado
		 if (intentosFallidos >= 10) {
		    System.out.println("GAME OVER. La palabra era: " + palabraSecreta);
		        juegoTerminado = true;
		    } else {
		      boolean todasAdivinadas = true;
		for (char letraAdvinada : letrasAdivinadas) {
		 if (letraAdvinada == '\u0000') { // Si hay alguna letra no adivinada
		    todasAdivinadas = false;
		     break;
		   }
		             }
		          if (todasAdivinadas) {
		 System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
		 juegoTerminado = true;
		          }
		  }
		 }
	 scanner.close();
		}
	}


