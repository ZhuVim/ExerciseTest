package test1;

import java.util.Scanner;

public class Huawei1 {
public int cal_score(int score[],int judge_type[],int n)
{
	int expAverage=0;
	int pubAverage=0;
	int expertNum=0;
	int pubNum=0;
	int expSum=0;
	int pubSum=0;
	for(int i=0;i<n;i++)
	{
		if(judge_type[i]==1)
			{expSum+=score[i];
			expertNum++;
			}
		else if(judge_type[i]==2){
			pubSum+=score[i];
			pubNum++;
		}
	}
	expAverage=expSum/expertNum;
	pubAverage=pubSum/pubNum;
	return (int) (expAverage*0.6+pubAverage*0.4);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score=new int[10];
		Scanner input;
		input=new Scanner(System.in);
		for(int i=0;i<10;i++){
		System.out.println("请输入第"+i+"分数");

		score[i]=input.nextInt();
		System.out.println(score[i]);
		}
	}

}
