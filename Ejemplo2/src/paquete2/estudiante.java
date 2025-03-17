package paquete2;

public class estudiante extends Persona  {
private  String matricula;

public estudiante(String matricula) {
	super(matricula );
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
