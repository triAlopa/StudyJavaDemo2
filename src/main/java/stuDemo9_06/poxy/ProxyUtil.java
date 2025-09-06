package stuDemo9_06.poxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
/**
 * 创建一个明星的代理对象
 * @param bigStar 真实的明星对象
 * @return 返回代理后的明星对象
 */
    public static star createStarProxy(bigStar bigStar) {
    // 使用Proxy类的newProxyInstance方法创建代理对象
        star star=(star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),//加载哪一个类的生成加载器，一般是代理生成类的加载器
                new Class[]{star.class},//指定代理要 干哪些接口
                new InvocationHandler() {//接口里的实现方法
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        if ("sing".equals(method.getName())) {
                            System.out.println("准备话筒,收钱");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("准备场地，收钱");
                        }
                        return method.invoke(bigStar, args);
                    }
                }
        );

        return  star;
    }
}
