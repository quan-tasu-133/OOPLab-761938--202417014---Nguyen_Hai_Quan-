import java.util.Scanner;

public class Assignment64 {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);

        int month;
        int year;

        while (true) {
            System.out.println("Enter month:");
            String m = keyboard.nextLine().toLowerCase();

            if (m.equals("january") || m.equals("jan") || m.equals("1")) month = 1;
            else if (m.equals("february") || m.equals("feb") || m.equals("2")) month = 2;
            else if (m.equals("march") || m.equals("mar") || m.equals("3")) month = 3;
            else if (m.equals("april") || m.equals("apr") || m.equals("4")) month = 4;
            else if (m.equals("may") || m.equals("5")) month = 5;
            else if (m.equals("june") || m.equals("jun") || m.equals("6")) month = 6;
            else if (m.equals("july") || m.equals("jul") || m.equals("7")) month = 7;
            else if (m.equals("august") || m.equals("aug") || m.equals("8")) month = 8;
            else if (m.equals("september") || m.equals("sep") || m.equals("9")) month = 9;
            else if (m.equals("october") || m.equals("oct") || m.equals("10")) month = 10;
            else if (m.equals("november") || m.equals("nov") || m.equals("11")) month = 11;
            else if (m.equals("december") || m.equals("dec") || m.equals("12")) month = 12;
            else {
                System.out.println("Invalid month!");
                continue;
            }

            System.out.println("Enter year:");
            year = keyboard.nextInt();
            keyboard.nextLine();

            if (year < 0) {
                System.out.println("Invalid year!");
                continue;
            }

            break;
        }

        int days;

        if (month == 1 || month == 3 || month == 5 || month == 7 ||
            month == 8 || month == 10 || month == 12) {
            days = 31;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        }
        else {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                days = 29;
            else
                days = 28;
        }

        System.out.println("Number of days: " + days);
    }
}