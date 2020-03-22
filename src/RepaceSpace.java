public class RepaceSpace {
    public String replaceSpace(StringBuffer str) {
        StringBuilder res = new StringBuilder();
        int length = str.length();
        for(int i = 0; i < length; i++){
            if (str.charAt(i) == ' ' ){
                res.append('%');
                res.append('2');
                res.append('0');
            }else{
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }
    public String replaceSpace2(StringBuffer str) {
        int length1 = str.length() - 1 ;
        for(int i = 0; i <= length1; i++){
            if (str.charAt(i) == ' ' ){
                str.append("  ");
            }
        }
        int length2 = str.length() - 1;
        for(int i =length1; i >= 0; i --){
            char temp = str.charAt(i);
            if(temp == ' '){
                str.setCharAt(length2 -- , '0');
                str.setCharAt(length2 -- , '2');
                str.setCharAt(length2 -- , '%');
            }else{
                str.setCharAt(length2 --, temp);
            }
        }
        return str.toString();
    }
}
