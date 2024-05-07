import java.util.Scanner;

public class Main {
    public static String defangIPaddr(String address) {
        StringBuilder defangedIP = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c == '.') {
                defangedIP.append("[.]");
            } else {
                defangedIP.append(c);
            }
        }
        return defangedIP.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IP address: ");
        String address = scanner.nextLine();
        String defangedAddress = defangIPaddr(address);
        System.out.println(defangedAddress);
    }
}
