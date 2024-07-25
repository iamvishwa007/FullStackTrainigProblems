
import java.util.*;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        ArrayList<Integer> aa=new ArrayList<>(n);
        for(int i:a)
            aa.add(i);
        Collections.sort(a);
        char c='a';
        HashMap<Integer,Character> hm=new HashMap<>();
        for(int i=0;i<n;i++)
            hm.put(a.get(i),c++);
        ArrayList<Character> ans=new ArrayList<>();
        for(int i:aa){
            ans.add(hm.get(i));
        }
        System.out.println(ans);
    }

}