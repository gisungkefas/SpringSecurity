package com.kefas.SpringSecurity.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Indexed;
import java.io.Serializable;
import java.util.Date;

@Document("users")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 2L;
    @Id
    private String id;
    @Indexed(unique = true)
    private String uuid;

    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, length = 50)
    private String emailAddress;

    @Column(nullable = false, length = 10)
    private Status status;

    @Column(nullable = false, length = 50)
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;

    User(){
        this.createdDate= new Date();
        this.updatedDate = new Date();
    }
    @PrePersist
    private void setCreatedAt() {
        createdDate = new Date();
    }
    @PreUpdate
    private void setUpdatedAt() {
        updatedDate = new Date();
    }

}
