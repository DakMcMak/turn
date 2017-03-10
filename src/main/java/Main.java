import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10001];
        int numerTurn = scanner.nextInt();
        for(int i = 1;i <= numerTurn; ++i){
            numbers[i] = scanner.nextInt();
        }
        for(int i = numerTurn; i >= 1; i = i - 1){
            System.out.println(numbers[i] + " " );
        }
    }
}
