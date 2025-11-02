public class revice{
    public static void main(working[] args) {
//        for(int i=1;i<=3;i++){
//           for(int j=1;j<=2*i-1;j++){
//               System.out.print("*");
//           }
//            System.out.println();
//        }

        int n=5;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("this is factorical of n = "+fact);
    }
}
