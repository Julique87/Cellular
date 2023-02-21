public class Main {
    public static void main(String[] args) {

        int initialAmount = 100; // начальный счет
        int priceBonus = 100; // цена одного бонуса
        int amount = 1200; // сумма пополнения
        int check = amount + initialAmount; // всего на счету

        int bonus;
        if (amount > 1000) {
            bonus = check / priceBonus;
        } else {
            bonus = 0;
        }
        System.out.println("Всего начислено бонусов: " + bonus);
    }

}