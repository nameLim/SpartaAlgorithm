package com.company;

import java.util.Scanner;

public class Chapter01_02 {

    public static void main(String[] args) {
        Chapter01_02 C = new Chapter01_02();

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int V = in.nextInt();


        in.close();
        System.out.println(C.solution(A, B, V));
    }
    private int solution(int a, int b, int v) {
        int height=0;
        int answer = 0;
//        while(height<v) {
//            height += (a-b);
//            answer++;
//        }
        return v/(a-b);
    }
}
