package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B11866_요세푸스문제0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++) q.add(i);

        System.out.println("<");
        while(!q.isEmpty()){
            for(int i=1; i<k; i++){
                q.offer(q.poll());
            }
            System.out.println(q.poll());
            if(q.size()>0)
                System.out.println(",");
        }
        System.out.println(">");
    }
}
