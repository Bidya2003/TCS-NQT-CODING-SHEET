package Problems_On_String;
import java.util.*;
public class PalindromeCheck {
    Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        int start = 0;
        int end = str.length() - 1;
        while(start <= end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            } else{
                System.out.println("not a palindrom");
                return;
            }
        }
        System.out.println("is a palindrom");
}
