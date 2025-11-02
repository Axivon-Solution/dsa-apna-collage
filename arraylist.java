import java.util.*;

public class arraylist {

    public static int conaintwater(ArrayList<Integer> list) {
        int maxwater = 0;
        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                int heigth = Math.min(list.get(i), list.get(j));
                int weith = j-i;
                int currentWater = heigth * weith;
                maxwater =  Math.max(maxwater, currentWater);
            }
        }
        return maxwater;
    }

    public static int conaintwaterr(ArrayList<Integer> list) {
        int lp=0;
        int rp= list.size()-1;
        int maxwater=0;
        while(lp<rp){
            int min = Math.min(list.get(lp),list.get(rp));
            int wigth = rp-lp;
            int total = min*wigth;
            maxwater=Math.max(maxwater,total);

            if(list.get(lp)<list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }


    public static boolean palindrome(ArrayList<Integer> list,int target) {
        int ls= 0;
        int rs = list.size()-1;
        while(ls<rs){
            if(list.get(ls)+list.get(rs)==target){
                return true;
            }else if(list.get(ls)+list.get(rs)>target){
                rs--;
            }else{
                ls++;
            }
        }
        return false;
    }

    public static void main(working[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
//        int maxnum = Integer.MIN_VALUE;
//        for(int i=0;i<list.size();i++){
//            maxnum = Math.max(maxnum,list.get(i));
//        }
//        System.out.println(maxnum);

//        System.out.println(conaintwaterr(list));


        System.out.println(palindrome(list,80));
    }
}
