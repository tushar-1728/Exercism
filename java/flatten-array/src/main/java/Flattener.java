import java.util.List;
import java.util.Stack;
import java.util.ArrayList;


public class Flattener {
    public List flatten(List unflattenedList) {
        ArrayList flattenedList = new ArrayList<>();
        Stack<Integer> stackInt = new Stack<Integer>();
        Stack<List> stackObj = new Stack<List>();
        Integer index;
        Object obj;
        if (unflattenedList.size() > 0) {
            stackInt.push(0);
            stackObj.push(unflattenedList);
            while (!stackObj.isEmpty()) {
                index = stackInt.peek();
                obj = stackObj.peek().get(index);
                while (obj instanceof List) {
                    stackObj.push((List)obj);
                    stackInt.push(stackInt.pop() + 1);
                    index = stackInt.push(0);
                    obj = ((List)obj).get(index);
                }
                if (obj != null) {
                    flattenedList.add(obj);
                }
                index = stackInt.push(stackInt.pop() + 1);
                while (!stackObj.isEmpty() && stackInt.peek() == (stackObj.peek()).size()) {
                    stackObj.pop();
                    stackInt.pop();
                }
                
            }
        }
        return flattenedList;
    }
}