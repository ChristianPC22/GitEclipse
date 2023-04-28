package Ejercicio1;

public class Alumno
{
	private String nombre, apellido, dni;
	
	public Alumno(String nombre, String apellido, String dni) 
	{
		
	}
	
	@Override
	public String toString() 
	{
		return "Alumno: [Nombre: " + nombre + "], " + "[Apellido: " + apellido + "], " + "[DNI: " + dni + "]";
	}
}