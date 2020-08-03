//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-08-02<p>
//-------------------------------------------------------

public class HeapSort {

    //完全二叉树
    //堆，parent> child

    public static void heapify(int[] tree, int n, int i) {

        //递归终止条件
        if (i >= n) {
            return;
        }

        //左孩子
        int c1 = 2 * i + 1;
        //右孩子
        int c2 = 2 * i + 2;

        int max = i;

        //在父亲节点，左孩子，右孩子节点之间寻找最大值
        if (c1 < n && tree[c1] > tree[max]) {
            max = c1;
        }

        if (c2 < n && tree[c2] > tree[max]) {
            max = c2;
        }


        //如果当前节点不是最大值，则需要进行节点交换
        if (max != i) {
            swap(tree, max, i);

            //轮询进行heapyfy
            heapify(tree, n, max);
        }
    }

    private static void buildHeap(int[] tree, int n) {
        int lastNode = n - 1;
        int parent = (lastNode - 1) / 2;

        for (int i = parent; i >= 0; i--) {
            heapify(tree, n, i);
        }
    }

    private static void heapSort(int[] tree, int n) {
        buildHeap(tree, n);

        for (int i = n - 1; i >= 0; i--) {
            swap(tree, i, 0);
            heapify(tree, i, 0);
        }
    }

    private static void swap(int[] tree, int max, int i) {
        int temp = tree[max];
        tree[max] = tree[i];
        tree[i] = temp;
    }


    public static void main(String[] args) {
//        int[] array = new int[]{4, 10, 3, 5, 1, 2};
//
//        heapify(array, 6, 0);

//        int[] tree = new int[]{2,5,3,1,10,4};
//        buildHeap(tree, 6);
//        System.out.println("===>" + tree);

        int[] tree = new int[]{2, 5, 3, 1, 10, 4};

        heapSort(tree, 6);

        System.out.println("====>" + tree);
    }
}