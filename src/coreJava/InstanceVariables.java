package coreJava;

public class InstanceVariables {
    public String name="temp"; // instance variables

    private int emplid;

    InstanceVariables(String name) {
        this.name=name;
    }

    public void setEmplid(int emplid) {
        this.emplid=emplid;
    }

    public static void main( String[] args ) {

        InstanceVariables v1 = new InstanceVariables("Prabu");
        System.out.println(v1.name);
        v1.setEmplid(1000);
        System.out.println(v1.emplid);

    }
}
