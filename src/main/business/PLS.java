/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.business;

import java.util.regex.Pattern;
import main.data.APIWrapper;

/**
 *
 * @author yusoi
 */
public class PLS {
    
    /*
     * API KEY (VERY IMPORTANT!)
     */
    private static final String key = "RGAPI-cffcfa1b-2bfd-4b4b-86f9-0d8014d64289";

    
    private APIWrapper wrapper;

    public PLS(){
        this.wrapper = new APIWrapper(this.key);

        summonerStringParser(this.getSummonerInfo("Yusoi"));
        
    }
    
    public Summoner summonerStringParser(String summonerInfo){
        Summoner s = new Summoner();
        
        //Takes off the brackets
        String[] split1 = summonerInfo.split(Pattern.quote("{"));
        String[] split2 = split1[1].split(Pattern.quote("}"));
        
        String noBrackets = split2[0];
        
        //Separates into topics
        String[] splitTopics = noBrackets.split(Pattern.quote(","));
        
        //Parses the topics individually
        String[] value = null;
        for(int i = 0; i < splitTopics.length ;i++){
            value = splitTopics[i].split(Pattern.quote(":"));
            
            String topic = value[0].replaceAll("\"", "");
            String result = value[1].replaceAll("\"", "");
            
            switch(topic){
                case "id": s.setId(Integer.parseInt(result)); break;
                case "accountId": s.setAccountId(Integer.parseInt(result)); break;
                case "name": s.setName(result); break;
                case "profileIconId": s.setProfileIconId(Integer.parseInt(result)); break;
                case "revisionDate": s.setRevisionDate(Long.parseLong(result)); break;
                case "summonerLevel": s.setSummonerLevel(Integer.parseInt(result)); break;
            }
        }
        
        return s;
    }
    
    public String getSummonerInfo(String summonerName){
        return wrapper.getSummonerInfo(summonerName);
    }
}
