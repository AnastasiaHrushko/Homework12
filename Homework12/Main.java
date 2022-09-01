package Homework12;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Order order = new Order();
        Product product = new Product();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        Path forProducts = Path.of("resources", "forProducts.txt");
        Path forOrders = Path.of("resources", "forOrders.txt");

        Product bread = new Product(1111, "хлеб");
        Product sourCream = new Product(7288, "сметана");
        Product milk = new Product(256, "молоко");
        Product cheese = new Product(2654, "сыр");
        Product pasta = new Product(3355, "макароны");
        Product beef = new Product(2564, "говядина");
        Product bacon = new Product(7867, "бекон");
        Product pork = new Product(5230, "свинина");

        System.out.println("введите 1 чтобы увидеть список товаров в наличии");
        Scanner makeOrder = new Scanner(System.in);
        int make_order = makeOrder.nextInt();
        if (make_order == 1) {
            System.out.println(bread);
            System.out.println(sourCream);
            System.out.println(milk);
            System.out.println(cheese);
            System.out.println(pasta);
            System.out.println(beef);
            System.out.println(bacon);
            System.out.println(pork);
        }
        System.out.println("введите 1 чтобы добавить хлеб в заказ" + "\n" + "введите 2 чтобы добавить сметану в заказ" + "\n" +
                "введите 3 чтобы добавить молоко в заказ" + "\n" + "введите 4 чтобы добавить сыр в заказ" + "\n" +
                "введите 5 чтобы добавить говядину в заказ" + "\n" + "введите 6 чтобы добавить бекон в заказ" + "\n" +
                "введите 7 чтобы добавить свинину в заказ" + "\n" + "введите 0 чтобы закончить");
        Scanner addProduct = new Scanner(System.in);
        int add_product = addProduct.nextInt();

            try (BufferedWriter writerForOrders = Files.newBufferedWriter(forOrders)) {
                writerForOrders.append("ваш заказ:");
                    do {
                        add_product = addProduct.nextInt();
                        switch (add_product) {
                            case 1:
                                System.out.println("хлеб добавлен в заказ");
                                writerForOrders.append("хлеб");
                                writerForOrders.newLine();
                                break;
                            case 2:
                                System.out.println("сметана добавлена в заказ");
                                writerForOrders.append("сметана");
                                writerForOrders.newLine();
                                break;
                            case 3:
                                System.out.println("молоко добавлено в заказ");
                                writerForOrders.append("молоко");
                                writerForOrders.newLine();
                                break;
                            case 4:
                                System.out.println("сыр добавлен в заказ");
                                writerForOrders.append("сыр");
                                writerForOrders.newLine();
                                break;
                            case 5:
                                System.out.println("говядина добавлена в заказ");
                                writerForOrders.append("говядина");
                                writerForOrders.newLine();
                                break;
                            case 6:
                                System.out.println("бекон добавлен в заказ");
                                writerForOrders.append("бекон");
                                writerForOrders.newLine();
                                break;
                            case 7:
                                System.out.println("свинина добавлена в заказ");
                                writerForOrders.append("свинина");
                                writerForOrders.newLine();
                                break;
                            default:
                                System.out.println("неверный номер");
                                break;
                        }
                    } while (add_product != 0);
                    if (add_product == 0) {
                        System.out.println("спасибо за заказ!)");
                    }
                } catch (IOException e){
            e.printStackTrace();
        }

        try (BufferedReader readerForOrders = Files.newBufferedReader(forOrders)) {
            String str = readerForOrders.lines()
                    .collect(Collectors.joining("\n"));
            System.out.println(str);

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
