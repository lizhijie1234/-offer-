public class Tiaozhengjioushu {
    public void reOrderArray(int [] array) {
        if(array == null || array.length <=1 ){
            return;
        }
        int oddcnt = 0;
        for(int x : array){
            if(isodd(x)){
                oddcnt++;
            }
        }
        int []copy = array.clone();
        int i = 0,j = oddcnt;
        for(int x :copy){
            if(isodd(x)){
                array[i++] = x;
            }else {
                array[j++] = x;
            }
        }
    }

    private boolean isodd(int x){
        return x%2==1;
    }
    private void swap(int[] array, int i ,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public void reOrderArrayBubble(int [] array){
        if(array == null || array.length <=1 ){
            return;
        }
        int length = array.length;
        for(int i = length - 1; i >0; i --){
            for(int j = 0; j < i; j++){
                if(!isodd(array[j]) && isodd(array[j + 1])){
                    swap(array, j, j + 1);
                }
            }
        }
    }
}
