package racingcar;


import utils.RandomUtils;

public class Car {
    private final String name;
    private int position = 0;
    private String advance="";

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    // 추가 기능
    public void moverandom(){//랜덤으로 숫자 넣기
        final int STARTNUM=0;
        final int ENDNUM=9;
        int number= RandomUtils.nextInt(STARTNUM,ENDNUM);
        move(number);
    }
    private void move(int num){ //숫자에 따라 이동하기
        if(num>=4){
            this.position++;
            this.advance+="-";}
    }
    public String printmove(){
        return this.advance;
    }

}
