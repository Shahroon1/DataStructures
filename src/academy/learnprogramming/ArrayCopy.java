package academy.learnprogramming;

public class ArrayCopy {
    public static void main(String[] args){
        char [] copyFrom = {'a','b','c','d','f','e','h','i'};
        char [] copyTO = new char[4];
        System.arraycopy(copyFrom,2,copyTO,0,4 );
        System.out.println(new String(copyTO));
    }
}
