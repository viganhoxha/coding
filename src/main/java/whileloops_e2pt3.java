import java.util.Scanner;

public class whileloops_e2pt3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota = 0;
        double shuma = 0;
        double count = 0;

        while (nota != -1) {
            System.out.println("Shkruaj noten (-1 perfundon programin): ");
            nota = input.nextDouble();

            if (nota != -1)
            {
               shuma = nota + shuma;
                count++;
            }

        }

        double notamesatare = shuma / count;
        System.out.println("Nota mesatare eshte: " +notamesatare);






        //2. Krijo programin qe kalkulon mesataren e notave te nje studenti
        //Shuma e notave / numri i notave = mesatarja
                //(10+7+8+9+10) / 5 = 8.8


        //Shembull:

        /*Shkruaj noten(-1 perfundon programin): 10
        Shkruaj noten(-1 perfundon programin): 7
        Shkruaj noten(-1 perfundon programin): 8
        Shkruaj noten(-1 perfundon programin): 9
        Shkruaj noten(-1 perfundon programin): 10
        Shkruaj noten(-1 perfundon programin): -1

        Nota mesatare eshte: 8.8

    */}
}
