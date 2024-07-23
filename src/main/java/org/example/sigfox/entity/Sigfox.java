package org.example.sigfox.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "sigfox")
public class Sigfox {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Long id;
    private String DeviceTypeId;
    private String Device;
    private String Time;
    private String SeqNumber;
    private String Data;
}