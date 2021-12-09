package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B18258_큐2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer command;
        int num = -1;
        Deque<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        while(cnt-- > 0) {
            command = new StringTokenizer(br.readLine(), " ");	// 문자열 분리
//            command = st.nextToken();
            switch (command.nextToken()) {
                case "push":
                    queue.offer(Integer.parseInt(command.nextToken()));
                    break;
                case "pop":
                    sb.append(queue.isEmpty()? -1:queue.poll()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty()? 1:0).append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty()? -1:queue.peek()).append("\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty()? -1:queue.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
//        시간초과
//        for(int i=0; i<cnt; i++) {
//            st = new StringTokenizer(br.readLine());
//            command = st.nextToken();
//            if(command.equals("push")) {
//                num = Integer.parseInt(st.nextToken());
//                queue.offer(num);
//            }
//            else if(command.equals("pop"))
//                System.out.println(queue.isEmpty()? -1:queue.poll());
//            else if(command.equals("size"))
//                System.out.println(queue.size());
//            else if(command.equals("empty"))
//                System.out.println(queue.isEmpty()? 1:0);
//            else if(command.equals("front"))
//                System.out.println(queue.isEmpty()? -1:queue.peek());
//            else if(command.equals("back"))
//                System.out.println(queue.isEmpty()? -1:num);
//        }
    }
}
