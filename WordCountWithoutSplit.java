*import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int sp_count=1;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                sp_count++;
            }
        }
        System.out.println("The number of words: "+ (sp_count));
    }
} */
