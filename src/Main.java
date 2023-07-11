public class Main {
    public static void main(String[] args) {

        int begin = 300;
        int replenishment = 5000;
        int bonus;
        boolean part = replenishment > 1000;
        if (part) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Итоговый счет=" + (begin + replenishment + bonus)
        );
        System.out.println("Итоговый бонус=" + bonus);


    }
}
