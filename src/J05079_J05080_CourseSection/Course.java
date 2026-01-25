package J05079_J05080_CourseSection;

public class Course {
	private String idCourse, nameCourse, groupCourse, nameTeacher;

	public Course(String idCourse, String nameCourse, String groupCourse, String nameTeacher) {
		super();
		this.idCourse = idCourse;
		this.nameCourse = nameCourse;
		this.groupCourse = groupCourse;
		this.nameTeacher = nameTeacher;
	}

	public String getIdCourse() {
		return idCourse;
	}

	public String getNameCourse() {
		return nameCourse;
	}

	public String getGroupCourse() {
		return groupCourse;
	}

	@Override
	public String toString() {
		return this.groupCourse + " " + this.nameTeacher;
	}

}
