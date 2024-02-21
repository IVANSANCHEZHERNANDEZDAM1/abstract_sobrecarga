package sobrecarga_abstract2;

class Permanente extends Empleado {
    double beneficiosAdicionales;

    public Permanente(String nombre, int id, double salario, double beneficiosAdicionales) {
        super(nombre, id, salario);
        this.beneficiosAdicionales = beneficiosAdicionales;
    }

    @Override
    double calcularSalario() {
        return salario + beneficiosAdicionales;
    }

    @Override
    void mostrarDetalles() {
        System.out.println("Empleado Permanente:");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario: " + salario);
        System.out.println("Beneficios Adicionales: " + beneficiosAdicionales);
    }
}