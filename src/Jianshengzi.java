public class Jianshengzi {
    public int cutRop(int length){
        if(length <= 1 ){
            return 0;
        }
        if (length == 2)
        {
            return 1;
        }
        if(length == 3){
            return 2;
        }
        int timeOf3 = length/3;
        if(length - timeOf3 * 3 == 1){
            timeOf3--;
        }
        int timeOf2 = (length - timeOf3 * 3)/2;
        return (int)(Math.pow(3, timeOf3)) * (int)(Math.pow(2, timeOf2));
    }

    public int cutRopeDp(int n){
        int[] Dp = new int[n + 1];
        Dp[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 1; j < i; j++){
                Dp[i] = Math.max(Dp[i], Math.max(j * (i - j),Dp[j] * (i - j)));
            }
        }
        return Dp[n];
    }
}
