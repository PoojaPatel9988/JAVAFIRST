import java.util.List;

public class UsedDistinctAndSorted {
    public static void main(String[] args) {
        //used distinct operation
        List<Integer> numbers=List.of(23,34,90,93,34,67,78,90,14,27,5,87,23,78,14,5);
        List<Integer> uniqueNmae=numbers.stream()
                .distinct()
                .sorted()
                .toList();
        System.out.println(numbers);
        System.out.println(uniqueNmae);
        System.out.println("-----------------------------------------------------------------------------");

//used distinct and sorted operation
        List<Integer> nums=List.of(23,34,90,86,93,67,78,23,90,14,27,78,5,87,14,5);
        List<Integer> unique=nums.stream()
                .distinct()
                .sorted()
                .toList();
        System.out.println(nums);
        System.out.println(unique);
        System.out.println("------------------------------------------------------------------------------");

        //Limit operation : kitna elements print karna hai
        List<Integer> num=List.of(23,34,90,86,93,67,78,23,90,14,27,78,5,87,14,5);
        List<Integer> uniqueN=nums.stream()
                .limit(4)
                .toList();
        System.out.println(num);
        System.out.println(uniqueN);
        System.out.println("-------------------------------------------------------------------------------");
    }
}
