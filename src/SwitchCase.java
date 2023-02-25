public class SwitchCase {
    public static void main(String[] args) {
        String day="tuesday";

        switch (day){
            //using : to run statments will fall through cases
            case "monday":
                System.out.println("Day1");
                break;
            case "tuesday":
                    System.out.println("Day2");
                    break;
            case "wednesday":
                System.out.println("day3");
                break;
            default:
                System.out.println("other");
        }
        //using -> to run statments will not fall through cases
        switch (day){
            case "monday"-> System.out.println("Day1");
            case "tuesday"-> System.out.println("day2");
            case "wednesday"-> System.out.println("day3");
            default -> System.out.println("other");
        }
    }
}
