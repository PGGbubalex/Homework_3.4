public class Main {
    public static void main(String[] args) {
        int productivityInTwoMinutes = 16;
        int productivityInOneMinute = productivityInTwoMinutes / 2;
        int minutesInOneDay = 24 * 60;
        int threeDays = 3;
        int daysInOneMonth = 30;

        int twentyMinutes = 20;
        int productivityInTwentyMinutes = productivityInOneMinute * twentyMinutes;
            System.out.println("За двадцать минут машина произвела бутылок " + productivityInTwentyMinutes + " штук");

        int productivityInOneDay = minutesInOneDay * productivityInOneMinute;
            System.out.println("За один день машина произвела бутылок " + productivityInOneDay + " штук");

        int productivityInThreeDays = (threeDays * minutesInOneDay) * productivityInOneMinute;
            System.out.println("За три дня машина произвела бутылок " + productivityInThreeDays + " штук");

        int productivityInOneMonth = (daysInOneMonth * minutesInOneDay) * productivityInOneMinute;
            System.out.println("За один месяц произвела бутылок " + productivityInOneMonth + " штук");
    }
}