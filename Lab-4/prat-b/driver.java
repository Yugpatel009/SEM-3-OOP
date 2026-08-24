import java.util.Scanner;

public class driver {

    public static void main(String[] args) {

        String[] logs = {
                "10:05 alice Hello there",
                "10:10 bob Java is very easy",
                "10:15 charlie Hello everyone",
                "10:20 david Good morning",
                "10:25 This line is malformed",
                "10:30 alice I love Java programming"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter keyword: ");
        String keyword = sc.nextLine();

        String result = chatfilter.filterLogs(logs, keyword);

        System.out.println(result);

        sc.close();
    }
}