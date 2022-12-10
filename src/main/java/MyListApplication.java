public class MyListApplication {

    public static void main(String[] args) {

        LinkedList<Double> list = new LinkedList<>();

        list.addFirst(1.23);
        list.addLast(8.235);
        list.addLast(19.235);

        list.addLast(2.235);

        list.addLast(7.235);


        System.out.println(list);

        list.add(12.35, 19.235);
        System.out.println(list);
    }

}