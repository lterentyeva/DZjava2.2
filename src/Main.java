public class Main {
    public static void main(String[] args) {

        // Входные данные

        int balance = 200;
        int amount = 2000;
        int cost = 100;

        // Логика программы

        int bonus;
        if (amount >= 1000) {
            bonus = amount / cost;
        } else {
            bonus = 0;
        }
        int total = balance + amount + bonus;

        System.out.println("Сумма счета составляет:" + total);

    }
}