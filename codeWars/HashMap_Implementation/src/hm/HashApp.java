package hm;

class HashApp{
    
    public static void main(String[] args) {
        MyHashTable table = new MyHashTable();
        table.add(1, 1);
        table.add(2,2);
        table.add(3,3);
        table.add(4, 4);
        table.add(5,5);
        table.add(6,6);
        table.add(7, 7);
        table.add(8,8);
        table.add(9,9);


        System.out.println("==================");
        table.printAll();
        System.out.println("size is " + table.getSize());
    }
}