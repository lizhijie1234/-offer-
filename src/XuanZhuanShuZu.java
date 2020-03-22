public class XuanZhuanShuZu {
    public int minNumberInRotateArray(int [] array) {
        int length = array.length;
        if(length == 0){
            return 0;
        }
        int start = 0;
        int end = length - 1;
        int mid = 0;
        while(array[start] >= array[end]){
            if(end - start == 1){
                mid = end;
                break;
            }
            mid = (start + end)/2;

            if(array[mid] == array[start] && array[mid] == array[end]){
                return orderSerch(array, start, end);
            }
            if(array[mid] >= array[start]){
                start = mid;
            }else if(array[mid] <= array[end]){
                end = mid;
            }
        }
        return array[mid];
    }
    private int orderSerch(int []array, int low, int high){
        int locate = low;
        for(int i = low ; i < high;i++){
            if(array[i] > array[i + 1]){
                locate = i + 1;
                break;
            }
        }
        return array[locate];
    }
}
