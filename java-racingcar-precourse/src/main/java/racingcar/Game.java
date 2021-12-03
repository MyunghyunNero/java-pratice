package racingcar;

import utils.DataUtils;
import utils.MakeUtils;

import java.util.Scanner;

public class Game {
    private Scanner scanner;
    private MakeUtils makeUtils=new MakeUtils();
    private result rst= new result();

    Game(Scanner scanner){
        this.scanner= scanner;
    }
    public void initalize(){
        inputname();
    }
    public void inputname(){
        System.out.println("경주할 자동차 이름을 입력하세요: ");
        makeUtils.inputname(scanner);
        getcount();
    }
    public void getcount(){
        System.out.println("시도할 횟수는 몇 회인가요? :");
        makeUtils.inputcount(scanner);
        race();
    }
    public void race(){
        System.out.println("실행결과\n");
        for(int i=0;i<DataUtils.getCount();i++){
            rst.onerace();
        }
        rst.maxposition();
        rst.getwinner();
    }
}
