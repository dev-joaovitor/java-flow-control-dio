public class SchoolResult {
    public static void main(String[] args) {
        int grade = 8;

//        if (grade >= 7)
//            System.out.println("Approved");
//
//        else if (grade >= 5 && grade < 7)
//            System.out.println("Recuperation");
//        else
//            System.out.println("Rejected");

        // ternary
        String result = grade >= 7 ? "Approved" :
                        grade >= 5 ? "Recuperation" : "Rejected";

        System.out.println(result);
    }
}