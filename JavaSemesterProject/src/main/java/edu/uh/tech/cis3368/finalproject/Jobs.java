package edu.uh.tech.cis3368.finalproject;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "jobs", schema = "public", catalog = "finalproject")
public class Jobs {
    private int jobid;
    private String jobname;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jobid", nullable = false)
    public int getJobid() {
        return jobid;
    }

    public void setJobid(int jobid) {
        this.jobid = jobid;
    }

    @Basic
    @Column(name = "jobname", nullable = true, length = -1)
    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jobs that = (Jobs) o;
        return jobid == that.jobid &&
                Objects.equals(jobname, that.jobname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobid, jobname);
    }
}

/*

This is just a test because i was following the zoom record from few weeks ago
feel free to delete this class and make your own database with tables.
if you don't know how to do this i can help you. the only thing i typed here is the @GeneratedValue(), everything else
is made through assigning datasource and generate persistence unit

*/