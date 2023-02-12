package ExProg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Tiempo {
	int horas;
	int minutos;
	int segundos;

}

public class E14_Segundos {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader teclat = new BufferedReader(new InputStreamReader(System.in));
		E14_Segundos programa = new E14_Segundos();

		try {
			System.out.print("Entra la cantidad de segundos : ");
			int segundos = Integer.parseInt(teclat.readLine());
			Tiempo t = programa.calcularTiempo(segundos);

			System.out.printf("%d segundos son %d horas, %d minutos y %d segundos", segundos, t.horas, t.minutos,
					t.segundos);
		} catch (Exception e) {
			System.out.println("Valor Incorrecto");
		}

		

	}

	Tiempo calcularTiempo(int s) {

		Tiempo t = new Tiempo();
		while (s > 59) {
			if (s > 59) {
				t.minutos++;
				s -= 60;
			}
			if (t.minutos > 59) {
				t.horas++;
				t.minutos -= 60;
			}
			t.segundos = s;
		}
		return t;
	}

}
