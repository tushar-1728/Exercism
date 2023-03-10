import java.util.ArrayList;
import java.util.List;

class ResistorColor {

    List<String> colorList;

    ResistorColor() {
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

    int colorCode(String color) {
        return colorList.indexOf(color);
    }

    String[] colors() {
        return colorList.toArray(new String[0]);
    }
}
