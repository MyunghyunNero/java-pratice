package subway.utils;

import subway.domain.Line;
import subway.domain.Station;

import java.util.Scanner;

import static subway.domain.LineRepository.addLine;
import static subway.domain.StationRepository.addStation;

public class Input {
    private Scanner scanner;

    public void addL(String linename){
        Line line= new Line(linename);
        addLine(line);
        startstation(line);
    }
    private void startstation(Line line){
        System.out.println("등록할 노선의 상행 종점역 이름을 입력하시오:");
        String statiionname = scanner.next();
        Station station =new Station(statiionname);
        station.setLinename(line);
        addStation(station);
        endstation(line);
    }
    private void endstation(Line line){
        System.out.println("등록할 노선의 하행 종점역 이름을 입력하시오:");
        String statiionname = scanner.next();
        Station station =new Station(statiionname);
        station.setLinename(line);
        addStation(station);
        System.out.println("[INFO] 노선이 등록되었습니다.");
    }
    public void addS(String stationname){
        Station station =new Station(stationname);
        addStation(station);
        System.out.println("[INFO] 지하철 역이 등록되었습니다.");
    }

    public void addT(String totalname){

    }

}
