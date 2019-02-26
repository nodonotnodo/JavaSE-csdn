package arrary;

public class ObjectArray {

    public static void main(String[] args) {

        //这是一个对象数组
        MyObject[] myObjects = new MyObject[3];
        myObjects[0] = new MyObject("第一个",12);
        myObjects[1] = new MyObject("第二个",23);
        myObjects[2] = new MyObject("第三个",45);
        myPrint(myObjects);

    }

    //方法接收对象数组
    private static void myPrint(MyObject[] arr){
        System.out.println("数组的内容为：");
        for(int i=0; i<arr.length; i++){
            System.out.println("\t" + arr[i].toString());
        }
    }
}

//这就是一个引用数据类型，我们称它为类
class MyObject{

    private String objectName;
    private int objectNum;

    public MyObject(String objectName, int objectNum) {
        this.objectName = objectName;
        this.objectNum = objectNum;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public int getObjectNum() {
        return objectNum;
    }

    public void setObjectNum(int objectNum) {
        this.objectNum = objectNum;
    }

    @Override
    public String toString() {
        return "objectName='" + objectName + '\'' +
                ", objectNum=" + objectNum;
    }
}
