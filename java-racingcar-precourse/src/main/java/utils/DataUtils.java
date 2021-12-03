package utils;

import racingcar.Car;

public class DataUtils {
    private static int numcar;
    private static Car[] cararr;
    private static int count;

    public static int getNumcar() {
        return numcar;
    }

    public static void setNumcar(int numcar) {
        DataUtils.numcar = numcar;
        cararr = new Car[numcar];
    }

    public static Car[] getCararr() {
        return cararr;
    }

    public static void setCararr(String[] userinput) {
        for(int i=0;i<numcar;i++){
            cararr[i]=new Car(userinput[i]);
        }
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        DataUtils.count = count;
    }
}
