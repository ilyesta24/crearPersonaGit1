package paquete2;

public class crearPersona {

	public static void main(String[] args) {
		  
		Persona persona1 = new Persona("Maria ", 30);
		persona1.mostrarInformacion();
		
		Persona persona2 = new Persona("juan", 34);
		persona2.mostrarInformacion();
               
		System.out.println("--------------------------");
		System.out.println("Estudiantes");
		System.out.println("------------");
		
		
		estudiante estudiante1 = new estudiante("Anna","A12345",20);
		estudiante1.mostrarInformacion();
		
		estudiante estudiante2 = new estudiante("Pedro","B5678",18);
		estudiante2.mostrarInformacion();
		
		estudiante estudiante3 = new estudiante("Lola","D4321",19);
		estudiante3.mostrarInformacion();
		
	System.out.println("--------------Fin------------");
	}

}
