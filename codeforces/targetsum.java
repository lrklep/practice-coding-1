import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int l = 0;
        int r = n-1;
        while(l<r){
            if(arr[l]+arr[r]>k){
                r--;

            }
            else if(arr[l]+arr[r]<k){
                l++;
            }
            else{
                System.out.print(l);
                System.out.print(r);
                break;
            }

        }
        


    }
}
