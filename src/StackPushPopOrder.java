public class StackPushPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA == null || popA == null || pushA.length != popA.length){
            return false;
        }
        int top = -1;
        int push = 0;
        int pop = 0;
        top++;
        while(push < pushA.length && pop < popA.length){
            if(top != -1 && pushA[top] == popA[pop]){
                top--;
                pop++;
            }else{
                if(push + 1 < pushA.length){
                    pushA[++top] = pushA[++push];
                }else {
                    push ++;
                }
            }
        }
        return (top == -1);
    }

}
