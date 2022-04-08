import java.util.Scanner;

public class whileloops_e1pt3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double rroga = 0;

        while (rroga != -1) {
            System.out.println("Shkruaj rrogen bruto (-1 perfundon programin): ");
            rroga = input.nextDouble();

            if (rroga >= 250 && rroga <= 800) {

                double rroganet = rroga - rroga * 0.10;
                System.out.println("Rroga neto eshte: " + rroganet);

                if (rroga >= 1 && rroga <= 180) {
                    System.out.println("Rroga neto eshte: " + rroganet);

                }
            }

        }

    }
}