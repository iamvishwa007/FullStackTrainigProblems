import java.util.*;
public class Program5 {
    public static boolean isPrime(int n){
        if(n==1 || n==2)
            return true;
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(isPrime(a[i])){
                ans.add(a[i]);
            }
        }
        Collections.sort(ans);
        int sum=0;
        for(int i=1;i<ans.size();i++){
            sum+=ans.get(i);
        }
        System.out.println(sum);
    }
}