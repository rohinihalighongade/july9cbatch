package Stringstudy;

public class StringMethods {

	public static void main(String[] args) {
		String s="velocity";
		System.out.println("string length is "+s.length());
		//second way to print length,we can re-use the lenghth
		int lengthofstring=s.length();
		System.out.println(lengthofstring);
		System.out.println("====================================================================================");
String a="i am happy";
System.out.println(a.length());
System.out.println("====================================================================================");
//=========================================================================================================
//toUppercase &toLowerCase
System.out.println(s);
System.out.println(s.toUpperCase());
//using refrance variable
String s1=s.toUpperCase();
System.out.println(s1);
System.out.println(s1.toLowerCase());
String s2=s1.toLowerCase();
System.out.println(s2);

System.out.println("====================================================================================");
//==============================================================================
String x=("pune");
String y=("pune");
String z=("Pune");
String n=new String("pune");
String o=new String("pune");
String p=new String("PUNE");
System.out.println(x==y);//== is for memory  is depend uponin constant pool area and non constant pool area
System.out.println(z==y);
System.out.println(n==o);
System.out.println(x.equals(y));
System.out.println(z.equals(x));
System.out.println(x.equals(o));
System.out.println(o.equals(p));
System.out.println(o.equalsIgnoreCase(p));
//=========================================================================================================
System.out.println("====================================================================================");

//contains()method use
String s3=("velocity");
System.out.println(s3.contains("city"));
//using ref variables
boolean result=s3.contains("city");
System.out.println(result);
  System.out.println("=======================================================================");
  //====================================================================================
//is empty()
  String a1="pune";
  String a2="";
  String a3=" ";
  System.out.println("a1 result is "+a1.isEmpty());
  System.out.println("a2 result is "+a2.isEmpty());
  System.out.println("a3 result is "+a3.isEmpty());

//is blank()
  //===========================================================================
  System.out.println("=======================================================================");

//charat()
  String b="velocity";
  System.out.println(b.charAt(5));
  char ans=b.charAt(5);
  System.out.println("ans is "+ans);
  System.out.println("=======================================================================");
  //========================================================================================
  //EndsWith(),Starts with(),
  
	String w="Maharashtra";
	System.out.println(w.endsWith("Maharashtra"));
	System.out.println(w.startsWith("Mah"));
	System.out.println(w.startsWith("ra", 4));
//=============================================================================================
	System.out.println("=======================================================================");
	//substring ()
	String d="I am in pune";
	System.out.println(d.substring(5));
	String d1=d.substring(3);
	System.out.println(d1);
	System.out.println(d.subSequence(2, 8));
	//============================================================================================
	System.out.println("===========================================================================");
	  //concat()
	String y1="good";
	String y2="day";
	System.out.println(y1.concat(y2));
	System.out.println(y1.concat("afternoon"));
	//===============================================================================
	System.out.println("==============================================================");
	//index of()
	String m="Hello Hello";
	System.out.println(m.indexOf("h"));
	System.out.println(m.indexOf("lo"));
	System.out.println(m.lastIndexOf("l"));
	System.out.println(m.indexOf("o", 5));
	//====================================================================================
	System.out.println("==================================================================");
	//replace()
	String z1="un happy";
	System.out.println(z1.replace("un", ""));
	System.out.println(z1.replace("un", "very"));
	//==========================================================
	System.out.println("====================================================================");
	
































	}

}
