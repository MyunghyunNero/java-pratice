package subway.domain;

public class Station {
    private String name;

    private Line linename;

    public Station(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Line getLinename() {
        return linename;
    }

    public void setLinename(Line linename) {
        this.linename = linename;
    }
// 추가 기능 구현
}
