package com.gang.algs.exercise.sort;

import com.gang.algs.util.ArrayUtil;

/**
 * @author ligang
 * @desc 插入排序
 * @date 2018/11/11下午1:09
 **/
public class InsertSort {
     /**
      *
      * desc:排序
      * @param: arr 待排序数组
      * @return:
      * @auther: ligang
      * @date: 2018/11/11 下午1:46
      */
    public void sort(int[] arr){
        if(ArrayUtil.isEmptyArray(arr)){
            return;
        }

        for(int i =1; i<arr.length; i++){
            int count = i;
            for(int j =i-1; j>=0; j--){
                if(arr[count] < arr[j]){
                    ArrayUtil.swap(count, j, arr);
                    count = j;
                }
            }
        }
    }
}
