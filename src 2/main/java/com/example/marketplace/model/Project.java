package com.example.marketplace.model;

import com.example.marketplace.model.ProjectProduct;
import com.example.marketplace.model.User;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="project_id")
    private int projectid;

//    @Column(name="c_user_name")
//    private String user_name;
    @Column(name ="project_name")
    private String projectname;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="user_id")
    private User user;

    //name

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "project")
    Set<ProjectProduct> projectproduct= new HashSet<>();

    //set




    public Project(){};

    public Project(int project_id,String project_name ,User user_name) {
        this.projectid = project_id;
        this.projectname = project_name;
        this.user = user_name;
    }


    public int getProject_id() {
        return projectid;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Project{" +
                "project_id=" + projectid +
                ", user=" + user +
                ", Project_name"+projectname+
                ", productList=" + projectproduct +
                '}';
    }


}
