
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
        "carta", "mundo", "praia", "monte", "feliz", "sonho", "noite", "claro", "cheio", "vagas", "força", "beijo", "culpa", "tempo", "nobre", "honra", "pagar", "atuar", "fraco", "pacto", "canto", "ritmo", "fatia", "casar", "amigo", "firme", "livro", "fugir", "bravo", "tanto", "terno", "verde", "marca", "justo", "matar", "dança", "hotel", "pleno", "amado", "servo", "letra", "frase", "bebeu", "nuvem", "roupa", "museu", "pobre", "famos", "pular", "nasce", "carne", "vigor", "lento", "custe", "zebra", "bolsa", "couro", "traje", "massa", "vidro", "navio", "motor", "tocar", "andar", "abrir", "limpo", "suave", "rival", "banco", "turma", "grupo", "posto", "certo", "cesta", "coisa", "nível", "dente", "mesma", "mesmo", "vento", "chuva", "salto", "gosto", "culpa", "festa", "tarde", "antes", "sorte", "sinal", "lugar", "geral", "perto", "longe", "igual", "topar", "tomar", "comer", "beber", "temor", "caber", "falar", "calma", "saiba", "olhar", "dizer", "achar", "viver", "prova", "meter", "ouvir", "puxar", "furor", "fusão", "razão", "tarde", "criar", "meter", "pesar", "lider", "mando", "legal", "civil", "tribo", "lenda", "folga", "prato", "suado", "fomei", "nobre", "gesto", "carga", "pilha", "cesto", "fardo", "trago", "saldo", "visão", "argua", "clima", "coste", "magia", "morte", "mudar", "fundo", "linha", "faixa", "cesta", "lutar", "lance", "cinto", "focar", "molho", "couro", "vazio", "prado", "poema", "barco", "frota", "mural", "folha", "bicho", "papel", "pente", "serra", "cesto", "vinho", "pista", "torre", "costa", "fenda", "jogar", "lindo", "antes", "sonar", "pouco", "estar", "sabor", "cardo", "jovem", "ricos", "pobre", "covil", "pular", "tocar", "vasto", "reino", "globo", "cerne", "posto", "corpo", "aroma", "rever", "saber", "crise", "norma", "repor", "seara", "couss", "chefe", "agora", "burro", "nossa", "vozão", "mural", "prior", "comum", "preço", "valeu", "trapo", "tutor", "forma", "humor", "falar", "cansa", "listo", "fosse", "haste", "cópia", "claro"
    };
    ImageIcon imagem = new ImageIcon(getClass().getResource("imagens/fundo.png"));

    String palavraSorteada = "";

    JLabel ml[][] = new JLabel[6][5];
    int colunaGlobal = 0;
    int linhaGlobal = 0;

    /**
     * Creates new form Termo
     */
    public Termo() {
        initComponents();
        geraLabels(6, 5);
        criarFundo();
        this.setLocation(320, 50);
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
                        preencherCampo("<");
                        break;
                    case KeyEvent.VK_ENTER:
                        conferirPalavra();
                        break;
                }
            }
        });

        frame.setFocusable(true);
        frame.requestFocusInWindow();
    }

    private void preencherCampo(String letra) {
        if (letra.equals("<")) {
            if (colunaGlobal > 0) {
                ml[linhaGlobal][colunaGlobal - 1].setText("");
                colunaGlobal--;
            }
            return;
        }

        if (colunaGlobal < 5) {
            ml[linhaGlobal][colunaGlobal].setText(letra);
            colunaGlobal++;
        }
        if (colunaGlobal >= 5) {
            jbtentar.setEnabled(true);
        }
    }

    private void conferirPalavra() {
        String copiaPalavraSorteada = palavraSorteada.toUpperCase();
        if (colunaGlobal < 5) {
            return;
        }
        String palavra = lerPalavra();
        if (palavra.equalsIgnoreCase(copiaPalavraSorteada)) {
            //mensagem fim de jogo
            for (int i = 0; i < 5; i++) {
                //deixar botão verde
                ml[linhaGlobal][i].setForeground(Color.GREEN);// cor do texto
            }
            JOptionPane.showMessageDialog(null, "Você ganhou!");
            int retorno = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", palavra, JOptionPane.YES_NO_OPTION);
            if (retorno == 0) {
                resetaLabels(6, 5);
                System.out.println(linhaGlobal);
            } else {
                return;
            }
        }
        for (int i = 0; i < 5; i++) {
            if (palavra.substring(i, i + 1).equalsIgnoreCase(palavraSorteada.substring(i, i + 1))) {
                //deixar botão verde
                ml[linhaGlobal][i].setForeground(Color.GREEN);// cor do texto
                atribuirCorBotaoLetra(palavra.substring(i, i + 1), Color.GREEN);
                copiaPalavraSorteada = conferirLetra(copiaPalavraSorteada, palavra, i);

            }
        }
        for (int i = 0; i < 5; i++) {
            if (copiaPalavraSorteada.toUpperCase().contains(palavra.substring(i, i + 1))) {
                ml[linhaGlobal][i].setForeground(Color.YELLOW);
                atribuirCorBotaoLetra(palavra.substring(i, i + 1), Color.YELLOW);
                copiaPalavraSorteada = conferirLetra(copiaPalavraSorteada, palavra, i);
            } else {
                atribuirCorBotaoLetra(palavra.substring(i, i + 1), Color.RED);
            }
        }

        if (linhaGlobal < 5) {
            linhaGlobal++;
            colunaGlobal = 0;
            habilitarProxLinha();
            this.setFocusable(true);
            this.requestFocusInWindow();
        } else {
            JOptionPane.showMessageDialog(null, "*voz do faustão* ERROOU" + "\n A palavra era: " + palavraSorteada);

            int retorno = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", palavra, JOptionPane.YES_NO_OPTION);
            if (retorno == 0) {
                resetaLabels(6, 5);
            } else {
                return;
            }
        }
    }

    private String conferirLetra(String copiaPalavraSorteada, String palavra, int i) {
        int indice = copiaPalavraSorteada.indexOf(palavra.substring(i, i + 1));
        System.out.println(palavraSorteada);
        System.out.println(indice);
        if (indice == - 1) {
            return copiaPalavraSorteada;
        }

        copiaPalavraSorteada.replace(palavra.substring(i, i + 1), "*");

        return copiaPalavraSorteada;
    }

    private String lerPalavra() {
        String palavra = "";
        for (int i = 0; i < 5; i++) {
            palavra += ml[linhaGlobal][i].getText();

        }
        return palavra;
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
                if (linha > 0) {
                    ml[linha][coluna].setBackground(new Color(179, 139, 109));
                }
                add(ml[linha][coluna]);
            }
        }
    }

    private void resetaLabels(int a, int b) {
        for (int linha = 0; linha < a; linha++) {
            for (int coluna = 0; coluna < b; coluna++) {
                ml[linha][coluna].setOpaque(true);          // necessário para mostrar o fundo
                ml[linha][coluna].setBackground(new Color(121, 87, 53)); // cor de fundo
                ml[linha][coluna].setForeground(Color.WHITE);// cor do texto
                ml[linha][coluna].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                if (linha > 0) {
                    ml[linha][coluna].setBackground(new Color(179, 139, 109));
                }
                ml[linha][coluna].setText("");
            }

        }
        linhaGlobal = 0;
        colunaGlobal = 0;
        sortearPalavra();
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < alfabeto.length(); i++) {
            atribuirCorBotaoLetra(alfabeto.substring(i, i + 1), Color.LIGHT_GRAY);

        }
    }

    private void habilitarProxLinha() {
        for (int i = 0; i < 5; i++) {
            ml[linhaGlobal][i].setBackground(new Color(121, 87, 53));
        }
    }

    private void sortearPalavra() {
        Random r = new Random();
        int indicePalavra = r.nextInt(palavras.length);
        System.out.println(palavras[indicePalavra]);
        palavraSorteada = palavras[indicePalavra];
    }

    private void atribuirCorBotaoLetra(String L, Color color) {
        switch (L) {
            case "A":
                jba.setBackground(color);
                break;
            case "B":
                jbb.setBackground(color);
                break;
            case "C":
                jbc.setBackground(color);
                break;
            case "D":
                jbd.setBackground(color);
                break;
            case "E":
                jbe.setBackground(color);
                break;
            case "F":
                jbf.setBackground(color);
                break;
            case "G":
                jbg.setBackground(color);
                break;
            case "H":
                jbh.setBackground(color);
                break;
            case "I":
                jbi.setBackground(color);
                break;
            case "J":
                jbj.setBackground(color);
                break;
            case "K":
                jbk.setBackground(color);
                break;
            case "L":
                jbl.setBackground(color);
                break;
            case "M":
                jbm.setBackground(color);
                break;
            case "N":
                jbn.setBackground(color);
                break;
            case "O":
                jbo.setBackground(color);
                break;
            case "P":
                jbp.setBackground(color);
                break;
            case "Q":
                jbq.setBackground(color);
                break;
            case "R":
                jbr.setBackground(color);
                break;
            case "S":
                jbs.setBackground(color);
                break;
            case "T":
                jbt.setBackground(color);
                break;
            case "U":
                jbu.setBackground(color);
                break;
            case "V":
                jbv.setBackground(color);
                break;
            case "W":
                jbw.setBackground(color);
                break;
            case "X":
                jbx.setBackground(color);
                break;
            case "Y":
                jby.setBackground(color);
                break;
            case "Z":
                jbz.setBackground(color);
                break;
        }

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
        jbx = new javax.swing.JButton();
        jbc = new javax.swing.JButton();
        jbz = new javax.swing.JButton();
        jbg = new javax.swing.JButton();
        jbh = new javax.swing.JButton();
        jbf = new javax.swing.JButton();
        jbk = new javax.swing.JButton();
        jbl = new javax.swing.JButton();
        jbj = new javax.swing.JButton();
        jbb = new javax.swing.JButton();
        jbn = new javax.swing.JButton();
        jbv = new javax.swing.JButton();
        jbm = new javax.swing.JButton();
        jbp = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TERMULANDO");

        jbtentar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtentar.setText("TENTAR");
        jbtentar.setEnabled(false);
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

        jbx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbx.setText("X");
        jbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbxActionPerformed(evt);
            }
        });

        jbc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbc.setText("C");
        jbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcActionPerformed(evt);
            }
        });

        jbz.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbz.setText("Z");
        jbz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbzActionPerformed(evt);
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

        jbb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbb.setText("B");
        jbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbActionPerformed(evt);
            }
        });

        jbn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbn.setText("N");
        jbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnActionPerformed(evt);
            }
        });

        jbv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbv.setText("V");
        jbv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbvActionPerformed(evt);
            }
        });

        jbm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbm.setText("M");
        jbm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmActionPerformed(evt);
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
                                .addComponent(jbz)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbx)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbm)
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
                    .addComponent(jbz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtentar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtentarActionPerformed
        // TODO add your handling code here:
        conferirPalavra();

    }//GEN-LAST:event_jbtentarActionPerformed

    private void jbqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbqActionPerformed
        // TODO add your handling code here:
        preencherCampo("Q");
    }//GEN-LAST:event_jbqActionPerformed

    private void jbwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbwActionPerformed
        preencherCampo("W");
    }//GEN-LAST:event_jbwActionPerformed

    private void jbeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeActionPerformed
        preencherCampo("E");        // TODO add your handling code here:
    }//GEN-LAST:event_jbeActionPerformed

    private void jbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActionPerformed

        preencherCampo("T");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtActionPerformed

    private void jbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbyActionPerformed

        preencherCampo("Y");        // TODO add your handling code here:
    }//GEN-LAST:event_jbyActionPerformed

    private void jbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrActionPerformed

        preencherCampo("R");        // TODO add your handling code here:
    }//GEN-LAST:event_jbrActionPerformed

    private void jbiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbiActionPerformed

        preencherCampo("I");        // TODO add your handling code here:
    }//GEN-LAST:event_jbiActionPerformed

    private void jboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboActionPerformed

        preencherCampo("O");        // TODO add your handling code here:
    }//GEN-LAST:event_jboActionPerformed

    private void jbuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuActionPerformed

        preencherCampo("U");        // TODO add your handling code here:
    }//GEN-LAST:event_jbuActionPerformed

    private void jbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsActionPerformed
        preencherCampo("S"
                + "");        // TODO add your handling code here:
    }//GEN-LAST:event_jbsActionPerformed

    private void jbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbdActionPerformed
        preencherCampo("D");        // TODO add your handling code here:
    }//GEN-LAST:event_jbdActionPerformed

    private void jbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbaActionPerformed
        preencherCampo("A");        // TODO add your handling code here:
    }//GEN-LAST:event_jbaActionPerformed

    private void jbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbxActionPerformed
        preencherCampo("X");        // TODO add your handling code here:
    }//GEN-LAST:event_jbxActionPerformed

    private void jbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcActionPerformed
        preencherCampo("C");        // TODO add your handling code here:
    }//GEN-LAST:event_jbcActionPerformed

    private void jbzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbzActionPerformed
        preencherCampo("Z");        // TODO add your handling code here:
    }//GEN-LAST:event_jbzActionPerformed

    private void jbgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbgActionPerformed
        preencherCampo("G");        // TODO add your handling code here:
    }//GEN-LAST:event_jbgActionPerformed

    private void jbhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbhActionPerformed
        preencherCampo("H");        // TODO add your handling code here:
    }//GEN-LAST:event_jbhActionPerformed

    private void jbfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbfActionPerformed
        preencherCampo("F");        // TODO add your handling code here:
    }//GEN-LAST:event_jbfActionPerformed

    private void jbkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbkActionPerformed
        preencherCampo("K");        // TODO add your handling code here:
    }//GEN-LAST:event_jbkActionPerformed

    private void jblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblActionPerformed
        preencherCampo("L");        // TODO add your handling code here:
    }//GEN-LAST:event_jblActionPerformed

    private void jbjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbjActionPerformed
        preencherCampo("J");        // TODO add your handling code here:
    }//GEN-LAST:event_jbjActionPerformed

    private void jbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbActionPerformed
        preencherCampo("B");        // TODO add your handling code here:
    }//GEN-LAST:event_jbbActionPerformed

    private void jbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnActionPerformed
        preencherCampo("N");        // TODO add your handling code here:
    }//GEN-LAST:event_jbnActionPerformed

    private void jbvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbvActionPerformed
        preencherCampo("V");        // TODO add your handling code here:
    }//GEN-LAST:event_jbvActionPerformed

    private void jbmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmActionPerformed
        preencherCampo("M");        // TODO add your handling code here:
    }//GEN-LAST:event_jbmActionPerformed

    private void jbpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbpActionPerformed
        preencherCampo("P");        // TODO add your handling code here:
    }//GEN-LAST:event_jbpActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        if (colunaGlobal > 0) {
            ml[linhaGlobal][colunaGlobal - 1].setText("");
            colunaGlobal--;
        }        // TODO add your handling code here:
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
    private javax.swing.JButton jButton26;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jba;
    private javax.swing.JButton jbb;
    private javax.swing.JButton jbc;
    private javax.swing.JButton jbd;
    private javax.swing.JButton jbe;
    private javax.swing.JButton jbf;
    private javax.swing.JButton jbg;
    private javax.swing.JButton jbh;
    private javax.swing.JButton jbi;
    private javax.swing.JButton jbj;
    private javax.swing.JButton jbk;
    private javax.swing.JButton jbl;
    private javax.swing.JButton jbm;
    private javax.swing.JButton jbn;
    private javax.swing.JButton jbo;
    private javax.swing.JButton jbp;
    private javax.swing.JButton jbq;
    private javax.swing.JButton jbr;
    private javax.swing.JButton jbs;
    private javax.swing.JButton jbt;
    private javax.swing.JButton jbtentar;
    private javax.swing.JButton jbu;
    private javax.swing.JButton jbv;
    private javax.swing.JButton jbw;
    private javax.swing.JButton jbx;
    private javax.swing.JButton jby;
    private javax.swing.JButton jbz;
    // End of variables declaration//GEN-END:variables
}
