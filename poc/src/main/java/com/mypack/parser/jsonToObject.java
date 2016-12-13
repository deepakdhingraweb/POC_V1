package com.mypack.parser;

import java.io.Serializable;

public class jsonToObject implements Serializable{
	public static final long serialVersionUID = 7474778723687L;
	public   inputReference inputData;

    public jsonToObject(inputReference inputData){
        this.inputData = inputData;
    }
	
}

