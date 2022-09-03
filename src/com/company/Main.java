package com.company;

public class Main
{

    public static void main(String[] args)
    {
        boolean result = true;
        int[] values = {-3, 2, 5, 4, 7};
        int n = 1;

        while (n < values.length && result)
        {
            if (values[n] < values[n - 1])
                result = false;
            n++;
        }
        System.out.println(result);
    }
}
