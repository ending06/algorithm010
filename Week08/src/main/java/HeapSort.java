//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-08-02<p>
//-------------------------------------------------------

public class HeapSort {

    public static void heapify(int[] array, int length, int i) {

        int left = 2 * i + 1;int rigt = 2 * i + 2;

        int largest = i;

        if (left < length && array[left] > array[largest]) {
            largest = left;
        }

        if (rigt < length && array[rigt] > array[largest]) {
            largest = rigt;
        }

        if (largest != i) {
            int temp = array[i]; array[i] = array[largest];  array[largest] = temp;
            heapify(array, length, largest);
        }
    }

    public static  void headpSort(int[] array){
        if(array.length==0){
            return;
        }

        int length = array.length;

        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(array, length, i);
        }

        for (int i = length - 1; i >= 0; i--) {
            int temp = array[0]; array[0] = array[i]; array[i] = temp;
            heapify(array, i, 0);
        }
    }


    public static void main(String[] args) {
        int[] array = new int[]{3,10,7,9,2,1,1};

        headpSort(array);
        System.out.println("===>"+array);
    }
}