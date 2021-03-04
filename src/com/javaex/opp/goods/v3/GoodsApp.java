package com.javaex.opp.goods.v3;

import com.javaex.opp.goods.v1.Goods;

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		//	setter를 이용한 우회 접근
		notebook.setName("LG Gram");
		notebook.setPrice = 1500000;
		
		Goods smartphone = new Goods();
		smartphone.setName = "iPhone SE";
		smartphone.setPrice = 650000;
		
		System.out.printf("%s, %d원%n",
				notebook.name, notebook.price);
		System.out.printf("%s, %d원%n",
				smartphone.name, smartphone.price);
	}

}
