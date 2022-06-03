package leerArchivoDouble;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerDouble {
	public static void main(String[] args) {
		int suma = 0;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("posiciones.in");
			br = new BufferedReader(fr);
			String linea;
			while((linea = br.readLine())!=null) {
				try {
					String [] coordenadas = linea.split(" ");
					double x = Double.parseDouble(coordenadas[0]);
					double y = Double.parseDouble(coordenadas[1]);
					Punto posicion = new Punto(x,y);
					System.out.println(posicion);
				}catch (NumberFormatException e) {
					System.err.println("Uno de los datos leidos no es un double");
				}
			}
			System.out.println("Suma = " + suma);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally Suma = " + suma);
			try {
				if(fr != null) {
					fr.close();
				}
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
