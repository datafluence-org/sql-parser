package com.datafluence.sqlparser.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Onboard {
    @Id
    private String metric_name;
    private String definition;
}
