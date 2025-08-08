package StuDemo8_08.E;

import lombok.Data;

@Data
public abstract class animal {
    private String name;
    private int age;

    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void  eat();
}
