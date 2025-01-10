package StringsPrograms;

import java.util.Arrays;

public class WordPallendrome {
    public static void main(String args[]) {
        String names[] = {"bob", "mastanbi", "shainy", "jaj", "madam"};
        Arrays.stream(names).filter(s -> new StringBuilder(s).reverse().toString().equals(s)).forEach(e->System.out.println(e));

    }
}
