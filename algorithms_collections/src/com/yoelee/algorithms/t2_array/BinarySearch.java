package com.yoelee.algorithms.t2_array;

/**
 *  二分查找又称折半查找，它是一种效率较高的查找方法。
 * 【二分查找要求】：1.必须采用顺序存储结构 2.必须按关键字大小有序排列。
 */
public class BinarySearch {
    public static int binarySearch(int [] srcArray, int des){
        int low = 0;
        int high = srcArray.length-1;

        while (low <= high){
            int middle = (low+high)/2;
            if (des == srcArray[middle]){
                return middle;
            }else if(des < srcArray[middle]){
                high = middle - 1;
            }else{
                low = middle + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int [] src = new int[] {1,3,5,6,8,9,11};
        System.out.println(binarySearch(src,5));
        System.out.println(binarySearch(src,4));
    }
}
