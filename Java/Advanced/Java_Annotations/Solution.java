import java.util.Scanner;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
    String userRole() default "GUEST";
    int budgetLimit();
}

class FamilyMember {
    @FamilyBudget(userRole = "SENIOR", budgetLimit = 100)
    public void seniorMember(int budget, int moneySpend) {
        System.out.println("Senior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }

    @FamilyBudget(userRole = "JUNIOR", budgetLimit = 50)
    public void juniorUser(int budget, int moneySpend) {
        System.out.println("Junior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases-- > 0) {
            String role = in.next();
            int spend = in.nextInt();
            try {
                Class<?> annotatedClass = FamilyMember.class;
                Method[] methods = annotatedClass.getMethods();

                for (Method method : methods) {
                    if (method.isAnnotationPresent(FamilyBudget.class)) {
                        FamilyBudget family = method.getAnnotation(FamilyBudget.class);
                        int budgetLimit = family.budgetLimit();

                        if (family.userRole().equals(role)) {
                            if(spend <= budgetLimit)
                                method.invoke(annotatedClass.getDeclaredConstructor().newInstance(), budgetLimit, spend);
                            else
                                System.out.println("Budget Limit Over");
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        in.close();
    }
}