import java.util.*;

public class TestBed {

    public static void main(String[] args) {
//        nameManipulation("Souradeep");
        int[] arr= {8,6,3,0,1,7,5,1,5};
        arrySort(arr);
    }

    private static void arrySort(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length-1 ; j++) {
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int a: arr)
            System.out.println(a);
    }

    public static void nameManipulation(String name){
        String st ="";
        Map<Character,Integer> nMap= new HashMap<>();
        for (int i =name.length()-1; i>0; i--) {
            st = st+name.charAt(i);
        }
        System.out.println(st);
        for (char c : st.toCharArray() ) {
            if(nMap.containsKey(c))
                nMap.put(c,nMap.get(c)+1);
            else
                nMap.put(c,1);
        }
        nMap.forEach((k,v)->{
            if(v>1)
                System.out.println(k+"----"+v);
        });

    }

}