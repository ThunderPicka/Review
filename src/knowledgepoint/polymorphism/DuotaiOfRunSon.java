package knowledgepoint.polymorphism;

public class DuotaiOfRunSon implements DuoTai {

    private String speed;
    public static String filed=DuoTai.name;
    protected  String fast;

    public DuotaiOfRunSon(){

    }
    @Override
    public String fly() {
        return "老二不会飞";
    }

    @Override
    public String run() {
        return "老二跑起来了";
    }

    private String getStr(){
        return filed;
    }

//    public static void staticGetStr(){
//        return speed;
//    }
}
