package cn.campsg.java.experiment.entity;

import java.util.Random;

public class Zeus {
public int xl=1000;public int getBlood() {
	return xl;}
public void setBlood(int blood) {
	this.xl = xl;}
public  void attack(Taitan taitan) {
Random random=new Random();
int num=random.nextInt(71);
taitan.xl-=num;
System.out.println("ÖæË¹¹¥»÷Ì©Ì¹£¬Ì©Ì¹¿ÛÑª£º"+num+"Ê£ÓàÑªÁ¿"+taitan.xl);

}
}
