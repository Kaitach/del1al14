import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    int trabajadores = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de trabajadores"));
    int salario1 = 0, salario2=0, trabajador = 0;
     for ( int i=0; i<trabajadores; i++){
         salario1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del trabajador " + (i+1)));

         if (salario1 > salario2){
             trabajador = i+1;
             salario2 = salario1;
             System.out.println(salario2);
         }
     }
     JOptionPane.showMessageDialog(null, "El salario mas grande es del trabajador: " + trabajador + " el mismo es de: " +salario2);
    }
}