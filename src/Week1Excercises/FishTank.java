package Week1Excercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double percentWaterDisplaced = Double.parseDouble(scanner.nextLine());

        double tankVolumeInLiters = a * b * h * 0.001;

        double availableVolume = tankVolumeInLiters - (tankVolumeInLiters * percentWaterDisplaced / 100);
        System.out.println(availableVolume);
    }
}
