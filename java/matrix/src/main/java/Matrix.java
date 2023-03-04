import java.util.List;
import java.util.stream.Collectors;

class Matrix {

    int[][] rowMatrix;
    int[][] columnMatrix;

    Matrix(String matrixAsString) {
        List<String> stringRows = matrixAsString.lines().collect(Collectors.toList());
        int rows = stringRows.size();
        int columns = stringRows.get(0).split(" ").length;
        rowMatrix = new int[rows][columns];
        columnMatrix = new int[columns][rows];
        for (int i = 0; i < stringRows.size(); i++) {
            String[] temp = stringRows.get(i).split(" ");
            for (int j = 0; j < temp.length; j++) {
                rowMatrix[i][j] = Integer.parseInt(temp[j]);
                columnMatrix[j][i] = Integer.parseInt(temp[j]);
            }
        }
    }

    int[] getRow(int rowNumber) {
        return rowMatrix[rowNumber-1];
    }

    int[] getColumn(int columnNumber) {
        return columnMatrix[columnNumber-1];
    }
}
