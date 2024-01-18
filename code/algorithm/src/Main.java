import java.util.Arrays;

/**
 * 二分查找
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 23, 44, 55, 67, 88, 123, 456};
        System.out.println(binarytSearch(arr, 6));

        // 官方也有提供二分查找法
        System.out.println(Arrays.binarySearch(arr,6));
    }

    /**
     * 二分查找：
     * 1. 数据必须是排序好的
     * 2. 定义一个开头和一个结尾，每次取中间，如果中间的数据要比查找的数据大，那么，右边的数据全部不要，继续折半
     * @param arr
     * @param data
     * @return
     */
    public static int binarytSearch(int[] arr, int data) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (data > arr[middle]) {
                left = middle + 1;
            } else if (data < arr[middle]) {
                right = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}