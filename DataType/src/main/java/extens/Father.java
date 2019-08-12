package extens;

public class Father {

    private String fprivate = "这是父类的私有属性";
    public String fpublic = "这是父类的公用属性";

    public Father() {
    }

    public Father(String fprivate) {
        this.fprivate = fprivate;
    }

    public String getFprivate() {
        return fprivate;
    }

    private void fpprint(){
        System.out.println("这是父类的私有方法");
    }

    public void usePrivate(){
        this.fpprint();
    }

    public void fbprint(){
        System.out.println("这是父类的公有方法");
    }
}
