package algorithm;
/**
检测一个字符串中，注释是否正确使用（正确配对）,以及注释的个数
注释:/* * /  <!---->,这样算四个注释
 */
public class AnnotationDetect {
    
//    public int[] StrCount1(String s,Integer count){
//        int a
//        String str1="/*";
//    }
    public boolean JianCe(String s,Integer count){
        boolean state=true;
        String str1="/*";
        String str2="*/";
        String str3="<!--";
        String str4="-->";

        int firstIndexOfstr1=s.indexOf(str1);
        if(firstIndexOfstr1!=-1){
         count++;   
        }
        int firstIndexOfstr2=s.indexOf(str2);
        if(firstIndexOfstr2!=-1){
            count++;
        }
        int firstIndexOfstr3=s.indexOf(str3);
        if(firstIndexOfstr3!=-1){
            count++;
        }
        int firstIndexOfstr4=s.indexOf(str4);
        if(firstIndexOfstr4!=-1){
            count++;
        }
        
        int secondIndexOfstr1=s.indexOf(str1,firstIndexOfstr1+2);
        if(secondIndexOfstr1!=-1){
            count++;
        }
        int secondIndexOfstr2=s.indexOf(str2,firstIndexOfstr2+2);
        if(secondIndexOfstr2!=-1){
            count++;
        }
        int secondIndexOfstr3=s.indexOf(str3,firstIndexOfstr3+4);
        if(secondIndexOfstr3!=-1){
            count++;
        }
        int secondIndexOfstr4=s.indexOf(str4,firstIndexOfstr4+4);
        if(secondIndexOfstr4!=-1){
            count++;
        }
        if(firstIndexOfstr1>firstIndexOfstr2){
            state= false;
        }
//        else if(firstIndexOfstr1){
//
//        }
        if(firstIndexOfstr3>firstIndexOfstr4){
            state= false;
        }
//        for(){
//
//        }
        return true;

    }
    public static void main(String[] args){


    }

}
