public class Main {
    public static void main(String[] args) {
        int initialAmount = 150;
        int amountCredited = 2000;

        int bonus;
        if (amountCredited > 1000) {
            bonus = amountCredited / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Количество бонусных рублей:" + bonus);

        int totalAmount = initialAmount + amountCredited + bonus;

        System.out.println("Итоговый счёт:" + totalAmount);
    }
}
