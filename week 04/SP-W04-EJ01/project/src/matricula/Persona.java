package matricula;
import java.util.Date;

public class Persona {
	public String nombre, apellido, dni, correo, correoElectronico, direccion, telefono;
	public Integer edad;
	public Date fechaIngreso;
	
	public void saludar() {
		System.out.println("I'm a person");
	}
}