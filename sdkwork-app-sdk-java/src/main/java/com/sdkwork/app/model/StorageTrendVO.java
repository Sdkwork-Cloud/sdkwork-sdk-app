package com.sdkwork.app.model;

public class StorageTrendVO {
    private Integer last7Days;
    private Integer last30Days;
    private Integer last90Days;
    private Integer avgDailyGrowth;

    public Integer getLast7Days() {
        return this.last7Days;
    }
    
    public void setLast7Days(Integer last7Days) {
        this.last7Days = last7Days;
    }

    public Integer getLast30Days() {
        return this.last30Days;
    }
    
    public void setLast30Days(Integer last30Days) {
        this.last30Days = last30Days;
    }

    public Integer getLast90Days() {
        return this.last90Days;
    }
    
    public void setLast90Days(Integer last90Days) {
        this.last90Days = last90Days;
    }

    public Integer getAvgDailyGrowth() {
        return this.avgDailyGrowth;
    }
    
    public void setAvgDailyGrowth(Integer avgDailyGrowth) {
        this.avgDailyGrowth = avgDailyGrowth;
    }
}
