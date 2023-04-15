public class Main {
    public static void main(String[] args) {
        Linked_List<Test> list = new Linked_List<>();
        list.add(new Test("Андрей", 1));
        list.add(new Test("Юлия", 2));
        list.add(new Test("Иван", 3));
        list.add(new Test("Василий", 4));
        list.add(new Test("Елена", 5));

        for (Test item:list) {
            System.out.println(item);
        }

        System.out.println();
        System.out.println("=============================");
        System.out.println();

        for (Test item:list) {
            System.out.println(item);
        }

        System.out.println("0");
        System.out.println(list.getByIndex(0));
        System.out.println(list.getNodeByIndex(0));
        System.out.println("\n1");
        System.out.println(list.getByIndex(1));
        System.out.println(list.getNodeByIndex(1));
        System.out.println("\n2");
        System.out.println(list.getByIndex(2));
        System.out.println(list.getNodeByIndex(2));
        System.out.println("\n3");
        System.out.println(list.getByIndex(3));
        System.out.println(list.getNodeByIndex(3));
        System.out.println("\n4");
        System.out.println(list.getByIndex(4));
        System.out.println(list.getNodeByIndex(4));

    }
}