package com.ds;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){

        int arr[]={1,2,3,4,5};
        System.out.println("Given array"+ Arrays.toString(arr));
        rotate(arr);

        System.out.println("After rotation array"+ Arrays.toString(arr));
    }


    private static void rotate(int[] arr) {
        int x=arr[arr.length-1],i;
        for(i=arr.length-1;i>0;i--){
                arr[i]=arr[i-1];
        }
        arr[i]=x;
    }
}


