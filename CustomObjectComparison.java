
//no.13
import java.util.Objects;

public class CustomObjectComparison {
    static class CustomObject {
        private String name;
        private int id;

        public CustomObject(String name, int id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            CustomObject that = (CustomObject) o;
            return id == that.id && Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, id);
        }

        @Override
        public String toString() {
            return "CustomObject{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }

    public static void main(String[] args) {
        CustomObject obj1 = new CustomObject("Samir", 1);
        CustomObject obj2 = new CustomObject("zofix", 2);

        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));
        System.out.println("obj1.hashCode(): " + obj1.hashCode());
        System.out.println("obj2.hashCode(): " + obj2.hashCode());
        System.out.println("obj1.toString(): " + obj1.toString());
        System.out.println("obj2.toString(): " + obj2.toString());
    }
}
