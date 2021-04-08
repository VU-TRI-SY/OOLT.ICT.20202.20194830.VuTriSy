package hust.soict.globalict.aims.media;
public  class Media {
	private String id;
	private String title;
	private String category;
	private float cost;
	public Media() {
	}
	public Media(String title){
		this.title = title;
	}
	public Media(String title, String category){
		this(title);
		this.category = category;
	}
	public Media(String id, String title, String category, float cost) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
}
