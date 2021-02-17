package com.vika.springit.domain;

import io.micrometer.core.lang.NonNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Role {


        @Id
        @GeneratedValue
        private Long id;

        @NonNull
        private String name;

        @ManyToMany( mappedBy = "roles")
        private Collection<User> users;

}
