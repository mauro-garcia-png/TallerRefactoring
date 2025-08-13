public class EmpleadoPorHoras extends Empleado {

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, tarifaHora, departamento, genero);
        super.setSalarioBase(calcularSalario());
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Genero: " + super.getNombre());
        System.out.println("Salario: " + super.getSalarioBase());
        System.out.println("Horas trabajadas: " + super.getHorasTrabajadas());
        System.out.println("Departamento: " + super.getDepartamento());
    }

    @Override
    public double calcularSalario() {
        double salario = getHorasTrabajadas() * getTarifaHora();
        switch (getDepartamento()) {
            case "Sistemas":
                salario += 20;
                break;
            case "Contabilidad":
                salario += 10;
                break;
            default:
                break;
        }
        return salario;
    }

    // Más metodos
}