package baseball;

import utils.DataTuils;

public class result {
    int ball=0;
    int strike=0;
    int[] answer= DataTuils.getAnswernum();
    int[] user= DataTuils.getUsernum();
    void countresult(){
        for(int i=0;i<3;i++){
            if(answer[i]==user[i])
                strike++;
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(answer[i]==user[j])
                    ball++;
            }
        }
        ball-=strike;
    }
    String getresult(){
        String printmsg="";
        if(ball==0&&strike==0)
            printmsg+="낫잉";
        if(ball!=0)
            printmsg+=ball+"볼";
        if(strike!=0)
            printmsg+=strike+"스트라이크";
        return printmsg;
    }
    boolean checkresult(){
        if(strike==3) {
            return true;
        }
        return false;
    }
}
