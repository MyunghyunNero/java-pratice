package utils;

import java.util.Scanner;

public class MakeUtils {

    public void inputname(Scanner scanner){
        String userinputall =scanner.nextLine();
        String userinput = userinputall.replaceAll(" ","");
        String[] userinputarr= userinput.split(",");
        DataUtils.setNumcar(userinputarr.length);
        DataUtils.setCararr(userinputarr);

    }

    public void inputcount(Scanner scanner){
        String userinput = scanner.next();
        int count= Integer.parseInt(userinput);
        DataUtils.setCount(count);
    }
}
