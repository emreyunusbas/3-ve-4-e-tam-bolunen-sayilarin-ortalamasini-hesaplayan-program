import java.util.Scanner;

public class AverageDivisibleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0; // Toplamı saklamak için değişken
        int count = 0; // Bölünen sayıların adedini saklamak için değişken

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i; // Bölünebilen sayıları toplama ekle
                count++; // Bölünebilen sayıların adedini artır
            }
        }

        double average = (double) sum / count; // Ortalamayı hesapla

        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
    }
}
