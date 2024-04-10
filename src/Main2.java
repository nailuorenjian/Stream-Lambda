public class Main2 {
    public static void main(String[] args) {
        C1 c1=a -> a-1;
        System.out.println(c1.test(2));

        C1 c2=a -> a-1;
        System.out.println(c1.test(5));

        // 方法引用
        Main2 m2 = new Main2();
        C1 c3 = m2::test1;
        System.out.println(c3.test(7));

        // 静态方法引用 无需创建对象，直接使用类名
        C1 c4=Main2::test2;
        System.out.println(c4.test(9));

    }

    // 被引用的方法
    public int test1(int a){
        return a-2;
    }

    public static int test2(int a){
        return a-2;
    }

    interface C1{
        int test(int a);
    }

}