package utils;

public class MakeUtils {
    public void createanswer(){ //랜덤으로 정답 만들기
        final int STARTNUM=1;
        final int ENDNUM=9;
        final int ANSWERLEN=3;
        int[] answernum = new int[ANSWERLEN];
        int n=0;
        while(n<3){
            int number=RandomUtils.nextInt(STARTNUM,ENDNUM);
            if(checkoverlap(answernum,number,n)){
                answernum[n]=number;
                n++;
            }
        }
        DataTuils.setAnswernum(answernum);
    }

    public boolean checkoverlap(int[] answer,int num,int len){//중복 체크
        for(int i=0;i<len;i++){
            if(answer[i]==num)
                return false;
        }
        return true;
    }

    public void inputanswer(String userinput){
        String[] tryanswer=checkinputint(userinput).split("");
        DataTuils.setUsernum(tryanswer);
    }
    //넣은 값이 숫자인지 확인
    private String checkinputint(String userinput) throws IllegalArgumentException{//숫자만 입력되었는지 확인
        try{
            Integer.parseInt(userinput);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException();
        }
        return checkinputlenth(userinput);
    }
    //답의 길이가 3개인지 확인
    private String checkinputlenth(String userinput) throws IllegalArgumentException{
        if(userinput.length()!=3)
            throw new IllegalArgumentException();
        return checkinputoverlap(userinput);
    }
    //답의 숫자가 중복되는지 확인
    private String checkinputoverlap(String userinput) throws IllegalArgumentException{
        if(userinput.charAt(0)==userinput.charAt(1)
                || userinput.charAt(0)==userinput.charAt(2)
                || userinput.charAt(1)==userinput.charAt(2))
            throw new IllegalArgumentException(userinput);
        return validinput(userinput);
    }
    //답에 0이 포함되어 있는 지 확인
    private String validinput(String userinput) throws IllegalArgumentException{
        if(userinput.contains("0"))
            throw new IllegalArgumentException();
        return userinput;
    }
}