import java.util.Scanner;

class NetworkUtility{
    public static class PingConfig{
        int timeout;
        String targetIp;

        public PingConfig(int timeout, String targetIp) {
            this.timeout = timeout;
            this.targetIp = targetIp;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the timeout value (in milliseconds): ");
        int timeout = sc.nextInt();
        System.out.print("Enter the target IP address: ");
        String targetIp = sc.next();
        NetworkUtility.PingConfig config = new NetworkUtility.PingConfig(timeout, targetIp);
        System.out.println(config.targetIp + " with timeout " + config.timeout);
    }
    
}
