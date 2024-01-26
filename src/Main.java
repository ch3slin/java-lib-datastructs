import main.com.iamcheslin.datastruct.LinkedLists;

public class Main {
    public static void main(String[] args) {
        LinkedLists <String> list = new LinkedLists<>();
        list.add("I");
        list.add("am");
        list.add("Iron");
        list.add("Man");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.clear();
        System.out.println("-----------------------------------");
        list.add("I");
        list.add("am");
        list.add("Spider");
        list.add("man");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.indexOf("I"));

        System.out.println("-----------------------------------");
        list.remove(3);

    }
}