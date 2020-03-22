public class Jiqiren {
    private final static int next[][] = {{-1,0}, {0,1}, {1,0}, {0,-1}};
    private int count = 0;
    private int rows;
    private int cols;
    private int threhod;
    public int movingCount(int threshold, int rows, int cols)
    {
        if(rows <= 0 || cols <= 0 ){
            return 0;
        }
        this.rows = rows;
        this.cols = cols;
        this.threhod = threshold;
        boolean [][]marked = new boolean[rows][cols];
        coutCore(marked, 0, 0);
        return count;
    }

    private void coutCore( boolean [][]marked, int r, int c){
        if (r < 0 || r >= rows || c < 0 || c >= cols || marked[r][c]){
            return;
        }
        marked[r][c] = true;
        if(sum(r,c) > threhod){
            return;
        }
        count++;
        for(int[] tar : next){
            coutCore(marked, r + tar[0], c + tar[1]);
        }
    }
    private int sum(int r, int c){
        int sum = 0;
        while( r % 10 !=0){
            sum += r % 10;
            r = r/10;
        }
        while( c % 10 !=0){
            sum += c % 10;
            c = c/10;
        }
        return sum;
    }
}
