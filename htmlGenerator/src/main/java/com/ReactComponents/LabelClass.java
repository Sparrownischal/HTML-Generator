package com.ReactComponents;
public class LabelClass extends Components {

    public String html() {
        String tagName = "html";
        String htmlElements = head()  + body() +   "\n";
        return openAndCloseTag(tagName, htmlElements);
    }
    private String openAndCloseTag(String tagName, String mid) {
        return "\n"+open(tagName)+mid+close(tagName);
    }
    private String head() {
        String tagName ="head";
        return openAndCloseTag(tagName, title()+"\n");
    }
    private String title() {
        String tagName = "title";
        String text = "HTML Generator";
        return openAndCloseTag(tagName, text);
    }
    private String body() {
        String tagName = "body";
        String bodyElements = h1() + label("First Name :") +
        		input("firstname", "text") + "<br>"+
        		label("Last Name :") + input("lastname","text") +  "<br>"+
        		label("Gender :")+ 
        		select("male","female","others" ) +
        		label(" Are you single? :")+
        		input("single","radio" )+label("Yes")+
        		input("single","radio")+ label("No")+
        		 "<br>"+
        		button() + "\n";
        return openAndCloseTag(tagName, bodyElements);
    }
    private String h1() {
        String tagName = "h1";
        String text = "Input";
        return openAndCloseTag(tagName, text);
    }
    private String label(String text) {
        String tagName = "label";
        
        return openAndCloseTag(tagName, text) ;
    }


    private String input(String inputName, String inputType) {
        return inputTag(inputName, inputType) ;
    }
    private String select(String option1,String option2,String option3) {
        return (
          "\n" +
          this.open("select") +
          this.open("option") +
          option1 +
          this.close("option") +
          "\n" +
          this.open("option") +
          option2 +
          this.close("option") +
          "\n" +
          this.open("option") +
          option3 +
          this.close("option") +
          "\n" +
          this.close("select") +
          "<br>"
        );
      }

    
    private String button() {
        String tagName = "button";
        String text = "Submit";
        return "\n"+open(tagName+" type = 'Submit'")+text+close(tagName);
    }
}