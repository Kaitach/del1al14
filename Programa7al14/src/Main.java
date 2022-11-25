import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int calificaciones, general = 0;
        int promedio [] = new int [20];

        for (int i=0; i<20; i++){
            calificaciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificacion del alumno: "+(i+1)));
            promedio[i] = calificaciones;
            general = general+calificaciones;
        }
        JOptionPane.showMessageDialog(null, "El promedio general es: " + general/20 );

        for (int i=20; i>0; i--){
            JOptionPane.showMessageDialog(null, "La calificacion del alumno: " + i + "  es de " + promedio[i-1]);

        }
    }

    }
