package com.aadl.tarea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aadl.tarea.models.domains.Cargo;
import com.aadl.tarea.models.domains.Empleado;
import com.aadl.tarea.models.domains.Sucursal;
import com.aadl.tarea.models.domains.Vcard;

@Configuration
public class Config {

	@Bean("Empleados")
	public List<Empleado> cargaDatos(){
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
						Sucursal s = new Sucursal();
						
						Empleado e= new Empleado();
						e.setId(delimitar.next());
						e.setNombres(delimitar.next());
						e.setApellidos(delimitar.next());
						s.setCodigoSucursal(delimitar.next());
						s.setCiudad(delimitar.next());
						s.setNombreSucursal(delimitar.next());
						e.setSucursal(s);
						e.setHorario(delimitar.next());
						e.setCorreo(delimitar.next());
						e.setCelular(delimitar.next());
						e.setPaginaWeb(delimitar.next());
						cargo.setCargoId(delimitar.next());
						cargo.setNombreCargo(delimitar.next());
						e.setCargo(cargo);
						listaEmpleados.add(e);
						System.out.println(listaEmpleados);
						for(Empleado emp:listaEmpleados) {
							System.out.println("Id: " + emp.getId());
							System.out.println("Nombres: " + emp.getNombres());
							System.out.println("Apellidos: " + emp.getApellidos());
							System.out.println("Sucursal: " + emp.getSucursal().getCiudad());
							System.out.println("Horario: " + emp.getHorario());
							System.out.println("Correo: " + emp.getCorreo());
							System.out.println("Celular: " + emp.getCelular());
							System.out.println("Pagina: " + emp.getPaginaWeb());
							System.out.println("Cargo: " + emp.getCargo().getNombreCargo());
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
