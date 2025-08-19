package stuDemo8_19.E;

/**
 * 自定义异常类NameFormatException，用于处理名称格式相关的异常情况
 * 该类继承自RuntimeException，属于运行时异常
 */
public class NameFormatException extends RuntimeException{


    /**
     * 无参构造方法，创建NameFormatException异常实例
     */
    public NameFormatException() {
    }

    /**
     * 带参数的构造方法，根据指定的错误信息创建NameFormatException异常实例
     * @param message 异常的详细信息，用于描述异常的具体原因
     */
    public NameFormatException(String message) {
        super(message);
    }
}
