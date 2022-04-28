import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {


        //Здание 1
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start++;
        }


        System.out.println();
        int start2 = 10;
        while (start2 > 0) {
            System.out.print(start2 + " ");
            start2--;
        }


        System.out.println();
        //Задание 2
        int dateOfMonth = 2;
        for (int firstFriday  = dateOfMonth; firstFriday<= 31; firstFriday = firstFriday + 7) {

            System.out.println(" Сегодня пятница " + firstFriday + "-е число,необходимо подготовить отчет ");
        }


        //Задание 3
        int year = 2022;
        int start3 = year-200;
        int finish=year+100;
        for (year =start3;year<=finish;year=year+1)
            if (year % 79 == 0  ) {
            System.out.println(year);
        }
    }

}