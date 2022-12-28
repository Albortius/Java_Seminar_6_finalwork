public class NotebookList {
    int id;
    String whois;
    String model;
    String color;
    String os;
    int ram;
    int rom;
    int cost;
    public NotebookList(){

    }
    public NotebookList(int id, String whois, String model, String color, String os, int ram, int rom, int cost){
        this.id = id;
        this.whois = whois;
        this.model = model;
        this.color = color;
        this.os = os;
        this.ram = ram;
        this.rom = rom;
        this.cost = cost;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s (%s)\nОЗУ:%dGb ЖД:%dGb Стоимость: %d\n- - - - -", whois, model, os, ram, rom, cost);
    }
}
