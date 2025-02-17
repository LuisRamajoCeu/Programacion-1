package ejercicio50;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ejercicio50 {

	public static void main(String[] args) {
	//1
		Set<Pais> paises = new HashSet<>();
		System.out.println(paises);
	//2
		Pais españa = new Pais("ES","España");
		Pais cook = new Pais("CK","Islas Cook");
		Pais caiman = new Pais("CK","Islas Caimán");
	//3
		paises.add(españa);
		paises.add(cook);
		paises.add(caiman);
		System.out.println(paises);
	//4
		Pais españa2 = new Pais("es","España");
		paises.add(españa2);
		System.out.println(paises);
	//5
		Pais españa3 = new Pais("es","España");
		paises.add(españa3);
		System.out.println(paises);
	//6
		Iterator<Pais> it = paises.iterator();
		while(it.hasNext()) {
			Pais pais = it.next();
			if(pais.getCodigo().equals("ES")) {
				System.out.println(pais.toString());
		}}
	//7
		paises.clear();
	
	

	}

}
