package com.jojoldu.book.springboot.domain.posts;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;


//MappedSuperclass :JPA Entity 클래스가 BaseTimeEntity를 상속할 경우 필드도 칼럼으로 인식
//EntityListeners : 클래스에 Auditing 기능을 포함
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {
    // Entity가 생성되어 저장될 때 자동으로 시간 저장
    @CreatedDate
    private LocalDateTime createdDate;

    //조회한 Entity의 값을 변경할 때 시간 자동 저장
    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
