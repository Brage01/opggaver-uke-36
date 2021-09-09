package oppgave1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class oppgave1 {

	public static void main(String[] args) {
		String tallTxt =	showInputDialog ("lønn");
		double Lønn = Integer.parseInt(tallTxt);
		double skattTrinn0 = 0;
		double skattTrinn1 = 0;
		double skattTrinn2 = 0;
		double skattTrinn3 = 0;
		double skattTrinn4 = 0;
		
		if(Lønn >=0 && Lønn <= 184800) 
		{
			skattTrinn0 = (Lønn - 0) * 0.000;
		}
		if (Lønn > 184800) {skattTrinn0 = (184800 - 0) * 0.000; }
		
		if(Lønn > 184800 && Lønn <= 260100)
		{
			 skattTrinn1 = (Lønn - 184800) * 0.017;
		}
		
		if (Lønn > 260100) {skattTrinn1 = (260100 - 184800) * 0.017; }
		
		if(Lønn > 260100 && Lønn <= 651250) 
		{
			 skattTrinn2 = (Lønn - 260100) * 0.040;
		}
		
		if (Lønn > 651250) {skattTrinn2 = (651250 - 260100) * 0.040; }
		
		if(Lønn > 651250 && Lønn <= 1021550) 
		{
			skattTrinn3 = (Lønn - 651250) * 0.132;
		
		}
		if (Lønn > 1021550) {skattTrinn3 = (1021550 - 651250) * 0.132; }
		
		if(Lønn > 1021550) 
		{
			skattTrinn4 = (Lønn - 1021550) * 0.162;
		
		}
		
		showMessageDialog(null, "skatt for de ulike trinnene er i synkende rekkefølge" + "\n trinn0 \n" + 
		skattTrinn0 + "kr" + "\n trinn1 \n" + skattTrinn1 + "kr" + "\n trinn2 \n" + skattTrinn2 + "kr" + "\n trinn3 \n" + skattTrinn3 + "kr" + "\n trinn4 \n" + skattTrinn4 + "kr");
	}

}