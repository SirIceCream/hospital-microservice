package io.everyonecodes.springmysql.drhouseaccountancy.data;

import jakarta.persistence.*;

@Entity
public class Invoice {
    @Id
    @GeneratedValue
    private Long id;

    private double cost = 90.00;
    private boolean paid = false;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public Invoice() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
