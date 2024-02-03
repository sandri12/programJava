import java.util.Scanner;
public class teksAlay {
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
     String kalimat = scanner.nextLine();
   String kalimatAlay = convertToAlay(kalimat);
    System.out.println(kalimatAlay);
    scanner.close();
    }
  private static String convertToAlay(String input) {
     char[] characters = input.toCharArray();
  for (int i = 0; i < characters.length; i++) {
            char currentChar = characters[i];
        switch (currentChar) {
                case 'A':
                case 'a':
                    characters[i] = '4';
                    break;
                case 'I':
                case 'i':
                    characters[i] = '1';
                    break;
                case 'Z':
                case 'z':
                    characters[i] = '2';
                    break;
                case 'E':
                case 'e':
                    characters[i] = '3';
                    break;
                case 'G':
                case 'g':
                    characters[i] = '6';
                    break;
                case 'J':
                case 'j':
                    characters[i] = '7';
                    break;
                case 'B':
                case 'b':
                    characters[i] = '8';
                    break;
                }
            }

          return new String(characters);
        }
}