package OOP.less_figures;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Figures {

    private List<BaseFig> figures= new ArrayList<>();

    public void getInfo(int index){
        this.figures.get(index).toString();
    }

    public StringBuilder getAllInfo(){
        StringBuilder result = new StringBuilder();
        for (BaseFig fig : this.figures) {
            result.append(fig.toString() + "\n==============\n");  
        }
        return result;
    }

    public void addFig(BaseFig Object){
        this.figures.add(Object);
    }

    public void delFig(int index){
        this.figures.remove(index);
    }

    public void getChanges(){
        System.out.println("Введите индекс фигуры, парамеры которой нужно поменять");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("=============");
        System.out.println(this.figures.get(num).toString());
        System.out.println("=============");
        this.figures.get(num).set();
       
    }

    public void changeFig(BaseFig obj){
        System.out.println("Введите индекс фигуры, которую нужно заменить");
        Scanner scan = new Scanner(System.in);
        int indx = scan.nextInt();
        this.figures.set(indx, obj);
    }

    public void sort(){
        this.figures.sort(new SquareComporator());
    }

    


}
