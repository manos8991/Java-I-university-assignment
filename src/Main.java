import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String choice;
        int ak;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Έκδοση-αγορά\n" + "2. Ανανέωση\n" + "3. Ενημέρωση περιεχομένου\n" + "\nΠαρακαλώ επιλέξτε μία από τις " +
                "παραπάνω ενέργειες ");
        choice = sc.next();
        while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
            System.out.println("Σφάλμα\n");
            System.out.println("1. Έκδοση-αγορά\n" + "2. Ανανέωση\n" + "3. Ενημέρωση περιεχομένου\n" + "\nΠαρακαλώ επιλέξτε μία από τις " +
                    "παραπάνω ενέργειες ");
            choice = sc.next();
        }
        Eticket Eticket1 = new Eticket();
        if(choice.equals("1")){
            System.out.println("Παρακαλώ επιλέξτε τον τύπο εισιτηρίου\n1.Κανονικό\n2.Μειωμένο");
            Eticket1.setType(sc.next());
            while(!Eticket1.getType().equals("1") && !Eticket1.getType().equals("Κανονικό") && !Eticket1.getType().equals("Κανονικο") && !Eticket1.getType().equals
                    ("ΚΑΝΟΝΙΚΟ")&& !Eticket1.getType().equals("κανονικο") && !Eticket1.getType().equals("κανονικό") && !Eticket1.getType().equals("2") &&
                    !Eticket1.getType().equals("Μειωμένο") && !Eticket1.getType().equals("Μειωμενο") && !Eticket1.getType().equals("ΜΕΙΩΜΕΝΟ") && !Eticket1.getType().equals
                    ("μειωμένο")&& !Eticket1.getType().equals("μειωμένο")){
                System.out.println("Σφάλμα παρακαλώ επιλέξτε ξανά");
                System.out.println("Παρακαλώ επιλέξτε τον τύπο εισιτηρίου\n1.Κανονικό\n2.Μειωμένο");
                Eticket1.setType(sc.next());
            }
            if(Eticket1.getType().equals("1") || Eticket1.getType().equals("Κανονικό") || Eticket1.getType().equals("Κανονικο") || Eticket1.getType().equals("ΚΑΝΟΝΙΚΟ")
                    || Eticket1.getType().equals("κανονικο") || Eticket1.getType().equals("κανονικό"))
                    Eticket1.setType("Κανονικό");
            else
                Eticket1.setType("Μειωμένο");
            System.out.println("Επιλέξατε "+Eticket1.getType()+" εισιτήριο\nΠαρακαλώ επιλέξτε τη χρονική διάρκεια");
            System.out.println("1. 90 λεπτά\n2. ημερήσιο\n3. εβδομαδιαίο\n4. μηνιαίο");
            Eticket1.setDuration(sc.next());

        }
        else if (choice.equals("2")){

        }
        else{

        }
    }
}
