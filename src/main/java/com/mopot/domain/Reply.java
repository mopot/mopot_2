package com.mopot.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Reply {
    @Id
    @SequenceGenerator(
            name="ReplySEQ",
            sequenceName="Reply_SEQ",
            allocationSize = 1
    )
    @GeneratedValue(generator="ReplySEQ")
    @Column(name="re_no")
    private Long reNo;

    @Column(name="re_detail")
    @NonNull
    private String reDetail;

    @CreatedDate
    @Column(name="re_create")
    @NonNull
    private LocalDateTime reCreate;

    @LastModifiedDate
    @Column(name="re_modify")
    @NonNull
    private LocalDateTime reModify;

    @Column(name="ref_cno")
    private Long refCno;

    @Column(name="rname")
    private String rname;

    @Column(name="ref")
    private Long ref;

    @Column(name="re_step")
    private Long reStep;

    @Column(name="re_level")
    private Long reLevel;

    public Reply(String rname, String reDetail, LocalDateTime reCreate) {
        this.rname = rname;
        this.reDetail = reDetail;
        this.reCreate = reCreate;
    }

}
