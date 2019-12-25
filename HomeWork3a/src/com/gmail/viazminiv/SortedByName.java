package com.gmail.viazminiv;

import java.util.Comparator;

public class SortedByName implements Comparator<Student> {

	@Override
	public int compare(Student name1, Student name2) {
		
		String str1 = name1.getName();
        String str2 = name2.getName();
		
        return str1.compareTo(str2);
	}

}
