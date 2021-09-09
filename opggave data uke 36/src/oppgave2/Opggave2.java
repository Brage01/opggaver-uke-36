package oppgave2;

import static javax.swing.JOptionPane.*;

public class Opggave2 {
	
	public static void main(String[] args) {
		for (int i= 1; i < 11; i++) {
	String tallTxt =	showInputDialog ("student nr " + i + " poengsum");
	int tallKarakter = Integer.parseInt(tallTxt);
	
	if (tallKarakter <= 100 && tallKarakter >=90) {
	showMessageDialog(null, "eleven har fått en A");}
	if (tallKarakter <= 89 && tallKarakter >=80) {
		showMessageDialog(null, "eleven har fått en B");}
	if (tallKarakter <= 79 && tallKarakter >=60) {
		showMessageDialog(null, "eleven har fått en C");}
	if (tallKarakter <= 59 && tallKarakter >=50) {
		showMessageDialog(null, "eleven har fått en D");}
	if (tallKarakter <= 49 && tallKarakter >=40) {
		showMessageDialog(null, "eleven har fått en E");}
	if (tallKarakter <= 39 && tallKarakter >=0) {
		showMessageDialog(null, "eleven har fått en F");}
	if (tallKarakter < 0 || tallKarakter >100) {
		showMessageDialog(null, "ugylding poengsum, prøv igjen");
		i--;}
			}
	}
}