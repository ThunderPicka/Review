package knowledgepoint.polymorphism;

public class DuotaiOfFlySon extends DuotaiOfRunSon implements DuoTai{
    private String height;

    public DuotaiOfFlySon(){
        System.out.println(DuoTai.name);
        System.out.println("这是DuotaiOfFly的constructor");
    }

    public String hit(){
        return "上勾拳";
    }

    @Override
    public String fly() {
        return "老大飞一个";
    }

    @Override
    public String run() {
        return "老大只会飞";
    }
}
