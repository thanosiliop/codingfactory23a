package gr.aueb.cf.ch11;

/**
 * Driver class (δηλαδή θα χρησιμοποιήσει μια άλλη κλάση)
 */
public class Main {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση, μεταβλητή τύπου Student,
        //το alice είναι ένα object / instance της Student
        //και alice δείκτης στο heap. Student όταν δεν έχει
        //μέτρους ονομάζεται default constructor και παρέχεται από το JVM.
        //Σκοπός του είναι να αρχικοποιεί τα πεδία της κλάσης
        Student alice = new Student();
        Student bob = new Student(2, "Bob", "O.");

        System.out.println(Student.getStudentsCount());

        //Η main έχει άμεση πρόσβαση στα id, first-lastname, επειδή είναι public.
        //Set
        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        //Get
        System.out.println("Id: " + alice.getId());
        System.out.println("Firstname: " + alice.getFirstname());
        System.out.println("Lastname: " + alice.getLastname());

        System.out.println("Bob id: " + bob.getId());
        System.out.println("Bob firstname: " + bob.getFirstname());
        System.out.println("Bob lastname: " + bob.getLastname());
    }
}
