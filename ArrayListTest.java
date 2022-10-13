package ArrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<User> list=new ArrayList<>();
        User u1=new User("1","一号","123");
        User u2=new User("2","二号","456");
        User u3=new User("3","三号","789");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        boolean result = contains(list, "1");
        System.out.println(result);
    }
    public static boolean contains(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(id)){
                return true;
            }
        }
        return false;
    }
}
