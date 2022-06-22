import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
        ArrayList<ArrayList<Long>> res=new ArrayList<ArrayList<Long>>();
        ArrayList<Long> r,p=null;
        for(int i=0;i<n;i++){
            r=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i) r.add(1L);
                else r.add(p.get(j-1)+p.get(j));
            }
            p=r;
            res.add(r);
            }
        return res; 
	}
}