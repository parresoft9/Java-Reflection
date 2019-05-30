package dev.parresoft9.javareflection.launch;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import dev.parresoft9.javareflection.clases.Autobus;
import dev.parresoft9.javareflection.clases.Coche;
import dev.parresoft9.javareflection.clases.Motocicleta;

public class WithReflection {

	public static void main(String[] args) {

		long Tini = System.currentTimeMillis();
		List<Coche> lista = new ArrayList<Coche>();

		Coche c1 = new Coche("8333KPP", "Azul Metálico Berlina", 110, "Peugeot", true);
		Coche c2 = new Coche("8000AAA", "Blanco Perla Comercial", 90, "Citröen", true);
		Coche c3 = new Coche("7896ABC", "Oro descapotable", 180, "BMW", false);
		Coche c4 = new Coche("5669KLO", "Marrón  TodoTerreno", 140, "Audi", false);
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);

		List<Motocicleta> lista2 = new ArrayList<Motocicleta>();

		Motocicleta m1 = new Motocicleta("4577HJP", "Rojo T-Max Yamaha", 45, "David");
		Motocicleta m2 = new Motocicleta("4633KVM", "Amarilla BMW SR1100", 108, "Jose");
		Motocicleta m3 = new Motocicleta("7778LWM", "Gris MT-07 YAmaha", 45, "Luis");
		Motocicleta m4 = new Motocicleta("4566PTY", "Negra Aprilia Capponord", 98, "Vicente");
		lista2.add(m1);
		lista2.add(m2);
		lista2.add(m3);
		lista2.add(m4);

		List<Autobus> lista3 = new ArrayList<Autobus>();

		Autobus a1 = new Autobus("4517WWQ", "Auvasa", 450, 58);
		Autobus a2 = new Autobus("4153TTP", "MetroRed", 400, 22);
		Autobus a3 = new Autobus("7338RFG", "Navarro", 550, 50);
		Autobus a4 = new Autobus("4126MNB", "Bussines Class", 600, 45);
		lista3.add(a1);
		lista3.add(a2);
		lista3.add(a3);
		lista3.add(a4);

		printList(lista);
		printList(lista2);
		printList(lista3);

		long Tfin = System.currentTimeMillis();

		System.out.println("Tiempo sin Reflexión: " + (Tfin - Tini) + " milisegundos");

	}

	public static void printList(List<?> list) {

		for (Object o : list) {
			Method[] metodos = o.getClass().getMethods();
			for (Method m : metodos) {
				try {
					if ("getMatricula".equals(m.getName()) || "getDescripcion".equals(m.getName())) {

						String result = (String) m.invoke(o, null);
						System.out.println(result);

					} else if ("getPotencia".equals(m.getName())) {
						int potencia = (int) m.invoke(o, null);
						System.out.println(potencia);
					}
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					System.err.println("Se ha producido un error");
					e.printStackTrace();
				}
			}
		}
	}

}
