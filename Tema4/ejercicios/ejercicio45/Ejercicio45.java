package ejercicio45;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Boolean fechaIncorrecta = true;			
			System.out.println("Introduce tu dia de nacimiento: ");
			Integer diaNacimiento = sc.nextInt();
			System.out.println("Introduce tu mes de nacimiento: ");
			Integer mesNacimiento = sc.nextInt();
			System.out.println("Introduce tu año de nacimiento: ");
			Integer añoNacimiento = sc.nextInt();
			if (diaNacimiento >= 1 && diaNacimiento <= 30 && mesNacimiento >= 1 && mesNacimiento <= 12 && añoNacimiento < 2025) {
				fechaIncorrecta = false;
			}
			while (fechaIncorrecta) {
			System.err.println("Fecha incorrecta");
				System.out.println("Introduce tu dia de nacimiento: ");
				diaNacimiento = sc.nextInt();
				System.out.println("Introduce tu mes de nacimiento: ");
				mesNacimiento = sc.nextInt();
				System.out.println("Introduce tu año de nacimiento: ");
				añoNacimiento = sc.nextInt();
				if (diaNacimiento >= 1 && diaNacimiento <= 30 && mesNacimiento >= 1 && mesNacimiento <= 12 && añoNacimiento < 2025) {
					fechaIncorrecta = false;
				}
			}
		
		LocalDate fechaNacimiento = LocalDate.of(añoNacimiento, mesNacimiento,diaNacimiento);
		String fecha = fechaNacimiento.format(formatoFecha);
		System.out.println(fecha);
		
		//2
		if(fechaNacimiento.isLeapYear()) {
			System.out.println("El año que naciste es bisiesto");
		}else {
			System.out.println("El año que naciste no es bisiesto");
		}
		
		//3
		System.out.println(fechaNacimiento.getDayOfWeek());
		
		//4
		LocalDate hoy = LocalDate.now();
		System.out.println("Tienes " + (hoy.getYear() - fechaNacimiento.getYear()) + " años.");
		
		//5
		LocalDate muerte = fechaNacimiento.plusYears(100);
		Period periodo = hoy.until(muerte);
		System.out.println("Te quedan "+periodo.getDays()+" dias, "+periodo.getMonths()+" meses y "+periodo.getYears()+" años");
		
		//6
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime hora = LocalTime.now();
		String horaFormateada = hora.format(formatoHora);
		System.out.println(horaFormateada);
		
		sc.close();
	}

}
