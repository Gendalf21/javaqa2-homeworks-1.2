public class Main {
    public static void main(String[] args) {
        int start = 100; // сумма на счете
        int add = 1100; // сумма пополнения
        int bonus = add / 100; // сумма бонуса
        int sum = add > 1000 ? start + add + bonus : start + add; // расчет итоговой суммы
        System.out.println(sum + " итоговая сумма");
        System.out.println(bonus + " бонусные баллы");
    }
}
