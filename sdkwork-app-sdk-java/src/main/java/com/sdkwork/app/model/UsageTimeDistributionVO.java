package com.sdkwork.app.model;

public class UsageTimeDistributionVO {
    private Integer midnight;
    private Integer morning;
    private Integer afternoon;
    private Integer evening;

    public Integer getMidnight() {
        return this.midnight;
    }
    
    public void setMidnight(Integer midnight) {
        this.midnight = midnight;
    }

    public Integer getMorning() {
        return this.morning;
    }
    
    public void setMorning(Integer morning) {
        this.morning = morning;
    }

    public Integer getAfternoon() {
        return this.afternoon;
    }
    
    public void setAfternoon(Integer afternoon) {
        this.afternoon = afternoon;
    }

    public Integer getEvening() {
        return this.evening;
    }
    
    public void setEvening(Integer evening) {
        this.evening = evening;
    }
}
