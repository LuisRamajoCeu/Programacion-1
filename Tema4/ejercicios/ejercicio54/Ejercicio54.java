package ejercicio54;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Ejercicio54 {

	public static void main(String[] args) {
	//1
	CuentaAhorros cuenta = new CuentaAhorros("ES212131456");
	System.out.println(cuenta.getDineroCuenta());
	//2
	Cargos cargo1 = new Cargos(LocalDate.of(2025, 02, 23),new BigDecimal(23.42),"321131F");
	Cargos cargo2 = new Cargos(LocalDate.of(2025, 02, 24),new BigDecimal(12.2),"532431T");
	Ingresos ingreso1 = new Ingresos(LocalDate.of(2025, 02, 24),new BigDecimal(7.99),"Paga semanal");
	Ingresos ingreso2 = new Ingresos(LocalDate.of(2025, 02, 24),new BigDecimal(100.28),"Venta");
	Retiradas retirada1 = new Retiradas(LocalDate.of(2025, 02, 24),new BigDecimal(25));
	//3
	System.out.println(cuenta.getDineroCuenta());
	//4
	System.out.println(cuenta.mostrarMovimientos("T"));
	//5
	System.out.println(cuenta.mostrarMovimientos("C"));
	//6
	System.out.println(cuenta.mostrarMovimientos("I"));
	//7
	System.out.println(cuenta.mostrarMovimientos("R"));

	
	
	
	}

}
