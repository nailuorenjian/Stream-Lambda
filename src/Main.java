public class Main {
    public static void main(String[] args) {

//        Cal cal = new Cal(){
//
//            @Override
//            public int add(int a, int b){
//                return a+b;
//            }
//        };

        // lambda 表达式
        // (参数列表) -> {方法体}
        Cal cal=(int a, int b)->{
          return a+b;
        };
        System.out.println(cal.add(1,2));
    }

    interface Cal{

        int add(int a, int b);
    }
}