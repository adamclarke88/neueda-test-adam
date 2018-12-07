
public class Whale extends Animal {
	
	private String mainOcean;
	private Integer weight;
	private Integer maxSpeed;
	private Integer length;
	
	public Whale(String name, String mainOcean, Integer weight, Integer maxSpeed, Integer length) {
		super(name);
		this.mainOcean = mainOcean;
		this.weight = weight;
		this.maxSpeed = maxSpeed;
		this.length = length;
	}
	
	
	public void outputWhaleDetails() {
		System.out.println("Name: " + this.getName());
		System.out.println("Main ocean: " + this.getMainOcean());
		System.out.println("Weight in tonnes: " + this.getWeight());
		System.out.println("Max Speed: " + this.getWeight());
		System.out.println("Length in meters: " + this.getLength());
		System.out.println("\n");
	}

	public String getMainOcean() {
		return mainOcean;
	}

	public void setMainOcean(String mainOcean) {
		this.mainOcean = mainOcean;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}
	
}
