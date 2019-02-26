package arrary;

public class Array {

    public static void main(String[] args) {
        int[] ints = new int[]{21,34,12,5,7,3,9,45,23,75,10};
        myPrint(ints);
        int[] newInts = addOneElement(ints);
        myPrint(newInts);
    }

    //方法接收数组
    private static void myPrint(int[] arr){
        System.out.print("数组的内容为：");
        for(int i=0; i<arr.length; i++){
            if(arr.length-1 == i){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i] + "  ,  ");
            }
        }
    }

    //方法返回数组
    private static int[] addOneElement(int[] arr){
        int[] ints = new int[arr.length + 1];
        System.arraycopy(arr, 0, ints, 0, arr.length);
        ints[ints.length - 1] = arr[arr.length - 1] - arr[0];
        return ints;
    }

}
