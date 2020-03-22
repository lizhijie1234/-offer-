public class Power {
    public double Power(double base, int exponent) {
       if( exponent == 0){
           return 1;
       }
        if (exponent == 1)
            return base;
       if(exponent < 0){
           return 1/PosPower(base, -exponent);
       }else{
           return PosPower(base, exponent);
       }
    }

    private double PosPower(double base, int exponent){
        double res = 1;
        for(int i = 0; i < exponent; i ++ ){
            res *=base;
        }
        return res;
    }
}
