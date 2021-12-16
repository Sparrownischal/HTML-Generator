package com.ReactComponents;

public abstract class Components {

    public String open(String tagName) {
        return ("<" + tagName + ">");
    }

    public String close(String tagName) {
        return ("</" + tagName + ">");
    }
    public String inputTag(String name,String type) {
    	
        return ("<input "+ "name = \""+ name + "\" " + "type =\""+ type + "\"/>" );
      }
    
}