import java.util.List;

record User(String name) {
}

public class Gioi4 {
    public static void main(String[] args) {
        User user1 = new User("minh");
        User user2 = new User("minh");
        User user3 = new User("minhle");

        List<User> users = List.of(user1, user2, user3);
        users.stream().distinct().forEach(System.out::println);
    }
}
