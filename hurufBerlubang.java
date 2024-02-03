import java.util.Scanner;

public class hurufBerlubang {
    public static void main (String[] args ) {
        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();

        int result = countHoles(input);

        System.out.println(result);
    }
    public static int countHoles(String input){
        int holes = 0;
        for ( char c : input.toCharArray()){
            switch (c){
                case 'A':
                case 'D':
                case 'O':
                case 'P':
                holes += 1;
                break;
                case 'B':
                holes += 2;
                break;
            }
        } return holes;
    }
}
