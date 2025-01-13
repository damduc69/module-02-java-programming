package binary_search;

public class Example {

    static int binarySearch(int[] list, int key) {
        int left = 0;
        int right = list.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(list[mid] == key) {
                return mid;
            }
            if(list[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 79));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 80));

    }
}
