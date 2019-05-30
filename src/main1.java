
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.FocusListener;//导入有关的界面类



public class main1
{
	static Image im=(new ImageIcon("C:\\Users\\Handsome Lu\\Desktop\\新建文件夹\\新建文件夹\\Java语言课程设计指导2019--2\\图形界面学习\\1_2.png")).getImage();
	
	static JFrame zhujiemian=new JFrame();
	static JPanel pan1=new JPanel();
	static JPanel pan2=new JPanel();
	static JPanel pan3=new JPanel();
	static JPanel pan4=new JPanel();

	static JFrame chaxun=new JFrame();//查询框
	static JFrame chaxun2=new JFrame();//查询框
	static JFrame guanliyuan=new JFrame();//管理框
	static JFrame youke=new JFrame();//游客框
	static JFrame zhucejiemian=new JFrame();//注册框
	static JFrame guanliyuan2=new JFrame();//管理界面2
	static JFrame shu_shanchu=new JFrame();//删除书籍
	static JFrame shu_zengjia=new JFrame();//增加书籍
	static JFrame shu_duzhexinxi=new JFrame();//读者信息
	static JFrame shu_zhuxiao=new JFrame();//注销账号
	
	static JTextField chaxunlan=new JTextField(20);//查询栏
	
	static JFrame mimakuang=new JFrame();//管理员密码框
	static JPasswordField mimalan=new JPasswordField(20);//管理员密码栏
	
	static JFrame mimakuang2=new JFrame();//游客密码框
	static JPasswordField mimalan2=new JPasswordField(20);//游客密码栏
	
	static JFrame xinxilan=new JFrame();
	static JFrame xinxilan2=new JFrame();
	
	static String sex2;//性别
	static String xingming=null;//姓名
	static String youkeming=null;//游客名
	static String chaxunjieguo;
	
	static JTextField youkedengzhuce=new JTextField(20);//游客用户名
	static JTextField namelan=new JTextField(20);
	static JRadioButton jrb=new JRadioButton("男");//男女按钮
	static JRadioButton jrb1=new JRadioButton("女");
	static JButton QUEREN=new JButton();//注册确认按钮
	static JTextField mimalan3=new JTextField(20);//注册密码栏
	static JTextField mimalan4=new JTextField(20);//确认密码栏
	
	static JButton shanchu=new JButton();
	static JButton zengjia=new JButton();
	static JButton duzhexinxi=new JButton();
	static JButton zhuxiao=new JButton();
	
    static JButton A1=new JButton();//管理员界面2功能
    static JButton A2=new JButton();
    static JButton A3=new JButton();
    static JButton A4=new JButton();
	public static void main(String[] args) 
	{
		//****主界面************************************************************************************************
		
		//图标
		zhujiemian.setIconImage(im);
		//背景
			
		Icon icon=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_9.png");
		
		JLabel beijing=new JLabel(icon,JLabel.CENTER);
		zhujiemian.setLayout(null);
		beijing.setBounds(0,0,500,100);
		
		//窗口大小
		zhujiemian.add(beijing);
		zhujiemian.getContentPane().setBackground(Color.orange);
		zhujiemian.setLocation(500,250);
		zhujiemian.setSize(500,400);
		
		 //按钮
		ImageIcon SEARCH=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_11.png");
		ImageIcon MANGER=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_14.png");
		ImageIcon TOURIST=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_12.png");
        JButton search=new JButton(SEARCH);
        JButton manger=new JButton(MANGER);
        JButton tourist=new JButton(TOURIST);
        
        search.setBounds(-18,100,320,100);
        search.setMargin(new Insets(0,0,0,0));
        search.setBorderPainted(false);
        search.setContentAreaFilled(false);
        search.setFocusPainted(false);
        
        manger.setBounds(-15,180,320,100);
        manger.setMargin(new Insets(0,0,0,0));
        manger.setBorderPainted(false);
        manger.setContentAreaFilled(false);
        manger.setFocusPainted(false);
        
        tourist.setBounds(-15,270,330,100);
        tourist.setMargin(new Insets(0,0,0,0));
        tourist.setBorderPainted(false);
        tourist.setContentAreaFilled(false);
        tourist.setFocusPainted(false);
      
        zhujiemian.add(search);
        zhujiemian.add(manger);
        zhujiemian.add(tourist);
        
		//显示
		zhujiemian.setResizable(false);
        zhujiemian.setVisible(true);
        
        //错误信息栏************************************************************************************************
       // xinxilan.setLayout(null);
		xinxilan.getContentPane().setBackground(Color.GRAY);
		xinxilan.setLocation(620,380);
		xinxilan.setSize(230,200);
		Icon wornging=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_20.png");
		JLabel worng=new JLabel(wornging,JLabel.CENTER);
		worng.setLocation(500,400);
		worng.setSize(280,200);
		xinxilan.add(worng);
		xinxilan.setIconImage(im);
		
		//正确信息栏**************************************************************************************************
		//xinxilan2.setLayout(null);
		xinxilan2.getContentPane().setBackground(Color.GRAY);
		xinxilan2.setLocation(620,380);
		xinxilan2.setSize(230,200);
		Icon scceed=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_27.png");
		JLabel SUCCEED=new JLabel(scceed,JLabel.CENTER);
		SUCCEED.setLocation(500,400);
		SUCCEED.setSize(280,200);
		xinxilan2.add(SUCCEED);
		xinxilan2.setIconImage(im);
        
        // ***查询界面*******************************************************************************************
		chaxun.setLayout(null);
        //图标
        chaxun.setIconImage(im);
        
        //颜色背景
        Icon hbooksearch=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_16.png");
        JLabel chaxunbeijing=new JLabel(hbooksearch,JLabel.CENTER);
        chaxunbeijing.setBounds(0,70,500,100);
        //chaxun.setLayout(null);
        chaxun.add(chaxunbeijing);
        chaxun.getContentPane().setBackground(Color.orange);
		chaxun.setLocation(500,250);
		chaxun.setSize(500,400);
		search.addActionListener(new MyActLister());
		
		//文本框 标签
		//chaxunlan.addFocusListener(new JTextFieldHintListener(chaxunlan, "请输入书名或书名关键字"));
		JTextField chaxunlan=new JTextField(20);
		chaxunlan.setBounds(100,150,280,26);
		chaxun.add(chaxunlan);
		
		//按钮
		ImageIcon chaxunanniu=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_17.png");
		JButton CHAXUNANNIU=new JButton(chaxunanniu);
		CHAXUNANNIU.setBounds(75,160,320,100);
        CHAXUNANNIU.setMargin(new Insets(0,0,0,0));
        CHAXUNANNIU.setBorderPainted(false);
        CHAXUNANNIU.setContentAreaFilled(false);
        CHAXUNANNIU.setFocusPainted(false);
        chaxun.add(CHAXUNANNIU);
        chaxun.setResizable(false);
      //********查询界面2***************************************************************************************
      		chaxun2.setLayout(null);
              //图标 颜色 大小
      		chaxun2.setLocation(500,250);
      		chaxun2.setSize(500,400);
              chaxun2.setIconImage(im);
              chaxun2.getContentPane().setBackground(Color.orange);
              //弹出查询窗2
              CHAXUNANNIU.addActionListener(new MyActLister8());
              //System.out.print(chaxunjieguo);
              chaxunjieguo=chaxunlan.getText();//查询结果
              selectbook aw=new selectbook(chaxunjieguo);
              aw.countN();
              //System.out.println("wocao"+chaxunjieguo+"wocao");
        
       //               &&&&&&&&&&&&&&&&&&&&&&&&&&&&& 读取数据   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        //chaxunjieguo=chaxunlan.getText();
        
        // ***管理员界面********************************************************************************************
        
        guanliyuan.setIconImage(im);
        manger.addActionListener(new MyActLister2());
        guanliyuan.setLayout(null);
        
        //页面大小
        guanliyuan.setLocation(500,250);
		guanliyuan.setSize(500,400);
		
		//颜色
		guanliyuan.getContentPane().setBackground(Color.orange);
		
		//头像
		ImageIcon xiaohuang=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_19.png");
		JLabel xiaohuangtouxiang=new JLabel(xiaohuang,JLabel.CENTER);
		xiaohuangtouxiang.setBounds(100,60,280,100);
		guanliyuan.add(xiaohuangtouxiang);
		
		//密码，用户文本框,标签
		JLabel yonghu=new JLabel("用 户:");
		yonghu.setBounds(120,170,200,26);
		JLabel mima=new JLabel("密 码:");
		mima.setBounds(120,210,200,26);
		JTextField yonghulan=new JTextField("                       小     黄",20);
		yonghulan.setBounds(160,170,200,26);
		yonghulan.setEditable(false);
		guanliyuan.add(yonghulan);
		guanliyuan.add(yonghu);
		guanliyuan.add(mima);
		
		
		mimalan.setBounds(160,210,200,26);
		guanliyuan.add(mimalan);

		
		 //按钮
		ImageIcon guanliyuananniu=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_17.png");
		JButton GUANLIYUANANNIU=new JButton(guanliyuananniu);
		GUANLIYUANANNIU.setBounds(95,220,320,100);
		GUANLIYUANANNIU.setMargin(new Insets(0,0,0,0));
		GUANLIYUANANNIU.setBorderPainted(false);
		GUANLIYUANANNIU.setContentAreaFilled(false);
		GUANLIYUANANNIU.setFocusPainted(false);
        guanliyuan.add(GUANLIYUANANNIU);
        guanliyuan.setResizable(false);guanliyuan.setLocation(500,250);
		guanliyuan.setSize(500,400);
        
		//按钮密码判断
        GUANLIYUANANNIU.addActionListener(new MyActLister3());
        
        //管理员2界面*********************************************************************************************
        //大小
        guanliyuan2.setLayout(null);
        guanliyuan2.setIconImage(im);
        guanliyuan2.setLocation(500,250);
		guanliyuan2.setSize(500,400);
		
		//按钮
		ImageIcon a1=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_28.png");
		ImageIcon a2=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_29.png");
		ImageIcon a3=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_30.png");
		ImageIcon a4=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_31.png");
		
		A1.setIcon(a1);
		A2.setIcon(a2);
		A3.setIcon(a3);
		A4.setIcon(a4);
        
        A4.setBounds(20,20,450,100);
        A4.setMargin(new Insets(0,0,0,0));
        A4.setBorderPainted(false);
        A4.setContentAreaFilled(false);
        A4.setFocusPainted(false);
        
        A1.setBounds(20,100,450,100);
        A1.setMargin(new Insets(0,0,0,0));
        A1.setBorderPainted(false);
        A1.setContentAreaFilled(false);
        A1.setFocusPainted(false);
        
        A2.setBounds(20,180,450,100);
        A2.setMargin(new Insets(0,0,0,0));
        A2.setBorderPainted(false);
        A2.setContentAreaFilled(false);
        A2.setFocusPainted(false);
        
        A3.setBounds(20,260,450,100);
        A3.setMargin(new Insets(0,0,0,0));
        A3.setBorderPainted(false);
        A3.setContentAreaFilled(false);
        A3.setFocusPainted(false);
      
        guanliyuan2.add(A1);
        guanliyuan2.add(A2);
        guanliyuan2.add(A3);
        guanliyuan2.add(A4);
        
        guanliyuan2.setResizable(false);
        //颜色
        guanliyuan2.getContentPane().setBackground(Color.orange);
        
        
        // ***游客界面*********************************************************************************************
        //进入按钮
        youke.setIconImage(im);
        tourist.addActionListener(new MyActLister4());
        youke.setLayout(null);
		//图案
		ImageIcon youke2=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_21.png");
		JLabel youke3=new JLabel(youke2,JLabel.CENTER);
		youke3.setBounds(100,60,280,100);
		youke.add(youke3);
        
        //图标 大小颜色
        youke.setIconImage(im);
        youke.getContentPane().setBackground(Color.orange);
		youke.setLocation(500,250);
		youke.setSize(500,400);
        
		//大小
		youke.setResizable(false);
	    
		//文本，标签
		JLabel youke1=new JLabel("游 客 ID:");
		youke1.setBounds(105,160,190,26);
		JLabel mima2=new JLabel("密 码:");
		mima2.setBounds(120,200,200,26);
		JTextField youkedenglulan=new JTextField(20);
		youkedenglulan.setBounds(160,160,200,26);
		youke.add(youkedenglulan);
		youke.add(youke1);
		youke.add(mima2);
        
		 //按钮
		ImageIcon zhuce=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_22.png");
		JButton ZHUCE=new JButton(zhuce);
		ZHUCE.setBounds(130,250,100,50);
		ZHUCE.setMargin(new Insets(0,0,0,0));
		ZHUCE.setBorderPainted(false);
		ZHUCE.setContentAreaFilled(false);
		ZHUCE.setFocusPainted(false);
        youke.add(ZHUCE);
        youke.setResizable(false);
        ImageIcon denglu=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_23.png");
		JButton DENGLU=new JButton(denglu);
		DENGLU.setBounds(280,250,100,50);
		DENGLU.setMargin(new Insets(0,0,0,0));
		DENGLU.setBorderPainted(false);
		DENGLU.setContentAreaFilled(false);
		DENGLU.setFocusPainted(false);
        youke.add(DENGLU);
        youke.setResizable(false);
        
        //密码栏
        mimalan2.setBounds(160,200,200,26);
		youke.add(mimalan2);
		
		// ***注册界面*************************************************************************************
        //进入按钮
		zhucejiemian.setIconImage(im);
        ZHUCE.addActionListener(new MyActLister5());
        zhucejiemian.setLayout(null);
        //图标 大小颜色
        zhucejiemian.setIconImage(im);
        zhucejiemian.getContentPane().setBackground(Color.orange);
        zhucejiemian.setLocation(500,250);
        zhucejiemian.setSize(500,400);
        //背景
        Icon icon3=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_25.png");
		JLabel beijing2=new JLabel(icon3,JLabel.CENTER);
		zhucejiemian.setLayout(null);
		beijing2.setBounds(-3,0,500,100);
        zhucejiemian.add(beijing2);
        //文本标签
		JLabel youke4=new JLabel("自 建ID:");
		youke4.setBounds(105,160,190,26);
		JLabel youkemima=new JLabel("密 码:");
		youkemima.setBounds(120,200,200,26);
		JLabel querenmima=new JLabel("确 认 密 码:");
		querenmima.setBounds(90,240,200,26);
		JLabel name=new JLabel("姓 名:");
		name.setBounds(110,120,190,26);
		JLabel sex=new JLabel("性 别:");
		sex.setBounds(270,120,190,26);
		
		
		youkedengzhuce.setBounds(160,160,200,26);
		
		namelan.setBounds(160,120,100,26);
		
		mimalan3.setBounds(160,200,200,26);
		
		mimalan4.setBounds(160,240,200,26);
		
		//按钮 男女
		
		ButtonGroup bg = new ButtonGroup();
		jrb.setBounds(340,120,40,26);
		jrb1.setBounds(300,120,40,26);
		bg.add(jrb1);
		bg.add(jrb);
		jrb.setContentAreaFilled(false);
		jrb1.setContentAreaFilled(false);
		
		
		//按钮 确认
		ImageIcon queren=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\新建文件夹\\\\新建文件夹\\\\Java语言课程设计指导2019--2\\\\图形界面学习\\\\1_26.png");
		QUEREN.setIcon(queren);
		QUEREN.setBounds(208,275,100,50);
		QUEREN.setMargin(new Insets(0,0,0,0));
		QUEREN.setBorderPainted(false);
		QUEREN.setContentAreaFilled(false);
		QUEREN.setFocusPainted(false);
        zhucejiemian.add(QUEREN);
        //密码判断
        QUEREN.addActionListener(new MyActLister6());
       // QUEREN.addActionListener(new MyActLister7());

		
		//密码判断
		
		
		//加入
		zhucejiemian.add(youkedengzhuce);
		zhucejiemian.add(youke4);
		zhucejiemian.add(youkemima);
		zhucejiemian.add(querenmima);
		zhucejiemian.add(name);
		zhucejiemian.add(sex);
		zhucejiemian.add(namelan);
		zhucejiemian.add(mimalan3);
		zhucejiemian.add(mimalan4);
		zhucejiemian.add(jrb);
		zhucejiemian.add(jrb1);
		
		//大小
		zhucejiemian.setResizable(false);
		
		//**********增加书籍*******************************************************************************************
		//背景 图标 大小
		shu_zengjia.setLayout(null);
		
		
//                               &&&&&&&&&&&&&&&&&&&&&&&&&&&&& 读取数据   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
         //chaxunjieguo=chaxunlan.getText();//查询结果
        /* if(chaxunjieguo!="请输入书名或书名关键字") 
         {
             selectbook aw=new selectbook(chaxunjieguo);
             aw.countN();
             System.out.println("wocao"+chaxunjieguo+"wocao");
         }*/
         
	}
	
	//内部类，查询窗口
	static class MyActLister implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			chaxun.setVisible(true);
			//chaxunlan.setText("");
		}
		
	}

	//内部类，查询窗口2
	static class MyActLister8 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			chaxun2.setVisible(true);
			//chaxunjieguo=chaxunlan.getText();//查询结果
			chaxun2.setVisible(true);
			//chaxunlan.setText("");
		}
		
	}
	
	//管理员 登陆界面
	static class MyActLister2 implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
	
			guanliyuan.setVisible(true);
			mimalan.setText("");
		}
		
	}
	
	//游客 登陆注册界面
	static class MyActLister4 implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
	
			youke.setVisible(true);
		}
		
	}
	
	//注册界面
	static class MyActLister5 implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
	
			zhucejiemian.setVisible(true);
		}
		
	}
	
   //书籍增加
	static class MyActLister7 implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
	
			shu_zengjia.setVisible(true);
		}
		
	}
	
	//内部类 管理员密码判断
	static class MyActLister3 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
			char[] password=mimalan.getPassword();
			String str=new String(password);
			String b=new String("123456");
			boolean a=str.equals(b);
			if(a==true)
			{
				guanliyuan.setVisible(false);
				guanliyuan2.setVisible(true);
			}
			if(a==false)
			{
				xinxilan.setVisible(true);
				xinxilan.setResizable(false);
			}

		}
		
	}
	
	//内部类 注册密码判断
		static class MyActLister6 implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				
				String a=mimalan3.getText();
				String b=mimalan4.getText();
				xingming=namelan.getText();
				youkeming=youkedengzhuce.getText();
				boolean c=a.equals(b);
				//jrb.setSelected(true);
				if(jrb1.isSelected()){
					sex2="女";
					}
				if(jrb.isSelected()){
					sex2="男";
					}
				
				if(namelan.getText().length()==0)
				{
					xinxilan.setVisible(true);
					xinxilan.setResizable(false);
				}
				
				if(c==false)
				{
					xinxilan.setVisible(true);
					xinxilan.setResizable(false);
				}
				
				if(youkedengzhuce.getText().length()==0)
				{
					xinxilan.setVisible(true);
					xinxilan.setResizable(false);
				}
				if(namelan.getText().length()!=0&c==true&youkedengzhuce.getText().length()!=0&sex2.length()!=0)
				{
					xinxilan2.setVisible(true);
					xinxilan2.setResizable(false);
					zhucejiemian.setVisible(false);
					mimalan3.setText("");mimalan4.setText("");namelan.setText("");youkedengzhuce.setText("");
				}

			}
			
		}
	

	
	
	//搜寻栏提示语
	/*static class JTextFieldHintListener implements FocusListener {
	    private String hintText=("");
	    private JTextField textField;
	    public JTextFieldHintListener(JTextField jTextField,String hintText) {
	        this.textField = jTextField;
	        this.hintText = hintText;
	        jTextField.setText(hintText);  //默认直接显示
	        jTextField.setForeground(Color.GRAY);
	    }
	    public void focusGained(FocusEvent e) {
	        //获取焦点时，清空提示内容
	        String temp = textField.getText();
	        if(temp.equals(hintText)) {
	            textField.setText("");
	            textField.setForeground(Color.BLACK);
	        }
	        
	    }
	    public void focusLost(FocusEvent e) {    
	        //失去焦点时，没有输入内容，显示提示内容
	        String temp = textField.getText();
	        if(temp.equals("")) {
	            textField.setForeground(Color.GRAY);
	            textField.setText(hintText);
	        }
	        
	    }
	 
	}*/
	
	

}


/*public class main1
{
	public static void main(String[] args) 
	{
		
	}
}
		//查询功能，查书库里有什么书
		Scanner reader=new Scanner(System.in);
		String zxc=reader.nextLine();
		String sql="SELECT * FROM BOOK WHERE bName ='"+zxc+"'"+"OR bWriter ='"+zxc+"'";
		try 
		{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			int count=0;
			while(rs.next()) 
			{
				String bid=rs.getString("bID");
				String bname=rs.getString("bName");
				String bwriter=rs.getString("bWriter");
				String publishinghouse=rs.getString("PublishingHouse");
				String publicationdate=rs.getString("PublicationDate");
				int stock=rs.getInt("Stock");
				System.out.println(bid+""+bname+""+bwriter+""+publishinghouse+""+publicationdate+""+stock);
				count++;
			}
			if(count==0)
			{
				System.out.println("图书馆里没有有关书籍");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//点击书籍获得进入下一步的界面，弹出该书籍的馆藏情况
		String zxc1="";//从上一层数据点击获得的书籍名字
		String sql1="SELECT * FROM STOCK WHERE bName='"+zxc1+"'";
		ResultSet rs1=null;
		try
		{
			while(rs1.next()) 
			{
					String bnumber=rs1.getString("bNumber");
					String bname=rs1.getString("bName");
					String bplace=rs1.getString("bPlace");
					String status=rs1.getString("Status");
					String borrowtime=rs1.getString("BorrowTime");
					String returntime=rs1.getString("ReturnTime");
					System.out.println(bnumber+""+bname+""+bplace+""+status+""+borrowtime+""+returntime);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		//借阅管理
		PreparedStatement ps21=null;
		PreparedStatement ds2=null;
		PreparedStatement cs2=null;
		PreparedStatement gs2=null;
		ResultSet rs2=null;
		String insertsql2="INSERT INTO BORROWRETURN(bNumber,rNumber,BorrowTime,ReturnTime) VALUES(?,?,?,?)";
		String updatesql21="UPDATE BOOK SET Stock=?";
		String updatesql22="UPDATE STOCK SET Status=?,BorrowTime=?,ReturnTime=? WHERE bNumber=?";
		String selectsql2="SELECT Stock FROM BOOK WHERE bID=?";
		//借书往表输入数据
		try
		{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			ps21=conn.prepareStatement(insertsql2);    //创建PrepareStatement对象ps2
		    Scanner reader2=new Scanner(System.in);   //获取需要插入的内容
		    String bnumber=reader2.nextLine();
		    String rnumber=reader2.nextLine();
		    String borrowtime=reader2.nextLine();
		    String returntime=reader2.nextLine();
		    ps21.setString(1,bnumber);
		    ps21.setString(2,rnumber);
		    ps21.setString(3,borrowtime);                       //获取时间出现问题，无法解决
		    ps21.setString(4,returntime);
		    int count2=ps21.executeUpdate();        //执行语句insert2的插入操作
		    if(count2==1)                          //判断是否借书
		    {
		    	String bid=reader2.nextLine();           //获取需要插入书的bid，找到该书的存量，再判断是否需要进行存量改变
			    ds2=conn.prepareStatement(selectsql2);
			    ds2.setString(1,bid);
			    rs2=ds2.executeQuery();             //执行语句selectsql2的查询操作
			    int stock2=0;
			    while(rs2.next()) 
			    {
			    	stock2=rs2.getInt("Stock");    //获得书本的存量信息
			    }
			    cs2=conn.prepareStatement(updatesql21);
			    stock2=stock2-1;
			    cs2.setInt(1,stock2);         
			    cs2.executeUpdate();               //执行语句updatesql21的修改操作，改变BOOK中Stock的值
			    gs2=conn.prepareStatement(updatesql22);
			    gs2.setString(2,borrowtime);
			    gs2.setString(3,returntime);
			    gs2.setString(1,"借出");
			    gs2.setString(4,bnumber);
			    gs2.executeUpdate();              //执行语句updatesql22的修改操作，改变STOCK中Status，BorrowTime，ReturnTime的值
		    }
		}		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//还书从表中删除数据
		PreparedStatement ps22=null;
		ResultSet rs21=null;
		String deletesql2="DELETE FROM BORROWRETURN WHERE bNumber=?";
		String updatesql23="UPDATE STOCK SET Status=?,BorrowTime=null,ReturnTime=null WHERE bNumber=?";//将两个日期设为空
		try 
		{
			ps22=conn.prepareStatement(deletesql2);
			Scanner reader21=new Scanner(System.in);
			String bnumber22=reader21.nextLine();
			ps22.setString(1,bnumber22);
			int count21=ps22.executeUpdate();      //执行语句deletesql2的删除操作
			if(count21==1)                         //判断是否还书
			{
				String bid=reader21.nextLine();
			    ds2=conn.prepareStatement(selectsql2);
			    ds2.setString(1,bid);
			    rs21=ds2.executeQuery();             //执行语句selectsql2的查询操作
			    int stock21=0;
			    while(rs2.next()) 
			    {
			    	stock21=rs2.getInt("Stock");    //获得书本的存量信息
			    }
			    cs2=conn.prepareStatement(updatesql21);
			    stock21=stock21+1;
			    cs2.setInt(1,stock21);         
			    cs2.executeUpdate();               //执行语句updatesql21的修改操作，改变BOOK中Stock的值
			    gs2=conn.prepareStatement(updatesql23);
			    gs2.setString(1,"在馆");
			    gs2.setString(2,bnumber22);
			    gs2.executeUpdate();               //执行语句updatesql23的修改操作，改变STOCK中Status，BorrowTime，ReturnTime的值
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		//借阅证管理
		//读者证加入部分或者用户注册
		Scanner reader3=new Scanner(System.in);
		String rnumber3=reader3.nextLine();
		String rname3=reader3.nextLine();
		String rsex3=reader3.nextLine();
		String registerdate3=reader3.nextLine();         //日期输入无法实现
		String insertsql3="INSERT INTO BOOK(rNumber,rName,rSex,RegisterDate) VALUES(?,?,?,?)";
		PreparedStatement ps3=null;
		ResultSet rs3=null;
		try 
		{
			ps3=conn.prepareStatement(insertsql3);
			ps3.setString(1,rnumber3);
		    ps3.setString(2,rname3);
		    ps3.setString(3,rsex3);                       
		    ps3.setString(4,registerdate3);
		    ps3.executeUpdate();                      //执行语句insertsql3的插入操作，完成对有新读者加入的借阅证管理
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//读者证删除或者用户注销
		String deletesql3="DELETE FROM BOOK WHERE rNumber=?";
		Scanner reader31=new Scanner(System.in);
		String rnumber=reader31.nextLine();
		PreparedStatement ps31=null;
		try 
		{
			ps31=conn.prepareStatement(deletesql3);
			ps31.setString(1,rnumber);
			ps31.executeUpdate();                       //执行语句deletesql3的删除操作，完成对读者删除的借阅管理或读者注销功能
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		查询书本存量功能,为其创造一个类
		String getbookstock="SELECT Stock FROM BOOK WHERE bid=?";
		Scanner getbookid=new Scanner(System.in);
		int bookid=getbookid.nextint();   //从键盘输入的方式获取bID
		Connection conn=null;
		PreparedStatement psgetbookstock=null;
		ResultSet rsgetbookstock=null;
		int stock=0;
		try 
		{
			
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			psgetbookstock=conn.prepareStatement(getbookstock);
			psgetbookstock.setInt(1,bookid);
			rsgetbookstock=psgetbookstock.executeQuery();
			while(rsgetbookstock.next()) 
			{
				stock=rsgetbookstock.getInt("Stock");
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println(+stock);
		return stock;
		
		
		//图书管理
		//新书加入，先判断馆里是否有该种类书,即书籍查询功能,
		String selectsql41="SELECT bID FROM BOOK WHERE bName=?";
		Scanner reader4=new Scanner(System.in);
		String bname4=reader4.nextLine();
		PreparedStatement ps4=null;
		ResultSet rs4=null;
		int count=0;        //用来判断馆里是否有书，，但是只通过书名判断，书名有即馆有，不存在即馆里没有，判断可以retuen count出去，大于0就有书，等于0没有书
		try
		{
			ps4=conn.prepareStatement(selectsql41);
			ps4.setString(1,bname4);
			rs4=ps4.executeQuery();
			while(rs4.next()) 
			{
				int bid=rs.getInt("bID");                    //这部分内容是有书后返回的信息，可以return出去
				String bname=rs.getString("bName");
				String bwriter=rs.getString("bWriter");
				String publishinghouse=rs.getString("PublishingHouse");
				String publicationdate=rs.getString("PublicationDate");
				int stock=rs.getInt("Stock");
				count++;
			}
			if(count==0)
			{
				System.out.println("图书馆里没有有关书籍");
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		
		Scanner reader41=new Scanner(System.in);         //录入要插入新书的数据
		String bname=reader41.nextLine();                //书名
		String bplace=reader41.nextLine();               //书的存放地址
		String status=reader41.nextLine();               //书是否在馆里
		int bid=reader41.nextInt();                      //书的种类
		int bnumber=reader41.nextInt();                  //每本书在图书馆里的number
		String bwriter=reader41.nextLine();              //书的作者
		String btraslator=reader41.nextLine();           //书的译者
		String publishinghouse=reader41.nextLine();      //书的出版社
		int n=reader41.nextInt();                        //加入n本相同书
		if(count>0)                       //书馆有书，加入相同书
		{
			String updatesql41="UPDATE BOOK SET Stock=?";
			PreparedStatement ps41=null;
			try 
			{
				ps41=conn.prepareStatement(updatesql41);
				//利用查询存量功能获取书籍stock
				ps41.setInt(1,stock+n);
				ps41.executeUpdate();              //执行语句updatesql41的操作，修改BOOK Stock的值
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
			String insertsql41="INSERT INTO STOCK(bNumber,bName,bPlace,Status,) VALUES(?,?,?,?)";//借出时间和归还时间没有写入
			PreparedStatement ps42=null;
			try 
			{
				ps42=conn.prepareStatement(insertsql41);
				for(int i=1;i<=n;i++) 
				{
					ps42.setInt(1,bnumber+1);
					ps42.setString(2,bname);
					ps42.setString(3,bplace);
					ps42.setString(4,status);
					ps42.executeUpdate();        //执行语句insertsql41的插入操作，
				}
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		else                   //书馆没有该种书，加入完全新的书
		{
			String insertsql42="INSERT INTO BOOK(bID,bName,bWriter,bTranslator,PublishingHouse,Stock) VALUER(?,?,?,?,?,?)";
			PreparedStatement ps43=null;
			try 
			{
				ps43=conn.prepareStatement(insertsql42);
				ps43.setInt(1,bid);
				ps43.setString(2,bname);
				ps43.setString(3,bwriter);
				ps43.setString(4,btraslator);
				ps43.setString(5,publishinghouse);
				ps43.setInt(6,n);
				ps43.executeUpdate();                   //执行语句insert42的插入操作
			} 
			catch(Exception e) 
			{
				e.printStackTrace();
			}
			String insertsql43="INSERT INTO STOCK(bNumber,bName,bPlace,Status) VALUER(?,?,?,?)";
			PreparedStatement ps44=null;
			try 
			{
				ps44=conn.prepareStatement(insertsql43);
				for(int i=1;i<=n;i++) 
				{
					ps44.setInt(1,bnumber+1);
					ps44.setString(2,bname);
					ps44.setString(3,bplace);
					ps44.setString(4,status);
					ps44.executeUpdate();        //执行语句insertsql43的插入操作，
				}
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		//删除书籍，先判断馆里是否有该种类书,即书籍查询功能
		String selectsql5="SELECT bID FROM BOOK WHERE bName=?";
		Scanner reader5=new Scanner(System.in);
		String bname5=reader5.nextLine();
		PreparedStatement ps5=null;
		ResultSet rs5=null;
		int count5=0;        //用来判断馆里是否有书，，但是只通过书名判断，书名有即馆有，不存在即馆里没有，判断可以retuen count出去，大于0就有书，等于0没有书
		try
		{
			ps5=conn.prepareStatement(selectsql5);
			ps4.setString(1,bname5);
			rs4=ps4.executeQuery();
			while(rs4.next()) 
			{
				int bid=rs.getInt("bID");                    //这部分内容是有书后返回的信息，可以return出去
				String bname=rs.getString("bName");
				String bwriter=rs.getString("bWriter");
				String publishinghouse=rs.getString("PublishingHouse");
				String publicationdate=rs.getString("PublicationDate");
				int stock=rs.getInt("Stock");
				count++;
			}
			if(count==0)
			{
				System.out.println("图书馆里没有有关书籍");
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		if(count>0)               //图书馆里有该书
		{
			//通过查询书本存量功能，查询书本存量Stock
			if(stock>1)            //该书存量大于1
			{
				String updatesql5="UPDATE BOOK SET Stock=? WHERE bID=?";
				String deletesql5="DELETE FROM STOCK WHERE bNumber=？";
				PreparedStatement ps51=null;
				PreparedStatement ps52=null;
				try 
				{
					ps51=conn.prepareStatement(updatesql5);
					ps51.setInt(1,stock-1);
					ps51.setInt(2, bid1111);
					ps51.executeUpdate();              //执行语句update5的修改操作，修改BOOK　Stock的值
					ps52=conn.prepareStatement(updatesql5);
					ps52.setInt(1,bnum);             //需要再加思考 
					ps52.executeUpdate();              //执行语句deletesql5的删除操作，删除STOCK一条记录，即精确至一本书（nNumber）的丢掉
				}
				catch(Exception e) 
				{
					e.printStackTrace();
				}
			}
			else 
			{
				String deletesql51="DELETE FROM BOOK WHERE bID=？";
				String deletesql52="DELETE FROM STOCK WHERE bNumber=？";
				PreparedStatement ps51=null;
				PreparedStatement ps52=null;
				try 
				{
					ps51=conn.prepareStatement(deletesql51);
					ps51.setInt(1,bid111111);
					ps51.executeUpdate();              //执行语句deletesql51的操作，删掉BOOK bID的记录
					ps52=conn.prepareStatement(deletesql52);
					ps51.setInt(1,bid111111);
					ps52.executeUpdate();              //执行语句deletesql52的操作，删掉STOCK bNumber的记录
				}
				catch(Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
	}

	getstock a=new getstock();
	int b=a.stock1(6);
}*/
