package stuDemo9_06Anno;

public @interface MyAnno1 {

    public String name() default "null";
    public int  age() default 0;
}
