package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] myCar = {1.5, -11.7, 22.3, -11.1, 18.6, -92.4, 65.1, 14.5, -43.4, 33.5, -12.6, 55.4, -77.3, 90.2, 7.5};
        double impreza = 0;
        int forester = 0;
        boolean legacy = false;
        for (double bl5 : myCar) {
            if (bl5 < 0) {
                legacy = true;

            } else if (legacy) {
                impreza += bl5;
                forester++;



            }


        }
        System.out.println(impreza);
        System.out.println(forester);
        System.out.println("Среднее арифмическое" + impreza + forester);{


            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 1; i < myCar.length; i++) {
                    if (myCar[i] < myCar[i - 1]){
                        double temp = myCar[i];
                        myCar[i] = myCar[i - 1];
                        myCar[i - 1] = temp;
                        isSorted = false;

                    }

                }
                for (int i = 0; i < myCar.length; i++){
                    if (i > 0) {
                    }

                }

                System.out.println(Arrays.toString(myCar));
            }
        }
    }
}

    

