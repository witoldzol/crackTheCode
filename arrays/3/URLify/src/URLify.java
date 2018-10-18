public class URLify {
    public static void main(String[] args) {
        String s = "mr john smith    ";
        int len = 13;
        System.out.println(s.length());
        System.out.println(replace(s, len));
    }

    static String replace(String str, int len){

        char[] arr = str.toCharArray();
        int arrPointer=0;
        for (int i = 0; i < len; i++, arrPointer++) {

            if(str.charAt(i)==' '){
                arr[arrPointer]='%';
                arr[arrPointer+1]='2';
                arr[arrPointer+2]='0';
                arrPointer+=2;
            }else{
                arr[arrPointer]=str.charAt(i);
            }



        }
        return new String(arr);
    }

}
