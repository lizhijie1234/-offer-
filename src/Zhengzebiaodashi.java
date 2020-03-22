public class Zhengzebiaodashi {
    public boolean match(char[] str, char[] pattern){
        if((str == null && pattern == null)){
            return true;
        }
        return matchCore(str, pattern, 0, 0);
    }

    public boolean matchCore(char[] str, char[]pattern, int Sindex, int Pindex){
        if (Sindex == str.length && Pindex == pattern.length){
            return true;
        }
        if(Sindex != str.length && Pindex == pattern.length){
            return false;
        }
        if (Pindex + 1 < pattern.length && pattern[Pindex + 1] == '*'){
            if((Sindex  != str.length && str[Sindex] == pattern[Pindex]) ||  ( Sindex != str.length && pattern[Pindex] == '.')){
                return matchCore(str, pattern, Sindex, Pindex + 2) ||
                        matchCore(str, pattern, Sindex + 1, Pindex + 2) ||
                        matchCore(str, pattern, Sindex + 1, Pindex);
            }else{
                return matchCore(str, pattern, Sindex, Pindex + 2);
            }
        }else {
            if( Sindex != str.length && ( str[Sindex] == pattern[Pindex] || pattern[Pindex] == '.')){
                return matchCore(str, pattern, Sindex + 1, Pindex + 1);
            }
        }
        return false;
    }

}
