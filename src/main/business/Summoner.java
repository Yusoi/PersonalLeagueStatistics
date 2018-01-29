/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.business;

import java.util.Objects;

/**
 *
 * @author yusoi
 */
public class Summoner {
    
    private long id;
    private long accountId;
    private String name;
    private int profileIconId;
    private long revisionDate;
    private long summonerLevel;
    
    public Summoner(){
        this.id = -1;
        this.accountId = -1;
        this.name = null;
        this.profileIconId = -1;
        this.revisionDate = -1;
        this.summonerLevel = -1;
    }
    
    public Summoner(long id, long accountId, String name, int profileIconId, long revisionDate, long summonerLevel){
        this.id = id;
        this.accountId = accountId;
        this.name = name;
        this.profileIconId = profileIconId;
        this.revisionDate = revisionDate;
        this.summonerLevel = summonerLevel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(int profileIconId) {
        this.profileIconId = profileIconId;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(long revisionDate) {
        this.revisionDate = revisionDate;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(long summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + (int) (this.accountId ^ (this.accountId >>> 32));
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.profileIconId;
        hash = 97 * hash + (int) (this.revisionDate ^ (this.revisionDate >>> 32));
        hash = 97 * hash + (int) (this.summonerLevel ^ (this.summonerLevel >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Summoner other = (Summoner) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.accountId != other.accountId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Summoner{" + "id=" + id + ", accountId=" + accountId + ", name=" + name + ", profileIconId=" + profileIconId + ", revisionDate=" + revisionDate + ", summonerLevel=" + summonerLevel + '}';
    } 
}
