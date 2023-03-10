import java.util.ArrayList;
import java.util.List;

class ResistorColorDuo {

    List<String> colorList;

    ResistorColorDuo() {
        colorList = new ArrayList<>();
        colorList.add("black");
        colorList.add("brown");
        colorList.add("red");
        colorList.add("orange");
        colorList.add("yellow");
        colorList.add("green");
        colorList.add("blue");
        colorList.add("violet");
        colorList.add("grey");
        colorList.add("white");
    }

    int value(String[] colors) {
        return (colorList.indexOf(colors[0]) * 10) + colorList.indexOf(colors[1]); 
    }
}
