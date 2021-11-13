package com.aadl.tarea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aadl.tarea.models.domains.Empleado;

@SpringBootApplication
public class VcardSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(VcardSpringApplication.class, args);
		leerArchivo();
	}
	
	public static ArrayList<Empleado> leerArchivo() {
		// crea el flujo para leer desde el archivo
		File file = new File("C:\\Curso\\Spring5\\workspace\\vcard-spring\\src\\main\\resources\\static\\empleados.txt");
		ArrayList<Empleado> listaEmpleados= new ArrayList<>();	
		Scanner scanner;
		try {
			//se pasa el flujo al objeto scanner
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				// el objeto scanner lee linea a linea desde el archivo
				String linea = scanner.nextLine();
				Scanner delimitar = new Scanner(linea);
				//se usa una expresión regular
				//que valida que antes o despues de una coma (,) exista cualquier cosa
				//parte la cadena recibida cada vez que encuentre una coma				
				delimitar.useDelimiter(",");
				Empleado e= new Empleado();
				e.setNombres(delimitar.next());
				e.setApellidos(delimitar.next());
				e.setHorario(delimitar.next());
				e.setCorreo(delimitar.next());
				e.setCelular(delimitar.next());
				e.setPaginaWeb(delimitar.next());
				listaEmpleados.add(e);
				System.out.println(listaEmpleados);
				for(Empleado emp:listaEmpleados) {
					System.out.println(emp.getNombres());
					System.out.println(emp.getApellidos());
				}
			}
			//se cierra el ojeto scanner
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return listaEmpleados;
	}

}
