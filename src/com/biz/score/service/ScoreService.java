package com.biz.score.service;

import java.io.*;
import java.nio.*;
import java.util.*;

import com.biz.score.vo.*;

public class ScoreService {
	List<ScoreVO> scoreList;
	String strStuden;
	String strscore;
	String strsjp;
	

	public ScoreService(String strStuden, String strscore) {
		this.scoreList = new ArrayList();
		this.strStuden = strStuden;
		this.strscore = strscore;
		this.strsjp = "src/com/biz/score/sjp/성적표정리.txt";
		
	}

	public void scoreWrite() {

		FileWriter fw;
		PrintWriter pw;

		try {

			fw = new FileWriter(strsjp, true);
			pw = new PrintWriter(fw);

			for (ScoreVO v : scoreList) {
				// pw.printf("%s:%s:%s:%s:%d:%d:%d:%d:%d:%d:%f\n",
				// vo.getStrId1(), vo.getStrName(), vo.getStrPhone(),
				// vo.getAddress(), vo.getIntKor(), vo.getIntEng(),
				// vo.getIntMath(), vo.getIntTotal(),vo.getFloatAvg());
				
				if(v.getStrId1().equals(v.getStrId2())){
				pw.println(
				"===============================================================================\n"
				+v.getStrId1() + ":" 
				+ v.getStrName() + ":" 
				+ v.getStrPhone() + ":" 
				+ v.getAddress() + ":"
				+ v.getIntKor() + ":" 
				+ v.getIntEng() + ":" 
				+ v.getIntMath() + ":" 
				+ v.getIntTotal() + ":"
				+ v.getFloatAvg() + "\n"
				+ "===============================================================================\n"
				);
				}
			}

			pw.close();
			fw.close();
			System.out.println("저장완료.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void readFile01() {
		FileReader fr;
		FileReader fr2;
		BufferedReader buffer;
		BufferedReader buffer2;
		try {
			fr = new FileReader(this.strStuden);
			fr2 = new FileReader(this.strscore);
			buffer = new BufferedReader(fr);
			buffer2 = new BufferedReader(fr2);
			while (true) {
				String line = buffer.readLine();
				String lines = buffer2.readLine();
				if (line == null && lines == null)
					break;
				String[] line01 = line.split(":");
				String[] lines01 = lines.split(":");
				ScoreVO vo = new ScoreVO();
				vo.setStrId1(line01[0]);
				vo.setStrName(line01[1]);
				vo.setStrPhone(line01[2]);
				vo.setAddress(line01[3]);
				
				vo.setStrId2(lines01[0]);
				vo.setIntKor(Integer.valueOf(lines01[1]));
				vo.setIntEng(Integer.valueOf(lines01[2]));
				vo.setIntMath(Integer.valueOf(lines01[3]));
				vo.setIntTotal(Integer.valueOf(lines01[1]) + Integer.valueOf(lines01[2]) 
								+ Integer.valueOf(lines01[3]));
				vo.setFloatAvg(vo.getIntTotal() / 3.0f);
				
				
				scoreList.add(vo);

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	public void readFile02() {
//		FileReader fr;
//		BufferedReader buffer;
//
//		try {
//			fr = new FileReader(this.strscore);
//			buffer = new BufferedReader(fr);
//			while (true) {
//				String line = buffer.readLine();
//				if (line == null)
//					break;
//				String[] lines = line.split(":");
//				ScoreVO vo = new ScoreVO();
//				vo.setStrId2(lines[0]);
//				vo.setIntKor(Integer.valueOf(lines[1]));
//				vo.setIntEng(Integer.valueOf(lines[2]));
//				vo.setIntMath(Integer.valueOf(lines[3]));
//				vo.setIntTotal(Integer.valueOf(lines[1]) + Integer.valueOf(lines[2]) + Integer.valueOf(lines[3]));
//				vo.setFloatAvg(vo.getIntTotal() / 3);
//
//				scoreList.add(vo);
//
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
