package com.biz.score.exec;

import com.biz.score.service.*;

public class scoreExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strscore = "src/com/biz/score/점수표.txt";
		String strStuden = "src/com/biz/score/학생리스트.txt";
		
		ScoreService ss = new ScoreService(strStuden,strscore);
		ss.readFile01();
//		ss.readFile02();
		ss.scoreWrite();
		
	}

}
