package MT;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner IN = new Scanner(System.in);
        int n = IN.nextInt();
        int num[] = new int[20];
        for(int i = 0; i < n; i++){
            num[i] = IN.nextInt();
        }
        int i;
        for(i = 0; i < n; i++){
            int min = i;
            int j;
            for(j = i + 1; j < n; j++){
                if(num[j] < num[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp;
                temp = num[min];
                num[min] = num[i];
                num[i] = temp;
            }
        }
        for(i = 0; i < n; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

}
