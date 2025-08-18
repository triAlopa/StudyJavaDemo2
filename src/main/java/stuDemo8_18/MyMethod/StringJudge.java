package stuDemo8_18.MyMethod;

public class StringJudge {
/**
 * 判断字符串是否符合特定条件的工具方法
 * @param s 需要判断的字符串
 * @return 如果字符串以"张"开头且长度为3则返回true，否则返回false
 */
    public boolean stringJudge(String s){
        // 检查字符串是否以"张"开头且长度是否为3
        return s.startsWith("张") && s.length() == 3;
    }
}
