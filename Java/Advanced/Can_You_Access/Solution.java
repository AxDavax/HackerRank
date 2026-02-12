import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class Solution {
    static void toFinish() {
        System.out.println("Unsuccessful Termination !");
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o;

            Inner inner = new Solution.Inner();

            Class<?> innerPrivateClass = Solution.Inner.class.getDeclaredClasses()[0];

            Constructor<?> constructor = innerPrivateClass.getDeclaredConstructor(Solution.Inner.class);
            constructor.setAccessible(true);
            o = constructor.newInstance(inner);

            Method method = innerPrivateClass.getDeclaredMethod("powerof2", int.class);
            method.setAccessible(true);

            System.out.println(num + " is " + method.invoke(o, num));
            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
        }
        catch (IOException | InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            toFinish();
        }
    }

    static class Inner {
        private class Private {
            private String powerof2(int num) {
                return ((num & num - 1) == 0) ? "power of 2":"not a power of 2";
            }
        }
    }
}