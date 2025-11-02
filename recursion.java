public class recursion {

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fn = factorial(n-1);
        int result = n*fn;
        return result;
    }

    public static int calsum(int n){
        if(n==0){
            return 0;
        }
        int sum = calsum(n-1);
        int result = calsum(n-1)+n;
        return result;
    }

    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fn1 = fibonacci(n-1);
        int fn2 = fibonacci(n-2);
        return fn1+fn2;
    }

    public static boolean issorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr,i+1);
    }

    public static int firstoccur(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccur(arr,i+1,key);
    }

    public static int lasoccur(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        int isfounf = lasoccur(arr,i+1,key);
        if(isfounf==-1 && arr[i]==key){
            return i;
        }
        return isfounf;
    }

    public static int power(int n,int x){
        if(x==0){
            return 1;
        }
        int calp = power(n,x-1);
        return n*calp;
    }

    public static int optimizepower(int n,int x){
        if(x==0){
            return 1;
        }
        int power = optimizepower(n,x/2);
        int doub= power*power;
        if(x % 2 != 0){
            doub= n*doub;
        }
        return doub;
    }

    public static int wayoftiles(int n){
        if(n==0 || n==1){
            return 1;
        }
        int hori= wayoftiles(n-1);
        int veri= wayoftiles(n-2);
        return hori+veri;
    }

    public static int freinfpairs(int n){
        if(n==1 || n==2){
            return n;
        }
        int pair1 = freinfpairs(n-1);
        int pair2 = (n-1)*freinfpairs(n-2);
        return pair1+pair2;
    }

    public static void removedublicatest(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char ch = str.charAt(idx);
        if(map[ch-'a']==true){
            removedublicatest(str,idx+1,newstr,map);
        }else{
            map[ch-'a']=true;
            removedublicatest(str,idx+1,newstr.append(ch),map);
        }
    }

    public static void binnum(int n,int last,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        binnum(n-1,0,str+"0");
        if(last==0){
            binnum(n-1,1,str+"1");
        }
    }

    public static void main(String[] args) {
//        System.out.println(factorial(5));
//
//        System.out.println(calsum(5));

//        System.out.println(fibonacci(25));

        int arr[] = {10,2,3,7,5,6,7};
//        System.out.println(issorted(arr,1));

//        System.out.println(firstoccur(arr,1,10));
//        System.out.println(lasoccur(arr,0,7));

//        System.out.println(power(2,5));

//        System.out.println(5/2);

//        System.out.println(optimizepower(5,3));

//        System.out.println(wayoftiles(3));

//        System.out.println(freinfpairs(3));

//        removedublicatest("aabbdsbbbjg",0,new StringBuilder(""),new boolean[26]);

        binnum(5,0,"");
    }
}
