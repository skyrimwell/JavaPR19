package app.Application.Classes;

import com.sun.istack.NotNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "phones")
public class Phone implements Serializable {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "owner")
    @NotNull
    private String owner;

    @OneToMany(mappedBy = "phone")
    private List<Manufacture> manufactures = new ArrayList<>();

    public Phone() {

    }

    public Phone(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }


    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Пользователь #" + id + " " + name + " " + owner;
    }
}
