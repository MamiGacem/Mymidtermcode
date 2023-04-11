package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String name="Madam";
        // create an object for string buffer class
        StringBuffer sb=new StringBuffer(name);
        // declear revers method
        sb.reverse();
        // create another variable for comparing
        String name2=sb.toString();
        // validatating both words
        if(name.equalsIgnoreCase(name2)) { // before Ignorecase it was not palindrooe
            System.out.println("this is a palindroome ,test passed");
        }else {
            System.out.println("this is not a palindroome , test failed ");

        }
    }



}

