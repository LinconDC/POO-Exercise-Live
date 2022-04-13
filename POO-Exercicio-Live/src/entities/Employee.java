package entities;

public class Employee {

	// ATRIBUTOS (DADOS)
	public String name;
	public double valuePerHour;
	public int hour;

	// METODOS (FUNÇOES) (COMPORTAMENTO)
	
	public double total() {
		return valuePerHour * hour;
	}
}
