/*HelloWorld函数
public是访问修饰符,可以修饰类和方法,表示公开访问.
在class内部可以定义若干方法(method)
主方法main的返回值是void,表示没有任何返回值.

 */
//public class day01 {
//    public static void main(String[] args) { //psvm快捷输入main函数
//        System.out.println("Hello World!");
//    }
//}

public class day01 {
    public static void main(String[] args) { //psvm快捷输入main函数

//        int a = 6;
//        int b = a++;  //a = 7,b=6
//        System.out.println("b= "+ b); // 6
//        System.out.println("a= "+ a); // 7

//        int n = 7;
//        int a = n << 1;
//        int b = n << 2;
//        System.out.println(a);
//        System.out.println(b);

//        int i = 12345;
//        short s = (short) i;
//        System.out.println(s);

        int n = 100;
        //TODO: sum=1+2+...+n
        int sum = (1+n)*n/2;
        System.out.println(sum == 5050 ? "ture":"false");  //三元法

    }
}



