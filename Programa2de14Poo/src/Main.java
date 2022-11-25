public class Main {
    public static void main(String[] args) {

        int diferencial = 2;
        for (int i=0; i<800; i=i){

            if (diferencial == 2) {
                diferencial =3;
                i= i+diferencial;
            }
            else {
                diferencial = 2;
                i= i+diferencial;

            }

            System.out.print( i + " ");
        }

    }
}