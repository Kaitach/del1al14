import javax.swing.JOptionPane;

public class Main {


    public static void main(String[] args) {


        int matricula, promedio = 0, calificacion;
        matricula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su matricula "));
        for (int i=0; i<5; i++){
            calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su calificacion numero: " +(i+1)));
            promedio += calificacion;

        }
        if (promedio/5>=6){
            JOptionPane.showMessageDialog(null, "El alumno con matricula " + matricula +"  aprobó  el curso");

        }
        else {
            JOptionPane.showMessageDialog(null,  "El alumno con matricula " + matricula +" no  aprobó  el curso");

        }


    }
}