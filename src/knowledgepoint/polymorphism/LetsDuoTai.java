package knowledgepoint.polymorphism;

import java.util.Objects;

public class LetsDuoTai {
    public static void main(String[] args){

        DuoTai duoTaiFly=new DuotaiOfFlySon();
        DuoTai duoTaiRun=new DuotaiOfFlySon();
        System.out.println(Objects.isNull(duoTaiFly));
    }
}
