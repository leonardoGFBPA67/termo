
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Leonardo
 */
public class Termo extends javax.swing.JFrame {

    String[] palavras = {
        "carta", "mundo", "praia", "monte", "feliz", "sonho", "noite", "claro", "cheio", "vagas", "força", "beijo", "culpa", "tempo", "nobre", "honra", "pagar", "atuar", "fraco", "pacto", "canto", "ritmo", "fatia", "casar", "amigo", "firme", "livro", "fugir", "bravo", "tanto", "terno", "verde", "marca", "justo", "matar", "dança", "hotel", "pleno", "amado", "servo", "letra", "frase", "bebeu", "nuvem", "roupa", "museu", "pobre", "famos", "pular", "nasce", "carne", "vigor", "lento", "custe", "zebra", "bolsa", "couro", "traje", "massa", "vidro", "navio", "motor", "tocar", "andar", "abrir", "limpo", "suave", "rival", "banco", "turma", "grupo", "posto", "certo", "cesta", "coisa", "nível", "dente", "mesma", "mesmo", "vento", "chuva", "salto", "gosto", "culpa", "festa", "tarde", "antes", "depois", "sorte", "sinal", "lugar", "geral", "perto", "longe", "igual", "topar", "tomar", "comer", "beber", "temor", "caber", "falar", "calma", "saiba", "olhar", "dizer", "achar", "viver", "prova", "meter", "ouvir", "puxar", "furor", "fusão", "razão", "tarde", "criar", "meter", "pesar", "lider", "mando", "legal", "civil", "tribo", "lenda", "folga", "prato", "suado", "fomei", "nobre", "gesto", "carga", "pilha", "cesto", "fardo", "trago", "saldo", "visão", "argua", "clima", "coste", "magia", "morte", "mudar", "fundo", "linha", "faixa", "cesta", "lutar", "lance", "cinto", "focar", "molho", "couro", "vazio", "prado", "poema", "barco", "frota", "mural", "folha", "bicho", "papel", "pente", "serra", "cesto", "vinho", "pista", "torre", "costa", "fenda", "jogar", "lindo", "antes", "sonar", "pouco", "estar", "sabor", "cardo", "jovem", "ricos", "pobre", "covil", "pular", "tocar", "vasto", "reino", "globo", "cerne", "posto", "corpo", "aroma", "rever", "saber", "crise", "norma", "repor", "seara", "couss", "chefe", "agora", "burro", "nossa", "vozão", "mural", "prior", "comum", "preço", "valeu", "trapo", "tutor", "forma", "humor", "falar", "cansa", "listo", "fosse", "haste", "cópia", "fraude", "claro"
    };
    ImageIcon imagem = new ImageIcon(getClass().getResource("imagens/fundo.png"));

    String palavraSorteada = "";

    JLabel ml[][] = new JLabel[6][5];

    /**
     * Creates new form Termo
     */
    public Termo() {
        initComponents();
        geraLabels(6, 5);
        criarFundo();
        
        configurarTeclasTeclado(this);
        sortearPalavra();
    }
    private void criarFundo() {
        JLabel label = new JLabel();
        label.setBounds(0, 0, 728, 566);
        label.setIcon(imagem);
        this.add(label);
    }

    private void configurarTeclasTeclado(JFrame frame) {
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_A:
                        preencherCampo("A");
                        break;
                    case KeyEvent.VK_B:
                        preencherCampo("B");
                        break;
                    case KeyEvent.VK_C:
                        preencherCampo("C");
                        break;
                    case KeyEvent.VK_D:
                        preencherCampo("D");
                        break;
                    case KeyEvent.VK_E:
                        preencherCampo("E");
                        break;
                    case KeyEvent.VK_F:
                        preencherCampo("F");
                        break;
                    case KeyEvent.VK_G:
                        preencherCampo("G");
                        break;
                    case KeyEvent.VK_H:
                        preencherCampo("H");
                        break;
                    case KeyEvent.VK_I:
                        preencherCampo("I");
                        break;
                    case KeyEvent.VK_J:
                        preencherCampo("J");
                        break;
                    case KeyEvent.VK_K:
                        preencherCampo("K");
                        break;
                    case KeyEvent.VK_L:
                        preencherCampo("L");
                        break;
                    case KeyEvent.VK_M:
                        preencherCampo("M");
                        break;
                    case KeyEvent.VK_N:
                        preencherCampo("N");
                        break;
                    case KeyEvent.VK_O:
                        preencherCampo("O");
                        break;
                    case KeyEvent.VK_P:
                        preencherCampo("P");
                        break;
                    case KeyEvent.VK_Q:
                        preencherCampo("Q");
                        break;
                    case KeyEvent.VK_R:
                        preencherCampo("R");
                        break;
                    case KeyEvent.VK_S:
                        preencherCampo("S");
                        break;
                    case KeyEvent.VK_T:
                        preencherCampo("T");
                        break;
                    case KeyEvent.VK_U:
                        preencherCampo("U");
                        break;
                    case KeyEvent.VK_V:
                        preencherCampo("V");
                        break;
                    case KeyEvent.VK_W:
                        preencherCampo("W");
                        break;
                    case KeyEvent.VK_X:
                        preencherCampo("X");
                        break;
                    case KeyEvent.VK_Y:
                        preencherCampo("Y");
                        break;
                    case KeyEvent.VK_Z:
                        preencherCampo("Z");
                        break;
                    case KeyEvent.VK_BACK_SPACE:
                        preencherCampo("");
                        break;
                }
            }
        });

        frame.setFocusable(true);
        frame.requestFocusInWindow();
    }
    private void preencherCampo(String letra){
        ml[0][0].setText(letra);
        
    }


    private void geraLabels(int a, int b) {
        for (int linha = 0; linha < a; linha++) {
            for (int coluna = 0; coluna < b; coluna++) {
                ml[linha][coluna] = new JLabel();
                ml[linha][coluna].setBounds(coluna * 55 + 213, linha * 62 + 38, 50, 50);
                ml[linha][coluna].setFont(new Font("Arial", Font.BOLD, 18));
                ml[linha][coluna].setHorizontalAlignment(SwingConstants.CENTER);
                ml[linha][coluna].setOpaque(true);          // necessário para mostrar o fundo
                ml[linha][coluna].setBackground(new Color(121, 87, 53)); // cor de fundo
                ml[linha][coluna].setForeground(Color.WHITE);// cor do texto
                ml[linha][coluna].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                if (linha > 0){
                ml[linha][coluna].setBackground(new Color(179, 139, 109));
                }
                add(ml[linha][coluna]);
            }
        }
    }

    private void sortearPalavra() {
        Random r = new Random();
        int indicePalavra = r.nextInt(palavras.length);
        System.out.println(palavras[indicePalavra]);
        palavraSorteada = palavras[indicePalavra];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbtentar = new javax.swing.JButton();
        jbq = new javax.swing.JButton();
        jbw = new javax.swing.JButton();
        jbe = new javax.swing.JButton();
        jbt = new javax.swing.JButton();
        jby = new javax.swing.JButton();
        jbr = new javax.swing.JButton();
        jbi = new javax.swing.JButton();
        jbo = new javax.swing.JButton();
        jbu = new javax.swing.JButton();
        jbs = new javax.swing.JButton();
        jbd = new javax.swing.JButton();
        jba = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jbg = new javax.swing.JButton();
        jbh = new javax.swing.JButton();
        jbf = new javax.swing.JButton();
        jbk = new javax.swing.JButton();
        jbl = new javax.swing.JButton();
        jbj = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jbp = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(728, 566));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TERMULANDO");

        jbtentar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtentar.setText("TENTAR");
        jbtentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtentarActionPerformed(evt);
            }
        });

        jbq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbq.setText("Q");
        jbq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbqActionPerformed(evt);
            }
        });

        jbw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbw.setText("W");
        jbw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbwActionPerformed(evt);
            }
        });

        jbe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbe.setText("E");
        jbe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeActionPerformed(evt);
            }
        });

        jbt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbt.setText("T");
        jbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtActionPerformed(evt);
            }
        });

        jby.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jby.setText("Y");
        jby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbyActionPerformed(evt);
            }
        });

        jbr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbr.setText("R");
        jbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbrActionPerformed(evt);
            }
        });

        jbi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbi.setText("I");
        jbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbiActionPerformed(evt);
            }
        });

        jbo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbo.setText("O");
        jbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboActionPerformed(evt);
            }
        });

        jbu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbu.setText("U");
        jbu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuActionPerformed(evt);
            }
        });

        jbs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbs.setText("S");
        jbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsActionPerformed(evt);
            }
        });

        jbd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbd.setText("D");
        jbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbdActionPerformed(evt);
            }
        });

        jba.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jba.setText("A");
        jba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbaActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton13.setText("X");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton14.setText("C");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton15.setText("Z");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jbg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbg.setText("G");
        jbg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbgActionPerformed(evt);
            }
        });

        jbh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbh.setText("H");
        jbh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbhActionPerformed(evt);
            }
        });

        jbf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbf.setText("F");
        jbf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbfActionPerformed(evt);
            }
        });

        jbk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbk.setText("K");
        jbk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbkActionPerformed(evt);
            }
        });

        jbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbl.setText("L");
        jbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblActionPerformed(evt);
            }
        });

        jbj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbj.setText("J");
        jbj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbjActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton22.setText("B");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton23.setText("N");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton24.setText("V");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton27.setText("M");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jbp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbp.setText("P");
        jbp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbpActionPerformed(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton26.setText("<");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jba)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbl)
                                .addGap(18, 18, 18)
                                .addComponent(jButton26))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton27)
                                .addGap(18, 18, 18)
                                .addComponent(jbtentar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jby)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbp)))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 401, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbw, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jby, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbj, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jba, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtentar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtentarActionPerformed
        // TODO add your handling code here:

        int quantidadeErros = 0;
        String palavraSecreta = "Cinco";
        int tentaivas = 0;
        String tentativa = "";

//        if (txttentativa.getText() != 5) {
//            JOptionPane.showMessageDialog(null, "A palavra deve conter 5 letras!");
//        }
        if (tentativa.equals(palavraSecreta)) {
            JOptionPane.showMessageDialog(null, "Acertou Parabéns");
        }
    }//GEN-LAST:event_jbtentarActionPerformed

    private void jbqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbqActionPerformed

    private void jbwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbwActionPerformed

    private void jbeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbeActionPerformed

    private void jbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtActionPerformed

    private void jbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbyActionPerformed

    private void jbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbrActionPerformed

    private void jbiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbiActionPerformed

    private void jboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jboActionPerformed

    private void jbuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbuActionPerformed

    private void jbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbsActionPerformed

    private void jbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbdActionPerformed

    private void jbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbaActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jbgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbgActionPerformed

    private void jbhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbhActionPerformed

    private void jbfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbfActionPerformed

    private void jbkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbkActionPerformed

    private void jblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jblActionPerformed

    private void jbjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbjActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jbpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbpActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Termo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Termo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Termo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Termo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Termo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jba;
    private javax.swing.JButton jbd;
    private javax.swing.JButton jbe;
    private javax.swing.JButton jbf;
    private javax.swing.JButton jbg;
    private javax.swing.JButton jbh;
    private javax.swing.JButton jbi;
    private javax.swing.JButton jbj;
    private javax.swing.JButton jbk;
    private javax.swing.JButton jbl;
    private javax.swing.JButton jbo;
    private javax.swing.JButton jbp;
    private javax.swing.JButton jbq;
    private javax.swing.JButton jbr;
    private javax.swing.JButton jbs;
    private javax.swing.JButton jbt;
    private javax.swing.JButton jbtentar;
    private javax.swing.JButton jbu;
    private javax.swing.JButton jbw;
    private javax.swing.JButton jby;
    // End of variables declaration//GEN-END:variables
}
