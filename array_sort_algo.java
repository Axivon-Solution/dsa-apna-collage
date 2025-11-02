public class array_sort_algo {
    public static void main(working[] args) {
        int arr[] = {2,442,5,4,65,3};

//        bublle sort.....
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


//        Selection sort.....
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }



//        Insertion sort.....
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];      // store the value
            int prev = i - 1;
            // shift elements to the right
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // place curr in correct position
            arr[prev + 1] = curr;
        }


//        Counting Sort.......
        int larger = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            larger = Math.max(larger,arr[i]);
        }
        int count[]= new int[larger+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}