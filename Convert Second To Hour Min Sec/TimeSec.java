import java.util.Scanner;

public class TimeSec {
    public static void main(String[] args){
        int sec;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Second: ");
        sec = sc.nextInt();
        sc.close();
        int hour = (sec / 60);
        int min = hour%60;
        sec = sec%60;
        hour = hour/60;

        System.out.println("Hour: "+hour);
        System.out.println("Min: "+min);
        System.out.println("Sec: "+sec);

    }
}