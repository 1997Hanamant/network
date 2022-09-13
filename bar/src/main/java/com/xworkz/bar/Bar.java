package com.xworkz.bar;

//@Component
public class Bar {
	
//	@Value("${BarName}")
	String name;
	
	//@Value("${BarLocation}")
	String area;

	public Bar() {
		System.out.println(this.getClass().getSimpleName());
	}

	public Bar(String name, String location, String area) {
		super();
		this.name = name;
		this.area = area;
	}

	@Override
	public String toString() {
		return "Bar [name=" + name + ", location=" + area + "]";
	}

//	@Value("Saroja")
	public void setName(String name) {
		this.name = name;
	}

//	@Value("Hubli")
	public void setArea(String area) {
		this.area = area;
	}

}