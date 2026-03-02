package com.sdkwork.app.model;

public class RecentWinner {
    private String nickname;
    private String prizeName;
    private String winTime;

    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPrizeName() {
        return this.prizeName;
    }
    
    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public String getWinTime() {
        return this.winTime;
    }
    
    public void setWinTime(String winTime) {
        this.winTime = winTime;
    }
}
