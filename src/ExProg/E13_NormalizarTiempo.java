package ExProg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Tiempo {
	int hora;
	int min;
	int seg;
	Tiempo(){
	}
	Tiempo(String time){
		String [] times=time.split(":");
		hora=Integer.parseInt(times[0]);
		min=Integer.parseInt(times[1]);
		seg=Integer.parseInt(times[2]);
	}
	void normalizar(){
		do {
			if (seg>59) {
				min++;
				seg=seg-60;
			}
			if (min>59) {
				hora++;
				min=min-60;
			}
		} while (seg>59 || min>59);
		
	}
	public String toString() {
		 return String.format("%02d:%02d:%02d",hora,min,seg);
	}
}
public class E13_NormalizarTiempo {

	public static void main(String[] args) throws IOException {
		   BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	        
	        System.out.print("Entra un tiempo (hh:mm:ss) : ");
	        String tiempo = entrada.readLine();
	 
	        Tiempo t = new Tiempo(tiempo);
	 
	        t.normalizar();
	 
	        System.out.println("El tiempo normalizado es : " + t);

	}

}
