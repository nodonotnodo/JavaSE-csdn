package dataType;

public class DataType {

    private static byte b;//对象属性未初始化，为默认值
    private static short s;
    private static int i;
    private static long l;
    private static float f;
    private static double d;
    private static char c;
    private static boolean bl;

    public static void main(String[] args) {
        System.out.println("byte型数据的默认值："+b);
        System.out.println("byte型数据的数据范围："+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
        System.out.println("short型数据的默认值："+s);
        System.out.println("short型数据的数据范围："+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
        System.out.println("int型数据的默认值："+i);
        System.out.println("int型数据的数据范围："+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
        System.out.println("long型数据的默认值："+l);
        System.out.println("long型数据的数据范围："+Long.MIN_VALUE+"~"+Long.MIN_VALUE);
        System.out.println("float型数据的默认值："+f);
        System.out.println("float型数据的数据范围："+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
        System.out.println("double型数据的默认值："+d);
        System.out.println("double型数据的数据范围："+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
        System.out.println("char型数据的默认值："+c);
        System.out.println("char型数据的数据范围："+Character.MIN_VALUE+"~"+Character.MAX_VALUE);
        System.out.println("boolean型数据的默认值："+bl);
    }

}
