package stuDemo8_19.E;

/**
 * 自定义异常类AgeOutBoundsException，用于处理年龄超出范围的情况
 * 继承自RuntimeException，属于运行时异常
 */
public class AgeOutBoundsException  extends RuntimeException{
    /**
     * 无参构造方法
     * 创建一个新的AgeOutBoundsException实例
     */
    public AgeOutBoundsException() {
    }

    /**
     * 带参数的构造方法
     * @param message 异常信息，描述异常的具体原因
     */
    public AgeOutBoundsException(String message) {
        super(message);  // 调用父类RuntimeException的带参构造方法
    }
}
