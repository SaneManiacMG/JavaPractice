package com.sane.maniac.mg.lambdasandstreams;

import java.util.List;

public class StudentAnalysisApp {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    LocalDate eighteenYearsAgo = LocalDate.now().minusYears(18);

    students.add(new Student("John", LocalDate.of(2000, 1, 16), 76));
    students.add(new Student("Jane", LocalDate.of(2015, 7, 22), 47));
    students.add(new Student("Jack", LocalDate.of(2010, 12, 19), 52));
    students.add(new Student("Jill", LocalDate.of(1997, 6, 27), 93));

    List<Student> underageStudents = students
      .stream()
      .filter(s -> s.getDob().isBefore(eighteenYearsAgo))
      .collect(Collectors.toList());

    List<Student> studentsWithGradeAbove50 = students
      .stream()
      .filter(s -> s.getGrade() > 50)
      .collect(Collectors.toList());

    List<Student> studentsWithGradeAbove50AndUnderage = students
      .stream()
      .filter(s -> s.getGrade() > 50)
      .filter(s -> s.getDob().isBefore(eighteenYearsAgo))
      .collect(Collectors.toList());
  }
}
