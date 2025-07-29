package StuDemo7_29.SearchDemo.BlockSearch;

import java.util.ArrayList;


//分块查询
//
public class BlockSearchDemo1 {
    public static void main(String[] args) {
        int[] arr=new int[]{7,10,13,19,16,20,27,22,30,40,36,43,50,48};
        Block b1=new Block(10,0,1);
        Block b2=new Block(20,2,5);
        Block b3=new Block(40,6,10);
        Block b4=new Block(50,11,13);
        ArrayList<Block> blockArrayList=new ArrayList<>();
        blockArrayList.add(b1);
        blockArrayList.add(b2);
        blockArrayList.add(b3);
        blockArrayList.add(b4);
        System.out.println(BlockSearch(blockArrayList, arr, 48));
    }
// 在blockArrayList中查找arr数组中值为searchNum的元素，返回其索引
    private static int BlockSearch(ArrayList<Block> blockArrayList,int[] arr,int searchNum){
        // 遍历blockArrayList中的每个Block
        for (Block value : blockArrayList) {
            // 如果Block的最大值大于searchNum
            if (value.getMax() > searchNum) {
                // 获取当前Block
                Block block = value;
                // 遍历Block中的每个元素
                for (int j = block.getStartIndex(); j <= block.getEndIndex(); j++) {
                    // 如果当前元素等于searchNum
                    if (arr[j] == searchNum) return j;
                }
            }
        }
        // 如果没有找到，返回-1
        return -1;
    }
}
