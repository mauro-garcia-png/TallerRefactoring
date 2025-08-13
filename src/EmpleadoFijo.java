public class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    private String genero;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento, genero);
        this.bonoAnual = bonoAnual;
        this.genero = genero;
    }

    @Override
    public double calcularSalario() {
        validarDatos();

        double salarioTotal = getSalarioBase() + calcularHorasExtra();
        salarioTotal += calcularBonoDepartamento();
        return salarioTotal;
        
    }


    // Más metodos
}
