public class Pring1toN {
    public void printN(int n){
        if(n <= 0){
            return;
        }
        char[]num = new char[n];
        print1toN(num,0);

    }

    public void print1toN(char[]num, int len){
        if(len == num.length){
            printNum(num);
            return;
        }
        for(int i = 0; i <= 9; i++){
            num[len] = (char)(i + '0');
            print1toN(num, len + 1);
        }
    }
    public void printNum(char []num){
        int index = 0;
        while(index < num.length && num[index] == '0'){
            index++;
        }
        while(index < num.length){
            System.out.print(num[index++]);
        }
        System.out.println();
    }

    public static void main(String[] args){
        Pring1toN pring1toN = new Pring1toN();
        pring1toN.printN(2);
    }
}
