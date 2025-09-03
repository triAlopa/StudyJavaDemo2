package stuDemo9_02.MyThreadE;

import java.util.Random;

public class e4Thread extends Thread {

    static int count = 3;

    static double money = 100.0;

    static final double MIN = 0.01;

    @Override
    public void run() {
            synchronized (e4Thread.class) {
                if (count == 0) {
                    System.out.println(getName() + "没抢到红包");

                } else {
                    count--;
                    double prize = 0;
                    if (count == 1) prize = money;
                    else {
                        Random r = new Random();
                        double bounds = money - (count - 1) * MIN;
                        prize = r.nextDouble(bounds);
                        if(prize<=MIN) prize=MIN;
                        money = money - prize;
                    }

                    System.out.println(getName() + "抢到了" + prize);

                }

        }

    }
}
