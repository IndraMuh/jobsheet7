import java.util.Scanner;

public class ParkingLot10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type, duration, total = 0;

        System.out.println("Input the type of vehicle \n (1 Car, 2 Motorcycle, 0 Exit)");
        type = sc.nextInt();
        while (type != 0) {
        if (type == 1 || type == 2) {
            System.out.println("Input Duration: ");
            duration = sc.nextInt();

            if (duration > 5) {
                total += 12500;
            } else if (type == 1) {
                total += duration * 3000;
            } else if (type == 2) {
                total += duration * 2000;
            }
        }
        System.out.println("Input the type of vehicle \n (1 Car, 2 Motorcycle, 0 Exit)");
        type = sc.nextInt();
    }
    
    System.out.println("Total parking fee: Rp " + total);
    sc.close();
}
}
