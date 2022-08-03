package zipcode;

public class Hamming {

    private String s;
    private String s1;
    public Hamming(String s, String s1) {
        this.s = s;
        this.s1 = s1;
    }

    public int getHammingDistance() {
        int count = 0;
        if (s.length() == s1.length()){
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) != s1.charAt(i)){
                    count++;
                }
            }
            return count;
        }
        return -1;
    }
}
