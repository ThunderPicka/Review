package knowledgepoint.inheri;

import org.junit.Test;

public class AllTest {
    @Test
    public void T1(){
        Son son=new Son();
    }

    @Test
    public  void T2(){
        GrandFather grandFather=new Son();
    }

    @Test
    public void T3(){
        int[] str={1,23,3};
        System.out.println(str[1]);
    }
}
