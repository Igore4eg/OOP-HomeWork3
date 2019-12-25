package com.gmail.viazminiv;

import java.util.Arrays;

public class Group {

	private Student[] gr = new Student[10];

	public Group() {
		super();
	}

	public void addStudent(Student student) throws MyException {
		for (int i = 0; i < gr.length; i++) {
			if (gr[i] == null) {
				gr[i] = student;
				return;
			}
		}
		throw new MyException();
	}

	public Student deleteStudent(String name) {

		for (int i = 0; i < gr.length; i++) {
			if (gr[i] != null && name.equals(gr[i].getName())) {
				gr[i] = null;
			}

		}
		return null;

	}

	public Student searchStudent(String name) {
		for (Student student : gr) {
			if (student != null && name.equalsIgnoreCase(student.getName()));
			return student;
		}
		return null;
	}

	private void sort() {

		Arrays.sort(gr, new SortedByName());

	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sort();
		for (Student student : gr) {
			if (student == null) {
				break;
			}
			sb.append(student);
			sb.append("\n");
		}

		return sb.toString();
	}

}
