package domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class u_pro {
    private Integer u_uid;
    private  String u_name;
    private  String u_job;

    public Integer getU_uid() {
        return u_uid;
    }

    public void setU_uid(Integer u_uid) {
        this.u_uid = u_uid;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_job() {
        return u_job;
    }

    public void setU_job(String u_job) {
        this.u_job = u_job;
    }

    public u_pro() {
    }

    public u_pro(String u_name, String u_job) {
        this.u_name = u_name;
        this.u_job = u_job;
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "u_name", "u_job");
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this,obj,"u_name", "u_job");
    }

    @Override
    public String toString() {
        return "u_pro{" +
                "u_uid=" + u_uid +
                ", u_name='" + u_name + '\'' +
                ", u_job='" + u_job + '\'' +
                '}';
    }
}
