package Data;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String nombre = "";
        double SalarioSemanal = 0;
        double SalarioBruto = 0;
        double SalarioNeto = 0;
        double Deducciones = 0.0934;

        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        System.out.println("Su nombre es: "+nombre);
        SalarioSemanal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario semanal:"));
        System.out.println("Salario Semanal: "+SalarioSemanal);
        SalarioBruto = SalarioSemanal * 4;
        System.out.println("Salario bruto: "+SalarioBruto);
        Deducciones = Deducciones * SalarioBruto;
        System.out.println("Deducciones: "+Deducciones);
        SalarioNeto = SalarioBruto - Deducciones;
        System.out.println("Salario Neto: "+SalarioNeto);

        JOptionPane.showMessageDialog(null, "Estimado trabajador "+nombre+", el salario de este mes se deslglosa de la siguiente manera: \n" +
                "Salario Bruto: "+SalarioBruto+"\n" +
                "Deducciones: "+Deducciones+"\n" +
                "Salario Neto: "+SalarioNeto);
    }
}
