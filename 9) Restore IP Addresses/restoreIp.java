import java.util.ArrayList;
import java.util.List;

public class Main {

    public static boolean isValid(String s) {
        if (s.length() > 3 || s.isEmpty() || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255) {
            return false;
        }
        return true;
    }

    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        int n = s.length();

        for (int i = 1; i < 4 && i < n - 2; ++i) {
            for (int j = i + 1; j < i + 4 && j < n - 1; ++j) {
                for (int k = j + 1; k < j + 4 && k < n; ++k) {
                    String a = s.substring(0, i);
                    String b = s.substring(i, j);
                    String c = s.substring(j, k);
                    String d = s.substring(k);

                    if (isValid(a) && isValid(b) && isValid(c) && isValid(d)) {
                        result.add(a + "." + b + "." + c + "." + d);
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "25525511135"; // Example input
        List<String> ips = restoreIpAddresses(s);

        System.out.print("Valid IP addresses: ");
        for (String ip : ips) {
            System.out.print(ip + " ");
        }
        System.out.println();
    }
}
