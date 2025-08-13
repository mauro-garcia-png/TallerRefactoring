public class EmpleadoTemporario extends Empleado {
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento,
            int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento, genero);
        this.mesesContrato = mesesContrato; // La tecnica de refactorizacion "Pull Up Constructor Body" ya fue aplicada
                                            // por la tecnica "pull up field"
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

    // Más metodos
}
