public class EmpleadoFijo extends Empleado {
    private double bonoAnual;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual,
            String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento, genero);
        this.bonoAnual = bonoAnual;
    }

    @Override
    public double calcularSalario() {
        double salarioTotal = getSalarioBase();
        if (getHorasTrabajadas() >= 0) {
            if (getHorasTrabajadas() > 40) {
                salarioTotal += (getHorasTrabajadas() - 40) * 50;
            }
        } else {
            throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        }
        switch (getDepartamento()) {
            case "Sistemas":
                salarioTotal += 20;
                break;
            case "Contabilidad":
                salarioTotal += 10;
                break;
            default:
                break;
        }
        return salarioTotal;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Genero: " + super.getNombre());
        System.out.println("Salario: " + super.getSalarioBase());
        System.out.println("Horas trabajadas: " + super.getHorasTrabajadas());
        System.out.println("Departamento: " + super.getDepartamento());
        System.out.println("bonoAnual: " + bonoAnual);
    }

    // Más metodos
}
