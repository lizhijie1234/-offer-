import java.util.Arrays;
//一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级... 它也可以跳上 n 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
public class BianTaiTaijie {
    public int JumpFloorII(int target) {
        int []DP = new int[target];
        Arrays.fill(DP, 1);
        for(int i = 1; i < target; i++){
            for(int j = 0; j < i; j++){
                DP[i] += DP[j];
            }
        }
        return DP[target - 1];
    }
}
