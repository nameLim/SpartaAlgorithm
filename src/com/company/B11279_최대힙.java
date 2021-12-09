package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class B11279_최대힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<cnt; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                if(!q.isEmpty())
                    System.out.println(q.poll());
                else
                    System.out.println(0);
                continue;
            }
            q.add(num);
        }
    }
}
