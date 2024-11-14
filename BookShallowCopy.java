import java.util.ArrayList;
import java.util.List;

public class BookShallowCopy extends Book implements Cloneable {
    public BookShallowCopy(String title, String author, List<String> chapters) {
        this.title = title;
        this.author = author;
        this.chapters = chapters;
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
        return new BookShallowCopy(this.title, this.author, this.chapters);
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Chapters: " + chapters;
    }
}
