package hm;

class HashApp{
    
    public static void main(String[] args) {
        MyHashTable table = new MyHashTable();
        table.insert(1, 1);
        table.insert(2,2);
        table.insert(3,3);
        table.insert(4, 4);
        table.insert(5,5);
        table.insert(6,6);
        table.insert(7, 7);
        table.insert(8,8);
        table.insert(9,9);


        System.out.println("==================");
        table.printAll();
        System.out.println("size is " + table.getSize());
    }
}