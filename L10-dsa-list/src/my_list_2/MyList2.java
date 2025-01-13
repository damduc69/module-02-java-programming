package my_list_2;

public class MyList2 {
    public static void main(String[] args) {
        MylistTest2 list = new MylistTest2();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();
        list.add(2, 10);

        System.out.println("Danh sách hiện tại");
        list.print();
        System.out.println();
        System.out.println("Danh sách có chứa 3 không? " + list.contains(3));
        System.out.println("element at index 2: " + list.get(2));

        System.out.println("Danh sách sau khi xóa:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        MylistTest2<Integer> clonedList = list.clone();
        System.out.println("Danh sách sao chép:");
        for (int i = 0; i < clonedList.size(); i++) {
            System.out.print(clonedList.get(i) + " ");
        }
        System.out.println();

        list.clear();
        System.out.println("Danh sách sau khi xóa toàn bộ: " + list.size());
    }


}
