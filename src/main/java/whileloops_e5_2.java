public class whileloops_e5_2 {
    public static void main(String[] asdasd) {
        int count = 1;
        int dicka = 1;

        while(count <= 10) {
            System.out.println();
            int count2 = 1;

            while(count2 <= dicka) {
                System.out.print("*");
                count2++;

            }

           count++;
            dicka++;

        }
        // #1 per loop 1. Count = 1, Count2 = 1, dicka = 1. True, true *
        // #2 Count = 1, Count2 = 1, dicka = 1. True, true *
        // #3 Count = 1, Count2 = 2, dicka = 1. True, false
    }
}
