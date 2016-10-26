package lubod.demos.uservices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Something {
	@Id
    @GeneratedValue
    private Long id;
    private String title;
    private String author;

    public Something() {
    	
    }
    
    public Something(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
    public Long getId() {
		return id;
	}
	
    public void setId(Long id) {
		this.id = id;
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
    
    @Override
	public String toString() {
		return "Something [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
}
