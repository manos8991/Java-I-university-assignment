import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void printMenu(int input) {
        String[] Menu = new String[10];
        Menu[0] = "1. Έκδοση-αγορά\n" +
                  "2. Ανανέωση\n" +
                  "3. Ενημέρωση περιεχομένου\n" +
                  "\nΠαρακαλώ επιλέξτε μία από τις " +
                  "παραπάνω ενέργειες ";
        Menu[1] = "Παρακαλώ επιλέξτε τον τύπο εισιτηρίου\n" +
                  "1.Κανονικό\n" +
                  "2.Μειωμένo";
        Menu[2] = "Παρακαλώ επιλέξτε τη χρονική διάρκεια\n"+
                  "1. 90 λεπτά\n" +
                  "2. ημερήσιο\n" +
                  "3. εβδομαδιαίο\n" +
                  "4. μηνιαίο";
        Menu[3] = "Παρακαλώ επιλέξτε το πλήθος διαδρομών\n"+
                  "1. 1 Διαδρομή\n"+
                  "2. 5 Διαδρομές\n"+
                  "3. 10+1 Διαδρομές\n";
        Menu[4] = "Παρακαλώ καταχωρήστε επιπλέον : \n";
        Menu[5] = "Παρακαλώ επιλέξτε τον τρόπο πληρωμής\n"+
                  "1. Μετρητά\n"+
                  "2. Χρεωστική Κάρτα\n";
        Menu[6] = "Παρακαλώ εισάγετε τα χρήματα\n";
        Menu[7] = "Παρακαλώ επιλέξτε τον τρόπο παραλαβής του εισιτηρίου\n"+
                  "1. Ηλεκτρονική μορφή\n"+
                  "2. Έντυπη μορφή ";
        Menu[8] = "Παρακαλώ εισάγετε το Email σας για να σας αποσταλεί το εισιτήριο\n";
        System.out.println(Menu[input]);


    }

    public static void main(String[] args) {
        int i = 0;
        printMenu(0);
        String choise;
        Scanner sc = new Scanner(System.in);
        choise = sc.next();
        while(!choise.equals("quit")){
            Eticket Eticket1 = new Eticket();


        }




            }
}

