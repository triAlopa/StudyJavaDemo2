package stuDemo9_01.myIOe;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.io.File;
import java.util.*;


public class E2 {
    //hutool工具包 对E1简化
    public static void main(String[] args) {
        // 定义百家姓网页URL
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        // 定义男孩名字网页URL
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        // 定义女孩名字网页URL
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //hutool 抓取网页
        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        //根据正则表达式处理抓取网页内容的字符串
        List<String> familyTempList = ReUtil.findAll("([\\u4e00-\\u9fa5]{4})(，|。)", familyNameStr, 1);
        List<String> boyTempList = ReUtil.findAll("([\\u4e00-\\u9fa5])(、|。)", boyNameStr, 1);
        List<String> girlTempList = ReUtil.findAll("([\\u4e00-\\u9fa5]{2} ){4}..", girlNameStr, 0);

        //处理百家姓数据：将每个姓氏拆分为单个字符并添加到列表中
        ArrayList<String> familyList = new ArrayList<>();
        for (String str : familyTempList) {
            for (int i = 0; i < str.length(); i++) {
                familyList.add(str.charAt(i) + "");
            }
        }

        //处理男孩名字数据：去重处理
        ArrayList<String> boyList = new ArrayList<>();
        for (String str : boyTempList) {
            if (!boyList.contains(str)) {
                boyList.add(str);
            }
        }

        //处理女孩名字数据：分割字符串并添加到列表中
        ArrayList<String> girlList = new ArrayList<>();
        for (String str : girlTempList) {
            String[] arr = str.split(" ");
            for (int i = 0; i < arr.length; i++) {
                girlList.add(arr[i]);
            }
        }


        ArrayList<String> list = getInfos(familyList, boyList, girlList, 50, 60);
        Collections.shuffle(list);

        //hutool 将集合数据写入文件，路径是项目根路径
        FileUtil.writeLines(list,new File("name1s.txt"),"UTF-8");
    }
    private static ArrayList<String> getInfos(ArrayList<String> familyList, ArrayList<String> boyList, ArrayList<String> girlList, int boyCount, int girlCount) {

        //添加男生姓名
        HashSet<String> boyHs = new HashSet<>();
        while (true) {
            if (boyHs.size() == boyCount) break;
            Collections.shuffle(familyList);
            Collections.shuffle(boyList);
            boyHs.add(familyList.get(0) + boyList.get(0));
        }

        //添加女生姓名
        HashSet<String> girlHs = new HashSet<>();
        while (true) {
            if (girlHs.size() == girlCount) break;
            Collections.shuffle(familyList);
            Collections.shuffle(girlList);
            girlHs.add(familyList.get(0) + girlList.get(0));
        }
        //添加到最终列表，并进行加入年龄、性别
        Random r = new Random();
        ArrayList<String> list = new ArrayList<>();
        //18~25 男
        for (String boyName : boyHs) {
            int age = r.nextInt(8) + 18;
            list.add(boyName + "-男-" + age);
        }
        //18~27 女
        for (String girlName : girlHs) {
            int age = r.nextInt(10) + 18;
            list.add(girlName + "-女-" + age);
        }

        return list;
    }
}
