package oppgave1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class oppgave1 {

	public static void main(String[] args) {
		String tallTxt =	showInputDialog ("l�nn");
		double L�nn = Integer.parseInt(tallTxt);
		double skattTrinn0;
		double skattTrinn1;
		double skattTrinn2;
		double skattTrinn3;
		double skattTrinn4 = 0;
		
		if(L�nn >=0 && L�nn <= 184800) 
		{
			skattTrinn0 = (L�nn - 0) * 0.000;
		}
		else {skattTrinn0 = (184800 - 0) * 0.000; }
		
		if(L�nn > 184800 && L�nn <= 260100)
		{
			 skattTrinn1 = (L�nn - 184800) * 0.017;
		}
		
		else {skattTrinn1 = (260100 - 184800) * 0.017; }
		
		if(L�nn > 260100 && L�nn <= 651250) 
		{
			 skattTrinn2 = (L�nn - 260100) * 0.040;
		}
		
		else {skattTrinn2 = (651250 - 260100) * 0.040; }
		
		if(L�nn > 651250 && L�nn <= 1021550) 
		{
			skattTrinn3 = (L�nn - 651250) * 0.132;
		
		}
		else {skattTrinn3 = (1021550 - 651250) * 0.132; }
		
		if(L�nn > 1021550) 
		{
			skattTrinn4 = (L�nn - 1021550) * 0.162;
		
		}
		
		showMessageDialog(null, "skatt for de ulike trinnene er i synkende rekkef�lge" + "\n" + 
		skattTrinn0 + "kr" + "\n" + skattTrinn1 + "kr" + "\n" + skattTrinn2 + "kr" + "\n" + skattTrinn3 + "kr" + "\n" + skattTrinn4 + "kr");
	}

}