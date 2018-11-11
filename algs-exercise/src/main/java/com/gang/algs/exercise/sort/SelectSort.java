package com.gang.algs.exercise.sort;

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
        if(isEmptyArray(unSortedArry)){
            return;
        }
        // TODO
        // test
        for(int i = 0; i<unSortedArry.length; i++){
            for(int j =i+1; j <unSortedArry.length; j++){
                if(unSortedArry[i] > unSortedArry[j]){
                    swap(i, j, unSortedArry);
                }
            }
        }
    }
    
     /**
      *
      * desc:判断是否空数组
      * @param: array 数组
      * @return:
      * @auther: ligang
      * @date: 2018/11/10 下午7:13
      */
    private boolean isEmptyArray(int[] array){
        if(array == null || array.length <=0){
            return true;
        }

        return false;
    }
    
     /**
      *
      * desc:交换
      * @param: i 位置 i
      * @param  j 位置 j
      * @param array 数组
      * @return:
      * @auther: ligang
      * @date: 2018/11/10 下午7:17
      */
    private void swap(int i, int j, int[] array){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
