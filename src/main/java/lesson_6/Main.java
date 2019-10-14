package lesson_6;

public class Main {
    public static void main(String[] args) {
        determinePercentageOfBalancedTrees(generateTwentyTreesWithDepthSix());
    }

    public static void determinePercentageOfBalancedTrees(MyTreeMap... myTreeMaps) {
        int balanced = 0;
        int notBalanced = 0;
        for (MyTreeMap m :
                myTreeMaps) {
            if (m.isBalanced()) {
                balanced++;
            } else {
                notBalanced++;
            }
        }
        int i = 100 / myTreeMaps.length;
        System.out.println(String.format("Balanced trees: %s%%\nNot Balanced trees: %s%% ", balanced * i, notBalanced * i));

    }

    public static MyTreeMap[] generateTwentyTreesWithDepthSix() {
        MyTreeMap<Integer, Integer>[] myTreeMaps = new MyTreeMap[20];
        for (int i = 0; i < myTreeMaps.length; i++) {
            MyTreeMap myTreeMap = new MyTreeMap<Integer, Integer>();
            while (myTreeMap.depth() != 6) {
                int key = (int) ((Math.random() * 200) - 100);
                myTreeMap.put(key, key);
            }
            myTreeMaps[i] = myTreeMap;
        }
        return myTreeMaps;
    }
}
