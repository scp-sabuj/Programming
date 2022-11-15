package stringmaking;

public class StringMaking {

    public static void main(String[] args) {
        char c[] = {'j','a','v','a'};
        String s1 = new String(c);
        String s2 = s1;
        
        System.out.println(s1);
        System.out.println(s2);
    }
    
}