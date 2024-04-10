public class Main3 {
    public static void main(String[] args) {

        UserService1 userService1=UserBean::new;
        System.out.println(userService1.getUser());

        UserService2 userService2=UserBean::new;
        System.out.println(userService2.getUser("test1",17));
    }

    interface UserService1{
        UserBean getUser();
    }

    interface UserService2{
        UserBean getUser(String name,long id);
    }

}