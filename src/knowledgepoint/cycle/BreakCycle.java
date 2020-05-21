package knowledgepoint.cycle;

import org.junit.Test;

/**
 * break 只能跳出当前循环
 */
public class BreakCycle {
    @Test
    public void Test1(){
        int a=0;
        int b;
        b=10
        ;
        ok:
        for(int i=0;i<100;i++){
            a+=1;
            for(int j=0;j<50;j++){
                b+=1;
                if(a>10){
                    break ok;
                }
            }

        }
        System.out.println(a);
        System.out.println(b);
    }

    @Test
    public void TestSum(){
        int a=1;
        int b=2;
        int c=3;
        System.out.println(b=++c);
        System.out.println(c);
        System.out.println(a=c++);
        System.out.println(c);
    }

    @Test
    public void Test3(){
        int a=8;
        int b=2;
        int c=1;

        System.out.println(a=+1);
        System.out.println(b+=1);

    }
}
