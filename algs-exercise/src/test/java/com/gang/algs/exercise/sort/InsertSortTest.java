package com.gang.algs.exercise.sort;

import com.gang.algs.exercise.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author ligang
 * @desc 插入排序测试
 * @date 2018/11/10下午7:21
 **/
public class InsertSortTest extends BaseTest {

    private static InsertSort insertSort = new InsertSort();

    @Test
    public void sortTest(){
        int[] arr = {3,4,2,1};
        insertSort.sort(arr);
        int[] expertArr = {1,2,3,4};
        Assert.assertEquals(arr, expertArr, "sortTest");
    }
}
