package gr.aueb.cf.ch9;

import java.io.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Διαβάζει από ένα αρχείο grades.txt το ονοματεπώνυμο των μαθητών
 * και εκτυπώνει σε ένα αρχείο primOut.txt το ονοματεπώνυμο με τον
 * μέσο όρο των μαθητών. Τυχόν λάθη στους βαθμούς ή στην εισαγωγή
 * και την εξαγωγή αρχείων εκτυπώνονται στο αρχείο log.txt.
 */
public class Exercise9 {

    public static void main(String[] args) {

        File file = new File("C:/tmp/grades.txt");

        Logger logger = getLogger();

        if (!file.exists()) {
            if (logger != null) {
                logger.severe("Error in finding file.");
                System.out.println("Error in finding file.");
                System.exit(1);
            }
        }

        StringBuilder sb = readGrades(file, logger);

        printGrades(sb, logger);

    }

    /**
     * Διαβάζει ένα αρχείο με όν/μο και βαθμούς και επιστρέφει έναν
     * StringBuilder με τα ονόματα και τους μέσους όρους των βαθμών
     * των μαθητών, ελέγχοντας για λάθη στους βαθμους και στο input.
     *
     * @param dir       το path του αρχείου εισαγωγής.
     * @param logger    το αρχείο log.txt για εγγραφή λαθών.
     * @return          ο StringBuilder που μετέπειτα θα εγγραφεί σε αρχείο.
     */
    public static StringBuilder readGrades(File dir, Logger logger) {

        StringBuilder sb = new StringBuilder();
        String line;
        String[] grades;
        double firstGrade, secondGrade, avg;

        try (BufferedReader bf = new BufferedReader(new FileReader(dir))) {
            while ((line = bf.readLine()) != null) {
                grades = line.split(" +");
                try {
                    firstGrade = Double.parseDouble(grades[2]);
                    secondGrade = Double.parseDouble(grades[3]);
                } catch (NumberFormatException e1) {
                    e1.printStackTrace();
                    firstGrade = -1.0;
                    secondGrade = -1.0;
                }
                if (correctGrades(firstGrade, secondGrade)) {
                    avg = (Double.parseDouble(grades[2]) + Double.parseDouble(grades[3])) / 2;
                    sb.append(grades[0]).append(" ").append(grades[1]).append(" ").append(avg).append("\n");
                } else {
                    if (logger != null) logger.severe(String.format("The grades of %s %s are incorrect.", grades[0], grades[1]));
                    System.out.printf("The grades of %s %s are incorrect.\n", grades[0], grades[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb;
    }

    /**
     * Εκτυπώνει τον StringBuilder σε ένα αρχείο primOut.txt
     *
     * @param sb         ο StringBuilder προς εγγραφή.
     * @param logger     το αρχείο log.txt για εγγραφή λαθών.
     */
    public static void printGrades(StringBuilder sb, Logger logger) {
        if (sb != null) {
            try (PrintStream ps1 = new PrintStream("C:/tmp/primOut.txt")) {
                print(ps1, sb);
                System.out.println("The print is successful.");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            if (logger != null) {
                logger.severe("Error in reading file.");
                System.out.println("Error in reading file.");
                System.exit(1);
            }
        }
    }

    /**
     * Εκτυπώνει
     *
     * @param ps το αρχείο που θα γίνει η εκτύπωση.
     * @param sb ο StringBuilder προς εγγραφή.
     */
    public static void print(PrintStream ps, StringBuilder sb) {
        ps.println(sb);
    }

    /**
     * Έλεγχος για λάθος βαθμούς με μια boolean μεταβλητή
     * που είναι true αν είναι σωστοί και false αν είναι
     * λάθος.
     *
     * @param a βαθμός νο. 1
     * @param b βαθμός νο. 2
     * @return boolean επιστροφής
     */
    public static boolean correctGrades(double a, double b) {
        if ((a < 0 || a > 10) || (b < 0 || b > 10)) return false;
        else return true;
    }

    /**
     * Δημιουργεί ένα αρχείο Logger που καταγράφει τυχόν
     * λάθη που προκύπτουν στην εφαρμογή.
     *
     * @return επιστρέφει το αρχείο logger.
     */
    public static Logger getLogger() {
        Logger logger = Logger.getLogger(Exercise9.class.getName());

        try {
            FileHandler fileHandler = new FileHandler("C:/tmp/log.txt");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setUseParentHandlers(false);
            return logger;
        } catch (IOException e) {
            logger.severe("Error in log file");
            return null;
        }

    }
}
