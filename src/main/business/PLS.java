/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.business;

import java.util.regex.Pattern;
import main.data.APIWrapper;
import java.io.IOException;

/**
 *
 * @author yusoi
 */
public class PLS {
    
    /*
     * API KEY (VERY IMPORTANT!)
     */
    private static final String key = "RGAPI-61bc91dd-748d-4806-b89c-0426f93f571c";

    
    private APIWrapper wrapper;

    public PLS(){
        this.wrapper = new APIWrapper(this.key);
    }
    
    public Summoner summonerStringParser(String summonerName, String region) throws IOException{
        
        try{
            
            Summoner s = new Summoner();
            String summonerInfo = wrapper.getSummonerInfo(summonerName,region);
        
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

        }catch(IOException e){
            throw(e);
        }
    }
    
    public String versionStringParser(String region){;
        String versionInfo = wrapper.getGameVersion(region);
        
        //Takes off the brackets
        String[] split1 = versionInfo.split(Pattern.quote("["));
        String[] split2 = split1[1].split(Pattern.quote("]"));
        
        String noBrackets = split2[0];
        
        //Separates into topics
        String[] splitTopics = noBrackets.split(Pattern.quote(","));
        
        //Parses the topics individually
        String v = splitTopics[0].replaceAll("\"","");
        
        System.out.println(v);
        return v;
    }
}
