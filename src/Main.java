// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int bonus = 0;
        int fish = 100;
        int depositAmount = 1500;
        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
        }
        int finalScore = fish + depositAmount + bonus;

        System.out.println("Итоговый счет:" + finalScore);
        System.out.println("Бонус:" + bonus);
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}