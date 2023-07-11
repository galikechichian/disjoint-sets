package DisjointSets;
import java.io.*;
import java.util.*;


public class DisjointSets {

    private int[] par;
    private int[] rank;
    
    /* contructor: creates a partition of n elements. */
    /* Each element is in a separate disjoint set */
    DisjointSets(int n) {
        if (n>0) {
            par = new int[n];
            rank = new int[n];
            for (int i=0; i<this.par.length; i++) {
                par[i] = i;
            }
        }
    }
    
    public String toString(){
        int pari,countsets=0;
        String output = "";
        String[] setstrings = new String[this.par.length];
        /* build string for each set */
        for (int i=0; i<this.par.length; i++) {
            pari = find(i);
            if (setstrings[pari]==null) {
                setstrings[pari] = String.valueOf(i);
                countsets+=1;
            } else {
                setstrings[pari] += "," + i;
            }
        }
        /* print strings */
        output = countsets + " set(s):\n";
        for (int i=0; i<this.par.length; i++) {
            if (setstrings[i] != null) {
                output += i + " : " + setstrings[i] + "\n";
            }
        }
        return output;
    }
    
    /* find representative of element i */
    public int find(int i) {
        if (this.par[i] == i) return i;
        else {
            this.par[i] = find(par[i]);
            return this.par[i];
        }

    }

    /* merge sets containing elements i and j */
    public int union(int i, int j) {
        int rooti = find(i);
        int rootj = find(j);

        if (rooti == rootj) return rooti;

        if (this.rank[rooti] <= this.rank[rootj]) { // merge into j
            for (int k = 0; k < this.par.length; k++) {
                if (this.par[k] == rooti) this.par[k] = rootj;
            }
            this.rank[rootj]++;
            return rootj;
        }
        else { // merge into i
            for (int k=0; k< this.par.length; k++) {
                if (this.par[k] == rootj) this.par[k] = rooti;
                }
            this.rank[rooti]++;
            return rooti;
            }
        }


}
