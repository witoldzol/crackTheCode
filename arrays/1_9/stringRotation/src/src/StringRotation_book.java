package src;
class StringRotation_book{
/*
if string one is waterbottle
string two is erbottle
we can split string into two parts x & y
x=wat
y=erbottle 

string1 = xy
string2 = yx

now if we concat first string to itself we get:
xyxy
In that combination there will always be yx in the middle
ie. we can use isSubstring method
*/
    
    boolean isRotation(String s1, String s2){
        if( s1.length() != s2.length() ) return false;
        String s1s1 = s1+s1;
        return isSubstring(s1s1, s2);
    }

    private boolean isSubstring(String s1s1, String s2) {
        //implement
        return false;
    }

}