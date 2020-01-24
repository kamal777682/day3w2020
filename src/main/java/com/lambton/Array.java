package com.lambton;



public class Array
{

    public static void main(String[] args) {
        int a[];
        int[] b;
        int c[] = new int[5];
        c[0] = 10;
        c[1] = 20;
        c[2] = 30;
        c[3] = 40;
        c[4] = 50;
        System.out.println(c[4]);
        a = new int[2];
        a[0] = 100;
        a[1] = 200;
        System.out.println(a[0]);
        int d[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(d[4]);
        System.out.println(d.length);
        System.out.println("Using for(;;)");
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
        int[] x, y; //Both are array
        int x2, y2[]; // 1 - int, 2 - array
        int x3[], y3; //1 - array, 2 - int
        int[] x4, y4[]; // 1 - array, 2 - 2D array
        y4 = new int[3][3];
        y4[0][0] = 1;
        y4[0][1] = 2;
        y4[0][2] = 4;
        y4[1][0] = 5;
        y4[1][1] = 6;
        y4[1][2] = 7;
        System.out.println(y4[0][1]);
        System.out.println("Using Compact for(:)");



            // class assignment

            int i,j, max, min, sum;
            float avg;
            max = 0;
            min = 0;
            sum = 0;
            int ar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            System.out.println("Display Array values: ");

            for(i=0;i< ar.length ; i++)
                System.out.println(ar[i]);

            for(j=0;j< ar.length;j++)
            {
                sum+=j;
            }
            System.out.println("Sum: " + sum);


            avg = (float)sum/ar.length;
            System.out.println("Average : " + avg);

            for(i=0;i< ar.length; i++)
            {
                max= ar[0];
                if(max<ar[i])
                    max=ar[i];

            }
            System.out.println("Maximum value in array : " +max);
        for(i=0;i< ar.length; i++)
        {
            min= ar[0];
            if(min >ar[i])
                min =ar[i];

        }
        System.out.println("Minimum value in array : " +min);

        for(i=ar.length-1;i >=0; i--)

            System.out.println(ar[i]);

        }

    }