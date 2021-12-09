package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B10828_스택 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        String command = "";
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            command = st.nextToken();
            if(command.contains("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            }
            else if(command.equals("pop")) {
                System.out.println(stack.isEmpty()?-1:stack.pop());
            }
            else if(command.equals("size")) {
                System.out.println(stack.size());
            }
            else if(command.equals("empty")) {
                System.out.println(stack.isEmpty()?1:0);
            }
            else if(command.equals("top")) {
                System.out.println(stack.isEmpty()?-1:stack.peek());
            }

        }
    }
}
