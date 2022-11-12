package com.Hamza.studentSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperandOptions implements Serializable {
    @Serial
    private final static long serialVersionUID = 7702L;

    private String value;
    private String label;

}
