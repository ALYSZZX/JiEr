package com.jier.soft.Util;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Centre {
	//x，y为窗口大小
	public static void centre(JFrame j,int x,int y) {
		j.setSize(x, y);
		// 获取工具对象
		Toolkit tool = Toolkit.getDefaultToolkit();
		// 获取屏幕尺寸
		Dimension d = tool.getScreenSize();
		//取得任务栏高度 
		Insets   screenInsets   =   Toolkit.getDefaultToolkit().getScreenInsets(j.getGraphicsConfiguration()); 
		x = (d.width - x) / 2;
		y = (d.height-screenInsets.bottom - y) / 2;
		//设置屏幕居中
		j.setLocation(x, y);
		
	}
}
