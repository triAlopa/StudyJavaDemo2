package StuDemo8_08.E;



public class lihuaCat extends cat{
    public lihuaCat(String name,int age) {
        super(name,age);
    }




    @Override
    public void eat() {
        System.out.println(this.getName()+"的狸花猫， "+this.getAge()+"岁，正在吃🐟");
    }
}
