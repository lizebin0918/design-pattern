package com.lzb.decorator;
/**
 * 插入排序<br/>
 * Created on : 2021-05-07 00:31
 * @author lizebin
 */
public class InsertionSort implements ISort {

    @Override
    public void sort(int[] array) {
        System.out.println("插入排序");
    }
}
