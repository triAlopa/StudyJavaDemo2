package doudizhuDemo;

import java.util.*;

public class pokerGame {
    static ArrayList<String> list = new ArrayList<>();
    static HashMap<String, Integer> hm = new HashMap<>();

    static {
        //准备牌
        String[] color = {"♣", "♠", "♦", "♥"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10",
                "J", "Q", "K", "A", "2"};
        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add(" 大王");
        list.add(" 小王");
        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
        hm.put("大王", 50);
        hm.put("小王", 100);
    }

    public pokerGame() {
        //打乱牌
        Collections.shuffle(list);

        //发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> lord = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if (i <= 2) {
                lord.add(poker);
                continue;
            }
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else player3.add(poker);
        }
        order(lord);
        order(player1);
        order(player2);
        order(player3);

        lookPoker("player1 ",player1);
        lookPoker("player2 ",player2);
        lookPoker("player3 ",player3);
        lookPoker("lord ",lord);

    }

    //对发给玩家的牌 排序
    public void order(ArrayList<String> player) {
        //排序
        //自定义
        Collections.sort(player, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);
                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);
                int i = value1 - value2;
                 i = i == 0 ? color1.compareTo(color2) : i;
                 return i;
            }
        });
    }

    public int getValue(String str) {
        String sub = str.substring(1);
        if(hm.containsKey(sub)){
            return hm.get(sub);
        }else return Integer.parseInt(sub);
    }


    public void lookPoker(String name,ArrayList<String> player){
        System.out.print(name);
        for (String  s : player) {
            System.out.print(s +" ");
        }
        System.out.println();
    }
}
