package com.jendareytechnologies;

public class CourseVote {
    private Course course;
    private int voteCount;

    public CourseVote(Course course, int voteCount) {
        this.course = course;
        this.voteCount = voteCount;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }
}
