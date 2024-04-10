import java.util.ArrayList;
import java.util.Comparator;

public class Main4 {
    public static void main(String[] args) {

        ArrayList<UserBean> list = new ArrayList<>();
        list.add(new UserBean(1,"test1",17,"2002-11-01"));
        list.add(new UserBean(4,"test4",10,"2001-11-01"));
        list.add(new UserBean(3,"test3",11,"2006-11-01"));
        list.add(new UserBean(2,"test2",20,"2000-11-01"));
        list.add(new UserBean(2,"test5",20,"2000-11-01"));
        list.add(new UserBean(2,"test5",20,"2000-11-01"));

        System.out.println("lambda排序");
        list.sort((o1,o2)->{return o1.getAge()- o2.getAge();});
        System.out.println(list);

        System.out.println("lambda遍历");
        list.forEach(System.out::println);

        System.out.println("filter");
        list.stream().filter(a->a.getAge()>12).forEach(System.out::println);

        // 先排序 后filter
        System.out.println("filter&sort");
        list.sort((o1,o2)->{return o2.getAge() - o1.getAge();});
        list.stream().filter(a->a.getAge()>12).forEach(System.out::println);

        System.out.println("limit");
        list.stream().limit(1).forEach(System.out::println);

        System.out.println("distinct");
        list.stream().distinct().forEach(System.out::println);

        System.out.println("指定条件排序");
        list.stream().sorted((u1,u2)-> {return Integer.compare(u1.getAge(), u2.getAge());}).forEach(System.out::println);

        System.out.println("匹配条件");
        boolean allMatch = list.stream().allMatch(e ->e.getAge() > 1);
        System.out.println(allMatch);

        //list.stream().max(Comparator.comparingInt(UserBean::getAge)).map(UserBean::getAge);
        list.stream().max(Comparator.comparingInt(UserBean::getAge));
        list.stream().forEach(System.out::println);
    }


}