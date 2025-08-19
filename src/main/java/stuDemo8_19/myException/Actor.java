package stuDemo8_19.myException;

public class Actor {
    private String name;
    private int age;

    public Actor() {
    }



    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
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

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        if(age>40||age<18) {
            throw new RuntimeException();
        }
        this.age = age;
    }

    public String toString() {
        return "Actor{name = " + name + ", age = " + age + "}";
    }
}
