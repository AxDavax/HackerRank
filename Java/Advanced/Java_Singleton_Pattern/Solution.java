import java.util.Scanner;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class Singleton {
    private static Singleton instance;
    public String str;

    private Singleton() {}

    public static Singleton getSingleInstance() {
        if(instance == null) instance = new Singleton();
        return instance;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Singleton s1 = Singleton.getSingleInstance();
        Singleton s2 = Singleton.getSingleInstance();
        assert(s1 == s2);

        Class<?> c = s1.getClass();
        Constructor<?>[] allConstructors = c.getDeclaredConstructors();
        assert allConstructors.length==1;

        for (Constructor<?> ctor : allConstructors)
            if(ctor.getParameterCount() != 0 && !Modifier.isPrivate(ctor.getModifiers()))
                System.out.println("Wrong class!");

        String str = sc.nextLine();
        s1.str = str;
        s2.str = str;
        System.out.println("Hello I am a singleton! Let me say " + str + " to you");
    }
}