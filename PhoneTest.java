package ArrayList;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("苹果", 8500);
        Phone p2 = new Phone("小米", 1500);
        Phone p3 = new Phone("vivo", 4000);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> phoneInfo = getPhoneInfo(list);
        for (int i = 0; i < phoneInfo.size(); i++) {
            Phone p=phoneInfo.get(i);
            System.out.println(p.getBrand()+","+p.getPrice());
        }
    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            if (price < 3000) {
                resultList.add(p);
            }
        }
        return resultList;
    }
}
