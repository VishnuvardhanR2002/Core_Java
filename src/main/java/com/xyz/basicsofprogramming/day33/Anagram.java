package com.xyz.basicsofprogramming.day33;
import java.util.Scanner;

 class Anagram1 {
	 int flag=0;
	 char arr1[];
	 char arr2[];
	 int logic(String s1,String s2) {
		 
	 convertToArray(s1,s2);
	 if(flag!=0) {
		 return flag;
	 }
	 else {
		 sorting();
		 comparision();
	 }
	 return flag;
}
 private void comparision() {
	 System.out.println("comparing the arrays");
	 for(int i=0;i<arr1.length;i++) {
	
	 if(arr1[i]!=arr2[i]) {
		 flag=-1;
		 
	 }
	 }
	 System.out.println("comparing the arrays is completed");
	 System.out.println("==============");
 }
 
 private void sorting() {
	 char temp;
	 for(int i=0;i<arr1.length;i++) {
		 for(int j=i+1;j<arr1.length;j++) {
			 if(arr1[i]==arr2[i]) {
			 temp=arr1[i];
			 arr1[i]=arr2[j];
			 arr2[j] =temp;
		 }
	 }
 }
	 char temp1;
	 for(int i=0;i<arr1.length;i++) {
		 for(int j=i+1;j<arr1.length;j++) {
			 if(arr1[i]==arr2[i]) {
			 temp1=arr1[i];
			 arr1[i]=arr2[j];
			 arr2[j] =temp1;
			 }
		 }
	 }
	 System.out.println("sorting arrays is completed");
	 System.out.println("================");
 }
	 //sorting the second array
	 private void  convertToArray(String s1,String s2) {
		 arr1= new char[s1.length()];
		 arr2= new char[s2.length()];
		 if(s1.length()==s2.length()) {
			 for(int i=0;i<arr1.length;i++) {
			 arr1[i]=s1.charAt(i);
			 arr2[i]=s2.charAt(i);
			 }
			 }
	 else {
		 flag=-1;
		 return;
	 }
	 }
	 
	 }
	 
 public class Anagram {
	 public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	 System.out.println("enter the string-1");
	 String s1= sc.next();
	 System.out.println("enter the string-2");
	 String s2= sc.next();
	 Anagram1 a=new Anagram1();
	 int res=a.logic(s1, s2);
	 if(res==0) {
		 System.out.println("the string is anagaram");
	 }
	 else {
		 System.out.println("the string is not anagaram");
	 }
	 }
 }