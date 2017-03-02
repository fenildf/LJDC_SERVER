package com.ljdc.pojo;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA
 * User:邹旭
 * Date:2017/2/22 0022
 * Time:下午 7:57
 * Desc:略
 */
@Entity
@Table(name = "user", schema = "server_ljdc", catalog = "")
public class UserServer {
    private int userId;
    private String phone;
    private String password;
    private String email;
    private String nickname;
    private String headImageUrl;
    private Collection<LearnLib1Server> learnLib1;
    private Collection<LearnLib2Server> learnLib2;
    private Collection<WordDevelopmentServer> wordDevelopment;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 20  , unique = true)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 20 , unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "nickname", nullable = true, length = 20)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "headImageUrl", nullable = true, length = 20)
    public String getHeadImageUrl() {
        return headImageUrl;
    }

    public void setHeadImageUrl(String headImageUrl) {
        this.headImageUrl = headImageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserServer that = (UserServer) o;

        if (userId != that.userId) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
        if (headImageUrl != null ? !headImageUrl.equals(that.headImageUrl) : that.headImageUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (headImageUrl != null ? headImageUrl.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "user")
    public Collection<LearnLib1Server> getLearnLib1() {
        return learnLib1;
    }

    public void setLearnLib1(Collection<LearnLib1Server> learnLib1) {
        this.learnLib1 = learnLib1;
    }

    @OneToMany(mappedBy = "user")
    public Collection<LearnLib2Server> getLearnLib2() {
        return learnLib2;
    }

    public void setLearnLib2(Collection<LearnLib2Server> learnLib2) {
        this.learnLib2 = learnLib2;
    }

    @OneToMany(mappedBy = "user")
    public Collection<WordDevelopmentServer> getWordDevelopment() {
        return wordDevelopment;
    }

    public void setWordDevelopment(Collection<WordDevelopmentServer> wordDevelopment) {
        this.wordDevelopment = wordDevelopment;
    }

    @Override
    public String toString() {
        return "UserServer{" +
                "userId=" + userId +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", headImageUrl='" + headImageUrl + '\'' +
                ", learnLib1ServersByUserId=" + learnLib1 +
                ", learnLib2ServersByUserId=" + learnLib2 +
                ", wordDevelopmentServersByUserId=" + wordDevelopment +
                '}';
    }
}
