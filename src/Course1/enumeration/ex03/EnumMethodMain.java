package Course1.enumeration.ex03;

public class EnumMethodMain {
    public static void main(String[] args) {
        Grade[] values = Grade.values();

        for(Grade value : values) {
            System.out.println("value = " + value + " " + value.name() + " " + value.ordinal());
        }

        String inp = "GOLD";
        Grade grade = Grade.valueOf(inp);

        System.out.println(grade);
        System.out.println(grade.getClass().getSuperclass());
    }
}
