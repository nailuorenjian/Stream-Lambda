import java.util.Arrays;
import java.util.List;

public class TestFilerList {
    public static void main(String[] args) {
        userBeanList.stream()
                .filter(userBean -> userBean.getAge()>11).forEach(userBean -> System.out.println(userBeanList));
    }

    private static List<UserBean> userBeanList;
    static {
        // 构造userBeanList
        UserBean t1 = new UserBean(1,"test1",17,"2002-11-01");
        UserBean t4 = new UserBean(4,"test4",10,"2001-11-01");
        UserBean t3 = new UserBean(3,"test3",11,"2006-11-01");
        UserBean t2 = new UserBean(2,"test2",20,"2000-11-01");

        userBeanList = Arrays.asList(t1,t2,t3,t4);
    }
}
