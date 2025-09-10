import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("NAME : ");
        String name = sc.nextLine();

        System.out.print(name + " 나이: ");
        int age = sc.nextInt();

        System.out.print(name + " 몸무게: ");
        double weight = sc.nextDouble();

        sc.nextLine();

        System.out.print(name + " 성별(남자/여자): ");
        String gender = sc.nextLine();

        System.out.print(name + " 혈액형: ");
        String bloodType = sc.nextLine();

        System.out.printf("%s은 %d살이고, %.2f Kg 입니다.\n", name, age, weight);

        if (gender.equals("남자")) {
            System.out.printf("%s은 남자(M)입니다.\n", name);
        } else if (gender.equals("여자")) {
            System.out.printf("%s은 여자(F)입니다.\n", name);
        } else {
            System.out.printf("%s의 성별: %s\n", name, gender);
        }

        System.out.printf("혈액형은 %s형입니다.\n", bloodType);

        sc.close();
    }
}
