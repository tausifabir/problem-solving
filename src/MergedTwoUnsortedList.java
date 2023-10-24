import java.util.List;

public class MergedTwoUnsortedList {

    /*
     * You are given the heads of two sorted linked lists list1 and list2.
     * Merge the two lists in a one sorted list.
     * The list should be made by splicing together the nodes of the first two lists.
     * Return the head of the merged linked list.
     *
     * Input: list1 = [1,2,4], list2 = [1,3,4]
     * Output: [1,1,2,3,4,4]
     *
     * Example 2:
     * Input: list1 = [], list2 = []
     * Output: []
     *
     * Example 3:
     * Input: list1 = [], list2 = [0]
     * Output: [0]
     * */

    public List<Integer> mergedTwoUnsortedList(List<Integer> numberList1, List<Integer> numberList2) {

        numberList1.addAll(numberList2);

        // Selection Sort Technique
        for(int i=0;i<numberList1.size();i++){
            for(int j = i+1; j<numberList1.size();j++){
                if(numberList1.get(i)>numberList1.get(j)){
                    int temp = numberList1.get(i);
                    numberList1.set(i, numberList1.get(j));
                    numberList1.set(j, temp);
                }
            }
        }
        return numberList1;

    }
}
