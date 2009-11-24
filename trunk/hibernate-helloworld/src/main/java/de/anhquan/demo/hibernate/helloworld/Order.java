package de.anhquan.demo.hibernate.helloworld;

public class Order {

	private Long id;
	private String name = "";
	private String description= "";
	private String category= "";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String cat) {
		this.category = cat;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return new StringBuffer()
			.append("id=" + id)
			.append(",name=" + name)
			.append(",description=" + description)
			.append(",category=" + category)
			.toString();
	}
}
