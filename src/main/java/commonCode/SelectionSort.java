package commonCode.Test;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] arg){

        int[] arr ={4,8,3,6,70};
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n;j++){

                if(arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }

            }

        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
