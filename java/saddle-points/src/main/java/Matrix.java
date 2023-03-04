import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Matrix {
    
    ArrayList<Integer> minInColumns;
    ArrayList<Integer> maxInRows;
    List<List<Integer>> values;

    Matrix(List<List<Integer>> values) {
        this.values = values;
        minInColumns = new ArrayList<>();
        maxInRows = new ArrayList<>();

        ArrayList<Integer> temp = new ArrayList<Integer>();

        int rowSize = values.size();
        int colSize = rowSize > 0 ? values.get(0).size(): 0;

        for (int j = 0; j < colSize; j++) {
            for (int i = 0; i < rowSize; i++) {
                temp.add(values.get(i).get(j));
            }
            minInColumns.add(Collections.min(temp));
            temp.clear();
        }

        for (int i = 0; i < rowSize; i++) {
            maxInRows.add(Collections.max(values.get(i)));
        }
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        Set<MatrixCoordinate> sMatrixCoordinates = new HashSet<>();
        for (int i = 0; i < values.size(); i++) {
            for (int j = 0; j < values.get(i).size(); j++) {
                int temp = values.get(i).get(j);
                if (temp >= maxInRows.get(i) && temp <= minInColumns.get(j)) {
                    sMatrixCoordinates.add(new MatrixCoordinate(i + 1, j + 1));
                }
            }
        }
        return sMatrixCoordinates;
    }
}
