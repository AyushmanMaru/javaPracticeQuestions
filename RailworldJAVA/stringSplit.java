public class stringSplit {
    public static void main(String[] args) {
        String s = "Jai Shree Ram";

        String s1[] = s.split("\s");

        for(String w:s1){
            System.out.println(w);
        }
    }
}
