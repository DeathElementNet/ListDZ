import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = new ArrayList<>();

        System.out.println("Готов закупиться??");

        while (true) {
            CreateSelection.printSelectionMenu();

            String selectOperation = scanner.next();

            if (selectOperation.equals("5")) {
                System.out.println("Пока-пока");
                break;
            }

            switch (selectOperation) {
                case "1" -> CreateSelection.addPurchase(scanner, shoppingList);

                case "2" -> CreateSelection.list(shoppingList);

                case "3" -> {
                    CreateSelection.list(shoppingList);
                    CreateSelection.deletePurchase(scanner, shoppingList);
                }

                case "4" -> CreateSelection.searching(scanner, shoppingList);

                default -> System.out.println("Такой операции нет!! их всего 5, попробуй еще раз");
            }
        }
    }
}