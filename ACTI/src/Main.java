import javax.swing.*;
import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog("Primer promedio");
        System.out.println(x);
        String y = JOptionPane.showInputDialog("Segundo promedio");
        System.out.println(x);
        String z = JOptionPane.showInputDialog("Tercer promedio");
        System.out.println(x);

        double suma = Integer.parseInt(x) + Integer.parseInt(y) + Integer.parseInt(z);
        double resultado = suma / 3;

        System.out.println(resultado);
    }

}