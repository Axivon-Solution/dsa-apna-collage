public class bit {

    public static void chectnum(int num){
        int bit=1;
        if((num&bit)==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }

    public static int getbit(int n,int i){
        int bitmask = 1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        return 1;
    }

    public static int setbit(int n,int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }

    public static int clearbit(int n,int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }

    public static int clearibits(int n,int i){
        int bitmask = -1<<i;
        return n&bitmask;
    }

    public static int clearitojbits(int n,int i,int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;      //2 ki power i -1
        int c = a|b;
        return n&c;
    }

    public static boolean ispoweroftwo (int n){
        return ((n&n-1)==0);
    }

    public static int countbit(int n){
        int count = 0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static int exponential(int a,int n){
        int ans =1;
        while(n>0){
            if((n&1)==1){
                ans= ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    public static void main(String[] args){
//        chectnum(1);
//        chectnum(13);
//        chectnum(14);
//        System.out.println(clearitojbits(10,2,4));

//        System.out.println(ispoweroftwo(34));

//        System.out.println(countbit(15));

        System.out.println(exponential(5,2));
    }
}
