package com.company;

import java.util.Scanner;

//4948 성공
//베르트랑 공준
public class Chapter01_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int n = in.nextInt();
            if(n==0){
                break;
            }
            int answer = 0;
            int[] arr = new int[n*2+1];
            for(int i=2; i<=n*2; i++) {
                if(arr[i]==0) {
                    if(i>n)
                        answer++;
                    for(int j=i; j<=n*2; j=j+i) {
                        arr[j] = 1;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}