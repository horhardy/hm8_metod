public class Main {

    //ЗАДАНИЕ 1
    public static void printYearLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
    }

    public static void main(String[] args) {

        int year = 2024;
        printYearLeap(year);
        // ЗАДАНИЕ 2
        int clientOSS = 0;
        clientDevise (clientOSS);
        int clientDeviseYear = 2014;
        currentYear (clientDeviseYear);

    }


    // ЗАДАНИЕ 2
    public static void clientDevise (int clientOSS) {
        if (clientOSS == 0) {

            System.out.println("IOS");
        } else {
            System.out.println("Andoird");
        }
    }

        public static void  currentYear ( int clientDeviseYear) {
            if (clientDeviseYear > 2015) {
                System.out.println("Установить обычную версию приложения ");
            } else {
                System.out.println("Установить lite версию приложения  ");
            }





    }
}