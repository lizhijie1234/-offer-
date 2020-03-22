
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public void Find(int [] array, int length) {
        if(length<=1){
            return;
        }
        int i=0;
        int j=length-1;
        while (i < j) {
            while (array[j]%2==1&&i<j)
                j--;
            while (array[i]%2==0&&i<j)
                i++;
            if(i == j){
                break;
            }
            swap(array, i, j);
        }
    }

    private void swap(int []array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[1000000];
        int k = 0;
        Main a = new Main();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            array[k++] = sc.nextInt();
        }
        a.Find(array, k);
        for(int i = 0; i < k; i++)
            System.out.print(array[i] + " ");
    }
}
