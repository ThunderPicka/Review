package knowledgepoint.scope.P2;

import knowledgepoint.scope.P1.PublicT1;

public class PublicT2 extends PublicT1 {
    public  String publicName="publicName2";
    private String privateName="privateNAme2";
    String deFaultName="defaultName2";
    protected String protectedName;

    PublicT1 publicT1=new PublicT1();

    public PublicT2(){
        this.protectedName=protectName;
        System.out.println(this.protectedName);
    }

    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }
}

