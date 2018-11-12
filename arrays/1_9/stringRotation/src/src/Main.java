package src;
class Main{
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        StringRotation sr = new StringRotation();
        System.out.println(sr.isRotation(s1, s2));
    }
}