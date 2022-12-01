import java.util.Scanner;

public class ConvertDay {
    public static void main(String[] args){
        int Days ,year , month, day;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Days for Convert: ");
        Days = sc.nextInt();
        sc.close();
        year = Days/365;
        month = (Days - year*365)/30;
        day = (Days-year*365-month*30);
        System.out.println("Years = "+year);
        System.out.println("Months = "+month);
        System.out.println("Days = "+day);
    }
}
