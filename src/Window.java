import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Window extends JFrame {

	// Panels
	private JPanel topPanel = new JPanel();
	private JPanel contentPan = new JPanel();
	private JPanel botPan = new JPanel();
	private JPanel colorPan = new JPanel();

	private ArrayList<JPanel> rowPanList = new ArrayList<JPanel>();

	// Buttons Choix row 1
	private JButton choix1Row1 = new JButton("1");
	private JButton choix2Row1 = new JButton("2");
	private JButton choix3Row1 = new JButton("3");
	private JButton choix4Row1 = new JButton("4");

	// Buttons Choix row 2
	private JButton choix1Row2 = new JButton("1");
	private JButton choix2Row2 = new JButton("2");
	private JButton choix3Row2 = new JButton("3");
	private JButton choix4Row2 = new JButton("4");

	// Buttons Choix row 3
	private JButton choix1Row3 = new JButton("1");
	private JButton choix2Row3 = new JButton("2");
	private JButton choix3Row3 = new JButton("3");
	private JButton choix4Row3 = new JButton("4");

	// Buttons Choix row 4
	private JButton choix1Row4 = new JButton("1");
	private JButton choix2Row4 = new JButton("2");
	private JButton choix3Row4 = new JButton("3");
	private JButton choix4Row4 = new JButton("4");

	// Buttons Choix row 5
	private JButton choix1Row5 = new JButton("1");
	private JButton choix2Row5 = new JButton("2");
	private JButton choix3Row5 = new JButton("3");
	private JButton choix4Row5 = new JButton("4");

	// Buttons Choix row 6
	private JButton choix1Row6 = new JButton("1");
	private JButton choix2Row6 = new JButton("2");
	private JButton choix3Row6 = new JButton("3");
	private JButton choix4Row6 = new JButton("4");

	// Buttons Choix row 7
	private JButton choix1Row7 = new JButton("1");
	private JButton choix2Row7 = new JButton("2");
	private JButton choix3Row7 = new JButton("3");
	private JButton choix4Row7 = new JButton("4");

	// Buttons Choix row 8
	private JButton choix1Row8 = new JButton("1");
	private JButton choix2Row8 = new JButton("2");
	private JButton choix3Row8 = new JButton("3");
	private JButton choix4Row8 = new JButton("4");

	private JButton choix1Row9 = new JButton("1");
	private JButton choix2Row9 = new JButton("2");
	private JButton choix3Row9 = new JButton("3");
	private JButton choix4Row9 = new JButton("4");

	private JButton choix1Row10 = new JButton("1");
	private JButton choix2Row10 = new JButton("2");
	private JButton choix3Row10 = new JButton("3");
	private JButton choix4Row10 = new JButton("4");

	// Buttons couleurs
	private JButton btnC1 = new JButton(" ");
	private JButton btnC2 = new JButton(" ");
	private JButton btnC3 = new JButton(" ");
	private JButton btnC4 = new JButton(" ");
	private JButton btnC5 = new JButton(" ");
	private JButton btnC6 = new JButton(" ");
	private JButton btnC7 = new JButton(" ");
	private JButton btnC8 = new JButton(" ");

	// Labels
	private JLabel tourVal = new JLabel();
	private JLabel essaiVal = new JLabel();
	private JLabel finalMsg = new JLabel();

	// Infos Jeu
	private Integer numTour = 1;
	private Integer nbEssai = 0;

	// Selected button
	JButton selectedBtn = null;

	private static final long serialVersionUID = 1613425471804970464L;

	public Window(String title, Integer width, Integer height) {

		this.setSize(width, height);
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null); // La page sera centrée
		this.setResizable(false);
		this.setVisible(true);

		CreateTopPanel();
		CreateBotPanel();
		CreateContentPan();

		InitAllRowPan();

		for (int i = 0; i < 10; i++) {
			ShowRowPan(i);
		}
	}

	private void CreateTopPanel()

	{
		JLabel tourLbl = new JLabel();
		JLabel essaiLbl = new JLabel();

		topPanel.setLayout(new GridLayout(1, 2));
		topPanel.setBackground(Color.orange);
		this.add(topPanel, BorderLayout.NORTH);

		tourLbl.setText("Tours :");
		tourLbl.setHorizontalAlignment(SwingConstants.CENTER);
		topPanel.add(tourLbl);

		tourVal.setText(numTour.toString());
		tourVal.setHorizontalAlignment(SwingConstants.LEFT);
		topPanel.add(tourVal);

		essaiLbl.setText("Essais :");
		essaiLbl.setHorizontalAlignment(SwingConstants.CENTER);
		topPanel.add(essaiLbl);

		essaiVal.setText(nbEssai.toString());
		essaiVal.setHorizontalAlignment(SwingConstants.LEFT);
		topPanel.add(essaiVal);

	}

	private void CreateContentPan() {
		contentPan.setLayout(new FlowLayout());
		this.add(contentPan, BorderLayout.CENTER);
	}

	private void CreateBotPanel() {
		botPan.setBackground(Color.orange);
		this.add(botPan, BorderLayout.SOUTH);
		CreateColorPan();
	}

	private void CreateColorPan() {
		colorPan.setBackground(Color.orange);
		colorPan.setLayout(new FlowLayout());
		CreationsBtn();
		AddBtnCouleur(colorPan);
		botPan.add(colorPan);
		ShowColorPan();
	}

	private void ShowColorPan() {
		if (colorPan.isVisible())
			colorPan.setVisible(false);
		else
			colorPan.setVisible(true);
	}

	// Ajout des boutons de choix des couleurs dans le panel des couleurs
	private void CreationsBtn() {
		btnC1.setBackground(Color.blue);
		btnC2.setBackground(Color.green);
		btnC3.setBackground(Color.yellow);
		btnC4.setBackground(Color.red);
		btnC5.setBackground(Color.orange);
		btnC6.setBackground(Color.white);
		btnC7.setBackground(Color.black);
		btnC8.setBackground(Color.magenta);

		btnC1.addActionListener(this::btnC1Listener);
		btnC2.addActionListener(this::btnC2Listener);
		btnC3.addActionListener(this::btnC3Listener);
		btnC4.addActionListener(this::btnC4Listener);
		btnC5.addActionListener(this::btnC5Listener);
		btnC6.addActionListener(this::btnC6Listener);
		btnC7.addActionListener(this::btnC7Listener);
		btnC8.addActionListener(this::btnC8Listener);

	}

	private void AddBtnCouleur(JPanel colorPan) {
		colorPan.add(btnC1);
		colorPan.add(btnC2);
		colorPan.add(btnC3);
		colorPan.add(btnC4);
		colorPan.add(btnC5);
		colorPan.add(btnC6);
		colorPan.add(btnC7);
		colorPan.add(btnC8);
	}

	// Initialisation des panel de lignes
	private void InitAllRowPan() {

		JPanel rowPan1 = new JPanel();
		JPanel rowPan2 = new JPanel();
		JPanel rowPan3 = new JPanel();
		JPanel rowPan4 = new JPanel();
		JPanel rowPan5 = new JPanel();
		JPanel rowPan6 = new JPanel();
		JPanel rowPan7 = new JPanel();
		JPanel rowPan8 = new JPanel();
		JPanel rowPan9 = new JPanel();
		JPanel rowPan10 = new JPanel();

		rowPanList.add(rowPan1);
		rowPanList.add(rowPan2);
		rowPanList.add(rowPan3);
		rowPanList.add(rowPan4);
		rowPanList.add(rowPan5);
		rowPanList.add(rowPan6);
		rowPanList.add(rowPan7);
		rowPanList.add(rowPan8);
		rowPanList.add(rowPan9);
		rowPanList.add(rowPan10);

		for (JPanel rowPan : rowPanList) {
			rowPan.setLayout(new FlowLayout());
		}

		InitChoixBtn();
	}

	// Ajout des boutons de choix de jeu dans les panel de lignes
	private void InitChoixBtn() {
		choix1Row1.addActionListener(this::btnChoix1Listener);
		choix2Row1.addActionListener(this::btnChoix2Listener);
		choix3Row1.addActionListener(this::btnChoix3Listener);
		choix4Row1.addActionListener(this::btnChoix4Listener);

		choix1Row2.addActionListener(this::btnChoix1Listener);
		choix2Row2.addActionListener(this::btnChoix2Listener);
		choix3Row2.addActionListener(this::btnChoix3Listener);
		choix4Row2.addActionListener(this::btnChoix4Listener);

		choix1Row3.addActionListener(this::btnChoix1Listener);
		choix2Row3.addActionListener(this::btnChoix2Listener);
		choix3Row3.addActionListener(this::btnChoix3Listener);
		choix4Row3.addActionListener(this::btnChoix4Listener);

		choix1Row4.addActionListener(this::btnChoix1Listener);
		choix2Row4.addActionListener(this::btnChoix2Listener);
		choix3Row4.addActionListener(this::btnChoix3Listener);
		choix4Row4.addActionListener(this::btnChoix4Listener);

		choix1Row5.addActionListener(this::btnChoix1Listener);
		choix2Row5.addActionListener(this::btnChoix2Listener);
		choix3Row5.addActionListener(this::btnChoix3Listener);
		choix4Row5.addActionListener(this::btnChoix4Listener);

		choix1Row6.addActionListener(this::btnChoix1Listener);
		choix2Row6.addActionListener(this::btnChoix2Listener);
		choix3Row6.addActionListener(this::btnChoix3Listener);
		choix4Row6.addActionListener(this::btnChoix4Listener);

		choix1Row7.addActionListener(this::btnChoix1Listener);
		choix2Row7.addActionListener(this::btnChoix2Listener);
		choix3Row7.addActionListener(this::btnChoix3Listener);
		choix4Row7.addActionListener(this::btnChoix4Listener);

		choix1Row8.addActionListener(this::btnChoix1Listener);
		choix2Row8.addActionListener(this::btnChoix2Listener);
		choix3Row8.addActionListener(this::btnChoix3Listener);
		choix4Row8.addActionListener(this::btnChoix4Listener);

		choix1Row9.addActionListener(this::btnChoix1Listener);
		choix2Row9.addActionListener(this::btnChoix2Listener);
		choix3Row9.addActionListener(this::btnChoix3Listener);
		choix4Row9.addActionListener(this::btnChoix4Listener);

		choix1Row10.addActionListener(this::btnChoix1Listener);
		choix2Row10.addActionListener(this::btnChoix2Listener);
		choix3Row10.addActionListener(this::btnChoix3Listener);
		choix4Row10.addActionListener(this::btnChoix4Listener);

		ShowRowPan(numTour);
	}

	public void ShowRowPan(Integer numTour) {
		switch (numTour) {
		case 1:
			rowPanList.get(numTour).add(choix1Row1);
			rowPanList.get(numTour).add(choix2Row1);
			rowPanList.get(numTour).add(choix3Row1);
			rowPanList.get(numTour).add(choix4Row1);
			contentPan.add(rowPanList.get(numTour));
			break;
		case 2:
			rowPanList.get(numTour).add(choix1Row2);
			rowPanList.get(numTour).add(choix2Row2);
			rowPanList.get(numTour).add(choix3Row2);
			rowPanList.get(numTour).add(choix4Row2);
			contentPan.add(rowPanList.get(numTour));
			break;
		case 3:
			rowPanList.get(numTour).add(choix1Row3);
			rowPanList.get(numTour).add(choix2Row3);
			rowPanList.get(numTour).add(choix3Row3);
			rowPanList.get(numTour).add(choix4Row3);
			contentPan.add(rowPanList.get(numTour));
			break;
		case 4:
			rowPanList.get(numTour).add(choix1Row4);
			rowPanList.get(numTour).add(choix2Row4);
			rowPanList.get(numTour).add(choix3Row4);
			rowPanList.get(numTour).add(choix4Row4);
			contentPan.add(rowPanList.get(numTour));
			break;
		case 5:
			rowPanList.get(numTour).add(choix1Row5);
			rowPanList.get(numTour).add(choix2Row5);
			rowPanList.get(numTour).add(choix3Row5);
			rowPanList.get(numTour).add(choix4Row5);
			contentPan.add(rowPanList.get(numTour));
			break;
		case 6:
			rowPanList.get(numTour).add(choix1Row6);
			rowPanList.get(numTour).add(choix2Row6);
			rowPanList.get(numTour).add(choix3Row6);
			rowPanList.get(numTour).add(choix4Row6);
			contentPan.add(rowPanList.get(numTour));
			break;
		case 7:
			rowPanList.get(numTour).add(choix1Row7);
			rowPanList.get(numTour).add(choix2Row7);
			rowPanList.get(numTour).add(choix3Row7);
			rowPanList.get(numTour).add(choix4Row7);
			contentPan.add(rowPanList.get(numTour));
			break;
		case 8:
			rowPanList.get(numTour).add(choix1Row8);
			rowPanList.get(numTour).add(choix2Row8);
			rowPanList.get(numTour).add(choix3Row8);
			rowPanList.get(numTour).add(choix4Row8);
			contentPan.add(rowPanList.get(numTour));
			break;
		case 9:
			rowPanList.get(numTour).add(choix1Row9);
			rowPanList.get(numTour).add(choix2Row9);
			rowPanList.get(numTour).add(choix3Row9);
			rowPanList.get(numTour).add(choix4Row9);
			contentPan.add(rowPanList.get(numTour));
			break;
		case 10:
			rowPanList.get(numTour).add(choix1Row10);
			rowPanList.get(numTour).add(choix2Row10);
			rowPanList.get(numTour).add(choix3Row10);
			rowPanList.get(numTour).add(choix4Row10);
			contentPan.add(rowPanList.get(numTour));
			break;
		default:
			break;
		}
	}

	public void ShowFinalPan(String _finalMsg) {
		JPanel finalPan = new JPanel();
		finalPan.setBackground(Color.gray);
		finalMsg.setText(_finalMsg);
		contentPan.add(finalPan);
		finalPan.add(finalMsg);
	}

	// GETTERS SETTERS

	public Integer getNumTour() {
		return numTour;
	}

	public void setNumTour(Integer numTour) {
		this.numTour = numTour;
		tourVal.setText(numTour.toString());
	}

	public Integer getNbEssai() {
		return nbEssai;
	}

	public void setNbEssai(Integer nbEssai) {
		this.nbEssai = nbEssai;
		essaiVal.setText(nbEssai.toString());
	}

	// LISTENERS
	private void btnC1Listener(ActionEvent event) {
		selectedBtn.setBackground(Color.blue);
		System.out.println("Bleu");
		ShowColorPan();
	}

	private void btnC2Listener(ActionEvent event) {
		selectedBtn.setBackground(Color.green);
		System.out.println("Vert");
		ShowColorPan();
	}

	private void btnC3Listener(ActionEvent event) {
		selectedBtn.setBackground(Color.yellow);
		System.out.println("Jaune");
		ShowColorPan();
	}

	private void btnC4Listener(ActionEvent event) {
		selectedBtn.setBackground(Color.red);
		System.out.println("Rouge");
		ShowColorPan();
	}

	private void btnC5Listener(ActionEvent event) {
		selectedBtn.setBackground(Color.orange);
		System.out.println("Orange");
		ShowColorPan();
	}

	private void btnC6Listener(ActionEvent event) {
		selectedBtn.setBackground(Color.white);
		System.out.println("Blanc");
		ShowColorPan();
	}

	private void btnC7Listener(ActionEvent event) {
		selectedBtn.setBackground(Color.black);
		System.out.println("Noir");
		ShowColorPan();
	}

	private void btnC8Listener(ActionEvent event) {
		selectedBtn.setBackground(Color.magenta);
		System.out.println("Violet");
		ShowColorPan();
	}

	private void btnChoix1Listener(ActionEvent event) {
		ShowColorPan();
		selectedBtn = (JButton) event.getSource();
		System.out.println("Choix 1");
	}

	private void btnChoix2Listener(ActionEvent event) {
		ShowColorPan();
		selectedBtn = (JButton) event.getSource();
		System.out.println("Choix 2");
	}

	private void btnChoix3Listener(ActionEvent event) {
		ShowColorPan();
		selectedBtn = (JButton) event.getSource();
		System.out.println("Choix 3");
	}

	private void btnChoix4Listener(ActionEvent event) {
		ShowColorPan();
		selectedBtn = (JButton) event.getSource();
		System.out.println("Choix 4");
	}
}
