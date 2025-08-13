public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, departamento, genero);
        this.tarifaHora = tarifaHora;
        super.setSalarioBase(calcularSalario());
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSalario() {
        double salario = getHorasTrabajadas() * tarifaHora;
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