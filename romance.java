package TermProject;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class romance implements ActionListener{
	JFrame jf6;
	JMenuBar bar;
	JMenu genre, menu;
	JMenuItem act, ani, hor, comi, sf, list, home;
	JTabbedPane tabpane4;
	
	public romance() {
		jf6 = new JFrame("�θǽ�");
		makeMenu();
		tabpane4 = new JTabbedPane();
		
		JPanel m1 = new JPanel(new BorderLayout());
		m1.setBackground(new Color(255,112,237));
		
		JLabel t1 = new JLabel("                                <���Ǵ��̾�>");
		Font font = new Font("���� ����",Font.PLAIN,30);
		t1.setFont(font);
		
		ImageIcon icon1 = new ImageIcon("./Image/���Ǵ��̾�.jpg");
		Image img1 = icon1.getImage();
		Image changeImg1 = img1.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon1 = new ImageIcon(changeImg1);
		JLabel pic1 = new JLabel(changedIcon1);
		
		JPanel p1 = new JPanel(new GridLayout(2,2));
		JLabel name1 = new JLabel("����");
		JLabel n1 = new JLabel("�����");
		JLabel actor1 = new JLabel("�ֿ� ���");
		JLabel an1 = new JLabel("������, �̵���, ���ϴ�, ����, ������, ������, ������, �迵��, ������...");
		p1.add(name1);
		p1.add(n1);
		p1.add(actor1);
		p1.add(an1);
		
		JPanel p2 = new JPanel(new GridLayout(6,1));
		JLabel c1 = new JLabel("15��° ����ģ���� ������ �����̴� ȣ�ڸ��� '����' �׷� ������ �ӵ� �� ä ����ģ�� '����' ���� �ʰ��� ��¦ ��ȥ��");
		JLabel c2 = new JLabel("��ǥ�ϴ� '��ȿ' ��� �� �� �������� ¦�� ���������� �����ϴ� ȣ�� ��ǥ '����' ������ ����� ���� ���� ��Ȱ������ �پ��");
		JLabel c3 = new JLabel("�Ͽ콺Ű�� '�̿�' ������ ���� ���� 5����, �Ǵ� ���� �ϳ��� ���� ȣ�� ������ '���'���� ����� ����� �����");
		JLabel c4 = new JLabel("���� ���� �� �����⸦ �����ϰ� �Բ��ϴ� ������ �ܼ�Ʈ�� �յ� ���� '�̰�'�� �Ŵ��� '����' 40�� ���� �쿬�� ù��� 'ĳ����'��");
		JLabel c5 = new JLabel("�ٽ� ���� ȣ�� ���� ����� '���' ���� ����� ȣ�� ��������� ���ο� �ο��� ��ٸ��� �¼��� '��ȣ'���� ���� �����ϰ�,");
		JLabel c6 = new JLabel("���� ��ƶ�ϰ�, ���� �������� �ູ�� ������ ������, ȣ�� ���ν����� ����� ��ٸ��ϴ�.");
		p2.add(c1);
		p2.add(c2);
		p2.add(c3);
		p2.add(c4);
		p2.add(c5);
		p2.add(c6);
		
		JPanel p3 = new JPanel(new GridLayout(2,1));
		p3.add(p1);
		p3.add(p2);
		
		m1.add("North",t1);
		m1.add("Center",pic1);
		m1.add("South",p3);
		
		JPanel m2 = new JPanel(new BorderLayout());
		m2.setBackground(new Color(255,112,237));
		
		JLabel t2 = new JLabel("                                <��ٿ�Ÿ��>");
		t2.setFont(font);
		
		ImageIcon icon2 = new ImageIcon("./Image/abouttime.jpg");
		Image img2 = icon2.getImage();
		Image changeImg2 = img2.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon2 = new ImageIcon(changeImg2);
		JLabel pic2 = new JLabel(changedIcon2);
		
		JPanel p4 = new JPanel(new GridLayout(2,2));
		JLabel name2 = new JLabel("����");
		JLabel n2 = new JLabel("������ ĿƼ��");
		JLabel actor2 = new JLabel("�ֿ� ���");
		JLabel an2 = new JLabel("���� �۸���, ����ÿ �ƾƴ㽺");
		p4.add(name2);
		p4.add(n2);
		p4.add(actor2);
		p4.add(an2);
		
		JPanel p5 = new JPanel(new GridLayout(6,1));
		JLabel c7 = new JLabel("���¼ַ� ���� ������ �� ��, �ƹ����κ��� ������� ������ ����� ��� �ȴ�. �ٷ� �ð��� �ǵ��� �� �ִ� �ɷ��� �ִٴ� ��!");
		JLabel c8 = new JLabel("�װ��� ��� ��Ʋ���� ���̰ų� ���Ű� �߰ſ� ����� �� ���� ������, ����ģ���� ������� �� ������... ���� ���� �������� ��");
		JLabel c9 = new JLabel("���� �쿬�� ���� ��������� ���� �޸����� ù���� ���ϰ� �ȴ�. �׳��� ����� ��� ���� �ڽ��� Ư���� �ɷ��� ������ �����ϴ� ��");
		JLabel c10 = new JLabel("��� ���, ����� ������ �����ε�! �߰ſ��� ���� ���� �̰߰� ���÷���! �޿� �׸��� �׳�� ���ϸ��� �ְ��� ������ ������.");
		JLabel c11 = new JLabel("������ �׿� �׳��� ����� �Ϻ��������� ���� �ѷ��� �ֺ� ��Ȳ���� �̹��ϰ� ��������, ����ġ ���� ��ǵ��� �������� ��Ÿ���� �����ϴµ�...");
		JLabel c12 = new JLabel("��� ������ �ٽ� ��� �ȴٸ�, ���� �Ϻ��� ����� �̷� �� ������?");
		p5.add(c7);
		p5.add(c8);
		p5.add(c9);
		p5.add(c10);
		p5.add(c11);
		p5.add(c12);
		
		JPanel p6 = new JPanel(new GridLayout(2,1));
		p6.add(p4);
		p6.add(p5);
		
		m2.add("North", t2);
		m2.add("Center",pic2);
		m2.add("South",p6);
		
		JPanel m3 = new JPanel(new BorderLayout());
		m3.setBackground(new Color(255,112,237));
		
		JLabel t3 = new JLabel("                               <��Ƽ�λ��̵�>");
		t3.setFont(font);
		
		ImageIcon icon3 = new ImageIcon("./Image/beauty.jpg");
		Image img3 = icon3.getImage();
		Image changeImg3 = img3.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changedIcon3 = new ImageIcon(changeImg3);
		JLabel pic3 = new JLabel(changedIcon3);
		
		JPanel p7 = new JPanel(new GridLayout(2,2));
		JLabel name3 = new JLabel("����");
		JLabel n3 = new JLabel("������");
		JLabel actor3 = new JLabel("�ֿ� ���");
		JLabel an3 = new JLabel("��ȿ��, ����, �輺��, �ڽ���, �̹���, �ڼ���, ���ȣ, õ����, ������...");
		p7.add(name3);
		p7.add(n3);
		p7.add(actor3);
		p7.add(an3);
		
		JPanel p8 = new JPanel(new GridLayout(3,1));
		JLabel c13 = new JLabel("����, ����, ����, ����.. ������ �ܱ��α���! �ڰ� �Ͼ�� ���� �ٸ� ������� ���ϴ� ����, '����'.");
		JLabel c14 = new JLabel("�׿��� ó������ ����� ���ϰ� ���� �� �ѻ���� �����. ���� D-DAY! '����'�� �׳࿡�� �ڽ��� ������");
		JLabel c15 = new JLabel("�����ϱ�� �ϴµ�...\"�ʹ��� ���ƿ�? ������ũ�� ���ƿ�? ���..���� ��û ���� �߾��. ���� �� �����̶� �� �԰� �;..\"");
		p8.add(c13);
		p8.add(c14);
		p8.add(c15);
		
		JPanel p9 = new JPanel(new GridLayout(2,1));
		p9.add(p7);
		p9.add(p8);
		
		m3.add("North",t3);
		m3.add("Center",pic3);
		m3.add("South",p9);
		
		tabpane4.add("���Ǵ��̾�",m1);
		tabpane4.add("��ٿ�Ÿ��", m2);
		tabpane4.add("��Ƽ�λ��̵�", m3);
		
		jf6.getContentPane().add(tabpane4,BorderLayout.CENTER);
		jf6.setJMenuBar(bar);
		jf6.setSize(900,900);
		jf6.setVisible(true);
		
	}
	
	public void makeMenu() {
		bar = new JMenuBar();
		genre = new JMenu("�帣");
		genre.setMnemonic('G');
		
		menu = new JMenu("�޴�");
		menu.setMnemonic('M');
		
		list = new JMenuItem("list");
		list.setMnemonic('L');
		menu.add(list);
		list.addActionListener(this);
		
		home = new JMenuItem("HOME");
		home.setMnemonic('h');
		menu.add(home);
		home.addActionListener(this);
		
		act = new JMenuItem("�׼�");
		act.setMnemonic('A');
		genre.add(act);
		act.addActionListener(this);
		
		ani = new JMenuItem("�ִϸ��̼�");
		ani.setMnemonic('N');
		genre.add(ani);
		ani.addActionListener(this);
		
		hor = new JMenuItem("����");
		hor.setMnemonic('H');
		genre.add(hor);
		hor.addActionListener(this);
		
		comi = new JMenuItem("�ڹ̵�");
		comi.setMnemonic('C');
		genre.add(comi);
		comi.addActionListener(this);
		
		sf = new JMenuItem("SF");
		sf.setMnemonic('S');
		genre.add(sf);
		sf.addActionListener(this);
		
		bar.add(genre);
		bar.add(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == home) {
			new Innermain();
			jf6.dispose();
		}
		else if(e.getSource() == act) {
			new action();
			jf6.dispose();
		}
		else if(e.getSource() == ani) {
			new animation();
			jf6.dispose();
		}
		else if(e.getSource()== hor) {
			new horror();
			jf6.dispose();
		}
		else if(e.getSource() == comi) {
			new comedy();
			jf6.dispose();
		}
		else if(e.getSource()==sf) {
			new SF();
			jf6.dispose();
		}
		else if(e.getSource()==list) {
			new list();
			jf6.dispose();
		}
	}
}