package hippo;

import java.io.IOException;
import java.util.Arrays;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.print.Collation;

public class Hippo {

    public static void main(String[] args) {
        Scanner input = null;
        try {input = new Scanner(Paths.get("hippo.in"));}
        catch (IOException io) {System.out.println("io");}
        int t = input.nextInt();
        for (int i = 1; i <= t; i++) {
            //geting data
            int n = input.nextInt(), dh = input.nextInt(), ta = input.nextInt(), td = input.nextInt();
                        int dhippo = 0, shippo = 0;

            int[] hippos = new int[n];
            //filling array
            for (int q = 0; q < n; q++) {hippos[q] = input.nextInt();}
            //sorting array
            Arrays.sort(hippos);
//counting 
            for (int w = hippos.length - 1; w > -1 && hippos[w]!=-1; w--) {
                int j = w-1;
                for (; j > -1&& hippos[j]!=-1; j--) {
                    int t1 = hippos[w], t2 =hippos[j];
                    if (t1 + t2 < dh) {
                        hippos[w] = -1;
                        hippos[j] = -1;
                        dhippo++;
                        break;
                    }
                }
                if(j<0){
                    shippo++;
                hippos[w]=-1;
                }
            }
            System.out.println("Case " + i + ": " + (dhippo * td + shippo * ta));

        }

    }

}
