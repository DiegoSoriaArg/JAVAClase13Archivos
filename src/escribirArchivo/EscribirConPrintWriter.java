package escribirArchivo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirConPrintWriter {

	public static void main(String[] args) throws IOException {
		// Preparo el archico de salida
		PrintWriter salida = new PrintWriter(new FileWriter("salida.txt"));
		
		int z = 34567890;
		String s = "dni: ";
		salida.print(s);
		salida.println(" " + z);
		salida.close(); //esto escribe = dni: 34567890
	}

}
