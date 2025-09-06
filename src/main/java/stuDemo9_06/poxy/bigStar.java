package stuDemo9_06.poxy;

public class bigStar implements star{
    private String name;







    public bigStar() {
    }

    public bigStar(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "bigStar{name = " + name + "}";
    }

    @Override
    public String sing(String name) {
        System.out.println(this.getName()+"正在唱"+name+"这首歌");
        return "谢谢";
    }

    @Override
    public void dance() {
        System.out.println(this.getName()+"正在跳舞");
    }
}
