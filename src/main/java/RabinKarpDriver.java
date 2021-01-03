import utility.RabinKarp;

import java.util.List;

public class RabinKarpDriver {
    public static void main(String[] args) {
        String pattern = "kaloso";
        String text = "qqkalosoffkalollkaloso";

        List<Integer> ans = RabinKarp.run(text, pattern, 11);
        System.out.println(ans);
    }
}
