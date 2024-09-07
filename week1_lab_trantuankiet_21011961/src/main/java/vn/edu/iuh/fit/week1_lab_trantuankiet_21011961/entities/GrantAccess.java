package vn.edu.iuh.fit.week1_lab_trantuankiet_21011961.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.checkerframework.checker.units.qual.A;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "grant_access")
@AllArgsConstructor
@NoArgsConstructor
public class GrantAccess {
    @EmbeddedId
    private GrantAccessId id;

    @MapsId("accountId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Column(name = "is_grant", nullable = false)
    private Boolean isGrant = false;

    @Column(name = "note", length = 250)
    private String note;

}