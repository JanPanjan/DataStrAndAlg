public class Main {
    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();

        obj.add(1);
        obj.printArr(4);

        System.out.println(obj.contains(1));
        System.out.println(obj.contains(2));

        obj.add(2);
        obj.printArr(4);

        System.out.println(obj.contains(2));

        obj.remove(1);
        obj.printArr(4);

        System.out.println(obj.contains(1));


        System.out.println("\n");


        MyHashSet myHashSet = new MyHashSet();

        myHashSet.add(1);      // set = [1]
        myHashSet.printArr(4);

        myHashSet.add(2);      // set = [1, 2]
        myHashSet.printArr(4);

        System.out.println(myHashSet.contains(1)); // return True
        System.out.println(myHashSet.contains(3)); // return False, (not found)

        myHashSet.add(2);      // set = [1, 2]
        myHashSet.printArr(4);

        System.out.println(myHashSet.contains(2)); // return True

        myHashSet.remove(2);   // set = [1]
        myHashSet.printArr(4);

        System.out.println(myHashSet.contains(2)); // return False, (already removed)

    }
}
