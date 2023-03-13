package OOP.less_figures;


import java.util.ArrayList;
import java.util.List;

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

    public void getChanges(int index){
        this.figures.get(index).getClass();

    }




}
