package com.gang.algs.exercise.sort;

import com.gang.algs.util.ArrayUtil;

/**
 * @author ligang
 * @desc 选择排序
 * @date 2018/11/10下午7:07
 **/
public class SelectSort {
   
     /**
      * desc: 排序
      * @param: upSortedArry 未排序数组
      * @return:
      * @auther: ligang
      * @date: 2018/11/10 下午7:09
      */
    public void sort(int[] unSortedArry){
        if(ArrayUtil.isEmptyArray(unSortedArry)){
            return;
        }

        for(int i = 0; i<unSortedArry.length; i++){
            for(int j =i+1; j <unSortedArry.length; j++){
                if(unSortedArry[i] > unSortedArry[j]){
                    ArrayUtil.swap(i, j, unSortedArry);
                }
            }
        }
    }

}
