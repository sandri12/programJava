import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class mengurutData {
    public static void main ( String [] args){
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();

        String [] dataString = input.split("");
        Integer [] data = new
         Integer[dataString.length];
for ( int i =0; i < dataString.length; i++){
    data[i] = Integer.parseInt(dataString[i]);
}
Arrays.sort(data,Collections.reverseOrder());
System.out.println ( Arrays.toString(data));
    }
}
