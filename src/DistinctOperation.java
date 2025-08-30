import java.util.List;

public class DistinctOperation {
    public static void main(String[] args) {
        List<Integer> num=List.of(4,5,7,8,12,78,34,54);
        List<Integer> update=num.stream()
                .distinct()
                .toList();
        System.out.println(num);
        System.out.println(update);
    }
}