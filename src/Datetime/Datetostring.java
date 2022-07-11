package Datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datetostring {
public static  void main(String[] args) {

Date date = new Date();
SimpleDateFormat DateFor = new SimpleDateFormat("dd:MMM:yyyy & hh:mm:ss a");
String stringDate= DateFor.format(date);
System.out.println(stringDate);



Date d=new Date();
SimpleDateFormat q=new SimpleDateFormat("MM/dd/yyyy");
String a=q.format(d);
System.out.println(a);
}
}
