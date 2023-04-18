package com.feuji.commonmodel;import com.fasterxml.jackson.annotation.JsonIgnore;import jakarta.persistence.*;@Entity@Table(name = "marks_table")public class Marks {    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)    private Long id;    @Column(name = "total_Marks")    private int totalMarks;    private int marks;    @JsonIgnore    @ManyToOne(cascade = CascadeType.ALL)    @JoinColumn(nullable = false)    private User user;    @JsonIgnore    @OneToOne(cascade = CascadeType.ALL)    @JoinColumn(name = "exam_id", nullable = false)    private Exam exam;    public Marks(int totalMarks, int marks, User user, Exam exam) {        this.totalMarks = totalMarks;        this.marks = marks;        this.user = user;        this.exam = exam;    }       public Long getId() {		return id;	}	public void setId(Long id) {		this.id = id;	}	public int getTotalMarks() {		return totalMarks;	}	public void setTotalMarks(int totalMarks) {		this.totalMarks = totalMarks;	}	public int getMarks() {        return marks;    }    public void setMarks(int marks) {        this.marks = marks;    }    public User getUser() {        return user;    }    public void setUser(User user) {        this.user = user;    }    public Exam getExam() {        return exam;    }    public void setExam(Exam exam) {        this.exam = exam;    }    public Marks() {    }}