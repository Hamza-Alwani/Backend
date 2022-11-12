package com.Hamza.studentSystem.model;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.Data;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.List;

//JsonBinaryType
@Data
@Entity
@TypeDef(name = "json", typeClass = JsonBinaryType.class)
public class Attribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String label;
    private String type;

    @Type(type= "json")
    @Column(name="operand_options", columnDefinition = "json")
    private List<OperandOptions> operandOptions;

    public Attribute() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<OperandOptions> getOperandOptions() {
        return operandOptions;
    }

    public void setOperandOptions(List<OperandOptions> operandOptions) {
        this.operandOptions = operandOptions;
    }
}
