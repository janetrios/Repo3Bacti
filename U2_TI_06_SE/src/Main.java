import Model.*;

public class Main {
    public static void main(String[] args) {
        Empleado tiempoCompleto = new EmpleadoTiempoCompleto("001", "Ana López", 15000, "Seguro médico");
        Empleado porHoras = new EmpleadoPorHoras("002", "Abraham Pérez", 120, 80);

        System.out.println("Salario de " + tiempoCompleto.getNombre() + ": $" + tiempoCompleto.calcularSalario());
        System.out.println("Salario de " + porHoras.getNombre() + ": $" + porHoras.calcularSalario());
    }


}