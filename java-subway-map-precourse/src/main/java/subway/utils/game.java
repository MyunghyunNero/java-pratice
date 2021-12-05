package subway.utils;

import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;

import java.util.Scanner;

public class game {
    private Scanner scanner;
    private Input ip; //input 클래스

    public game(Scanner scanner){
        this.scanner= scanner;
    }

    public void initialize(){//초기화면
        this.ip=new Input();
        System.out.println("## 메인화면");
        System.out.println("1.역관리");
        System.out.println("2.노선관리");
        System.out.println("3.구간관리");
        System.out.println("4.지하철 노선도 출력");
        System.out.println("5.종료");
        inputmain();
    }
    public void inputmain(){//main화면 입력
        int input=scanner.nextInt();
        if(input == 1){
            stationmanage();
        }
        if(input ==2){
            notionmanage();
        }
        if(input ==3){
            totalmanage();
        }
        if(input ==4){
            printsubway();
        }
        if(input ==5){
            return;
        }
    }
    public void stationmanage(){//역관리화면
        System.out.println("## 역관리화면");
        System.out.println("1.역 등록");
        System.out.println("2.역 삭제");
        System.out.println("3.역 조회");
        System.out.println("4.종료");
        inputstation();
    }
    public void inputstation(){ //역 관리 버튼 눌렀을 때
        int input = scanner.nextInt();
        if(input ==1){
            System.out.println("## 등록할 역 이름을 입력");
            String stationname = scanner.next();
            ip.addS(stationname);
        }
        if(input==2){
            System.out.println("## 삭제할 역 이름을 입력");
            String stationname = scanner.nextLine();
            StationRepository.deleteStation(stationname);
            System.out.println("[INFO] 지하철 역이 삭제되었습니다.");
        }
        if(input ==3){
            System.out.println("## 역 목록");
            StationRepository.viewS();
        }
        if(input==4){
            initialize();
        }
    }
    public void notionmanage(){ //노선관리 화면
        System.out.println("## 노선관리 화면");
        System.out.println("1.노선 등록");
        System.out.println("2.노선 삭제");
        System.out.println("3.노선 조회");
        System.out.println("4.종료");
        inputline();
    }
    public void inputline(){
        int input = scanner.nextInt();
        if(input ==1){
            System.out.println("## 등록할 노선 이름을 입력");
            String linename = scanner.next();
            ip.addL(linename);
        }
        if(input==2){
            System.out.println("## 삭제할 노선 이름을 입력");
            String linename = scanner.nextLine();
            LineRepository.deleteLineByName(linename);
            System.out.println("[INFO] 노선이 삭제되었습니다.");
        }
        if(input ==3){
            System.out.println("## 노선 목록");
            LineRepository.viewL();
        }
        if(input==4){
            initialize();
        }
    }
    public void totalmanage(){

    }
    public void printsubway(){

    }


}
