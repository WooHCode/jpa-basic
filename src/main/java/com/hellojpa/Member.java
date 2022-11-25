package com.hellojpa;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Member {
    @Id
    private Long id;
    @Column(name = "name")  // 컬럼 이름선정
    private String username;
    private Integer age;
    @Enumerated(EnumType.STRING)  // ENUM타입 설정가능, 무조건 String으로 사용
    private RoleType roleType;
    @Temporal(TemporalType.TIMESTAMP)  // 시간 설정, JAVA8부터 LocalDate를 사용하면 됨
    private Date createdDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Lob  // varchar를 넘어서는 큰 데이터, 문자는 CLob으로 나머지는 BLob으로 매핑
    private String description;

    public Member(){

    }
}
