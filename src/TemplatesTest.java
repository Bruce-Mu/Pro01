import java.util.ArrayList;

public class TemplatesTest {

    private static final Customer cust = new Customer();

    public static void main(String[] args) {





        String[] arr = new String[]{"Tom", "Jerry"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(678);
        for (Object o : list) {
        }
        for (int i = 0; i < list.size(); i++) {
            
        }
    }

    private static class Customer {
    }
}
