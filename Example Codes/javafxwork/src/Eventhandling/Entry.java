package Eventhandling;

/**********************************************
Workshop 8
Course:Jac444 semester4
Last Name:Ryo
First Name:Aoyama
ID:166137190
Section:NBB
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature Ryo Aoyama
Date:<submission date> 4/3/2022
**********************************************/ 
public class Entry {
   private String country;
   private String city;
   private String from;
   private String to;
   private String description;
   private String rating;
   
   public Entry(String country, String city, String from, String to, String desc, String rating) {
	   this.country = country;
	   this.city = city;
	   this.from = from;
	   this.to = to;
	   this.description = desc;
	   this.rating = rating;
   }
   
   public String getCountry() {
	   return this.country;
   }
   
   public String getCity() {
	   return this.city;
   }
   
   public String getFrom() {
	   return this.from;
   }
   
   public String getTo() {
	   return this.to;
   }
   
   public String getDescription() {
	   return this.description;
   }
   
   public String getRating() {
	   return this.rating;
   }
}
