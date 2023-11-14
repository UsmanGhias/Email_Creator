import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EmailGenerator {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Note: Enter lowercase alphabets only\n\nEnter the department(cs/se/it/ds)\n");
            Scanner scanner = new Scanner(System.in);

            String dep = scanner.next();
            System.out.println("Enter the batch (without f)\n");
            String bat = scanner.next();
            System.out.println("Enter the section (m/a)\n");
            String sec = scanner.next();

            String fileName = dep + "f" + bat + sec + ".txt";

            try {
                PrintWriter fout = new PrintWriter(new FileWriter(fileName));

                generateEmails(fout, dep, bat, sec);

                fout.close();

                System.out.println("File created successfully.\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void generateEmails(PrintWriter fout, String dep, String bat, String sec) {
        for (int i = 1; i < 61; i++) {
            if (dep.equals("ds")) {
                fout.print("bsdsf" + bat + sec + "0" + String.format("%02d", i) + "@pucit.edu.pk");
            } else {
                fout.print("b" + dep + "f" + bat + sec + "5" + String.format("%02d", i) + "@pucit.edu.pk");
            }

            if (i != 60) {
                fout.print(",");
            }
        }
    }
}
