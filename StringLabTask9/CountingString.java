package StringLabTask9;

class CountString {
    void count() {
        String s = "paininlife";
        int count = 0;
        int i;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Character Count Is: " + count);
    }
    void SameCharCount() {
        String s1 = "sadnessinlife";
        int count = 0;
        int i,k;

        for ( i = 0; i < s1.length(); i++) {
            for ( k = i + 1; k < s1.length(); k++) {
                if (s1.charAt(k) == s1.charAt(i)) {
                    count++;
                }
            }
        }
        System.out.println("The Number Of Same Characters Is: " + count);
    }
    void Replace() {
        String s2 = "Hello World";
        String s3 = s2.replace("World", "Brother How are you?");
        System.out.println("Original Was: " + s2 +"\nReplaced Word Is: " + s3);
    }
}
public class CountingString {
    public static void main(String[] args) {
        CountString s = new CountString();
        s.count();
        s.SameCharCount();
        s.Replace();
    }
}
