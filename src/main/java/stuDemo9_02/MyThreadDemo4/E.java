package stuDemo9_02.MyThreadDemo4;

public class E {
    public static void main(String[] args) {
        foodie f=new foodie();
        f.setName("食客");
        cook cook=new cook();
        cook.setName("厨师");

        f.start();
        cook.start();

    }
}
