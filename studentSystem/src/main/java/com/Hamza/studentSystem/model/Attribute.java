package com.Hamza.studentSystem.model;

import javax.persistence.*;
import java.util.List;

//JsonBinaryType
@Entity
//@TypeDef(name = "jsonb", typeClass = Json.class)
public class Attribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String label;
    private String type;

//    @Type(type= "jsonb")
//    @Column(name="operandOptions", columnDefinition = "jsonB")
//    private OperandOptions operandOptions;


}
