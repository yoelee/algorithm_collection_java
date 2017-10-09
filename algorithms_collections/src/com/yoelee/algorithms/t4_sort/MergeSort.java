package com.yoelee.algorithms.t4_sort;

/**
 * 归并排序
 * 简介:将两个（或两个以上）有序表合并成一个新的有序表 即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列
 * 时间复杂度为O(nlogn)
 * 稳定排序方式
 */

public class MergeSort {

    public static void merge(int [] nums, int low, int mid, int high){
        int [] tmp = new int[high - low + 1];
        int i = low;//左指针
        int j = mid + 1; //右指针
        int k = 0;

        while (i <= mid && j <= high){
            if(nums[i] < nums[j]){
                tmp[k++] = nums[i++];
            }else{
                tmp[k++] = nums[j++];
            }
        }

        //把左边剩下的放入数组
        while (i <= mid){
            tmp[k++] = nums[i++];
        }

        //把右边剩下的放入数组
        while (j <= high){
            tmp[k++] = nums[j++];
        }

        //把新数组中的数覆盖nums数组
        for(int k2 = 0; k2 < tmp.length; k2++){
            nums[k2 + low] = tmp[k2];
        }
    }

    public static int [] sort(int [] nums, int low, int high){
        int mid = (low + high) / 2;
        if (low < high){
            sort(nums, low, mid);
            sort(nums, mid+1, high);
            merge(nums, low, mid, high);
        }
        return nums;
    }

    public static void main(String [] args){
        int [] data = new int[] {5, 3, 6, 2, 1, 9, 4, 8, 7};
        System.out.println("Before merge sort:");
        for (int d : data){
            System.out.print(d);
        }
        System.out.println();
        sort(data,0,data.length-1);
        System.out.println("After merge sort:");
        for (int d : data){
            System.out.print(d);
        }
        System.out.println();


    }
}
