package matricula;
import matricula.Persona;

public class Alumno extends Persona{
	public String codigo, carrera, modalidad, categoria;
	
	public void saludar() {
		System.out.println("I'm a student, my name is " + nombre);
	}
}
