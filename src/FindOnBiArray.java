public class FindOnBiArray {
    public boolean Find(int target, int [][] array){
        if(array == null || array.length == 0 || array[0].length ==0){
            return false;
        }
        int row = array.length;
        int col = array[0].length;
        int currow = 0;
        int curcol = col - 1;
        while(currow < row  && curcol >= 0){
            int value = array[currow][curcol];
            if(target == value){
                return true;
            }
            else if(target > value){
                currow++;
            }
            else {
                curcol--;
            }

        }
        return false;
    }
}
