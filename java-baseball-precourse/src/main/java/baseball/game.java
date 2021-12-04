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
        System.out.println("input : ");
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
            System.out.println("complete");
            checkRestart();
        }
        else {
            System.out.println(result.getresult());
            getuserinput();
        }
    }
    public void checkRestart(){
        System.out.printf("restart: 1,end :2");
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