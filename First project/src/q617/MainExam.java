package q617;


public class MainExam {
	private String name;
	private int height;
	
	public MainExam(String name, int height) {
		this.name = name;
		this.height = height;
	}
	public void print() {
		System.out.println(name + " " +  height);

	}
	public int getHeight() {
		return height;
	}
}