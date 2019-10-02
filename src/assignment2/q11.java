package assignment2;
	import java.util.Scanner;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.concurrent.TimeUnit;
	import java.time.Duration;
	public class q11{
		public static void main(String args[]) throws Exception{
			
			
			System.out.println("---------part-1--------");
			String time1="07:45:33 am";
			String time2="12:33:45 pm";

	
			StringBuilder sb = new StringBuilder();
			int h1=0,m1=0,s1=0,t1=0,h2=0,m2=0,s2=0,t2=0,h3=0,m3=0,s3=0,t3=0;

			sb.append(time1.charAt(0));
			sb.append(time1.charAt(1));
			String str1=sb.toString();
			h1=Integer.parseInt(str1);
			if(time1.charAt(time1.length()-2)=='p'){
			h1=h1+12;
			}
			h1=h1*60*60;

			sb.setLength(0);
			sb.append(time1.charAt(3));
			sb.append(time1.charAt(4));
			String str2=sb.toString();
			m1=Integer.parseInt(str2);
			m1=m1*60;

			sb.setLength(0);
			sb.append(time1.charAt(6));
			sb.append(time1.charAt(7));
			String str3=sb.toString();
			s1=Integer.parseInt(str3);

			t1=h1+m1+s1;

			sb.setLength(0);
			sb.append(time2.charAt(0));
			sb.append(time2.charAt(1));
			String str4=sb.toString();
			h2=Integer.parseInt(str4);
			if(time2.charAt(time2.length()-2)=='p'){
			h2=h2+12;
			}
			h2=h2*60*60;

			sb.setLength(0);
			sb.append(time2.charAt(3));
			sb.append(time2.charAt(4));
			String str5=sb.toString();
			m2=Integer.parseInt(str5);
			m2=m2*60;

			sb.setLength(0);
			sb.append(time2.charAt(6));
			sb.append(time2.charAt(7));
			String str6=sb.toString();
			s2=Integer.parseInt(str6);

			t2=h2+m2+s2;

			if(t1>t2){
				t3=t1-t2;
			}
			else{
				t3=t2-t1;
			}

			h3=t3/3600;
			if(t3>3600){
				m3=(t3-(h3*3600))/60;
			}
			else{
				m3=t3/60;
			}
			s3=t3-(h3*3600)-(m3*60);
			System.out.println("Time interval between 2 times is : "+h3+"h"+":"+m3+"m"+":"+s3+"s");

			String time3 = "09:46:54";
			String time4 = "04:17:56";

			SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
			Date date1 = format.parse(time3);
			Date date2 = format.parse(time4);
			long diff;
			if(date1.getTime()>date2.getTime()){
				diff = date1.getTime() - date2.getTime();
			}
			else{
				diff = date2.getTime() - date1.getTime();
			}
			long sec=diff/1000;

			long hours = TimeUnit.SECONDS.toHours(sec);
			long minutes = TimeUnit.SECONDS.toMinutes(sec) - (TimeUnit.SECONDS.toHours(sec)* 60);
			long seconds = TimeUnit.SECONDS.toSeconds(sec) - (TimeUnit.SECONDS.toMinutes(sec) *60);

			System.out.println(hours+"H"+" "+minutes+"M"+" "+seconds+"S");

			Duration dur = Duration.ofSeconds(sec);
			String output = dur.toString();
			System.out.println(output +" ");
		
		System.out.println("---------part-2--------");
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first time : (hh:mm:ss pm/am)");
		String time11=scanner.nextLine();
		System.out.println("Enter next time : (hh:mm:ss pm/am)");
		String time22=scanner.nextLine();
		
		}
	}

