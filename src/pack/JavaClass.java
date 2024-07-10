package pack;

public class JavaClass extends JavaAbstractClass{
    private final int serialID;
    private final String name;
    private final double value;
    private final boolean bool = false;
    public JavaClass(int serialID, String name, double value){
        this.serialID = serialID;
        this.name = name;
        this.value = value;
    }

    private String returnInfo(){
        return serialID + " " + name + " " + value;
    }
    public void functionF(){
        System.out.println(returnInfo());
    }

    public void functionN(){
        System.out.println(bool ? "true" : "false");
    }
}
