package com.calderon.denv.pep.model.app;

import com.calderon.denv.pep.constant.DocumentType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "persons", schema = "app")
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  @Column(name = "name", nullable = false)
  private String name;

  @NotBlank
  @Column(name = "last_name", nullable = false)
  private String lastName;

  @NotBlank
  @Column(name = "gender", nullable = false)
  private String gender;

  @NotNull
  @Temporal(TemporalType.DATE)
  @Column(name = "birth_date", nullable = false)
  private LocalDate birthDate;

  @NotNull
  @Column(name = "document_type", nullable = false, length = 4)
  @Enumerated(EnumType.STRING)
  private DocumentType documentType;

  @NotBlank
  @Column(name = "document_number", nullable = false, length = 20)
  private String documentNumber;

  @Email
  @NotBlank
  @Column(name = "email", nullable = false, length = 100)
  private String email;

  @NotBlank
  @Column(name = "phone", nullable = false, length = 20)
  private String phone;
}
