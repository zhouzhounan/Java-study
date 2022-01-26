/* 数据类型
1. 布尔运算
2. 字符与字符串
   Java内存中使用Unicode表示字符,一个英文字符和一个中文字符都用一个char类型表示,他们都占用2个字节.
   String字符串类型用"..."表示,多行字符串用"""...""",必要时使用转义符\
   常见的转移字符包括：
      \" 表示字符 "
      \' 表示字符 '
      \\ 表示字符 \
      \n 表示换行符
      \r 表示回车符
      \t 表示制表符Tab
    * 空值null与空字符串""的区别：空值null表示不存在，该变量不指向任何对象,空字符串是一个有效的字符串对象,它不等于null.
3. 数组类型
*/



public class day2 {
    public static void main(String[] args) {
        /* 布尔运算:布尔类型boolean，只有true\false两个值
        布尔运算是一种关系运算,包含：
        比较运算符： > >= <= == !=
        与运算 &&
        或运算 ||
        非运算 ！
        */

        //demo
        boolean isGreater = 5 > 3; //true
        int age =12;
        boolean isZero = age == 0; //false
        boolean isTeenager = age > 14 && age < 18;  //false

        System.out.println(isGreater);
        System.out.println(isZero);
        System.out.println(isTeenager);

        /*关系型运算符的优先级顺序：
            !
            > >= < <=
            == !=
            &&
            ||
//================================================================================================
        短路运算
           &&  ||
           false && x 无论x为true还是false,直接返回结果false.在确定第一个值后可以不再继续计算.
           true || x 只要确定第一个布尔表达式的结果为true,可以直接返回结果.
        */
        boolean result = true || (5/0 > 0); //true
        System.out.println(result);

        boolean result2 = false && (5 > 0); //false
        System.out.println(result2);

        /* 三元运算符
        语法格式： b ? x : y  表达式b为true时返回值x
        */
        int n =-100;
        int x =  n > 0 ? n : -n;
        System.out.println(x);
//===================================================================================================
        //转义符
        String s = "ABC\nABCE";
        System.out.println(s);


//=====================================================================================================
        /* 数组定义
        语法：
        法一：数据类型[] 数组命名 = new 数据类型[n]  其中n表示数组元素容量大小
        法二：数据类型[] 数组命名 = new 数据类型[]{xx,xx,xx,xx,...}   定义数组时直接指定初始化的元素
        数组特点：数组所有元素初始化为默认值,整型都是0,浮点型是0.0,布尔型是false;数组一旦创建后，大小就不可改变
         */

        int[] arr = new int[5];
        arr[0] = 68;
        System.out.println(arr);   //输出arr的存储地址

        //数组访问:使用索引,数组索引从0开始.修改数组中某个元素，使用赋值语句，如ns[1]=78;
        //数组大小用数组名称.length求算

    }
}


