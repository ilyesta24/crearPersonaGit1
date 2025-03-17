package paquete2;

public class estudiante extends Persona  {
private  String matricula;

public estudiante(String matricula, String nombre , int edad) {
	super(nombre, edad);
	this.matricula = matricula;
}

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}
@Override
public void mostrarInformacion () {
	System.out.println("Matricula "+ matricula );
	
}
}
