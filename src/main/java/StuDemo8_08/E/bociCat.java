package StuDemo8_08.E;

public class bociCat extends cat{

    public bociCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+"的波斯猫， "+this.getAge()+"岁，正在吃小饼干");
    }
}
