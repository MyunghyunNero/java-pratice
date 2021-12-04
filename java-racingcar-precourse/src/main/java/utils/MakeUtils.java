package utils;

import java.util.Scanner;

public class MakeUtils {

    public void inputname(Scanner scanner){   //차 이름 입력
        String userinputall =scanner.nextLine();
        String userinput = userinputall.replaceAll(" ","");
        String[] userinputarr= userinput.split(",");
        if(checklen(userinputarr)){
            DataUtils.setNumcar(userinputarr.length);
            DataUtils.setCararr(userinputarr);
            return;
        }
        System.out.println("경주할 자동차 이름을 입력하세요: ");
        inputname(scanner);
    }

    private boolean checklen(String[] userinputarr){
        for(int i=0;i<userinputarr.length;i++){
            if(userinputarr[i].length()>5){
                System.out.println("[ERROR] 이름은 5글자 이하만 가능");
                return false;}
        }
        return true;
    }

    public void inputcount(Scanner scanner) { // 횟수 입력
        try {
            String userinput = scanner.next();
            checkint(userinput);
            int count =Integer.parseInt(userinput);
            DataUtils.setCount(count);
            return;
        }catch (IllegalArgumentException e){
            System.out.println("시도할 횟수는 몇 회 인가요: ");
            inputcount(scanner);
        }
    }

    private void checkint(String userinput) throws IllegalArgumentException {//받은 값이 숫자인지 확인
        try {
            Integer.parseInt(userinput);
        } catch (NumberFormatException e) {
            System.out.println("ERROR] 횟수는 숫자만 가능");
            throw new IllegalArgumentException();
        }
        return;
    }
}
