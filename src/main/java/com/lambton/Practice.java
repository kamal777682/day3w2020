package com.lambton;

public class Practice
{
    public static void main(String[] args)
    {
        int i;
        int ar[] = {20, 40, 30, 70, 60, 42, 88, 11, 30};
        System.out.println ( "Displaying Array values: " );
        for (i = 0; i < ar.length; i++)
        {
            System.out.println ( ar[i] );
        }
        System.out.println ( "" );

        int max = 0;
        int min=0;

        for (i = 0; i < ar.length; i++)
        {

            if (max < ar[i])
                max= ar[i];

        }
        System.out.println("Maximum value in array : " + max);
        for (i = 0; i <ar.length; i++) {
             min = ar[0];
            if (min > ar[i])
                min = ar[i];

        }
        System.out.println("Minimum value in array : " + min);

    }
}

