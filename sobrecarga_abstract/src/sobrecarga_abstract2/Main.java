package sobrecarga_abstract2;

	public class Main {
	    public static void main(String[] args) {
	        Permanente empleado1 = new Permanente("Juan", 1001, 3000, 500);
	        empleado1.mostrarDetalles();
	        System.out.println("Salario total: " + empleado1.calcularSalario());

	        Temporal empleado2 = new Temporal("Maria", 2001, 2500, 6);
	        empleado2.mostrarDetalles();
	        System.out.println("Salario total: " + empleado2.calcularSalario());

	        Contratista empleado3 = new Contratista("Pedro", 3001, 4000, 12);
	        empleado3.mostrarDetalles();
	        System.out.println("Salario total: " + empleado3.calcularSalario());
	    }
}
