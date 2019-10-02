package assignment2;
import java.io.*;
import java.util.Scanner;

public class q30 {

	private String project_id;
	private String project_name;
	private String[] defect_id = new String[10];
	private String[] defect_disc = new String[10];
	private String[] severity = new String[10];
	private String[] defect_status = new String[10];

	private int count=0;
	private int k=0;

	q30(String id, String name){
	project_id=id;
	project_name=name;
	}

	public void addDefect(String id, String disc, String sev){
	defect_id[count]=id;
	defect_disc[count]=disc;
	severity[count]=sev;
	defect_status[count]="New";
	count++;
	}

	public void printDefects(){
	System.out.println("Defect ID \t\tDisc \t\t\t\tSeverity \t\tStatus");
	for(int i=0; i<count; i++){
	if(severity[i].equals("High")){
	System.out.println(defect_id[i]+"\t\t\t"+defect_disc[i]+"\t\t\t"+severity[i]+"\t\t\t"+defect_status[i]);
	}
	}
	for(int i=0; i<count; i++){
	if(severity[i].equals("Medium")){
	System.out.println(defect_id[i]+"\t\t\t"+defect_disc[i]+"\t\t\t"+severity[i]+"\t\t\t"+defect_status[i]);
	}
	}
	for(int i=0; i<count; i++){
	if(severity[i].equals("Low")){
	System.out.println(defect_id[i]+"\t\t\t"+defect_disc[i]+"\t\t\t"+severity[i]+"\t\t\t"+defect_status[i]);
	}
	}
	}

	public boolean selectDefect(String id){
	for(int i=0; i<count; i++){
	if(defect_id[i].equals(id)){
	System.out.println(id+" found!");
	k=i;
	return true;
	}
	}
	System.out.println(id+" Not found!");
	return false;
	}

	public void devOpenDefect(){
	defect_status[k]="Open";
	}

	public void devRejectDefect(){
	defect_status[k]="Rejected";
	}

	public void devFixDefect(){
	defect_status[k]="Fixed";
	}

	public void qaReopenDefect(){
	defect_status[k]="Re-Open";
	}

	public void qaCloseDefect(){
	defect_status[k]="Closed";
	}
	}

