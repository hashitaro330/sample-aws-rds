package jp.hashitaro.sample.aws.rds.domain.model.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@IdClass(EmailPK.class)
public class Email {
    private long userId;
    private long emailNo;
    private String email;
    private Integer ver;
    private Timestamp lastUpdatedAt;
    private User usrByUserId;

    @Id
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "email_no", nullable = false)
    public long getEmailNo() {
        return emailNo;
    }

    public void setEmailNo(long emailNo) {
        this.emailNo = emailNo;
    }

    @Basic
    @Column(name = "email", nullable = true, length = -1)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "ver", nullable = true)
    @Version
    public Integer getVer() {
        return ver;
    }

    public void setVer(Integer ver) {
        this.ver = ver;
    }

    @Basic
    @Column(name = "last_updated_at", nullable = true)
    public Timestamp getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Timestamp lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email1 = (Email) o;
        return userId == email1.userId &&
                emailNo == email1.emailNo &&
                Objects.equals(email, email1.email) &&
                Objects.equals(ver, email1.ver) &&
                Objects.equals(lastUpdatedAt, email1.lastUpdatedAt);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, emailNo, email, ver, lastUpdatedAt);
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false, insertable = false, updatable = false)
    public User getUsrByUserId() {
        return usrByUserId;
    }

    public void setUsrByUserId(User usrByUserId) {
        this.usrByUserId = usrByUserId;
    }
}

