package com.sxl;

public interface IScores {
	void help();
	double sum(double[] d);
	double max(double[] d);
	double min(double[] d);
	double average(double[] d);
    int numberNot60(double[] d);
	double[] sort(double[] d);
	void info(double[] d);
}