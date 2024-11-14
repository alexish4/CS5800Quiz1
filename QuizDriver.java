import java.util.ArrayList;
import java.util.List;

public class QuizDriver {
    public static void main(String[] args) {
        demonstrateShallowCopy();
        demonstrateDeepCopy();
    }

    public static void demonstrateShallowCopy() {
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");
        chapters.add("Chapter 3");

        BookShallowCopy book = new BookShallowCopy("War and Peace", "Leo Tolstoy", chapters);
        BookShallowCopy shallowCopy = (BookShallowCopy) book.clone();

        System.out.println("Before Remove Chapter");
        System.out.println(book.toString());
        System.out.println(shallowCopy.toString());

        chapters.remove("Chapter 3");
        book.setChapters(chapters);

        System.out.println("After Remove Chapter");
        System.out.println(book.toString());
        System.out.println(shallowCopy.toString());
    }

    public static void demonstrateDeepCopy() {
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");
        chapters.add("Chapter 3");

        BookDeepCopy book = new BookDeepCopy("War and Peace", "Leo Tolstoy", chapters);
        BookDeepCopy deepCopy = (BookDeepCopy) book.clone();

        System.out.println("Before Remove Chapter");
        System.out.println(book.toString());
        System.out.println(deepCopy.toString());

        chapters.remove("Chapter 3");
        book.setChapters(chapters);

        System.out.println("After Remove Chapter");
        System.out.println(book.toString());
        System.out.println(deepCopy.toString());
    }

}
