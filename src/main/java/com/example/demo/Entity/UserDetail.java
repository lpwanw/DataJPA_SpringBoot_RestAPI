package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "user_detail")
public class UserDetail {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phone;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public UserDetail() {
    }

    public UserDetail(Long id, String phone, User user) {
        this.id = id;
        this.phone = phone;
        this.user = user;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
//
//    public User getUser() {
//        return user;
//    }

    public void setUser(User user) {
        this.user = user;
    }

//    public Long getId() {
//        return id;
//    }

    public void setId(Long id) {
        this.id = id;
    }
}
