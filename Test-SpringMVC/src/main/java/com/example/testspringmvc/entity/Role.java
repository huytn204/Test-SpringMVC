package com.example.testspringmvc.entity;


import jakarta.persistence.*;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String user_id;
    private String role;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private Member member;

    public Role() {}

    public Role(Long id, String user_id, String role, Member member) {
        this.id = id;
        this.user_id = user_id;
        this.role = role;
        this.member = member;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
