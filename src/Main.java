import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 아기사자 수 입력 (5 미만이면 재입력 요청)
        int count;
        while (true) {
            System.out.print("아기사자 수를 입력하세요 (5명 이상): ");
            count = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 소비

            if (count >= 5) {
                break;
            }
            System.out.println("5명 이상 입력해주세요. 다시 입력하세요.");
        }

        // 입력받은 수만큼 배열 생성
        String[] members = new String[count];

        // 반복문으로 아기사자 이름 입력받아 배열에 저장
        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "번째 아기사자 이름: ");
            members[i] = scanner.nextLine();
        }

        // 최종 명단 출력
        System.out.println("\n===== 아기사자 최종 명단 =====");
        System.out.println("총 " + count + "명");
        System.out.println("-----------------------------");

        for (int i = 0; i < members.length; i++) {
            System.out.println((i + 1) + ". " + members[i]);
        }

        System.out.println("=============================");
        scanner.close();
    }
}
