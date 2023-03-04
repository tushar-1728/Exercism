import java.util.List;

public class BinarySearch {

    List<Integer> sortedList;

    public BinarySearch(List<Integer> sortedList) {
        this.sortedList = sortedList;
    }

    Integer indexOf(Integer number) throws ValueNotFoundException {
        Integer index, leftBoundary, rightBoundary;
        leftBoundary = 0;
        rightBoundary = sortedList.size() - 1;
        index = (leftBoundary + rightBoundary) / 2;
        while (index >= leftBoundary && index <= rightBoundary) {
            if (number > sortedList.get(index)) {
                leftBoundary = index + 1;
            } else if (number < sortedList.get(index)) {
                rightBoundary = index - 1;
            } else if (sortedList.get(index).compareTo(number) == 0) {
                return index;
            }
            index = (leftBoundary + rightBoundary) / 2;
        }
        throw new ValueNotFoundException("Value not in array");
    }

    public static void main(String[] args) throws ValueNotFoundException {
        List<Integer> sortedListOfOddLength = List.of(1, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 634);

        BinarySearch search = new BinarySearch(sortedListOfOddLength);
        System.out.println(search.indexOf(144));
    }
}