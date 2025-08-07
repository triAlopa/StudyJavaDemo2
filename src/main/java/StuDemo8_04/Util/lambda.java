package StuDemo8_04.Util;

public class lambda {
    public static void main(String[] args) {
        useSwim(()->{
                System.out.println("Override");
            }
        );
    }

    public static void useSwim(swim swim) {
        swim.swim();
    }


    @FunctionalInterface
    interface swim {

        public abstract void swim();
    }
}
