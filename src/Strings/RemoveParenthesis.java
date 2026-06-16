package Strings;

import java.sql.SQLOutput;

public class RemoveParenthesis {
    public String removeOuterParenthesis(String s){
        StringBuilder result = new StringBuilder();
        int level =0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(level > 0) result.append(ch);

                level++;
            }
            else if(ch == ')'){
                level--;

                if(level > 0) result.append(ch);

            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        RemoveParenthesis res = new RemoveParenthesis();
        System.out.println(res.removeOuterParenthesis(s));

    }
}
