import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="batchfiles")
@Table(name="batchfiles")
public class Files {
	public Files( String filename) 
	{
		
		this.filename = filename;
	}

	public Files() 
	{
		super();
	}

	@Id
	@Column(name="id")
	int id;
	
	@Column(name="filename")
	String filename;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
}
