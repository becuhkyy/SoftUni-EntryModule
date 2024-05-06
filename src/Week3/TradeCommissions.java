package Week3;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        Double trade = Double.parseDouble(scanner.nextLine());

        double percent = 0;

        if (trade < 0) {
            System.out.println("error");
            return;
        }

        switch (city) {
            case "Sofia": {
                if (trade >= 0 && trade <= 500) {
                    percent = 0.05;
                } else if (trade <= 1000) {
                    percent = 0.07;
                } else if (trade <= 10000) {
                    percent = 0.08;
                } else if (trade > 10000) {
                    percent = 0.12;
                }
                break;
            }
            case "Varna": {
                if (trade >= 0 && trade <= 500) {
                    percent = 0.045;
                } else if (trade <= 1000) {
                    percent = 0.075;
                } else if (trade <= 10000) {
                    percent = 0.10;
                } else if (trade > 10000) {
                    percent = 0.13;
                }
                break;
            }
            case "Plovdiv": {
                if (trade >= 0 && trade <= 500) {
                    percent = 0.055;
                } else if (trade <= 1000) {
                    percent = 0.08;
                } else if (trade <= 10000) {
                    percent = 0.12;
                } else if (trade > 10000) {
                    percent = 0.145;
                }
                break;
            }
            default: {
                System.out.println("error");
                return;
            }
        }

        System.out.printf("%.2f", trade * percent);
    }
}
