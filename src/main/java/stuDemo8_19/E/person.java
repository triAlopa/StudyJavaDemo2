package stuDemo8_19.E;

public class person {
    private String name;
    private int age;

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("name "+name+", age "+age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<3||name.length()>10){
            throw new NameFormatException( name+"格式有误,应该在 3~10位");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>40||age<18){
            throw new AgeOutBoundsException( age+"范围有误,应该在 18~40");
        }
        this.age = age;
    }
}
