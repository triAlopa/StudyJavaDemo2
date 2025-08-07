package StuDemo8_05;



//斐波那契数列
public class Test2 {
    public static void main(String[] args) {
       int[] arr=new int [12];
       arr[0]=1;
       arr[1]=1;

        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        int sum=0;

        System.out.println(arr[11]);
        System.out.println(getsum(12));
    }

    private static int getsum(int mouth) {
        if(mouth==1||mouth==2) return 1;
        else return getsum(mouth-1)+getsum(mouth-2);
    }
}
