package Java_II;

public class ObjectOrientedProgramming {
    public String word1;
    public String word2;

    public String helloWorld(){
        return System.out.printf("%s %s",word1,word2).toString();
    }

    public static void main(String[] args) {
        ObjectOrientedProgramming test = new ObjectOrientedProgramming();
        test.word1 = "hello";
        test.word2 = "world";
        System.out.println(test.helloWorld());
    }
}
