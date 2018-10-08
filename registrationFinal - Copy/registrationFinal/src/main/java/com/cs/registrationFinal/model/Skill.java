package com.cs.registrationFinal.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by Christeen on 10/2/2018.
 */
@Entity
@Table(name = "skill")

public class Skill {
    @Id
    @GeneratedValue
    @Column(name = "skill_id")
    private int id;

    @Column(name = "skill_name")
    @Size(min = 3, max = 100)
    private String skill_name;

    public Skill() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }

}
