package J05011_Timer;

public class Player {
	private String id, name, timeEnter, timeOut;

	public Player(String id, String name, String timeEnter, String timeOut) {
		super();
		this.id = id;
		this.name = name;
		this.timeEnter = timeEnter;
		this.timeOut = timeOut;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTimeEnter() {
		return timeEnter;
	}

	public void setTimeEnter(String timeEnter) {
		this.timeEnter = timeEnter;
	}

	public String getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}

	public int getHour(String s) {
		return Integer.parseInt(s.substring(0, 2));
	}

	public int getMinutes(String s) {
		return Integer.parseInt(s.substring(3, 5));
	}

	public String getTime(String a, String b) {
		int hourA = getHour(a);
		int minutesA = getMinutes(a);
		int hourB = getHour(b);
		int minutesB = getMinutes(b);
		int minutes = minutesB - minutesA;
		if (minutes >= 0) {
			return (hourB - hourA) + " gio " + minutes + " phut";
		} else {
			return (hourB - hourA - 1) + " gio " + (60 + minutes) + " phut";
		}
	}

//	public String getTime(String a, String b) {
//	    int totalA = getHour(a) * 60 + getMinutes(a);
//	    int totalB = getHour(b) * 60 + getMinutes(b);
//
//	    // Nếu qua ngày
//	    if (totalB < totalA) {
//	        totalB += 24 * 60;
//	    }
//
//	    int diff = totalB - totalA;
//	    int hours = diff / 60;
//	    int minutes = diff % 60;
//
//	    return hours + " gio " + minutes + " phut";
//	}

	public int sortTime(String a, String b) {
		int totalA = getHour(a) * 60 + getMinutes(a);
		int totalB = getHour(b) * 60 + getMinutes(b);

		if (totalB < totalA) {
			totalB += 24 * 60;
		}

		int diff = totalB - totalA;
		return diff;
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + getTime(this.timeEnter, this.timeOut);
	}
}
