import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = new ArrayList<>();

        System.out.println("Готов закупиться??");

        while (true) {
            EverybodyDrinks.printSelectionMenu();

            String selectOperation = scanner.next();

            if (selectOperation.equals("5")) {
                System.out.println("Пока-пока");
                break;
            }

            switch (selectOperation) {
                case "1" -> EverybodyDrinks.addPurchase(scanner, shoppingList);

                case "2" -> EverybodyDrinks.list(shoppingList);

                case "3" -> {
                    EverybodyDrinks.list(shoppingList);
                    EverybodyDrinks.deletePurchase(scanner, shoppingList);
                }

                case "4" -> EverybodyDrinks.searching(scanner, shoppingList);

                default -> System.out.println("Такой операции нет!! их всего 5, попробуй еще раз");
            }
        }
    }
}