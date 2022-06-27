public class Main {
    public static void main(String[] args) {

        int bonusRate = 20; // стоимость бонуса
        int fare = 40; // цена билета
        int bonus; // количество бонусных миль

        System.out.println("Купили билет");
        System.out.println("Потратили: " + fare);
        bonus = fare / bonusRate;
        System.out.println("Получили бонусных миль: " + bonus);
    }
}
