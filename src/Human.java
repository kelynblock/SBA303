public class Human {
    String name;
    int height;

    int age;

    public Human(String name) {
        this.name = name;
    }

    public Human() {
    }

    public Human(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Human(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}