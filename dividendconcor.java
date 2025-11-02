public class dividendconcor {

    public static void margesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        margesort(arr,si,mid);
        margesort(arr,mid+1,ei);

        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]= new int [ei-si+1];
        int k=0;
        int i=si;
        int j=mid+1;

        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void quictsort(int arr[],int si,int ei){
        if (si >= ei){
            return;
        }
        int pivit = sortbypivit(arr,si,ei);
        quictsort(arr,si,pivit-1);
        quictsort(arr,pivit+1,ei);
    }

    public static int sortbypivit(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[ei];
        arr[ei]=temp;
        return i;
    }

    public static int search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // Check if left part is sorted
        if (arr[si] <= arr[mid]) {
            // Target lies in left sorted part
            if (arr[si] <= target && target < arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                return search(arr, target, mid + 1, ei);
            }
        } else { // Right part is sorted
            if (arr[mid] < target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};

//        System.out.println(search(arr, 2, 0, arr.length - 1));

//        margesort(arr,0,arr.length-1);
//        quictsort(arr,0,arr.length-1);

//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

    }
}
