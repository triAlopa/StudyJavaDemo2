package StuDemo8_05;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(getSum(1));
    }

    private static int getSum(int i) {
        if(i<0||i>11) return -1;
        if(i==10) return 1;
        else return (getSum(i+1)+1)*2;
    }

}
