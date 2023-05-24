package ru.netology.services;

public class FreeMonthsExpences {
    public static int calculate(int account, int income, int expence, int threshold) {
        int months = 12;
        while (months > 0) {
            if (threshold > account) {
                System.out.println("Денег " + account + ". Придётся работать. Заработал " + income + ", потратил " + expence);
                account = account + income;
                account = account - expence;

            } else {
                int accRest = account - expence;
                accRest /= 3;
                System.out.println("Денег " + account + ". Буду отдыхать. Потратил " + expence + ", затем ещё " + (account - accRest - expence));

                account = accRest;
            }
            months--;
        }
        return account;
    }

}
