package com.Bank.HDFC.entity;

import com.fasterxml.jackson.databind.node.DoubleNode;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name ="transactions")

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String transactionId;
    private String transactionType;
    private String amount;
    private String accountNumber;
    private String status;

@CreationTimestamp
    private LocalDate createdAt;
@UpdateTimestamp
    private LocalDate modifiedAt;
}
