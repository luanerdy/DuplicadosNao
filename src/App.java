import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String[] first = {"my", "name", "is", "skrillex"};
        String[] second = {"my", "nickname", "is", "luan"};

        List<String> same = Array.compare(first, second);

        System.out.println(same);
    }
}
