import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class Palindrome{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                List < String> ip = new ArrayList<String>();
                System.out.println("Enter the size of list");
                int size = sc.nextInt();
                System.out.println("Enter the strings");
                for(int i = 0; i < size; i++){
                        ip.add(sc.next());
                }
                List<String>result = palindrome(ip , (String s) -> IntStream.range(0,s.length()/2).noneMatch( i -> s.charAt(i) != s.charAt(s.length()-i-1)));
                for(String s : result){
                        System.out.println(s);
                }
        }
        public static List<String> palindrome(List<String> ip,Predicate<String> predicate){
                List<String>res = new ArrayList<String>();
                for(String s : ip){
                        if(predicate.test(s)){
                                res.add(s);
                        }
                }
                return res;
        }
}

