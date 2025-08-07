package StuDemo8_05;


public class Test4 {
    public static void main(String[] args) {
      int step=20;
        System.out.println(getCount(step));
    }

    private static int getCount(int step) {
        if(step==2) return 2;
        if(step==1) return 1;
        if(step==3) return 4;
        else return getCount(step-1)+getCount(step-2)+getCount(step-3);
    }

}
