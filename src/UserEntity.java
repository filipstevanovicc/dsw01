public class UserEntity {
    int age;
    String name;

    public UserEntity(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "UserEntity{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
