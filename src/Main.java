public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчета стоимости топлива");
        int fuelType = 92;
        int amount = 100;
        int maxAmount = 420;
        double fuel92Price = 60.2;
        double fuel95Price = 67.33;
        double fuelPrice = 0.0;
        if (fuelType == 92) {
            fuelPrice = fuel92Price;
        } else if (fuelType == 95) {
            fuelPrice = fuel95Price;
        } else {
            System.out.println("Указан неверный тип топлива!");
        }

        if (amount > maxAmount) {
            System.out.println("Цена выбранного топлива: " + fuelPrice + " руб.");
        }

        if (amount < 1) {
            System.out.println("Указано малое количество топлива");
        }

        double totalPrice = fuelPrice * (double)amount;
        System.out.println("Общая стоимость заправки " + totalPrice + " руб.");
    }
}