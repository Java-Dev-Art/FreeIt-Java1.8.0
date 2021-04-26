package HomeWorkAnnotation;

import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.Objects;

@Version(version = 1.0, codeVe = "Artur/1.0.0")
public class MyService {
    private int id;
    private String name;
    MyService service = new MyService();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return id == myService.id && Objects.equals(name, myService.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Version(version = 1.0, codeVe = "Method/1.0.0")
    private void thisClassInfo() {
        try {
            Class<?> c = service.getClass();
            Method m = c.getMethod("thisClassInfo");
            Version version = m.getAnnotation(Version.class);
            System.out.println(version.version());
            System.out.println(version.codeVe());
            System.out.println(m.getName());
            System.out.println(m.hashCode());
            System.out.println(c.getClasses());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
