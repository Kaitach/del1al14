import javax.swing.JOptionPane;

public class Main {


    public static void main(String[] args) {


        int SUE ;
        SUE  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su sueldo "));
        float nuevoSueldo;
        if (SUE <= 1000){
            nuevoSueldo = (float) (SUE *1.15);
            JOptionPane.showMessageDialog(null, "El nuevo salario es de: $" + nuevoSueldo);

        }
        else {
            nuevoSueldo = (float) (SUE *1.12);
            JOptionPane.showMessageDialog(null, "El nuevo salario es de: $" + nuevoSueldo);
        }


    }
}