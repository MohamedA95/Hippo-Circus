package hippo;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;

public class Hippo {

    public static void main(String[] args) {
        Scanner input=null;
        try{input= new Scanner(Paths.get("hippo.in"));}
        catch(IOException io){System.out.println("io");}
        int t=input.nextInt();
        for(int i=1;i<=t;i++){
            
        LinkedList<Integer> hippos=new LinkedList<Integer>();
            int n=input.nextInt(),dh=input.nextInt(),ta=input.nextInt(),td=input.nextInt();
            for(int q=0;q<n;q++)
                hippos.add(input.nextInt());
                
            System.out.println("Case "+i+": "+calculator(dh, ta, td, hippos));
        
        
        
        
        }
            



    }
    
    static int calculator(int h,int ta,int td,LinkedList s){
        int time=0;
        for(int i=0;i<s.size();i++){
            for(int j=0;j<s.size();j++){
                int t1=(int)s.get(i),t2=(int) s.get(j);
                if(t1+t2<h&&i!=j){
                    s.remove(s.indexOf(t1));
                    s.remove(s.indexOf(t2));
                    time+=td;
                    
                }
            }
        }
return time+=s.size()*ta;

    } 
    
}
