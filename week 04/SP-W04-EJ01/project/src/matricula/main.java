package matricula;

public class main {
	public static void main(String[] args) {
		System.out.println("-- Welcome everyone --");
		
		Alumno alumno = new Alumno();
		alumno.nombre = "Michael";
		alumno.apellido = "Jackson"; 
		alumno.saludar();
	}
}
