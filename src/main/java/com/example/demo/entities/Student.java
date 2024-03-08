package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
        @Id
        private int rollNo;
        private String name;
        private int standard;
        private String school;
        private int percentage;

        public Student() {
                System.out.println("Student object created!");
        }

        public Student(int rollNo, String name, int standard, String school, int percentage) {
                this.rollNo = rollNo;
                this.name = name;
                this.standard = standard;
                this.school = school;
                this.percentage = percentage;
        }

        public int getRollNo() {
                return rollNo;
        }

        public void setRollNo(int rollNo) {
                this.rollNo = rollNo;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getStandard() {
                return standard;
        }

        public void setStandard(int standard) {
                this.standard = standard;
        }

        public String getSchool() {
                return school;
        }

        public void setSchool(String school) {
                this.school = school;
        }

        public int getPercentage() {
                return percentage;
        }

        public void setPercentage(int percentage) {
                this.percentage = percentage;
        }

}
