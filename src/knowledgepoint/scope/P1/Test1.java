package knowledgepoint.scope.P1;

import knowledgepoint.scope.P2.PublicT2;
import org.junit.Test;

public class Test1 {
    final  static  String str3="3";
    @Test
    public void t1(){
        StringBuffer str1=new StringBuffer("1");
        final  StringBuffer str2=str1;
        System.out.println(str2);
        str1.append("2");
        System.out.println(str2);

    }

    @Test
    public  void t2(){
        PublicT1 publicT1 =new PublicT1();
//        PublicT1.deFaultName
        PublicT2 publicT2=new PublicT2();
    }

}
