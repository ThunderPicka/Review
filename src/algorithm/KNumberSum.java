package algorithm;

public class KNumberSum {

    public static String count(String str){
        String result="";
        String[] strSplit=str.split(";");

        String kStr=strSplit[0];
        String numberStr1=strSplit[1];
        String numberStr2=strSplit[2];

        int k=Integer.valueOf(kStr);

        char[] charOfNumber1=numberStr1.toCharArray();
        char[] charOfNumber2=numberStr2.toCharArray();

        int lenth1=charOfNumber1.length;
//        if(charOfNumber1[0]=='0'){
//            lenth1=lenth1-1;
//        }

        int lenth2=charOfNumber2.length;
//        if(charOfNumber2[0]=='0') {
//            lenth2 =lenth2-1;
//        }

        int a=0,b=0,sum=0;
        int j=0;
        for (int i=lenth1-1;i>=0;i--){
            a=a+(charOfNumber1[i]-'0')*(int)Math.pow(k,j);
            j++;
//            System.out.println(a);
        }
        System.out.println(a);
        j=0;
        for (int i=lenth2-1;i>=0;i--){
            b=b+(charOfNumber2[i]-'0')*(int)Math.pow(k,i);
            j++;
//            System.out.println(b);
        }
        System.out.println(b);

        sum=a+b;
        while(sum!=0){
            result=sum%k+result;
            sum=sum/k;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(count("3;012;1"));
        System.out.println(Math.pow(3,0));
    }
}
