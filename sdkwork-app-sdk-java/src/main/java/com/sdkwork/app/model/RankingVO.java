package com.sdkwork.app.model;

public class RankingVO {
    private String createdAt;
    private String updatedAt;
    private String rankingType;
    private String period;
    private List<RankInfoVO> rankings;
    private RankInfoVO myRank;
    private Integer totalUsers;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getRankingType() {
        return this.rankingType;
    }
    
    public void setRankingType(String rankingType) {
        this.rankingType = rankingType;
    }

    public String getPeriod() {
        return this.period;
    }
    
    public void setPeriod(String period) {
        this.period = period;
    }

    public List<RankInfoVO> getRankings() {
        return this.rankings;
    }
    
    public void setRankings(List<RankInfoVO> rankings) {
        this.rankings = rankings;
    }

    public RankInfoVO getMyRank() {
        return this.myRank;
    }
    
    public void setMyRank(RankInfoVO myRank) {
        this.myRank = myRank;
    }

    public Integer getTotalUsers() {
        return this.totalUsers;
    }
    
    public void setTotalUsers(Integer totalUsers) {
        this.totalUsers = totalUsers;
    }
}
