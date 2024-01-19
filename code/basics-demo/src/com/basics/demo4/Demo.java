package com.basics.demo4;

/**
 * @projectName: code
 * @package: com.basics.demo4
 * @className: Demo
 * @author: chenYongLong
 * @description: TODO 二分查找算法（要求：时间复杂度o(log2n)），{1,2,3,7,7,7,7,7,8,9,11}  输入值7 找到该7值的左右边界值的索引也就是 [3,7]
 * @date: 2024/1/19 23:06
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        // {1,2,3,7,7,7,7,7,8,9,11}
        int left = getLeftBoundary(new int[]{1, 2, 3, 7,7, 7, 7, 8, 9, 11},7,true);
        int right = getLeftBoundary(new int[]{1, 2, 3, 7,7, 7, 7, 8, 9, 11},7,false);
        System.out.println(left + " " + right);
    }

    /**
     * 二分查找算法
     * @param nums 目标数组
     * @param target 需要查找的值
     * @param bool 确定防线，true代表左边 ，false则是右边
     */
    public static int getLeftBoundary(int[] nums,int target,boolean bool){
        int start = 0;
        int end = nums.length - 1;
        // 临时变量用来存储找到的边界值的索引，-1代表没找到
        int temp = -1;
        while(start <= end){

            // 每次取中间值，判断是否大于target，如果大于那么就需要往左边找，end=middle
            // 如果小于的话就需要往右边找，start=middle
            // 如果等于的话，那么还需要往右边或者往左边找，一直找到边界值
            int middle = (start + end) / 2;

            if(target > nums[middle]){
               start = middle + 1;
            }else if(target < nums[middle]){
                end = middle - 1;
            }else{
                // 这个是找到的值
                temp = middle;
                if(bool){
                    // 往左边找边界值
                    end = middle - 1;
                }else{
                    // 往右边找边界值
                    start = middle + 1;
                }
            }
        }

        return temp;
    }

}
