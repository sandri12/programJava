import java.util.Scanner;

public class biayaTotal {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

     double biayaPertama = scanner.nextDouble();
    
     double persenBunga = scanner.nextDouble();
     
     double biayaTotal = biayaPertama + (biayaPertama * ( persenBunga / 100));
     
    System.out.printf("%.2f\n", biayaTotal);
     
     scanner.close();
        
    }
    
}