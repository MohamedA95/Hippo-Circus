package hippo;

import java.io.IOException;
import java.util.Arrays;
import java.nio.file.Paths;
import java.util.Scanner;

public class Hippo {

    public static void main(String[] args) {
        Scanner input = null;
        try {
            input = new Scanner(Paths.get("hippo.in"));
        } catch (IOException io) {
            System.out.println("io");
        }
        int t = input.nextInt();
        for (int i = 1; i <= t; i++) {
            //geting data
            int n = input.nextInt(), dh = input.nextInt(), ta = input.nextInt(), td = input.nextInt();
            int[] hippos = new int[n];
            //filling arry
            for (int q = 0; q < n; q++) {
                hippos[q] = input.nextInt();
            }
            //sorting arry
            Arrays.sort(hippos);
            for (int w = 0; w < hippos.length; w++) {
                for (int j = 0; j < hippos.length; j++) {
                    int t1 = hippos[w], t2 = hippos[j];
                    if (t1 + t2 < dh && w != j && t1 != -1 && t2 != -1) {
                        hippos[w] = -1;
                        hippos[j] = -1;

                    }
                }
            }
            int dhippo = 0, shippo = 0;
            for (int e = 0; e < hippos.length; e++) {
                if (hippos[e] == -1) {
                    dhippo++;
                } else {
                    shippo++;
                }

            }
            int time = (dhippo / 2) * td + shippo * ta;
            System.out.println("Case " + i + ": " + (time));

        }

    }

}
