public class FindKInSumK {
    public int[][] findK(int[] array, int target){
        int[][] res = new int[30][2];
        int i = 0;
        int length = array.length;
        if(length <= 1){
            return res;
        }
        int low = 0;
        int high = length - 1;
        while(low < high){
            if (array[low] + array[high] == target) {
                res[i][0] = low;
                res[i++][1] = high;
                low++;
                high--;
            }
            if(array[low] + array[high] > target){
                high--;
            }
            if(array[low] + array[high] < target){
                low++;
            }

        }
        return res;
    }
    public static void main(String []args){
        int[]list = {1,2,3,4,5,6,7,8,9,11,23,45,66};
        FindKInSumK solu = new FindKInSumK();
        int [][] res = solu.findK(list, 12);
        int n = res.length;
        int k = res[0].length;
        for(int i = 0; i<n;i++){
            for(int j = 0; j < k; j++){
                System.out.println(res[i][j]);
            }
        }
    }
}
