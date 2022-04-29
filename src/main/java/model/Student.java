package model;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String FIO;
    private String enrollDate;

    public Student(String FIO, String enrollDate) {
        this.FIO = FIO;
        this.enrollDate = enrollDate;

    }

    @Override
    public String toString() {
        return "Student{" +
                "FIO='" + FIO + '\'' +
                ", enrollDate='" + enrollDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(FIO, student.FIO) && Objects.equals(enrollDate, student.enrollDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIO, enrollDate);
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(String enrollDate) {
        this.enrollDate = enrollDate;
    }



}
