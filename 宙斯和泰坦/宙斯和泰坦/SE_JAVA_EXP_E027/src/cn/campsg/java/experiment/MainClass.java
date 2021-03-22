package cn.campsg.java.experiment;

import cn.campsg.java.experiment.entity.Taitan;
import cn.campsg.java.experiment.entity.Zeus;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Taitan taitan=new Taitan();
Zeus zeus=new Zeus();
attack(zeus,taitan);
	}

	private static void attack(Zeus zeus, Taitan taitan) {
		// TODO Auto-generated method stub
		boolean flag = true;
		do {
			if (flag) {
				taitan.attack(zeus);
			} else {
				zeus.attack(taitan);
			}
			flag = !flag;
			if (taitan.xl<= 0) {
				System.out.println("Ì©Ì¹ËÀÍö£¬ÖæË¹»ñÊ¤");
				break;
			}
			if (zeus.xl <= 0) {
				System.out.println("ÖæË¹ËÀÍö£¬Ì©Ì¹»ñÊ¤");
				break;
			}
		} while (true);
	
	}

}
