public class Main1 {
    public static void main(String[] args) {

        // lambda 表达式
        // (参数列表) -> {方法体}
        C1 cal=(int a, int b)->{
          return a+b;
        };
        System.out.println(cal.add(1,2));

        C2 c2=()->{
            System.out.println("c2");
        };
        c2.add();

        C3 c3=(int a)->{
            System.out.println("c3= "+a);
        };
        c3.add(3);

        C4 c4=()->{
            return 4;
        };
        System.out.println(c4.add());

    }

    interface C1{
        int add(int a, int b);
    }

    interface C2{
        // 无参无返回
        void add();
    }

    interface C3{
        // 有参无返回
        void add(int a);
    }

    interface C4{
        // 无参
        int add();
    }
}