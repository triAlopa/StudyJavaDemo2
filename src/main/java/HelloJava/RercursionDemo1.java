package HelloJava;

public class RercursionDemo1 {
    public static void main(String[] args) {
        System.out.println(addMethod(100));
    }
    private static int addMethod(int num){
        if(num==1) return num;
        return num+addMethod(num-1);
    }
}
