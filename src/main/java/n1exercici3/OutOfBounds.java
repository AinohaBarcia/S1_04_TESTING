package n1exercici3;

import java.util.ArrayList;

public class OutOfBounds {

    public String getElementAtIndex(ArrayList<String> nameList, int index) {
        if (index < 0 || index >= nameList.size()) {
            throw new ArrayIndexOutOfBoundsException("Índice fuera del rango del array");
        }
        String name = nameList.get(index);
        return nameList.get(index);
    }

    }


