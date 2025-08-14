package doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class pokerGame {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static HashMap<Integer,String> hm =new HashMap<>();
    static {

        //准备牌
        String[] color = {"♣", "♠", "♦", "♥"};
        String[] number = { "3", "4", "5", "6", "7", "8", "9", "10",
                "J", "Q", "K","A","2"};
        int  temp=1;
        for (String n : number) {
            for (String c : color) {
                arrayList.add(temp);
                hm.put(temp,c+n);
                temp++;
            }
        }
        hm.put(temp,"大王");
        arrayList.add(temp);
        temp++;
        arrayList.add(temp);
        hm.put(temp,"小王");
    }

    public pokerGame() {

        //打乱牌
        Collections.shuffle(arrayList);

        //发牌
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> lord = new TreeSet<>();
        for (int i = 0; i < arrayList.size(); i++) {
            int s = arrayList.get(i);
            if (i <= 2) {
                lord.add(s);
                continue;
            }
            if (i % 3 == 0) {
                player1.add(s);
            } else if (i % 3 == 1) {
                player2.add(s);
            } else {
                player3.add(s);
            }
        }
        lookPoker("player1 ",player1);
        lookPoker("player2 ",player2);
        lookPoker("player3 ",player3);
        lookPoker("lord ",lord);

    }

    public void lookPoker(String name,TreeSet<Integer> ts){
        System.out.print(name);
        for (Integer integer : ts) {
            String poker = hm.get(integer);
            System.out.print(poker +" ");
        }
        System.out.println();
    }
}
