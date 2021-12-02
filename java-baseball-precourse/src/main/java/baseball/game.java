package baseball;


import utils.DataTuils;
import utils.MakeUtils;

import java.util.Scanner;


public class game {
    private Scanner scanner;
    private DataTuils newdata;
    private MakeUtils newmake;

    game(Scanner scanner){
        this.scanner=scanner;
    }

    public void initialize(){
        this.newdata= new DataTuils();
        this.newmake=new MakeUtils();
        newmake.createanswer();
        getuserinput();
    }
    public void getuserinput(){
        System.out.println("숫자를 입력하세요 : ");
        try{
            String userinput=scanner.next();
            newmake.inputanswer(userinput);
            printresult();
            return;
        }catch (IllegalArgumentException e){
            getuserinput();
        }
    }
    public void printresult(){
        result result=new result();
        result.countresult();
        if(result.checkresult()){
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            checkRestart();
        }
        else {
            System.out.println(result.getresult());
            getuserinput();
        }
    }
    public void checkRestart(){
        System.out.printf("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요 ");
        String restart= scanner.next();
        if(restart.equals("1"))
            initialize();
        else if(restart.equals("2"))
            return;
        try {
            new restart(restart).checkRestart();
        }catch (IllegalArgumentException e) {
            checkRestart();
        }
    }
}