package utils;
public class DataTuils {
    private static int[] answernum;
    private static int[] usernum;

    public static int[] getAnswernum() {
        return answernum;
    }

    public static void setAnswernum(int[] answernum) {
        DataTuils.answernum = answernum;
    }

    public static int[] getUsernum() {
        return usernum;
    }

    public static void setUsernum(String[] tryanswer) {
        int[] usernumber =new int[3];
        for(int i=0;i<3;i++){
            usernumber[i]=Integer.parseInt(tryanswer[i]);
        }
        DataTuils.usernum=usernumber;
    }
}