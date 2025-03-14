package examen2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {

	public static void main(String[] args) {
		// Apartado 1
		System.out.println("Apartado 1");
		Plantacion plantacion = new Plantacion("98765432X");
		System.out.println(plantacion);

		// Apartado 2
		System.out.println("Apartado 2");
		ArbolesPinos pino10 = new ArbolesPinos(10);
		ArbolesPinos pino11 = new ArbolesPinos(11);
		ArbolesPinos pino12 = new ArbolesPinos(12);
		ArbolesFrutales frutal20 = new ArbolesFrutales(20, "Naranjo");
		ArbolesFrutales frutal21 = new ArbolesFrutales(21, "Limonero");
		plantacion.addArbol(pino10);
		plantacion.addArbol(pino11);
		plantacion.addArbol(pino12);
		plantacion.addArbol(frutal20);
		plantacion.addArbol(frutal21);
		System.out.println(plantacion);

		// Apartado 3
		System.out.println("Apartado 3");
		frutal20.setAltura(new BigDecimal(181.4));
		frutal20.setFechaPlantacion(LocalDate.of(2021, 01, 15));
		frutal21.setAltura(new BigDecimal(84));
		pino10.setFechaPlantacion(frutal20.getFechaPlantacion().plusMonths(3));
		pino11.setFechaPlantacion(frutal20.getFechaPlantacion().plusMonths(3));
		pino12.setFechaPlantacion(frutal20.getFechaPlantacion().plusMonths(3));
		pino10.setAltura(new BigDecimal(80));
		pino11.setAltura(new BigDecimal(80));
		pino12.setAltura(new BigDecimal(110));
		System.out.println(plantacion);

		// Apartado 4
		System.out.println("Apartado 4");
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String fechaFormateadaPino10 = pino10.getFechaPlantacion().format(formato);
		System.out.println(fechaFormateadaPino10);
		System.out.println(pino10.getEdad() + " meses");

		// Apartado 5
		System.out.println("Apartado 5");
		/*
		 * DecimalFormat formatoGanancia = new DecimalFormat("#,###.00 €"); String
		 * gananciaFormateada =
		 * formatoGanancia.format(plantacion.calcularGananciaExportacion());
		 * System.out.println(gananciaFormateada); No se porque no me funciona pero esa
		 * es la estructura
		 */
		System.out.println(plantacion.calcularGananciaExportacion());

		// Apartado 6
		System.out.println("Apartado 6");
		plantacion.exportarArboles();
		plantacion.exportarArboles();
		System.out.println(plantacion);

	}

}
