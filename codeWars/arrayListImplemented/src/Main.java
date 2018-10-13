public class Main {
    public static void main(String[] args) {

        MyArrayList arr = new MyArrayList();

        arr.add("helloo");
        arr.add(12212);
        arr.add(12212);
        arr.add(12212);
        arr.add(12212);
        arr.add(12212);

        System.out.println("get "+arr.get(3));
        arr.remove(44);

        System.out.println("array size");
        System.out.println(arr.getSize());
    }
}
