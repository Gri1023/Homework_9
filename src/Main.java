public class Main {
    public static void main(String[] args) {
        int t=0;
        int highest=0;
        int time = 0;
        while (t>=0 & t<=100)
        {
            int difference = (t*(t-20)*(t-100)+120000) - ((t-1)*(t-21)*(t-101)+120000);
            if ( difference < highest)
            {
                highest = difference;
                time = t;
            }
            t = t + 1;
        }
        System.out.println(time);
        System.out.println("difference was " + highest);
    }
}