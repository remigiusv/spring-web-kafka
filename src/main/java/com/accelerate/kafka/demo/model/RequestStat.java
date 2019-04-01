package com.accelerate.kafka.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class RequestStat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String endPoint;
    String data;
    Timestamp requestTime;
    Long responseTime;
    Timestamp updateTime;

    public RequestStat() {
    }

    public RequestStat(Long id, Long responseTime, Timestamp updateTime) {
        this.id = id;
        this.responseTime = responseTime;
        this.updateTime = updateTime;
    }

    public RequestStat(String endPoint, String data, Timestamp requestTime, Long responseTime, Timestamp updateTime) {
        this.endPoint = endPoint;
        this.data = data;
        this.requestTime = requestTime;
        this.responseTime = responseTime;
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Timestamp getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Timestamp requestTime) {
        this.requestTime = requestTime;
    }

    public Long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Long responseTime) {
        this.responseTime = responseTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
