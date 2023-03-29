package src.main.java.com.aadilrafiq.demo.model.Employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private int id;
    private String language;

    private String framework;

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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getframework() {
        return framework;
    }

    public void setframework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                "id=" + id +
                ", language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                '}';
    }
}