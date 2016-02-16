// ***** Puzzle *****

/* Assign a number from 1-7 to each department (police/fire department/sanitary)
 * Departments can't get the same number
 * Condition: all number for departments must add up to 12
 * police number must be even number */


public class Permutations {
    public static void main(String[] args) {
        int permut = 1;

        for (int fire = 1; fire <= 7; fire++) {
            for (int police = 1; police <= 7; police++) {
                for (int sanit = 1; sanit <= 7; sanit++) {
                    if ((fire != police) && (police != sanit) && (sanit != fire) && (police % 2 ==0) && fire + police + sanit == 12) {
                        System.out.println(permut + " permutation: " + fire + " " + police + " " + sanit);
                        permut++;
                    }
                }
            }
        }
    }
}
