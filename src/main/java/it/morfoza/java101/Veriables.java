/**
 * Created by michalina on 27/07/16.
 */

package it.morfoza.java101;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Veriables {
    static int i1=0;
    static byte b1=0;
    static long l1=0;
    static short s1=0;
    static char c1=263;
    static double d1=0.0;
    static float f1=0.0f;
    static Object ob1=null;
    static boolean bo1=true;



    public static void main (String[] args){

        System.out.println(i1);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(s1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(f1);
        System.out.println(ob1);
        System.out.println(bo1);

        byte b2 = 1;
        if(b2==0) {
            System.out.println("Ok!");
        }
        else {
            System.out.println("Pfffff... źle!");
        }


        if(b2==d1) {
            System.out.println("Ok!");
        }
        else {
            System.out.println("Pfffff... źle!");
        }

        if(c1==l1) {
            System.out.println("Ok!");
        }
        else {
            System.out.println("Pfffff... źle!");
        }

    };
}
