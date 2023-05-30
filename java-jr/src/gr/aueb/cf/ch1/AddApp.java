package gr.aueb.cf.ch1;

/**
 * Prosthetei 2 akeraious kai emfanizei
 * to apotelesma sto stdout.
 */
public class AddApp {
    public static void main(String[] args) {
        //dilwsi kai arxikopoiisi metablitwn
        int num1 = 10;
        int num2 = 7;
        int result = 0;

        //entoles
        result = num1 + num2;

        //ektypwsi apotelesmatwn
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.printf("Το αποτέλεσμα των %d , %d είναι %d", num1 , num2 , result);
    }
}
