package com.vm.java.assignments;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class ScoreAnalyzer{
 private LinkedList<Integer> runsData;

 public ScoreAnalyzer(LinkedList<Integer> runsData) {
  this.runsData = runsData;
 }

    public LinkedList<Integer> getRunsData(){
        return runsData;
    }
 public void addRunsToList(int runs) {
  runsData.add(runs);
 }
 public double CalcRunRate()
 {
  double runrate=0;
  double truns=0;
  double overs=50;
  for(int i:runsData)
  {
   truns=truns+i;
  }
  
  runrate=truns/overs;
  return runrate;
 }
 public int lowestRunsScored()
 {
  Collections.sort(runsData);
  return runsData.get(0);
 }
 public void displayRuns() {
 System.out.println("Runs scored:");
  for(int i=0;i<runsData.size();i++)
  System.out.print((i+1)+"-"+runsData.get(i)+" ");
  System.out.println();
 }
	
}

 class TestScoreAnalyzer{
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  
 LinkedList<Integer> runsData=new LinkedList<Integer>();
 ScoreAnalyzer scoreanalyzer=new ScoreAnalyzer(runsData);
  System.out.println("Enter Runs:");
 String a[]=sc.nextLine().split(" ");
 for(int i=0;i<a.length;i++){
   scoreanalyzer.addRunsToList(Integer.parseInt(a[i]));
 }
 scoreanalyzer.displayRuns();
	
 //double rr=scoreanalyzer.CalcRunRate(runs);
 System.out.println("Runs rate:"+scoreanalyzer.CalcRunRate());
	
 //int lowest=scoreanalyzer.lowestRunsScored(runs);
 System.out.println("Lowest runs:"+scoreanalyzer.lowestRunsScored());
	
 System.out.println("count of players who batted:"+scoreanalyzer.getRunsData().size());

	
 }

}
 