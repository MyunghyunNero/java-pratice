package baseball;

public class restart {
    String userinput;
    restart(String userinput){
        this.userinput=userinput;
    }
    public void checkRestart() throws IllegalArgumentException{
        if(!userinput.equals("1")&&!userinput.equals("2")){
            throw new IllegalArgumentException();
        }
    }
}
