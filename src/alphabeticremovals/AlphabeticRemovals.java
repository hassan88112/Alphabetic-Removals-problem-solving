package alphabeticremovals;

// solved by hassan shalash
import java.util.Scanner;

public class AlphabeticRemovals {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int removalSize = input.nextInt();
        String value = input.next();
        char c[] = value.toCharArray();

        int start = 'a';
        int end = 'z';

        for (int i = start; i <= end; i++) {
            for (int x = 0; x < size; x++) {

                if (removalSize == 0) {
                break;
            }
                if (c[x] == i) {
                    c[x] = ' ';
                    removalSize--;

                }
            }
        }

        for (int i = 0; i < size; i++) {
            if (c[i] != ' ') {

                System.out.print(c[i]);

            }

        }

    }

}
