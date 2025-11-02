public class array {
    public static void prifix(int arr[]){
        int cur= 0;
        int maxsum= Integer.MIN_VALUE;
        int prefix[]= new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                cur= start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(cur>maxsum){
                    maxsum=cur;
                }
            }
        }
        System.out.println(maxsum);
    }


    public static void maxprefix(int arr[]){
        int cs=0;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs = cs+arr[i];
            if(cs<0){
                cs=0;
            }
            max = Math.max(max,cs);
        }
        System.out.println(max);
    }


    public static int tapping(int arr[]){
        int leftside[]= new int[arr.length];
        leftside[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            leftside[i] = Math.max(leftside[i-1],arr[i]);
        }
        int rightside[]= new int[arr.length];
        rightside[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightside[i] = Math.max(rightside[i+1],arr[i]);
        }

        int tapped=0;
        for(int i=0;i<arr.length;i++){
            int waterlevel= Math.min(leftside[i],rightside[i]);
            tapped= tapped +waterlevel-arr[i];
        }
        return tapped;
    }

    public static void main(String[] args) {
        int arr[] = {5, 0, 5};
        prifix(arr);
//        maxprefix(arr);
//        System.out.println(tapping(arr));
    }
}
