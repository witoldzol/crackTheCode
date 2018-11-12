package src;
class Main{
    public static void main(String[] args) {
        String s2 = "waterbottle";
        String s1 = "erbottlewat";
        StringRotation sr = new StringRotation();
        System.out.println(sr.isRotation(s1, s2));
    }
}