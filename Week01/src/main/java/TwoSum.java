//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-06-14<p>
//-------------------------------------------------------

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        List<Node> list = new ArrayList<Node>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            list.add(new Node(nums[i], i));
        }

        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.value - o2.value;
            }
        });
        int i = 0;
        int j = list.size() - 1;
        while (i != j) {
            if (list.get(i).value + list.get(j).value == target) {
                return new int[]{list.get(i).index, list.get(j).index};
            } else if (list.get(i).value + list.get(j).value < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }

    private static class Node {
        private int value;

        private int index;

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("===>"+result);
    }
}