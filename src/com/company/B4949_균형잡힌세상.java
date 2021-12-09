package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B4949_균형잡힌세상 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        String answer = "yes";

        while(true) {
            answer = "yes";
            String str = br.readLine();
            if(str.equals("."))
                break;

            Stack<Character> stack = new Stack<>();
            for(char c: str.toCharArray()) {
                if(c == ')' || c == ']') {
                    if(c==')' && !stack.isEmpty() && stack.pop() == '(')
                            continue;
                    else if(c==']' && !stack.isEmpty() && stack.pop() == '[')
                            continue;
                    else {
                        answer = "no";
                        break;
                    }
                }
                else if(c == '(' || c == '[') {
                    stack.push(c);
                }
            }
            System.out.println(answer);
        }
    }
}
