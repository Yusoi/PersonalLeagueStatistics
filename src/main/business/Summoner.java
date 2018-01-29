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
    
    private int id;
    private int accountId;
    private String name;
    private int profileIconId;
    private long revisionDate;
    private int summonerLevel;
    
    public Summoner(){
        this.id = -1;
        this.accountId = -1;
        this.name = null;
        this.profileIconId = -1;
        this.revisionDate = -1;
        this.summonerLevel = -1;
    }
    
    public Summoner(int id, int accountId, String name, int profileIconId, long revisionDate, int summonerLevel){
        this.id = id;
        this.accountId = accountId;
        this.name = name;
        this.profileIconId = profileIconId;
        this.revisionDate = revisionDate;
        this.summonerLevel = summonerLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
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

    public int getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(int summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.id;
        hash = 89 * hash + this.accountId;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.profileIconId;
        hash = 89 * hash + this.summonerLevel;
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
