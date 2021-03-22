package cn.campsg.java.experiment.entity;

import java.util.Random;

public class Taitan {
public int xl=700;
public int getBlood() {
	return xl;}
public void setBlood(int blood) {
	this.xl = xl;}
public void attack(Zeus zeus) {
	Random random = new Random();
	int num = random.nextInt(101);
	zeus.xl -= num;
	System.out.println("Ì©Ì¹¹¥»÷ÖæË¹£¬ÖæË¹¿ÛÑª:" + num + ",Ê£ÓàÑªÁ¿" + zeus.xl);
}
}
