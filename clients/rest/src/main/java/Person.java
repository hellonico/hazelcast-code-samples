import java.io.Serializable;

/**
 * Simple Person class
 *
 * @since 2/6/15
 */
public class Person implements Serializable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    @Override public String toString() {
        return "Person {" + "name='" + name + '\'' + '}';
    }
}
