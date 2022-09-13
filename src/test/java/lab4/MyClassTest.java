package lab4;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class MyClassTest {

    @Test
    void test() throws InvocationTargetException, IllegalAccessException {
        Method[] methods = MyClass.class.getDeclaredMethods();
        MyClass myClass = new MyClass();

        for (Method method : methods) {
            MyAnno annotation = method.getAnnotation(MyAnno.class);
            if (annotation == null) {
                continue;
            }
            int n = annotation.n();
            if (n < 1) {
                continue;
            }

            method.trySetAccessible();
            for (int i = 0; i < n; i++) {
                method.invoke(myClass);
            }
        }
    }

}