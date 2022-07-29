public class Main {
    public static void main(String[] args) {
        //Задание 1
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float e = 5.5f;
        double f = 6.66;
        char g = '!';
        boolean h = c <=3;
        System.out.println(h + " " + g);
        System.out.println();

        //Задание 2
        float boxerOneWeight = 78.2f;
        float boxerTwoWeight = 82.7f;
        float summaryWeight = boxerOneWeight + boxerTwoWeight;
        float differenceWeight = boxerTwoWeight - boxerOneWeight;
        System.out.println("Суммарный вес двух боксеров = " + summaryWeight + " кг.");
        System.out.println("Их разница в весе = " + differenceWeight + " кг.");
        System.out.println();

        //Задание 3
        byte bananaWeight = 80;
        int bananaSummaryWeight = bananaWeight * 5;
        byte milkWeight = 105;
        int milkSummaryWeight = milkWeight * 2;
        byte iceCreamWeight = 100;
        int iceCreamSummaryWeight = iceCreamWeight * 2;
        byte eggWeight = 70;
        int eggSummaryWeight = eggWeight * 4;
        double breakfastWeightG = bananaSummaryWeight + milkSummaryWeight + iceCreamSummaryWeight + eggSummaryWeight;
        double breakfastWeightKg = breakfastWeightG / 1000;
        System.out.println("Общий вес завтрака = " + breakfastWeightG + " грамм.");
        System.out.println("Это " + breakfastWeightKg + " кг.");
        System.out.println();

        //Задача 4
        byte weightLossResult = 7;
        float weightLossOne = 0.25f;
        float weightLossTwo = 0.5f;
        float daysForWeightLossOne = weightLossResult / weightLossOne;
        float daysForWeightLossTwo = weightLossResult / weightLossTwo;
        float weightLossAverage = weightLossTwo + weightLossOne / 2;
        float daysForWeightLossAverage = weightLossResult / weightLossAverage;
        System.out.println("Похудение по 250 грамм в сутки займёт " + daysForWeightLossOne + " дней");
        System.out.println("Похудение по 500 грамм в сутки займёт " + daysForWeightLossTwo + " дней");
        System.out.println("В среднем, похудение на 7 кг займёт " + daysForWeightLossAverage + " дней");
        System.out.println();

        //Задача 5
        int oldMonthSalaryMaria = 67760;
        int oldMonthSalaryDenis = 83690;
        int oldMonthSalaryKristina = 76230;
        int oldYearsMonthSalaryMaria = oldMonthSalaryMaria * 12;
        int oldYearsMonthSalaryDenis = oldMonthSalaryDenis * 12;
        int oldYearsMonthSalaryKristina = oldMonthSalaryKristina * 12;
        int newMonthSalaryMaria = oldMonthSalaryMaria + oldMonthSalaryMaria * 10 / 100;
        int newMonthSalaryDenis = oldMonthSalaryDenis + oldMonthSalaryDenis * 10 / 100;
        int newMonthSalaryKristina = oldMonthSalaryKristina + oldMonthSalaryKristina * 10 / 100;
        int newYearsMonthSalaryMaria = newMonthSalaryMaria * 12;
        int newYearsMonthSalaryDenis = newMonthSalaryDenis * 12;
        int newYearsMonthSalaryKristina = newMonthSalaryKristina * 12;
        int incomeDifferenceMaria = newYearsMonthSalaryMaria - oldYearsMonthSalaryMaria; //можно было в sout посчитать разницу, чтобы не вводить 3 новые переменные(ради экономии памяти)
        int incomeDifferenceDenis = newYearsMonthSalaryDenis - oldYearsMonthSalaryDenis;
        int incomeDifferenceKristina = newYearsMonthSalaryKristina - oldYearsMonthSalaryKristina;
        System.out.println("Маша теперь получает " + newMonthSalaryMaria + " рублей. Годовой доход вырос на " + incomeDifferenceMaria + " рублей.");
        System.out.println("Денис теперь получает " + newMonthSalaryDenis + " рублей. Годовой доход вырос на " + incomeDifferenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newMonthSalaryKristina + " рублей. Годовой доход вырос на " + incomeDifferenceKristina + " рублей.");
    }
}