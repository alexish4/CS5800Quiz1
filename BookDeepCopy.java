import java.util.ArrayList;
import java.util.List;

public class BookDeepCopy extends Book implements Cloneable{
    public BookDeepCopy(String title, String author, List<String> chapters) {
        this.title = title;
        this.author = author;
        this.chapters = new ArrayList<>(chapters);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getChapters() {
        return chapters;
    }

    public void setChapters(List<String> chapters) {
        this.chapters = chapters;
    }

    @Override
    public Object clone() {
        List<String> newDeepChapters = new ArrayList<>(this.chapters);
        return new BookDeepCopy(title, author, newDeepChapters);
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Chapters: " + chapters;
    }
}
