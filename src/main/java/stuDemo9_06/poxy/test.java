package stuDemo9_06.poxy;

public class test {
    public static void main(String[] args) {
        bigStar bigStar=new bigStar("及格");
        star starProxy = ProxyUtil.createStarProxy(bigStar);

        String result = starProxy.sing("只因你太美");
        System.out.println(result);
        starProxy.dance();
    }
}
