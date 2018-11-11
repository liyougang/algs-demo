package com.gang.algs.util;

/**
 * @author ligang
 * @desc
 * @date 2018/11/11下午1:11
 **/
public class ArrayUtil {

    /**
     *
     * desc:判断是否空数组
     * @param: array 数组
     * @return:
     * @auther: ligang
     * @date: 2018/11/10 下午7:13
     */
    public static boolean isEmptyArray(int[] array){
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
    public static void swap(int i, int j, int[] array){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
