package part1;

public class Task {
	private String name;
	private int day, month, year;
	private boolean isUrgent;
	private String category;
	private boolean isCompleted;
	private Task next; 

	public Task(String name, int day, int month, int year, boolean isUrgent, String category) {
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
		this.isUrgent = isUrgent;
		this.category = category;
		this.isCompleted = false;
		this.next = null;
	}

	public String getName() {
		return name;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public boolean isUrgent() {
		return isUrgent;
	}

	public String getCategory() {
		return category;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public Task getNext() {
		return next;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setUrgent(boolean isUrgent) {
		this.isUrgent = isUrgent;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public void setNext(Task next) {
		this.next = next;
	}

}
