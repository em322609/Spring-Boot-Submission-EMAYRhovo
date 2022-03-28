package com.example.RhovoSubmission.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/*
Role model class to define user roles
 */
@Document(collection = "roles")
public class Role {
    @Id
    private String id;
    private ERole name;
    public Role() {
    }
    public Role(ERole name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public ERole getName() {
        return name;
    }
    public void setName(ERole name) {
        this.name = name;
    }
}