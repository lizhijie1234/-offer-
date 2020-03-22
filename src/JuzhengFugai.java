
//要覆盖 2*n 的大矩形，可以先覆盖 2*1 的矩形，再覆盖 2*(n-1) 的矩形；或者先覆盖 2*2 的矩形，再覆盖 2*(n-2) 的矩形。而覆盖 2*(n-1) 和 2*(n-2) 的矩形可以看成子问题。该问题的递推公式如下：
public class JuzhengFugai {
    public int RectCover(int target) {
        if(target <= 2){
            return target;
        }
        int pre1 = 1;
        int pre2 = 2;
        for(int i = 3; i <= target; i++){
            int temp = pre2;
            pre2 = pre1 + pre2;
            pre1 = temp;
        }
        return pre2;
    }
}
