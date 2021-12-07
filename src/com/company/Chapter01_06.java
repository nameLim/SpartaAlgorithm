package com.company;

import java.util.Scanner;

//터렛
public class Chapter01_06 {
    // 1.두 점에서 교차하는 두 원 = 2
    // 2.한 점에서 만나는 두 원 = 1
    // 3.교차하지 않는 두 원 = 0
    // 4.무한히 교차 = 겹칠 때 = -1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=0; i<num; i++) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int r1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int r2 = in.nextInt();

            int distance = (int)(Math.pow(x1-x2,2) + Math.pow(y1-y2, 2));
            int add = (int)Math.pow(r1+r2,2);
            int sub = (int)Math.pow(r1-r2,2);

            if( x1==x2 && y1==y2 && r1==r2)
                System.out.println(-1);
            else if( add < distance || sub > distance)
                System.out.println(0);
            else if( add == distance || sub == distance)
                System.out.println(1);
            else if(sub < distance && add > distance)
                System.out.println(2);
        }

    }
}
