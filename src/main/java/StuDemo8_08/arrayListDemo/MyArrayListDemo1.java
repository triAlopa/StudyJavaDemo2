package StuDemo8_08.arrayListDemo;



/**
 * MyArrayListDemo1 类是一个简单的自定义ArrayList实现
 * 它支持泛型E，可以存储任意类型的对象
 */
public class MyArrayListDemo1<E> {
    // 使用Object数组作为底层存储结构
    Object[] object=new Object[10];
    // 记录当前集合中元素的数量
    int size=0;

    /**
     * 向集合中添加元素
     * @param e 要添加的元素
     * @return 添加成功返回true
     */
    public boolean add(E e){
        object[size]=e;
        size++;
        return true;
    }

    /**
     * 根据索引获取集合中的元素
     * @param index 要获取的元素的索引
     * @return 返回指定索引处的元素
     */
    public E get(int index){
        return (E) object[index];
    }

    /**
     * 根据索引删除集合中的元素
     * @param index 要删除的元素的索引
     * @return 删除成功返回true，集合为空时返回false
     */
    public boolean del(int index){
        if(size==0) return false;
        object[index]=null;
        size--;
        return true;
    }
    /**
     * 重写toString方法，用于将集合内容转换为字符串表示
     * @return 返回集合的字符串表示，格式为"[元素1,元素2,...]"
     */
    @Override
    public String toString(){
        if(this.size==0)  return null;
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            E e = (E) object[i];
            sb.append(e);
            if (i==size-1) continue;
            sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}
