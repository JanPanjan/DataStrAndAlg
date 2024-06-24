public class MyHashSet {

    int arr[] = new int[(int) 1e6+1];

    // add
    void add(int key) {
        arr[key] = 1;
    }

    // contains
    boolean contains(int key) {
        return arr[key] == 1;
    }

    // remove
    void remove(int key) {
        arr[key] = 0;
    }

    // print array
    void printArr(int len) {
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            if (i == len-1) {
                System.out.print(arr[i]);
            }
            else {
                System.out.print(arr[i] + ", ");
            }
        } System.out.println("]");
    }
}