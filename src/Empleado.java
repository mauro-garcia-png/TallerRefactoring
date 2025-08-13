public abstract class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;
    private double tarifaHora;
    private String genero;

    public Empleado(){}
    public Empleado(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento,
            String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
        this.departamento = departamento;
        this.genero = genero;
    }

    public abstract double calcularSalario();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}