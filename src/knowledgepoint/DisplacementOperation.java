package knowledgepoint;

import org.junit.Test;

public class DisplacementOperation {
    public static void main(String[] args){
        int a=-1;
        System.out.println("a="+a+"的二进制为"+Integer.toBinaryString(a));
        int b=a<<3;
        int c=a>>1;
        a=-1;
        int d=a>>>1;
        System.out.println("b="+b+"的二进制为"+Integer.toBinaryString(b));
        System.out.println("c="+c+"的二进制为"+Integer.toBinaryString(c));
        System.out.println("d="+d+"的二进制为"+Integer.toBinaryString(d));
    }

}
