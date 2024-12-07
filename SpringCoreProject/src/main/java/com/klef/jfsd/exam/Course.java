package com.klef.jfsd.exam;

public class Course {
	private int course_id;
	private String courseName;
	private double credits;
	private Instructor instructor;
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = credits;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", courseName=" + courseName + ", credits=" + credits
				+ ", instructor=" + instructor + "]";
	}

}
