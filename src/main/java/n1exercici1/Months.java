package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Months {
    private ArrayList<String> listMonths ;

    public Months (){
        listMonths = new ArrayList<String>();
    }

    public ArrayList <String> addMonths(){


        listMonths.add("January");
        listMonths.add("February");
        listMonths.add("March");
        listMonths.add("April");
        listMonths.add("May");
        listMonths.add("June");
        listMonths.add("July");
        listMonths.add("August");
        listMonths.add("September");
        listMonths.add("October");
        listMonths.add("November");
        listMonths.add("December");
        return listMonths;
    }

}
