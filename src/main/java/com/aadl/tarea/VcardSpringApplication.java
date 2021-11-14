package com.aadl.tarea;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aadl.tarea.models.domains.Cargo;
import com.aadl.tarea.models.domains.Ciudad;
import com.aadl.tarea.models.domains.Empleado;
import com.aadl.tarea.models.domains.Sucursal;

@SpringBootApplication
public class VcardSpringApplication {
	
	static File empleados;

	public static void main(String[] args) {
		SpringApplication.run(VcardSpringApplication.class, args);
		
		escribirArchivo();
		leerArchivo();
	}
	
	public static ArrayList<Empleado> leerArchivo() {
		// crea el flujo para leer desde el archivo
		File file = new File("C:..\\vcard-spring\\src\\main\\resources\\static\\empleados.txt");
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
				Cargo cargo = new Cargo();
				Sucursal sucu = new Sucursal();
				
				Empleado e= new Empleado();
				e.setNombres(delimitar.next());
				e.setApellidos(delimitar.next());
				sucu.setCodigoSucursal(delimitar.next());
				sucu.setCiudad(delimitar.next());
				sucu.setNombreSucursal(delimitar.next());
				e.setHorario(delimitar.next());
				e.setCorreo(delimitar.next());
				e.setCelular(delimitar.next());
				e.setPaginaWeb(delimitar.next());
				cargo.setNombreCargo(delimitar.next());
				listaEmpleados.add(e);
				System.out.println(listaEmpleados);
				for(Empleado emp:listaEmpleados) {
					System.out.println("Nombres: " + emp.getNombres());
					System.out.println("Apellidos: " + emp.getApellidos());
					System.out.println("Sucursal: " + sucu.toString());
					System.out.println("Horario: " + emp.getHorario());
					System.out.println("Correo: " + emp.getCorreo());
					System.out.println("Celular: " + emp.getCelular());
					System.out.println("Pagina: " + emp.getPaginaWeb());
					System.out.println("Cargo: " + cargo.getNombreCargo());
				}
			}
			//se cierra el ojeto scanner
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return listaEmpleados;
	}
	
	public static void escribirArchivo() {
		
		empleados = new File("C:..\\vcard-spring\\src\\main\\resources\\static\\empleados.txt");
		
		//Ciudad ciudad = new Ciudad(1, "Cuenca");
		Cargo cargo = new Cargo(1, "Marketing");
		Sucursal sucu = new Sucursal("1", "Cuenca", "Sucursal Cuenca 0014");
		
			
		List<Empleado> emp = Arrays.asList(new Empleado ("Luis Alejandro", "Coraizaca Quizhpi", sucu, "Lunes - Viernes (9:00AM - 6:00PM)"
																,"alejocoraizaca@gmail.com", "0984839462", "https://www.facebook.com/canofutbolero", cargo),
												new Empleado ("Lina Mercedes", "Orellana Yungaicela", sucu, "Lunes - Viernes (9:00AM - 6:00PM)"
														     ,"lina.orellana@gmail.com", "0984839462", "https://www.facebook.com/canofutbolero", cargo));
		
		try {
			FileWriter escribir = new FileWriter(empleados);
			for (Empleado empleado : emp) {
				escribir.write(empleado.getNombres()+ ",");
				escribir.write(" " + empleado.getApellidos()+ ",");
				escribir.write(" " +empleado.getSucursal().toString()+ ",");
				escribir.write(" " +empleado.getHorario()+ ",");
				escribir.write(" " +empleado.getCorreo()+ ",");
				escribir.write(" " +empleado.getCelular()+ ",");
				escribir.write(" " +empleado.getPaginaWeb()+ ",");
				escribir.write(" " +empleado.getCargo().toString()+ ",");
				escribir.write("\r\n");
			}
			escribir.close();
		} catch (IOException e) {
			System.err.println("Ha ocurrido un error en la Escritura");
			e.printStackTrace();
		}
		
	
		
		
	
	}

}
