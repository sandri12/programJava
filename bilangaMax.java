import java.util.Scanner;

public class bilangaMax {
public static void main (String[] args){
    Scanner scanner = new 
    Scanner (System.in);
int x1 = scanner.nextInt();
int x2 = scanner.nextInt();
int x3 = scanner.nextInt ();

int maxNumber = Math.max(Math.max (x1, x2), x3);

System.out.println( maxNumber);

}
}
