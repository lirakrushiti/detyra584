/* Ky program ben llogaritjen e d(distances) nga formula e dhene d=V0*t+1/2*a*t*t duke paraqitur rezultatin grafikisht ku t(koha)
eshte e percaktuar te jete 1s,2s,3s,....,10s ndersa vlerat e V0(shpejtesia fillestare) dhe a(nxitimi) jane te dhena sikur vlera hyrese
nga perdoruesi i programit.*/

//importimi in librarive te nevojshme
import java.awt.*; 
import javax.swing.*;

class D584 extends JPanel
{
   int width = 800;//gjeresia e panelit
   int height= 600;//gjatesia e panelit
   private String nxitimi=JOptionPane.showInputDialog("Vendose vleren e nxitimit , a :"); //vlera hyrese a
   private String sh_fillestare=JOptionPane.showInputDialog("Vendose vleren e shpejtesise fillestare , V0 :");//vlera hyrese V0
   //kthimi prej string ne double i te dy vlerave hyrese
   private double a = new Double(nxitimi).doubleValue();
   private double V0 = new Double(sh_fillestare).doubleValue();

  //percaktimi i t sipas vlerave te dhena ne detyre t=1,2....,10
   private int t1=0;
   private int t2=1;
   private int t3=2;
   private int t4=3;
   private int t5=4;
   private int t6=5;
   private int t7=6;
   private int t8=7;
   private int t9=8;
   private int t10=9;
   private int t11=10;
   
   //llogaritja e distances ne baze te formules dhe vlerave te dhena
   private double distance1 = V0*t1+(1/2.0)*a*Math.pow(t1,2);
   private double distance2 = V0*t2+(1/2.0)*a*Math.pow(t2,2);
   private double distance3 = V0*t3+(1/2.0)*a*Math.pow(t3,2);
   private double distance4 = V0*t4+(1/2.0)*a*Math.pow(t4,2);
   private double distance5 = V0*t5+(1/2.0)*a*Math.pow(t5,2);
   private double distance6 = V0*t6+(1/2.0)*a*Math.pow(t6,2);
   private double distance7 = V0*t7+(1/2.0)*a*Math.pow(t7,2);
   private double distance8 = V0*t8+(1/2.0)*a*Math.pow(t8,2);
   private double distance9 = V0*t9+(1/2.0)*a*Math.pow(t9,2);
   private double distance10 = V0*t10+(1/2.0)*a*Math.pow(t10,2);
   private double distance11 = V0*t11+(1/2.0)*a*Math.pow(t11,2);
   
   //kthimi i rezultateve ne string per perdorim ne grafikme funksionin drawString
   String d1_label = String.valueOf(distance1+"m");
   String d2_label = String.valueOf(distance2+"m");
   String d3_label = String.valueOf(distance3+"m");
   String d4_label = String.valueOf(distance4+"m");
   String d5_label = String.valueOf(distance5+"m");
   String d6_label = String.valueOf(distance6+"m");
   String d7_label = String.valueOf(distance7+"m");
   String d8_label = String.valueOf(distance8+"m");
   String d9_label = String.valueOf(distance9+"m");
   String d10_label = String.valueOf(distance10+"m");
   String d11_label = String.valueOf(distance11+"m");
   
   //percaktimi i pikave filluese dhe mbaruese te boshteve ox dhe oy
   private int x_pos=width/10;
   private int y_pos=height-height/10;
   private int x_endpos= width - x_pos;
   private int y_endposx = height - height/10;
   private int y_endposy = height/10;
  //percaktimi i distancave mes pikave te t(kohes) qe do te vendosen ne boshtin ox
   private int points_distance=(width*8)/100;
   
   //percaktimi i pozitave te pikave te t(kohes) ne boshtin ox me distanca te barabarta nga njera-tjetra
   private int t1_xpos=x_pos;
   public int t2_xpos=x_pos+points_distance;
   public int t3_xpos=x_pos+(points_distance)*2;
   public int t4_xpos=x_pos+(points_distance)*3;
   public int t5_xpos=x_pos+(points_distance)*4;
   public int t6_xpos=x_pos+(points_distance)*5;
   public int t7_xpos=x_pos+(points_distance)*6;
   public int t8_xpos=x_pos+(points_distance)*7;
   public int t9_xpos=x_pos+(points_distance)*8;
   public int t10_xpos=x_pos+(points_distance)*9;
   public int t11_xpos=x_pos+(points_distance)*10;
  
   // od(oval diametre) - diametri i pikave te grafikut
      public int od=5;
   
   //k - koeficienti i kompresimit dhe zgjerimit te grafikut per qellim qe te duken te gjitha pikat pavarsisht vlerave te d
   public double k = (height*75/100.0)/distance11;
 //  public double k = 1;
   public D584()
   {  //korniza
      JFrame korniza = new JFrame();
      korniza.getContentPane().add(this);
      korniza.setSize(width+width/15,height+width/15);
      korniza.setVisible(true);
      korniza.setTitle("5.8.4");
   }
   public void paintComponent(Graphics g) //metoda per elemtentet grafike te programit
   {  
      
      g.setColor(Color.white); //vendosja e ngjyres qe do te perdoret , ngjyra e prapavijes
      g.fillRect(0,0,width+width/20,height+width/20); // mbushja e prapavijes me ngjyren e zgjedhur
     
     
      g.setColor(Color.black); // vendosja e ngjyres se zeze te "lapsit" qe do perodret ne vijim
      g.drawLine(x_pos,y_pos,x_endpos,y_endposx);//boshti ox
      g.drawLine(x_pos,y_pos,x_pos,y_endposy);//boshti oy
      g.drawString("d",x_pos-width/40,y_endposy-width/40); //emerimi i boshtit oy i cili paraqet vlerat e d
      g.drawString("t",x_endpos,y_endposx+width/20); // emerimi i boshtit ox i cili paraqet vlerat e t
   
      //vizatimi i pikave te t(kohes) ne boshtin ox me ngjyren e zgjedhur se fundmi
      g.fillOval(t1_xpos-2,y_pos-2,od,od);
      g.fillOval(t2_xpos-2,y_pos-2,od,od);
      g.fillOval(t3_xpos-2,y_pos-2,od,od);
      g.fillOval(t4_xpos-2,y_pos-2,od,od);
      g.fillOval(t5_xpos-2,y_pos-2,od,od);
      g.fillOval(t6_xpos-2,y_pos-2,od,od);
      g.fillOval(t7_xpos-2,y_pos-2,od,od);
      g.fillOval(t8_xpos-2,y_pos-2,od,od);
      g.fillOval(t9_xpos-2,y_pos-2,od,od);
      g.fillOval(t10_xpos-2,y_pos-2,od,od);
      g.fillOval(t11_xpos-2,y_pos-2,od,od);
      //vendosja e emerimit te pikave te t(kohes) ne pozicionet perkatese
      g.drawString("0s",t1_xpos-od/2,y_pos+width/40);
      g.drawString("1s",t2_xpos-od/2,y_pos+width/40);
      g.drawString("2s",t3_xpos-od/2,y_pos+width/40);
      g.drawString("3s",t4_xpos-od/2,y_pos+width/40);
      g.drawString("4s",t5_xpos-od/2,y_pos+width/40);
      g.drawString("5s",t6_xpos-od/2,y_pos+width/40);
      g.drawString("6s",t7_xpos-od/2,y_pos+width/40);
      g.drawString("7s",t8_xpos-od/2,y_pos+width/40);
      g.drawString("8s",t9_xpos-od/2,y_pos+width/40);
      g.drawString("9s",t10_xpos-od/2,y_pos+width/40);
      g.drawString("10s",t11_xpos-od/2,y_pos+width/40);
     
      
      //vizatimi i pikave me koordinatat perkatese te percaktuara nga t(koha) dhe d(sipas formules se llogaritur)
      g.setColor(Color.black); // "lapsi" tani ka ngjyren e zeze
      g.fillOval(t1_xpos-2,y_pos-(int)(distance1*k)-2,od,od);
      g.fillOval(t1_xpos-2,y_pos-(int)(distance2*k)-2,od,od);
      g.fillOval(t1_xpos-2,y_pos-(int)(distance3*k)-2,od,od);
      g.fillOval(t1_xpos-2,y_pos-(int)(distance4*k)-2,od,od);
      g.fillOval(t1_xpos-2,y_pos-(int)(distance5*k)-2,od,od);
      g.fillOval(t1_xpos-2,y_pos-(int)(distance6*k)-2,od,od);
      g.fillOval(t1_xpos-2,y_pos-(int)(distance7*k)-2,od,od);
      g.fillOval(t1_xpos-2,y_pos-(int)(distance8*k)-2,od,od);
      g.fillOval(t1_xpos-2,y_pos-(int)(distance9*k)-2,od,od);
      g.fillOval(t1_xpos-2,y_pos-(int)(distance10*k)-2,od,od);
      g.fillOval(t1_xpos-2,y_pos-(int)(distance11*k)-2,od,od);
     
     //vizatimi i vijave te cilat lidhin pikat e sapovizatuara per te formuar grafikune kerkuar
     g.setColor(Color.red); // "lapsi tani ka ngjyren e kuqe
     g.drawLine(t1_xpos,y_pos,t2_xpos,y_pos-(int)(distance2*k));
     g.drawLine(t2_xpos,y_pos-(int)(distance2*k),t3_xpos,y_pos-(int)(distance3*k));
     g.drawLine(t3_xpos,y_pos-(int)(distance3*k),t4_xpos,y_pos-(int)(distance4*k));
     g.drawLine(t4_xpos,y_pos-(int)(distance4*k),t5_xpos,y_pos-(int)(distance5*k));
     g.drawLine(t5_xpos,y_pos-(int)(distance5*k),t6_xpos,y_pos-(int)(distance6*k));
     g.drawLine(t6_xpos,y_pos-(int)(distance6*k),t7_xpos,y_pos-(int)(distance7*k));
     g.drawLine(t7_xpos,y_pos-(int)(distance7*k),t8_xpos,y_pos-(int)(distance8*k));
     g.drawLine(t8_xpos,y_pos-(int)(distance8*k),t9_xpos,y_pos-(int)(distance9*k));
     g.drawLine(t9_xpos,y_pos-(int)(distance9*k),t10_xpos,y_pos-(int)(distance10*k));
     g.drawLine(t10_xpos,y_pos-(int)(distance10*k),t11_xpos,y_pos-(int)(distance11*k));
     
     /* vizatimi i vijave te cilat lidhin boshtin ox dhe oy me pikat ne koordinate , ne menyre qe me leht te
     kuptohet se cilat vlera jane fitar dhe paraqiten ne grafik :   */
   
   
   //prej boshtit ox
     g.setColor(Color.gray);// "lapsi" ka ngjyren e hirt
     g.drawLine(t2_xpos,y_pos,t2_xpos,y_pos-(int)(distance2*k));
     g.drawLine(t3_xpos,y_pos,t3_xpos,y_pos-(int)(distance3*k));
     g.drawLine(t4_xpos,y_pos,t4_xpos,y_pos-(int)(distance4*k));
     g.drawLine(t5_xpos,y_pos,t5_xpos,y_pos-(int)(distance5*k));
     g.drawLine(t6_xpos,y_pos,t6_xpos,y_pos-(int)(distance6*k));
     g.drawLine(t7_xpos,y_pos,t7_xpos,y_pos-(int)(distance7*k));
     g.drawLine(t8_xpos,y_pos,t8_xpos,y_pos-(int)(distance8*k));
     g.drawLine(t9_xpos,y_pos,t9_xpos,y_pos-(int)(distance9*k));
     g.drawLine(t10_xpos,y_pos,t10_xpos,y_pos-(int)(distance10*k));
     g.drawLine(t11_xpos,y_pos,t11_xpos,y_pos-(int)(distance11*k));
     //prej boshtit oy
     g.drawLine(x_pos,y_pos-(int)(distance2*k),t2_xpos,y_pos-(int)(distance2*k));
     g.drawLine(x_pos,y_pos-(int)(distance3*k),t3_xpos,y_pos-(int)(distance3*k));
     g.drawLine(x_pos,y_pos-(int)(distance4*k),t4_xpos,y_pos-(int)(distance4*k));
     g.drawLine(x_pos,y_pos-(int)(distance5*k),t5_xpos,y_pos-(int)(distance5*k));
     g.drawLine(x_pos,y_pos-(int)(distance6*k),t6_xpos,y_pos-(int)(distance6*k));
     g.drawLine(x_pos,y_pos-(int)(distance7*k),t7_xpos,y_pos-(int)(distance7*k));
     g.drawLine(x_pos,y_pos-(int)(distance8*k),t8_xpos,y_pos-(int)(distance8*k));
     g.drawLine(x_pos,y_pos-(int)(distance9*k),t9_xpos,y_pos-(int)(distance9*k));
     g.drawLine(x_pos,y_pos-(int)(distance10*k),t10_xpos,y_pos-(int)(distance10*k));
     g.drawLine(x_pos,y_pos-(int)(distance11*k),t11_xpos,y_pos-(int)(distance11*k));
     
     
     
     //shkrimi dhe percaktimi i pozitave te vlerave te fituara te d(distances) nga fromula 
     g.setColor(Color.black);
     g.drawString(d1_label,t1_xpos-width/15,y_pos-(int)(distance1*k));
     g.drawString(d2_label,t1_xpos-width/15,y_pos-(int)(distance2*k));
     g.drawString(d3_label,t1_xpos-width/15,y_pos-(int)(distance3*k));
     g.drawString(d4_label,t1_xpos-width/15,y_pos-(int)(distance4*k));
     g.drawString(d5_label,t1_xpos-width/15,y_pos-(int)(distance5*k));
     g.drawString(d6_label,t1_xpos-width/15,y_pos-(int)(distance6*k));
     g.drawString(d7_label,t1_xpos-width/15,y_pos-(int)(distance7*k));
     g.drawString(d8_label,t1_xpos-width/15,y_pos-(int)(distance8*k));
     g.drawString(d9_label,t1_xpos-width/15,y_pos-(int)(distance9*k));
     g.drawString(d10_label,t1_xpos-width/15,y_pos-(int)(distance10*k));
     g.drawString(d11_label,t1_xpos-width/15,y_pos-(int)(distance11*k));
     //vendosja e pikave ne grafikne baze te distances dhe kohes
     g.setColor(Color.blue);
      g.fillOval(t1_xpos-2,y_pos-(int)(distance1*k)-2,od,od);
      g.fillOval(t2_xpos-2,y_pos-(int)(distance2*k)-2,od,od);
      g.fillOval(t3_xpos-2,y_pos-(int)(distance3*k)-2,od,od);
      g.fillOval(t4_xpos-2,y_pos-(int)(distance4*k)-2,od,od);
      g.fillOval(t5_xpos-2,y_pos-(int)(distance5*k)-2,od,od);
      g.fillOval(t6_xpos-2,y_pos-(int)(distance6*k)-2,od,od);
      g.fillOval(t7_xpos-2,y_pos-(int)(distance7*k)-2,od,od);
      g.fillOval(t8_xpos-2,y_pos-(int)(distance8*k)-2,od,od);
      g.fillOval(t9_xpos-2,y_pos-(int)(distance9*k)-2,od,od);
      g.fillOval(t10_xpos-2,y_pos-(int)(distance10*k)-2,od,od);
      g.fillOval(t11_xpos-2,y_pos-(int)(distance11*k)-2,od,od);

   }
   //krijimi i metodes main 
   public static void main(String []args)
   { new D584();
   }
}