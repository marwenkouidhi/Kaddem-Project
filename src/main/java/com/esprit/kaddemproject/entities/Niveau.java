package com.esprit.kaddemproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public enum Niveau {
    JUNIOR, SENIOR, EXPERT
}
