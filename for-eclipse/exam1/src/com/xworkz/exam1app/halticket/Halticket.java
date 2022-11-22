package com.xworkz.exam1app.halticket;

public class Halticket {
	 private String candidateName;
	 private String subjectNames[];
	 private String usnNo;
	 private String universityName;
	 //object/class ref of another object/class it is a has a relationship
	  
	  
	 
	 public Halticket(String candidateName,String subjectNames[],String usnNo,String universityName ) {
		this.candidateName=candidateName;
		this.subjectNames=subjectNames;
		this.usnNo=usnNo;
		this.universityName=universityName;
		
	 }
	 
	 public void displayDetails() {
		 System.out.println("CandidateNmae:"+this.candidateName);
		 System.out.println("usnNo:"+this.usnNo);
		 System.out.println("universityName:"+this.universityName);
		 System.out.println("List of subject to be given by the candidates");
		 
		 for(int i=0;i<subjectNames.length;i++) {
			 System.out.println(subjectNames[i]);																																														;
		 }
         
		 
		 
	 }
}

/*cofeeshop=classname
 return type boolean
 initialize the variables
method:filter(String cofee powder,String isWaterpresent,boolean isSugarAdded){
 boolean isFiltered=false;
!=null
check wheather filter is connected or not
check if cofepowder is avsailable or not
isFiltered=true;
}*/


