package utils;

import java.awt.*;
import java.util.ArrayList;

public class ListUtils extends List {

    public static <T> T getElementByIndex(ArrayList<T> list, int index){
        if(list.isEmpty() || index < 0 || index >= list.size()){
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
        return list.get(index);
    }

}

