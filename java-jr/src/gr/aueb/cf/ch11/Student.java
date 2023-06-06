package gr.aueb.cf.ch11;

import java.util.Scanner;

/**
 * Μια απλή data class. Η εμβέλεια της κλάσης εξαρτάται από τους access modifiers:
 * public(προσπελάσιμα από παντού, ίδια κλάση, package, derived, Java World).
 * private(μόνο η ίδια η κλάση έχει πρόσβαση)
 * protected(ίδια κλάση, package, derived)
 * default-package private(ίδια κλάση, package)
 *
 * POJO (Plain Old Java Object)
 * Student Java Bean (private fields, constructor, setters-getters -> POJO)
 * This leads to Convention over Configuration.
 */
public class Student {

    //Ένα μόνο studentsCount που το διαμοιράζονται όλα τα instances
    private static int studentsCount;
    static Scanner in = new Scanner(System.in);

    //Είτε αρχικοποιείται σε static block
    static {
        int num = in.nextInt();
        studentsCount = (num == 1) ? 1 : 0;
    }

    private int id;
    private String firstname;
    private String lastname;

    //Είτε αρχικοποιείται στον constructor
    public Student() {
        //studentsCount = 0;
    }

    //από μη στάτικ μεθόδους καλούμε και objects / instances
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    //από static μεθόδους καλούμε μόνο static μεθόδους και πεδία
    public static int getStudentsCount() {
        return studentsCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
