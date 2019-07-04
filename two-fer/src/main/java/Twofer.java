import java.util.Optional;

class Twofer {
    String twofer(Object name) {
        return String.format("One for %s, one for me.", Optional.ofNullable(name).orElse("you"));
    }
}