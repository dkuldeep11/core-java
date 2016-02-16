package com.basics;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class ReorderPositiveNegativeInOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {-3,4,3,-2,-8,6,13,-15};
	    int pos = partition_sign(A, 0, 7);
	    System.out.println(Arrays.toString(A));

	}


static int  partition_sign(int[] arr, int start, int end)
{
    int i,j, pivot;
    pivot = 0;
    i=start-1;
    for(j=start; j<=end; j++)
    {
        if(arr[j] <= pivot) {
            i=i+1;
            if(i!=j)
            {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
            
        }
    }
    return i+1;
}

}


 
 
