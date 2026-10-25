import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double total = 0, bl, mb, mh, p, kh;
        double n = in.nextDouble();

        //ביטוח לאומי
        total += Math.min(n, 7703) * 0.0104
                + Math.max(0, Math.min(n, 51090) - 7703) * 0.07;

        // מס בריאו
        total += Math.min(n, 7703) * 0.0323
                + Math.max(0, Math.min(n, 51090) - 7703) * 0.0517;

        //מס הכנסה
        total += Math.min(n, 7010) * 0.10
                + Math.max(0, Math.min(n, 10060) - 7010) * 0.14
                + Math.max(0, Math.min(n, 19000) - 10060) * 0.20
                + Math.max(0, Math.min(n, 25100) - 19000) * 0.31
                + Math.max(0, Math.min(n, 46690) - 25100) * 0.35
                + Math.max(0, Math.min(n, 60130) - 46690) * 0.47
                + Math.max(0, n - 60130) * 0.50;

        //פנסיה
        total += n * 0.06;

        //קרן השתלמות
        total += n * 0.025;

        System.out.println(n - total);
    }
}