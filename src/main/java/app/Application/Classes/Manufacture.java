package app.Application.Classes;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "manufactures")
public class Manufacture {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "name")
    @NotNull
    private String name;

    @CreationTimestamp
    @Column(name = "address")
    private LocalDateTime address;

    public Manufacture() {

    }
    public Manufacture(String name, LocalDateTime address) {
        this.name = name;
        this.address = address;
    }

    @ManyToOne
    private Phone phone;

    public Phone getPhone()
    {
        return phone;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getAddress() {
        return address;
    }

}
