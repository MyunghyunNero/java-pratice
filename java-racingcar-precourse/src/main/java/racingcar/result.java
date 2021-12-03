package racingcar;

import utils.DataUtils;

public class result {
    private String winner = "";
    private int maxcount=0;

    public String getWinner() {
        return winner;
    }

    public void onerace(){     //한번 실행할때 각 차 객체마다 이동값 넣기
        for(Car i:DataUtils.getCararr()){
            i.moverandom();
        }
        printrace();
    }
    public void printrace(){  //실행한 값 출력
        for(Car i:DataUtils.getCararr()){
            System.out.println(i.getName() + ":"+ i.printmove());
        }
        System.out.println("\n");
    }
    public void maxposition(){   //가장 멀리 간 값 구하기
        for(Car i: DataUtils.getCararr()){
            if(i.getPosition()>maxcount)
                maxcount=i.getPosition();
        }
    }
    public void getwinner(){    //우승자 정하기
        for(Car i: DataUtils.getCararr()){
            if(i.getPosition()==maxcount){
                strwinner(i);
            }
        }
        System.out.println(winner);
    }
    public void strwinner(Car car) { //우승자 목록 적기
        if (winner == "") {
            winner += car.getName();
            return;
        }
        winner +=(","+ car.getName());
    }
}
