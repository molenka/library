
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.FocusListener;//�����йصĽ�����



public class main1
{
	static Image im=(new ImageIcon("C:\\Users\\Handsome Lu\\Desktop\\�½��ļ���\\�½��ļ���\\Java���Կγ����ָ��2019--2\\ͼ�ν���ѧϰ\\1_2.png")).getImage();
	
	static JFrame zhujiemian=new JFrame();
	static JPanel pan1=new JPanel();
	static JPanel pan2=new JPanel();
	static JPanel pan3=new JPanel();
	static JPanel pan4=new JPanel();

	static JFrame chaxun=new JFrame();//��ѯ��
	static JFrame chaxun2=new JFrame();//��ѯ��
	static JFrame guanliyuan=new JFrame();//�����
	static JFrame youke=new JFrame();//�οͿ�
	static JFrame zhucejiemian=new JFrame();//ע���
	static JFrame guanliyuan2=new JFrame();//�������2
	static JFrame shu_shanchu=new JFrame();//ɾ���鼮
	static JFrame shu_zengjia=new JFrame();//�����鼮
	static JFrame shu_duzhexinxi=new JFrame();//������Ϣ
	static JFrame shu_zhuxiao=new JFrame();//ע���˺�
	
	static JTextField chaxunlan=new JTextField(20);//��ѯ��
	
	static JFrame mimakuang=new JFrame();//����Ա�����
	static JPasswordField mimalan=new JPasswordField(20);//����Ա������
	
	static JFrame mimakuang2=new JFrame();//�ο������
	static JPasswordField mimalan2=new JPasswordField(20);//�ο�������
	
	static JFrame xinxilan=new JFrame();
	static JFrame xinxilan2=new JFrame();
	
	static String sex2;//�Ա�
	static String xingming=null;//����
	static String youkeming=null;//�ο���
	static String chaxunjieguo;
	
	static JTextField youkedengzhuce=new JTextField(20);//�ο��û���
	static JTextField namelan=new JTextField(20);
	static JRadioButton jrb=new JRadioButton("��");//��Ů��ť
	static JRadioButton jrb1=new JRadioButton("Ů");
	static JButton QUEREN=new JButton();//ע��ȷ�ϰ�ť
	static JTextField mimalan3=new JTextField(20);//ע��������
	static JTextField mimalan4=new JTextField(20);//ȷ��������
	
	static JButton shanchu=new JButton();
	static JButton zengjia=new JButton();
	static JButton duzhexinxi=new JButton();
	static JButton zhuxiao=new JButton();
	
    static JButton A1=new JButton();//����Ա����2����
    static JButton A2=new JButton();
    static JButton A3=new JButton();
    static JButton A4=new JButton();
	public static void main(String[] args) 
	{
		//****������************************************************************************************************
		
		//ͼ��
		zhujiemian.setIconImage(im);
		//����
			
		Icon icon=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_9.png");
		
		JLabel beijing=new JLabel(icon,JLabel.CENTER);
		zhujiemian.setLayout(null);
		beijing.setBounds(0,0,500,100);
		
		//���ڴ�С
		zhujiemian.add(beijing);
		zhujiemian.getContentPane().setBackground(Color.orange);
		zhujiemian.setLocation(500,250);
		zhujiemian.setSize(500,400);
		
		 //��ť
		ImageIcon SEARCH=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_11.png");
		ImageIcon MANGER=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_14.png");
		ImageIcon TOURIST=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_12.png");
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
        
		//��ʾ
		zhujiemian.setResizable(false);
        zhujiemian.setVisible(true);
        
        //������Ϣ��************************************************************************************************
       // xinxilan.setLayout(null);
		xinxilan.getContentPane().setBackground(Color.GRAY);
		xinxilan.setLocation(620,380);
		xinxilan.setSize(230,200);
		Icon wornging=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_20.png");
		JLabel worng=new JLabel(wornging,JLabel.CENTER);
		worng.setLocation(500,400);
		worng.setSize(280,200);
		xinxilan.add(worng);
		xinxilan.setIconImage(im);
		
		//��ȷ��Ϣ��**************************************************************************************************
		//xinxilan2.setLayout(null);
		xinxilan2.getContentPane().setBackground(Color.GRAY);
		xinxilan2.setLocation(620,380);
		xinxilan2.setSize(230,200);
		Icon scceed=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_27.png");
		JLabel SUCCEED=new JLabel(scceed,JLabel.CENTER);
		SUCCEED.setLocation(500,400);
		SUCCEED.setSize(280,200);
		xinxilan2.add(SUCCEED);
		xinxilan2.setIconImage(im);
        
        // ***��ѯ����*******************************************************************************************
		chaxun.setLayout(null);
        //ͼ��
        chaxun.setIconImage(im);
        
        //��ɫ����
        Icon hbooksearch=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_16.png");
        JLabel chaxunbeijing=new JLabel(hbooksearch,JLabel.CENTER);
        chaxunbeijing.setBounds(0,70,500,100);
        //chaxun.setLayout(null);
        chaxun.add(chaxunbeijing);
        chaxun.getContentPane().setBackground(Color.orange);
		chaxun.setLocation(500,250);
		chaxun.setSize(500,400);
		search.addActionListener(new MyActLister());
		
		//�ı��� ��ǩ
		//chaxunlan.addFocusListener(new JTextFieldHintListener(chaxunlan, "�����������������ؼ���"));
		JTextField chaxunlan=new JTextField(20);
		chaxunlan.setBounds(100,150,280,26);
		chaxun.add(chaxunlan);
		
		//��ť
		ImageIcon chaxunanniu=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_17.png");
		JButton CHAXUNANNIU=new JButton(chaxunanniu);
		CHAXUNANNIU.setBounds(75,160,320,100);
        CHAXUNANNIU.setMargin(new Insets(0,0,0,0));
        CHAXUNANNIU.setBorderPainted(false);
        CHAXUNANNIU.setContentAreaFilled(false);
        CHAXUNANNIU.setFocusPainted(false);
        chaxun.add(CHAXUNANNIU);
        chaxun.setResizable(false);
      //********��ѯ����2***************************************************************************************
      		chaxun2.setLayout(null);
              //ͼ�� ��ɫ ��С
      		chaxun2.setLocation(500,250);
      		chaxun2.setSize(500,400);
              chaxun2.setIconImage(im);
              chaxun2.getContentPane().setBackground(Color.orange);
              //������ѯ��2
              CHAXUNANNIU.addActionListener(new MyActLister8());
              //System.out.print(chaxunjieguo);
              chaxunjieguo=chaxunlan.getText();//��ѯ���
              selectbook aw=new selectbook(chaxunjieguo);
              aw.countN();
              //System.out.println("wocao"+chaxunjieguo+"wocao");
        
       //               &&&&&&&&&&&&&&&&&&&&&&&&&&&&& ��ȡ����   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        //chaxunjieguo=chaxunlan.getText();
        
        // ***����Ա����********************************************************************************************
        
        guanliyuan.setIconImage(im);
        manger.addActionListener(new MyActLister2());
        guanliyuan.setLayout(null);
        
        //ҳ���С
        guanliyuan.setLocation(500,250);
		guanliyuan.setSize(500,400);
		
		//��ɫ
		guanliyuan.getContentPane().setBackground(Color.orange);
		
		//ͷ��
		ImageIcon xiaohuang=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_19.png");
		JLabel xiaohuangtouxiang=new JLabel(xiaohuang,JLabel.CENTER);
		xiaohuangtouxiang.setBounds(100,60,280,100);
		guanliyuan.add(xiaohuangtouxiang);
		
		//���룬�û��ı���,��ǩ
		JLabel yonghu=new JLabel("�� ��:");
		yonghu.setBounds(120,170,200,26);
		JLabel mima=new JLabel("�� ��:");
		mima.setBounds(120,210,200,26);
		JTextField yonghulan=new JTextField("                       С     ��",20);
		yonghulan.setBounds(160,170,200,26);
		yonghulan.setEditable(false);
		guanliyuan.add(yonghulan);
		guanliyuan.add(yonghu);
		guanliyuan.add(mima);
		
		
		mimalan.setBounds(160,210,200,26);
		guanliyuan.add(mimalan);

		
		 //��ť
		ImageIcon guanliyuananniu=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_17.png");
		JButton GUANLIYUANANNIU=new JButton(guanliyuananniu);
		GUANLIYUANANNIU.setBounds(95,220,320,100);
		GUANLIYUANANNIU.setMargin(new Insets(0,0,0,0));
		GUANLIYUANANNIU.setBorderPainted(false);
		GUANLIYUANANNIU.setContentAreaFilled(false);
		GUANLIYUANANNIU.setFocusPainted(false);
        guanliyuan.add(GUANLIYUANANNIU);
        guanliyuan.setResizable(false);guanliyuan.setLocation(500,250);
		guanliyuan.setSize(500,400);
        
		//��ť�����ж�
        GUANLIYUANANNIU.addActionListener(new MyActLister3());
        
        //����Ա2����*********************************************************************************************
        //��С
        guanliyuan2.setLayout(null);
        guanliyuan2.setIconImage(im);
        guanliyuan2.setLocation(500,250);
		guanliyuan2.setSize(500,400);
		
		//��ť
		ImageIcon a1=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_28.png");
		ImageIcon a2=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_29.png");
		ImageIcon a3=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_30.png");
		ImageIcon a4=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_31.png");
		
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
        //��ɫ
        guanliyuan2.getContentPane().setBackground(Color.orange);
        
        
        // ***�οͽ���*********************************************************************************************
        //���밴ť
        youke.setIconImage(im);
        tourist.addActionListener(new MyActLister4());
        youke.setLayout(null);
		//ͼ��
		ImageIcon youke2=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_21.png");
		JLabel youke3=new JLabel(youke2,JLabel.CENTER);
		youke3.setBounds(100,60,280,100);
		youke.add(youke3);
        
        //ͼ�� ��С��ɫ
        youke.setIconImage(im);
        youke.getContentPane().setBackground(Color.orange);
		youke.setLocation(500,250);
		youke.setSize(500,400);
        
		//��С
		youke.setResizable(false);
	    
		//�ı�����ǩ
		JLabel youke1=new JLabel("�� �� ID:");
		youke1.setBounds(105,160,190,26);
		JLabel mima2=new JLabel("�� ��:");
		mima2.setBounds(120,200,200,26);
		JTextField youkedenglulan=new JTextField(20);
		youkedenglulan.setBounds(160,160,200,26);
		youke.add(youkedenglulan);
		youke.add(youke1);
		youke.add(mima2);
        
		 //��ť
		ImageIcon zhuce=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_22.png");
		JButton ZHUCE=new JButton(zhuce);
		ZHUCE.setBounds(130,250,100,50);
		ZHUCE.setMargin(new Insets(0,0,0,0));
		ZHUCE.setBorderPainted(false);
		ZHUCE.setContentAreaFilled(false);
		ZHUCE.setFocusPainted(false);
        youke.add(ZHUCE);
        youke.setResizable(false);
        ImageIcon denglu=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_23.png");
		JButton DENGLU=new JButton(denglu);
		DENGLU.setBounds(280,250,100,50);
		DENGLU.setMargin(new Insets(0,0,0,0));
		DENGLU.setBorderPainted(false);
		DENGLU.setContentAreaFilled(false);
		DENGLU.setFocusPainted(false);
        youke.add(DENGLU);
        youke.setResizable(false);
        
        //������
        mimalan2.setBounds(160,200,200,26);
		youke.add(mimalan2);
		
		// ***ע�����*************************************************************************************
        //���밴ť
		zhucejiemian.setIconImage(im);
        ZHUCE.addActionListener(new MyActLister5());
        zhucejiemian.setLayout(null);
        //ͼ�� ��С��ɫ
        zhucejiemian.setIconImage(im);
        zhucejiemian.getContentPane().setBackground(Color.orange);
        zhucejiemian.setLocation(500,250);
        zhucejiemian.setSize(500,400);
        //����
        Icon icon3=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_25.png");
		JLabel beijing2=new JLabel(icon3,JLabel.CENTER);
		zhucejiemian.setLayout(null);
		beijing2.setBounds(-3,0,500,100);
        zhucejiemian.add(beijing2);
        //�ı���ǩ
		JLabel youke4=new JLabel("�� ��ID:");
		youke4.setBounds(105,160,190,26);
		JLabel youkemima=new JLabel("�� ��:");
		youkemima.setBounds(120,200,200,26);
		JLabel querenmima=new JLabel("ȷ �� �� ��:");
		querenmima.setBounds(90,240,200,26);
		JLabel name=new JLabel("�� ��:");
		name.setBounds(110,120,190,26);
		JLabel sex=new JLabel("�� ��:");
		sex.setBounds(270,120,190,26);
		
		
		youkedengzhuce.setBounds(160,160,200,26);
		
		namelan.setBounds(160,120,100,26);
		
		mimalan3.setBounds(160,200,200,26);
		
		mimalan4.setBounds(160,240,200,26);
		
		//��ť ��Ů
		
		ButtonGroup bg = new ButtonGroup();
		jrb.setBounds(340,120,40,26);
		jrb1.setBounds(300,120,40,26);
		bg.add(jrb1);
		bg.add(jrb);
		jrb.setContentAreaFilled(false);
		jrb1.setContentAreaFilled(false);
		
		
		//��ť ȷ��
		ImageIcon queren=new ImageIcon("C:\\\\Users\\\\Handsome Lu\\\\Desktop\\\\�½��ļ���\\\\�½��ļ���\\\\Java���Կγ����ָ��2019--2\\\\ͼ�ν���ѧϰ\\\\1_26.png");
		QUEREN.setIcon(queren);
		QUEREN.setBounds(208,275,100,50);
		QUEREN.setMargin(new Insets(0,0,0,0));
		QUEREN.setBorderPainted(false);
		QUEREN.setContentAreaFilled(false);
		QUEREN.setFocusPainted(false);
        zhucejiemian.add(QUEREN);
        //�����ж�
        QUEREN.addActionListener(new MyActLister6());
       // QUEREN.addActionListener(new MyActLister7());

		
		//�����ж�
		
		
		//����
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
		
		//��С
		zhucejiemian.setResizable(false);
		
		//**********�����鼮*******************************************************************************************
		//���� ͼ�� ��С
		shu_zengjia.setLayout(null);
		
		
//                               &&&&&&&&&&&&&&&&&&&&&&&&&&&&& ��ȡ����   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
         //chaxunjieguo=chaxunlan.getText();//��ѯ���
        /* if(chaxunjieguo!="�����������������ؼ���") 
         {
             selectbook aw=new selectbook(chaxunjieguo);
             aw.countN();
             System.out.println("wocao"+chaxunjieguo+"wocao");
         }*/
         
	}
	
	//�ڲ��࣬��ѯ����
	static class MyActLister implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			chaxun.setVisible(true);
			//chaxunlan.setText("");
		}
		
	}

	//�ڲ��࣬��ѯ����2
	static class MyActLister8 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			chaxun2.setVisible(true);
			//chaxunjieguo=chaxunlan.getText();//��ѯ���
			chaxun2.setVisible(true);
			//chaxunlan.setText("");
		}
		
	}
	
	//����Ա ��½����
	static class MyActLister2 implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
	
			guanliyuan.setVisible(true);
			mimalan.setText("");
		}
		
	}
	
	//�ο� ��½ע�����
	static class MyActLister4 implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
	
			youke.setVisible(true);
		}
		
	}
	
	//ע�����
	static class MyActLister5 implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
	
			zhucejiemian.setVisible(true);
		}
		
	}
	
   //�鼮����
	static class MyActLister7 implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
	
			shu_zengjia.setVisible(true);
		}
		
	}
	
	//�ڲ��� ����Ա�����ж�
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
	
	//�ڲ��� ע�������ж�
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
					sex2="Ů";
					}
				if(jrb.isSelected()){
					sex2="��";
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
	

	
	
	//��Ѱ����ʾ��
	/*static class JTextFieldHintListener implements FocusListener {
	    private String hintText=("");
	    private JTextField textField;
	    public JTextFieldHintListener(JTextField jTextField,String hintText) {
	        this.textField = jTextField;
	        this.hintText = hintText;
	        jTextField.setText(hintText);  //Ĭ��ֱ����ʾ
	        jTextField.setForeground(Color.GRAY);
	    }
	    public void focusGained(FocusEvent e) {
	        //��ȡ����ʱ�������ʾ����
	        String temp = textField.getText();
	        if(temp.equals(hintText)) {
	            textField.setText("");
	            textField.setForeground(Color.BLACK);
	        }
	        
	    }
	    public void focusLost(FocusEvent e) {    
	        //ʧȥ����ʱ��û���������ݣ���ʾ��ʾ����
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
		//��ѯ���ܣ����������ʲô��
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
				System.out.println("ͼ�����û���й��鼮");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//����鼮��ý�����һ���Ľ��棬�������鼮�Ĺݲ����
		String zxc1="";//����һ�����ݵ����õ��鼮����
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
		
		
		//���Ĺ���
		PreparedStatement ps21=null;
		PreparedStatement ds2=null;
		PreparedStatement cs2=null;
		PreparedStatement gs2=null;
		ResultSet rs2=null;
		String insertsql2="INSERT INTO BORROWRETURN(bNumber,rNumber,BorrowTime,ReturnTime) VALUES(?,?,?,?)";
		String updatesql21="UPDATE BOOK SET Stock=?";
		String updatesql22="UPDATE STOCK SET Status=?,BorrowTime=?,ReturnTime=? WHERE bNumber=?";
		String selectsql2="SELECT Stock FROM BOOK WHERE bID=?";
		//����������������
		try
		{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			ps21=conn.prepareStatement(insertsql2);    //����PrepareStatement����ps2
		    Scanner reader2=new Scanner(System.in);   //��ȡ��Ҫ���������
		    String bnumber=reader2.nextLine();
		    String rnumber=reader2.nextLine();
		    String borrowtime=reader2.nextLine();
		    String returntime=reader2.nextLine();
		    ps21.setString(1,bnumber);
		    ps21.setString(2,rnumber);
		    ps21.setString(3,borrowtime);                       //��ȡʱ��������⣬�޷����
		    ps21.setString(4,returntime);
		    int count2=ps21.executeUpdate();        //ִ�����insert2�Ĳ������
		    if(count2==1)                          //�ж��Ƿ����
		    {
		    	String bid=reader2.nextLine();           //��ȡ��Ҫ�������bid���ҵ�����Ĵ��������ж��Ƿ���Ҫ���д����ı�
			    ds2=conn.prepareStatement(selectsql2);
			    ds2.setString(1,bid);
			    rs2=ds2.executeQuery();             //ִ�����selectsql2�Ĳ�ѯ����
			    int stock2=0;
			    while(rs2.next()) 
			    {
			    	stock2=rs2.getInt("Stock");    //����鱾�Ĵ�����Ϣ
			    }
			    cs2=conn.prepareStatement(updatesql21);
			    stock2=stock2-1;
			    cs2.setInt(1,stock2);         
			    cs2.executeUpdate();               //ִ�����updatesql21���޸Ĳ������ı�BOOK��Stock��ֵ
			    gs2=conn.prepareStatement(updatesql22);
			    gs2.setString(2,borrowtime);
			    gs2.setString(3,returntime);
			    gs2.setString(1,"���");
			    gs2.setString(4,bnumber);
			    gs2.executeUpdate();              //ִ�����updatesql22���޸Ĳ������ı�STOCK��Status��BorrowTime��ReturnTime��ֵ
		    }
		}		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//����ӱ���ɾ������
		PreparedStatement ps22=null;
		ResultSet rs21=null;
		String deletesql2="DELETE FROM BORROWRETURN WHERE bNumber=?";
		String updatesql23="UPDATE STOCK SET Status=?,BorrowTime=null,ReturnTime=null WHERE bNumber=?";//������������Ϊ��
		try 
		{
			ps22=conn.prepareStatement(deletesql2);
			Scanner reader21=new Scanner(System.in);
			String bnumber22=reader21.nextLine();
			ps22.setString(1,bnumber22);
			int count21=ps22.executeUpdate();      //ִ�����deletesql2��ɾ������
			if(count21==1)                         //�ж��Ƿ���
			{
				String bid=reader21.nextLine();
			    ds2=conn.prepareStatement(selectsql2);
			    ds2.setString(1,bid);
			    rs21=ds2.executeQuery();             //ִ�����selectsql2�Ĳ�ѯ����
			    int stock21=0;
			    while(rs2.next()) 
			    {
			    	stock21=rs2.getInt("Stock");    //����鱾�Ĵ�����Ϣ
			    }
			    cs2=conn.prepareStatement(updatesql21);
			    stock21=stock21+1;
			    cs2.setInt(1,stock21);         
			    cs2.executeUpdate();               //ִ�����updatesql21���޸Ĳ������ı�BOOK��Stock��ֵ
			    gs2=conn.prepareStatement(updatesql23);
			    gs2.setString(1,"�ڹ�");
			    gs2.setString(2,bnumber22);
			    gs2.executeUpdate();               //ִ�����updatesql23���޸Ĳ������ı�STOCK��Status��BorrowTime��ReturnTime��ֵ
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		//����֤����
		//����֤���벿�ֻ����û�ע��
		Scanner reader3=new Scanner(System.in);
		String rnumber3=reader3.nextLine();
		String rname3=reader3.nextLine();
		String rsex3=reader3.nextLine();
		String registerdate3=reader3.nextLine();         //���������޷�ʵ��
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
		    ps3.executeUpdate();                      //ִ�����insertsql3�Ĳ����������ɶ����¶��߼���Ľ���֤����
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//����֤ɾ�������û�ע��
		String deletesql3="DELETE FROM BOOK WHERE rNumber=?";
		Scanner reader31=new Scanner(System.in);
		String rnumber=reader31.nextLine();
		PreparedStatement ps31=null;
		try 
		{
			ps31=conn.prepareStatement(deletesql3);
			ps31.setString(1,rnumber);
			ps31.executeUpdate();                       //ִ�����deletesql3��ɾ����������ɶԶ���ɾ���Ľ��Ĺ�������ע������
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		��ѯ�鱾��������,Ϊ�䴴��һ����
		String getbookstock="SELECT Stock FROM BOOK WHERE bid=?";
		Scanner getbookid=new Scanner(System.in);
		int bookid=getbookid.nextint();   //�Ӽ�������ķ�ʽ��ȡbID
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
		
		
		//ͼ�����
		//������룬���жϹ����Ƿ��и�������,���鼮��ѯ����,
		String selectsql41="SELECT bID FROM BOOK WHERE bName=?";
		Scanner reader4=new Scanner(System.in);
		String bname4=reader4.nextLine();
		PreparedStatement ps4=null;
		ResultSet rs4=null;
		int count=0;        //�����жϹ����Ƿ����飬������ֻͨ�������жϣ������м����У������ڼ�����û�У��жϿ���retuen count��ȥ������0�����飬����0û����
		try
		{
			ps4=conn.prepareStatement(selectsql41);
			ps4.setString(1,bname4);
			rs4=ps4.executeQuery();
			while(rs4.next()) 
			{
				int bid=rs.getInt("bID");                    //�ⲿ������������󷵻ص���Ϣ������return��ȥ
				String bname=rs.getString("bName");
				String bwriter=rs.getString("bWriter");
				String publishinghouse=rs.getString("PublishingHouse");
				String publicationdate=rs.getString("PublicationDate");
				int stock=rs.getInt("Stock");
				count++;
			}
			if(count==0)
			{
				System.out.println("ͼ�����û���й��鼮");
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		
		Scanner reader41=new Scanner(System.in);         //¼��Ҫ�������������
		String bname=reader41.nextLine();                //����
		String bplace=reader41.nextLine();               //��Ĵ�ŵ�ַ
		String status=reader41.nextLine();               //���Ƿ��ڹ���
		int bid=reader41.nextInt();                      //�������
		int bnumber=reader41.nextInt();                  //ÿ������ͼ������number
		String bwriter=reader41.nextLine();              //�������
		String btraslator=reader41.nextLine();           //�������
		String publishinghouse=reader41.nextLine();      //��ĳ�����
		int n=reader41.nextInt();                        //����n����ͬ��
		if(count>0)                       //������飬������ͬ��
		{
			String updatesql41="UPDATE BOOK SET Stock=?";
			PreparedStatement ps41=null;
			try 
			{
				ps41=conn.prepareStatement(updatesql41);
				//���ò�ѯ�������ܻ�ȡ�鼮stock
				ps41.setInt(1,stock+n);
				ps41.executeUpdate();              //ִ�����updatesql41�Ĳ������޸�BOOK Stock��ֵ
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
			String insertsql41="INSERT INTO STOCK(bNumber,bName,bPlace,Status,) VALUES(?,?,?,?)";//���ʱ��͹黹ʱ��û��д��
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
					ps42.executeUpdate();        //ִ�����insertsql41�Ĳ��������
				}
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		else                   //���û�и����飬������ȫ�µ���
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
				ps43.executeUpdate();                   //ִ�����insert42�Ĳ������
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
					ps44.executeUpdate();        //ִ�����insertsql43�Ĳ��������
				}
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		//ɾ���鼮�����жϹ����Ƿ��и�������,���鼮��ѯ����
		String selectsql5="SELECT bID FROM BOOK WHERE bName=?";
		Scanner reader5=new Scanner(System.in);
		String bname5=reader5.nextLine();
		PreparedStatement ps5=null;
		ResultSet rs5=null;
		int count5=0;        //�����жϹ����Ƿ����飬������ֻͨ�������жϣ������м����У������ڼ�����û�У��жϿ���retuen count��ȥ������0�����飬����0û����
		try
		{
			ps5=conn.prepareStatement(selectsql5);
			ps4.setString(1,bname5);
			rs4=ps4.executeQuery();
			while(rs4.next()) 
			{
				int bid=rs.getInt("bID");                    //�ⲿ������������󷵻ص���Ϣ������return��ȥ
				String bname=rs.getString("bName");
				String bwriter=rs.getString("bWriter");
				String publishinghouse=rs.getString("PublishingHouse");
				String publicationdate=rs.getString("PublicationDate");
				int stock=rs.getInt("Stock");
				count++;
			}
			if(count==0)
			{
				System.out.println("ͼ�����û���й��鼮");
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		if(count>0)               //ͼ������и���
		{
			//ͨ����ѯ�鱾�������ܣ���ѯ�鱾����Stock
			if(stock>1)            //�����������1
			{
				String updatesql5="UPDATE BOOK SET Stock=? WHERE bID=?";
				String deletesql5="DELETE FROM STOCK WHERE bNumber=��";
				PreparedStatement ps51=null;
				PreparedStatement ps52=null;
				try 
				{
					ps51=conn.prepareStatement(updatesql5);
					ps51.setInt(1,stock-1);
					ps51.setInt(2, bid1111);
					ps51.executeUpdate();              //ִ�����update5���޸Ĳ������޸�BOOK��Stock��ֵ
					ps52=conn.prepareStatement(updatesql5);
					ps52.setInt(1,bnum);             //��Ҫ�ټ�˼�� 
					ps52.executeUpdate();              //ִ�����deletesql5��ɾ��������ɾ��STOCKһ����¼������ȷ��һ���飨nNumber���Ķ���
				}
				catch(Exception e) 
				{
					e.printStackTrace();
				}
			}
			else 
			{
				String deletesql51="DELETE FROM BOOK WHERE bID=��";
				String deletesql52="DELETE FROM STOCK WHERE bNumber=��";
				PreparedStatement ps51=null;
				PreparedStatement ps52=null;
				try 
				{
					ps51=conn.prepareStatement(deletesql51);
					ps51.setInt(1,bid111111);
					ps51.executeUpdate();              //ִ�����deletesql51�Ĳ�����ɾ��BOOK bID�ļ�¼
					ps52=conn.prepareStatement(deletesql52);
					ps51.setInt(1,bid111111);
					ps52.executeUpdate();              //ִ�����deletesql52�Ĳ�����ɾ��STOCK bNumber�ļ�¼
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
