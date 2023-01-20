package desafioClase9;

public class Main {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setEdad(37);	
		cliente.setTelefono(406013);
		cliente.setNombre("Ignacio");
		cliente.setCredito(800);
		
		System.out.println(cliente.getNombre() +" Edad:"+ cliente.getEdad() +" Telefono:"+ cliente.getTelefono() +" Credito:"+ cliente.getCredito() );
		
		
		
		Trabajador trabajador = new Trabajador();
		trabajador.setEdad(33);
		trabajador.setTelefono(537821);
		trabajador.setNombre("Pablo");
		trabajador.setSalario(2500);
		
		System.out.println(trabajador.getNombre() +" Edad:"+ trabajador.getEdad() +" Telefono:"+ trabajador.getTelefono() +" Salario:"+ trabajador.getSalario());
		
	}

}


class Persona {
	
	int edad;
	String nombre;
	int telefono;
	
	
/*--GETTERS--------------- */
	
	public int getEdad() {
		return this.edad;
	}
	
	public int getTelefono() {
		return this.telefono;
	}
	
	public String getNombre() {
		return "Nombre: " + this.nombre;
	}
	
	
/*--SETTERS--------------- */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}


class Cliente extends Persona {
	
	int credito;
	
	
	public int getCredito() {
		return this.credito;
	}
	
	public void setCredito(int credito) {
		this.credito = credito;
	}
	
}

class Trabajador extends Persona {
	
	int salario;
	
	public int getSalario() {
		return this.salario;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
}