package vn.edu.iuh.fit.week1_lab_trantuankiet_21011961.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "log")
@NoArgsConstructor
@AllArgsConstructor
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "account_id", nullable = false, length = 50)
    private String accountId;

    @Column(name = "login_time", nullable = false)
    private Instant loginTime;

    @Column(name = "logout_time", nullable = false)
    private Instant logoutTime;

    @Column(name = "notes", nullable = false, length = 250)
    private String notes;

}