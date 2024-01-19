package com.javabean;

public class Operate {
    private Student student;
    public Operate(Student student){
        this.student = student;
    }

    public void printScore(double score){
        if(student.getScore() > score){
            System.out.println("恭喜被录入了");
        }else{
            System.out.println("很遗憾");
        }
    }

}
