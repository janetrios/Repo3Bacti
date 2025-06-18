package Model;

public abstract class Empleado {
    private String id;

    public Empleado(String id, String nombre, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    private String nombre;
    private double salarioBase;

    public abstract double calcularSalario();
}