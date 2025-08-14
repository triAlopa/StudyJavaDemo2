package StuDemo8_14;

public class ArgsDemo1 {
    public static void main(String[] args) {

        System.out.println(getSum(1, 2, 43, 45, 24, 24, 1));

    }

    public static<E> int getSum(E...es){
        int rs=0;
        for (E e : es) {
            rs=rs+(Integer) e;
        }
        return rs;
    }
}
