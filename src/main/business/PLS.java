package main.business;

import main.data.APIWrapper;

public class PLS {

    private static final String key = "RGAPI-cffcfa1b-2bfd-4b4b-86f9-0d8014d64289";

    private APIWrapper wrapper;

    public PLS(){
        this.wrapper = new APIWrapper(this.key);

        System.out.println(this.wrapper.getChampionMastery(92,"Yusoi"));
    }


}
