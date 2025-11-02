public class working {

    public static boolean check(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static float direction(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir=='N'){
                y++;
            }else if(dir=='S'){
                y--;
            }else if(dir=='E'){
                x++;
            }else{
                x--;
            }
        }
        return (float) Math.sqrt(x * x + y * y);
    }

    public static float direction(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'N') y++;
            else if (dir == 'S') y--;
            else if (dir == 'E') x++;
            else if (dir == 'W') x--;
        }

        return (float) Math.sqrt(x * x + y * y);
    }


    public static String hello(String[] fruit){
        String largest = fruit[0];
        for (int i = 1; i < fruit.length; i++){
            if (fruit[i].compareTo(largest) > 0){
                largest = fruit[i];
            }
        }
        return largest;
    }

    public static String uppercase(String str) {
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i)==' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String countchar(String str) {
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count>1) {
                newstr += count.toString();
            }
        }
        return newstr;
    }

    public static void main(String[] args){
//        String str = "jmadamj";
//        System.out.println(check(str));

//        System.out.println(direction("WNEENESENNN"));

//        String str[]= {"apple","mango","banana","zz","aa"};
//        System.out.println(hello(str));

//        System.out.println(uppercase("hy my name is anas l"));

        System.out.println(countchar("abcd"));
    }
}