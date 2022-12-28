import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static public void main(String[] args)
    {
        NotebookList unit1 = new NotebookList(1, "Acer", "Aspire D500usw", "black", "Windows", 2, 500, 12400);
        NotebookList unit2 = new NotebookList();
        unit2.id = 2;
        unit2.whois = "Samsung";
        unit2.model = "SN-320/2/DVDRW";
        unit2.color = "silver";
        unit2.os = "Windows";
        unit2.ram = 2;
        unit2.rom = 320;
        unit2.cost = 14660;
        NotebookList unit3 = new NotebookList(3, "ASUS", "Combo-500WT", "silver", "Ubunta", 4, 500, 15650);
        NotebookList unit4 = new NotebookList(4, "Toshiba", "SNC-750/4/Win/DVD", "black", "Windows", 4, 750, 19500);
        NotebookList unit5 = new NotebookList(5, "HP", "Pavilion 17/1000", "golden", "Windows", 8, 1000, 25990);
        NotebookList unit6 = new NotebookList(6, "Apple", "Mac book Pro 2018", "silver", "MacOS", 12, 512, 56000);
        NotebookList unit7 = new NotebookList(7, "Lenovo", "Vivo Shtorm", "black", "Windows", 4, 500, 18990);
        
        List<NotebookList> units = new ArrayList<>();
        units.add(unit1);
        units.add(unit2);
        units.add(unit3);
        units.add(unit4);
        units.add(unit5);
        units.add(unit6);
        units.add(unit7);
        
        for (var item : units){
            System.out.println(item.whois);
        }
        searchByInfo(units);
    }
    static void searchByInfo(List<NotebookList> list){
        Scanner input = new Scanner(System.in);
        int process = 0;
        int variant = 0;
        int count = 0;
        while (process != 1){
            System.out.println("Введите критерии поиска:\n1-по производителю, 2-по ОС\n3-по объему RAM, 4-по объему ЖД");
            variant = input.nextInt();
            if (variant == 1){
                System.out.println("Название производителя:");
                String whoisSearch = input.next();
                for (var searchVar : list){
                    if (whoisSearch.equals(searchVar.whois)){
                        System.out.println(searchVar.toString());
                        count++;
                    }
                }
            }
            else if (variant == 2){
                System.out.println("Операционная система:");
                String osSearch = input.next();
                for (var searchVar : list){
                    if (osSearch.equals(searchVar.os)){
                        System.out.println(searchVar.toString());
                        count++;
                    }
                }
            }
            else if (variant == 3){
                System.out.println("Минимальный объем оперативной памяти:");
                int minVal = input.nextInt();
                System.out.println("максимальный объем оперативной памяти:");
                int maxVal = input.nextInt();
                for (var searchVar : list){
                    if (searchVar.ram >= minVal && searchVar.ram <= maxVal){
                        System.out.println(searchVar.toString());
                        count++;
                    }
                }
            }
            else if (variant == 4){
                System.out.println("Минимальный объем жесткого диска:");
                int minVal = input.nextInt();
                System.out.println("максимальный объем жесткого диска:");
                int maxVal = input.nextInt();
                for (var searchVar : list){
                    if (searchVar.rom >= minVal && searchVar.rom <= maxVal){
                        System.out.println(searchVar.toString());
                        count++;
                    }
                }
            }
            if (count == 0){
                System.out.println("Поиск не дал результатов.");
            }
            System.out.println("Хотите повторить? Да=0, Нет=1");
            process = input.nextInt();
        }
        input.close();
    }
}
