package Week3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String productName = scanner.nextLine();

        List<String> fruits = Arrays.asList("banana", "apple", "kiwi", "cherry", "lemon", "grapes");
        List<String> vegetables = Arrays.asList("tomato", "cucumber", "pepper", "carrot");

        boolean isVegetable = vegetables.contains(productName);
        boolean isFruit = fruits.contains(productName);

        if (isFruit)
            System.out.println("fruit");
        else if (isVegetable)
            System.out.println("vegetable");
        else
            System.out.println("unknown");
    }
}
