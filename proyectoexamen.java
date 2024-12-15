package proyectoexamen;
    import java.awt.FlowLayout;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import javax.swing.JComboBox;
    import javax.swing.JFrame;
    import javax.swing.JTextField;
    import javax.swing.WindowConstants;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    import java.awt.Image;
    import javax.swing.ImageIcon;
    import java.util.Calendar; 
    import java.util.GregorianCalendar;

public class ProyectoExamen extends JFrame implements ActionListener, ItemListener{
        JButton aceptar,imprimir,salir,cambio,limpiar,login2,cerrar;
        JLabel bienvenido,cartelera,horarios,sala,asiento,num2,fila1,num1,fila2,boleto1,boleto2,
                pago,cobro,previo,horap,recibo,A,N,BOL,Usuario,Clave,us;
        JTextField total,pel,sala1,numA,numN,numeroN,filaA,filaN,filaA2,filaN2,horaprev,
                 montoA,montoN,precioA,precioN,Tsin,Des,TDes,iva,cambio2,efectivo2,usuario,clave;
        JComboBox pelicula,horario;
        JTextArea ticket;
        JPanel cartel;
        JCheckBox adulto,niño,Descuento,normal,A2x1,An,Os,Da;
        ImageIcon lucy,box,can,tor,torna,ninfo,login;
       
    public static void main (String[] args){
       ProyectoExamen marco2 = new ProyectoExamen();
        marco2.setSize(400,200);
        marco2.crearGUI2();
        marco2.setVisible(true);}
   
    public void crearGUI2(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana2 = getContentPane();
        ventana2.setLayout(null);
        this.setTitle("Iniciar Sesion");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("icel.jpg"));
        setIconImage(icon);
        setVisible(true);
        ventana2.setBackground(new Color(231, 240, 242));
               
        Usuario =new JLabel("Usuario");
        ventana2.add(Usuario);
        Usuario.setBounds(80, 30, 80, 20);
        Usuario.setFont(new java.awt.Font(" ", 0, 16));
        
        usuario=new JTextField();
        ventana2.add(usuario);
        usuario.setBounds(150, 30, 150, 20);
        
        Clave =new JLabel("Clave");
        ventana2.add(Clave);
        Clave.setBounds(90, 60, 80, 20);
        Clave.setFont(new java.awt.Font(" ", 0, 16));
        
        clave=new JTextField();
        ventana2.add(clave);
        clave.setBounds(150, 60, 150, 20);
        
        login2=new JButton("Login");
        ventana2.add(login2);
        login2.setBounds(150,90,100,30);
        login2.addActionListener(this);}
    
    public void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(null);
        this.setTitle("CINEICEL");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("icel2.jpg"));
        setIconImage(icon);
        setVisible(true);
        ventana.setBackground(new Color(225, 245, 250));
           
        bienvenido = new JLabel("BienvenidoICEL");
        ventana.add(bienvenido);
        bienvenido.setFont(new java.awt.Font("BankGothic Lt BT", 0, 36)); 
        bienvenido.setBounds(472, 0, 350, 50);
        
        cartelera = new JLabel("Peliculas");
        ventana.add(cartelera);
        cartelera.setBounds(10, 100, 100, 20);
        
                pelicula  = new JComboBox();
		pelicula.addItem(" ");
		pelicula.addItem("Cantinflas");
		pelicula.addItem("En el Tornado");
                pelicula.addItem("Lucy");
                pelicula.addItem("Los Boxtrolls");
		pelicula.addItem("Las Tortugas Ninja");
                pelicula.addItem("Ninfomania");
                pelicula.addActionListener(this);
                ventana.add(pelicula);
                pelicula.setBounds(65, 100, 140, 20);
                
               JLabel horarios = new JLabel("Horario");
               ventana.add(horarios);
               horarios.setBounds(230, 100, 100, 20);
                               
                horario  = new JComboBox();
        	horario.addItem(" ");
		horario.addItem("4:00 pm.");
		horario.addItem("6:10 pm.");
                horario.addItem("9:15 pm.");
                ventana.add(horario);
                horario.setBounds(280, 100,80, 20);
                horario.addActionListener(this);
        cartel=new JPanel();
        cartel.setPreferredSize(new Dimension(330,450));
        cartel.setBackground(Color.white);
        ventana.add(cartel);
        cartel.setBounds(358, 90, 330,450);
        
        lucy=new ImageIcon("lucy.jpg");
        can=new ImageIcon("can.jpg");
        box=new ImageIcon("box.jpg");
        ninfo=new ImageIcon("ninfo.jpg");
        tor=new ImageIcon("tor.jpg");
        torna=new ImageIcon("torna.jpg");
        
               
        recibo = new JLabel("Ticket");
        ventana.add(recibo);
        recibo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); 
        recibo.setBounds(1065, 685, 100, 50);
        
        ticket = new JTextArea();
        JScrollPane panelDespl= new JScrollPane(ticket);
        panelDespl.setBounds(750, 90, 400, 600);
        add(panelDespl);
               
        JLabel Pr =new JLabel("Precio");
        ventana.add(Pr);
        Pr.setBounds(20, 150, 100, 20);
        
        A =new JLabel("$60");
        ventana.add(A);
        A.setBounds(20, 180, 100, 20);
        
        N =new JLabel("$55");
        ventana.add(N);
        N.setBounds(20, 210, 100, 20);
               
        boleto1 =new JLabel("Boleto");
        ventana.add(boleto1);
        boleto1.setBounds(80, 150, 100, 20);
       
        adulto = new JCheckBox("Adulto");
        ventana.add(adulto);
        adulto.setBounds(80, 180, 63, 20);
        adulto.addItemListener(this);
                
        niño = new JCheckBox("Niño");
        ventana.add(niño);
        niño.setBounds(80, 210, 60, 20);
        niño.addItemListener(this);
                 
        JLabel Cantidad =new JLabel("Cantidad");
        ventana.add(Cantidad);
        Cantidad.setBounds(175, 150, 100, 20);
        
        numA =new JTextField();
        ventana.add(numA);
        numA.setText("0");
        numA.setBounds(175, 180, 50, 20);
        
        numN =new JTextField(5);
        ventana.add(numN);
        numN.setText("0");
        numN.setBounds(175, 210, 50, 20);
        
        A2x1 = new JCheckBox("2x1");
        ventana.add(A2x1);
        A2x1.setBounds(80, 240, 60, 20);
        A2x1.addItemListener(this);
        
        asiento =new JLabel("Asiento");
        ventana.add(asiento);
        asiento.setBounds(270, 150, 100, 20);
        
        fila1 =new JLabel("Fila");
        ventana.add(fila1);
        fila1.setBounds(270, 180, 50, 20);
        
        fila2 =new JLabel ("Fila");
        ventana.add(fila2);
        fila2.setBounds(270, 210, 50, 20 );
        
        filaA =new JTextField();
        ventana.add(filaA);
        filaA.setBounds(293, 180, 20, 20);
        
        filaN =new JTextField(5);
        ventana.add(filaN);
        filaN.setBounds(293, 210, 20, 20);
                     
        pago =new JLabel ("Forma de Pago");
        ventana.add(pago);
        pago.setBounds(10, 320, 100, 20 );
        
        normal = new JCheckBox("Normal");
        ventana.add(normal);
        normal.setBounds(100, 320, 70, 20 );
        normal.addItemListener(this);
        
        Descuento = new JCheckBox("Descuento con Tarjeta");
        ventana.add(Descuento);
        Descuento.setBounds(170, 320, 160, 20 );
        Descuento.addItemListener(this);
        
        cobro =new JLabel ("Realizar Operacion");
        ventana.add(cobro);
        cobro.setBounds(120, 280, 130, 20 );
        
        aceptar = new JButton("Aceptar");
        ventana.add(aceptar);
        aceptar.setBounds(235, 280, 87, 20 );
        aceptar.addActionListener(this);
        
        previo = new JLabel("Previo");
        ventana.add(previo);
        previo.setBounds(10, 390, 100, 20);
        
        JLabel pel2 = new JLabel("Pelicula");
        ventana.add(pel2);
        pel2.setBounds(10, 430, 100, 20);
                
        pel = new JTextField(12);
        ventana.add(pel);
        pel.setBounds(60, 430, 120, 20);
                
        sala = new JLabel("Sala");
        ventana.add(sala);
        sala.setBounds(185, 430, 100, 20);
        
        sala1 = new JTextField();
        ventana.add(sala1);
        sala1.setBounds(215, 430, 23, 20);
        
        horap = new JLabel("Hora");
        ventana.add(horap);
        horap.setBounds(245, 430, 100, 20);
        
        horaprev = new JTextField(12);
        ventana.add(horaprev);
        horaprev.setBounds(275, 430, 70, 20);
        
        BOL =new JLabel("Boletos:");
        ventana.add(BOL);
        BOL.setBounds(10, 470, 100, 20);
        
        JLabel ad=new JLabel("Adulto");
        ventana.add(ad);
        ad.setBounds(70, 470, 100, 20);
         
        montoA = new JTextField();
        ventana.add(montoA);
        montoA.setBounds(110, 470, 30, 20);
        
        JLabel cosA=new JLabel("Monto $");
        ventana.add(cosA);
        cosA.setBounds(150,470,50,20);
        
        precioA=new JTextField();
        ventana.add(precioA);
        precioA.setBounds(197,470,60,20);
        
        JLabel FA=new JLabel("Fila");
        ventana.add(FA);
        FA.setBounds(270,470,70,20);
        
        filaA2=new JTextField();
        ventana.add(filaA2);
        filaA2.setBounds(293,470,50,20);
        
        JLabel an=new JLabel("Niño");
        ventana.add(an);
        an.setBounds(70, 510, 100, 20);
         
        montoN = new JTextField(12);
        ventana.add(montoN);
        montoN.setBounds(110, 510, 30, 20);
        
        JLabel cosN=new JLabel("Monto $");
        ventana.add(cosN);
        cosN.setBounds(150,510,50,20);
        
        precioN=new JTextField();
        ventana.add(precioN);
        precioN.setBounds(197,510,60,20);
        
        JLabel FN=new JLabel("Fila");
        ventana.add(FN);
        FN.setBounds(270,510,70,20);
        
        filaN2=new JTextField();
        ventana.add(filaN2);
        filaN2.setBounds(293,510,50,20);
        
        JLabel sub=new JLabel("Subtotal");
        ventana.add(sub);
        sub.setBounds(200,560,70,20);
        
        Tsin=new JTextField();
        ventana.add(Tsin);
        Tsin.setBounds(255,560,90,20);
        
        JLabel des=new JLabel("Descuento");
        ventana.add(des);
        des.setBounds(190,590,70,20);
        
        Des=new JTextField();
        ventana.add(Des);
        Des.setBounds(255,590,90,20);
        
        JLabel tdes=new JLabel("Total con descuento");
        ventana.add(tdes);
        tdes.setBounds(135,620,130,20);
        
        TDes=new JTextField();
        ventana.add(TDes);
        TDes.setBounds(255,620,90,20);
        
        JLabel IVA=new JLabel("IVA");
        ventana.add(IVA);
        IVA.setBounds(230,650,50,20);
        
        iva=new JTextField();
        ventana.add(iva);
        iva.setBounds(255,650,90,20);
        
        JLabel total2=new JLabel("Total");
        ventana.add(total2);
        total2.setBounds(220,680,50,20);
        
        total=new JTextField();
        ventana.add(total);
        total.setBounds(255,680,90,20);
        
        JLabel efectivo=new JLabel("Efectivo Recibido");
        ventana.add(efectivo);
        efectivo.setBounds(520,560,150,20);
        
        efectivo2=new JTextField();
        ventana.add(efectivo2);
        efectivo2.setBounds(630,560,50,20);
        
        cambio=new JButton("Cambio");
        ventana.add(cambio);
        cambio.setBounds(540,590,78,20);
        cambio.addActionListener(this);
                       
        cambio2=new JTextField();
        ventana.add(cambio2);
        cambio2.setBounds(630,590,50,20);
        
        imprimir=new JButton("Imprimir Ticket");
        ventana.add(imprimir);
        imprimir.setBounds(540,660,140,20);
        imprimir.addActionListener(this);
        
        salir=new JButton("Salir");
        ventana.add(salir);
        salir.setBounds(10,720,60,20);
        salir.addActionListener(this);
        
        cerrar=new JButton("Cerrar Sesion");
        ventana.add(cerrar);
        cerrar.setBounds(80,720,150,20);
        cerrar.addActionListener(this);
        
        limpiar=new JButton("Limpiar");
        ventana.add(limpiar);
        limpiar.setBounds(600,700,80,20);
        limpiar.addActionListener(this);
        
        JLabel nomus = new JLabel("Usuario");
        ventana.add(nomus);
        nomus.setBounds(440,620,140,20);
        
        An = new JCheckBox("JAIME");
        ventana.add(An);
        An.setBounds(490,620,60,20);
        An.addItemListener(this);
        
        Da = new JCheckBox("JOSHUA");
        ventana.add(Da);
        Da.setBounds(550,620,70,20);
        Da.addItemListener(this);
        
        Os = new JCheckBox("YAIR");
        ventana.add(Os);
        Os.setBounds(620,620,60,20);
        Os.addItemListener(this);
    
    }
    
    public void actionPerformed(ActionEvent e){
                         
        if(e.getSource()==pelicula){
                    pel.setText((String)pelicula.getSelectedItem());
                    String salas;
                    salas = pel.getText();

               if(salas.equals(" ")){cartel.repaint(); }
               if(salas.equals("Los Boxtrolls")){ 
                    Graphics papel = cartel.getGraphics();
                    Object origen =e.getSource();
                    box.paintIcon(this, papel, 0, 0); sala1.setText("1");} 
               if(salas.equals("Las Tortugas Ninja")){ 
                    Graphics papel = cartel.getGraphics();
                    Object origen =e.getSource();
                    tor.paintIcon(this, papel, 0, 0);sala1.setText("2"); } 
               if(salas.equals("Cantinflas")){  
                    Graphics papel = cartel.getGraphics();
                    Object origen =e.getSource();
                    can.paintIcon(this, papel, 0, 0);sala1.setText("5");  } 
               if(salas.equals("En el Tornado")){  
                    Graphics papel = cartel.getGraphics();
                    Object origen =e.getSource();
                    torna.paintIcon(this, papel, 0, 0);sala1.setText("3");  } 
               if(salas.equals("Ninfomania")){  
                    Graphics papel = cartel.getGraphics();
                    Object origen =e.getSource();
                    ninfo.paintIcon(this, papel, 0, 0);sala1.setText("6"); } 
               if(salas.equals("Lucy")){  
                    Graphics papel = cartel.getGraphics();
                    Object origen =e.getSource();
                    lucy.paintIcon(this, papel, 0, 0);sala1.setText("4"); } }

               
        if(e.getSource()==salir){ this.dispose();}
        if(e.getSource()==horario){horaprev.setText((String)horario.getSelectedItem());}
        if(e.getSource()==login2){
                String U;
                String C;
                U = usuario.getText();
                C = clave.getText();                        
            
           if((U.equals("yair"))&&(C.equals("133107038"))){
            ProyectoExamen marco = new ProyectoExamen();
            marco.setSize(1200,800);
            marco.crearGUI();
            marco.setVisible(true);
            this.dispose();}else{
       
           if((U.equals("jhoshua"))&&(C.equals("133107033"))){
            ProyectoExamen marco = new ProyectoExamen();
            marco.setSize(1200,800);
            marco.crearGUI();
            marco.setVisible(true);
            this.dispose();}else{
               
            if((U.equals("q"))&&(C.equals("q"))){
            ProyectoExamen marco = new ProyectoExamen();
            marco.setSize(1200,800);
            marco.crearGUI();
            marco.setVisible(true);
            this.dispose();
            }else{
           
           if((U.equals("jaime"))&&(C.equals("133107032"))){
            ProyectoExamen marco = new ProyectoExamen();
            marco.setSize(1200,800);
            marco.crearGUI();
            marco.setVisible(true);
            this.dispose();}
            else{ JOptionPane.showMessageDialog (null, "El Usuario/Clave es incorrecto");}} }}}
        
         if(e.getSource()==cerrar){
           this.dispose();
           ProyectoExamen marco2 = new ProyectoExamen();
           marco2.setSize(400,200);
           marco2.crearGUI2();
           marco2.setVisible(true);  }
         
         if(e.getSource()==aceptar){       
            double Ad=Double.parseDouble(numA.getText());
            double res=Ad*60;
            String mon=String.valueOf(res);
            precioA.setText(mon);
            
            int i = Integer.parseInt(numA.getText());
            String canA=String.valueOf(i);
            montoA.setText(canA);
            int i2 = i%2;
            
            double Nd=Double.parseDouble(numN.getText());
            double resN=Nd*55;
            String monN=String.valueOf(resN);
            precioN.setText(monN);
            
            int x = Integer.parseInt(numN.getText());
            String canN=String.valueOf(x);
            montoN.setText(canN);
            int x2 = x%2;
            
             String fa;
             fa = filaA.getText();
             filaA2.setText(fa);
            
             String fn;
             fn = filaN.getText();
             filaN2.setText(fn);
            
             double pA=0; pA=Double.parseDouble(precioA.getText());
             double pN=0; pN=Double.parseDouble(precioN.getText());
             
             if(A2x1.isSelected()){
                 if(i>1){ if(i2==1){ pA=((pA-60)/2)+60;} 
                    else{pA=pA/2;}}
                 if(x>1){ if(x2==1){ pN=((pN-55)/2)+55;}
                    else{pN=pN/2;}}
                    double p1=pA;
                    String p1A=String.valueOf(p1);
                    precioA.setText(p1A);
                    precioA.setBackground(new Color(251, 185, 177));
                    double p2=pN;
                    String p2N=String.valueOf(pN);
                    precioN.setText(p2N);
                    precioN.setBackground(new Color(251, 185, 177));
                    double sub=pA+pN;
                    String subtotal=String.valueOf(sub);
                    Tsin.setText(subtotal);}
             else{double sub=pA+pN;
                    String subtotal=String.valueOf(sub);
                    precioA.setBackground(Color.white);
                    precioN.setBackground(Color.white);
                    Tsin.setText(subtotal);}}
         
         if(e.getSource()==cambio){
            double efec=0; efec=Double.parseDouble(efectivo2.getText());
            double totalneto=0; totalneto=Double.parseDouble(total.getText());
            double cam=efec-totalneto;
            String cam2=String.valueOf(cam);
            cam2=cam2.substring(0,5);
            cambio2.setText(cam2);}
         
         if(e.getSource()==limpiar){
             Descuento.setSelected(false);
             normal.setSelected(false);
             A2x1.setSelected(false);
             adulto.setSelected(false);
             niño.setSelected(false);
             pelicula.setSelectedIndex(0);
             horario.setSelectedIndex(0);
             total.setText(" ");
             pel.setText(" ");
             sala1.setText(" ");
             numA.setText("0");
             numN.setText("0");
             filaA.setText(" ");
             filaN.setText(" ");
             filaA2.setText(" ");
             filaN2.setText(" ");
             montoA.setText(" ");
             montoN.setText(" ");
             precioA.setBackground(Color.white);
             precioN.setBackground(Color.white);
             precioA.setText(" ");
             precioN.setText(" ");
             Tsin.setText(" ");
             Des.setBackground(Color.white);
             Des.setText(" ");
             TDes.setText(" ");
             iva.setText(" ");
             cambio2.setText(" ");
             efectivo2.setText(" ");
             ticket.setText(" ");
             cartel.repaint();
             ticket.setBackground(Color.WHITE);}
         
         if(e.getSource()==imprimir){
            ticket.setText(" ");
            ticket.setBackground(new Color(111, 242, 181));
            ticket.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16));
            ticket.setText("\n\n\n");
            ticket.append("                                      CINEICEL\n\n");
            ticket.append("                   AV. PRADOS DE CEDRO #167 Col.ARAGON\n                           Mexico EDOMEX C.P. 57179\n\n"); 
            if(An.isSelected()){ ticket.append("          Atendio: JAIME MINOR GOMEZ  "+"   Caja #3"+"\n");}
            if(Da.isSelected()){ ticket.append("         Atendio: JOSHUA HONORATO  "+"   Caja #2"+"\n");}
            if(Os.isSelected()){ ticket.append("          Atendio: YAIR HONORATO  "+"   Caja #1"+"\n");}
            Calendar fecha = new GregorianCalendar();
            int año = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH);
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
            int hora = fecha.get(Calendar.HOUR); 
            int minuto = fecha.get(Calendar.MINUTE);  
            int segundo = fecha.get(Calendar.SECOND); 
            int ampm = fecha.get(Calendar.AM_PM); 
            ticket.append("   Fecha: " + dia + "/" + (mes+1) + "/" + año+"             "+"Hora: "+hora+":"+minuto+":"+segundo+" "+(ampm==Calendar.AM?"am":"pm")+"\n\n\n");
            String salas1;
            salas1 = pel.getText();
            ticket.append("Pelicula:  "+salas1+"\n");
            String horaprev2;
            horaprev2 = horaprev.getText();
            ticket.append("Funcion: "+horaprev2+"\n");
            String sala2;
            sala2 = sala1.getText();
            ticket.append("Sala  "+sala2+"\n");
            if(A2x1.isSelected()){ticket.append("                                                                                 2x1\n\n");}
            else{ticket.append("\n\n");}
            if(adulto.isSelected()){
            int iA = Integer.parseInt(numA.getText());
            String canA2=String.valueOf(iA);
            double pA=0; pA=Double.parseDouble(precioA.getText());
            String mon2=String.valueOf(pA);
            String fa2;
            fa2 = filaA.getText();
            ticket.append(" "+canA2+"  Boleto Adulto  $"+mon2+"\n"+"    Asiento Fila "+fa2+"\n\n");}
            if(niño.isSelected()){
            int iN = Integer.parseInt(numN.getText());
            String canN2=String.valueOf(iN);
            double pN=0; pN=Double.parseDouble(precioN.getText());
            String mon3=String.valueOf(pN);
            String fa3;
            fa3 = filaN.getText();
            ticket.append(" "+canN2+"  Boleto Niño  $"+mon3+"\n"+"    Asiento Fila "+fa3+"\n\n\n");}
            double s=0; s=Double.parseDouble(Tsin.getText());
            String s2=String.valueOf(s);
            ticket.append("     Subtotal ..................................... $  "+s2+"\n");
            double d=0; d=Double.parseDouble(Des.getText());
            String d2=String.valueOf(d);
            ticket.append("     Descuento .................................. $  "+d+"\n");
            double td=0; td=Double.parseDouble(TDes.getText());
            String td2=String.valueOf(td);
            ticket.append("     Subtotal con Descuento ......... $  "+td2+"\n");
            double iv=0; iv=Double.parseDouble(iva.getText());
            String iv2=String.valueOf(iv);
            ticket.append("     IVA ............................................... $  "+iv2+"\n");
            double t=0; t=Double.parseDouble(total.getText());
            String t2=String.valueOf(t);
            ticket.append("     Total a pagar ............................ $  "+t2+"\n\n");
            double ef=0; ef=Double.parseDouble(efectivo2.getText());
            String ef2=String.valueOf(ef);
            ticket.append("                                    Efectivo ............ $  "+ef2+"\n");
            double c=0; c=Double.parseDouble(cambio2.getText());
            String c2=String.valueOf(c);
            ticket.append("                                    Cambio  .............. $   "+c2+"\n\n\n");
            ticket.append("                   ¡Gracias por su VISITA!\n");
            ticket.append("                   www.cineICEL.com.mx\n\n\n");}
}
    public void itemStateChanged(ItemEvent event){   
     if(Descuento.isSelected()){
            double descuento=0; descuento=Double.parseDouble(Tsin.getText());
            double descuen=descuento*0.15;
            String descue=String.valueOf(descuen);;
            Des.setText(descue);
            Des.setBackground(new Color(225, 209, 245));
            
            double descuen1=descuento-descuen;
            String Tdescue=String.valueOf(descuen1);
            TDes.setText(Tdescue);
            
            double iv=descuen1*0.16;
            String IVA=String.valueOf(iv);
            iva.setText(IVA);
            
            double tot=descuen1+iv;
            String tota=String.valueOf(tot);
            total.setText(tota); }
     
     if(normal.isSelected()){
            double totalsin=0; totalsin=Double.parseDouble(Tsin.getText());
            double iv2=totalsin*0.16;
            String IVA2=String.valueOf(iv2);
            iva.setText(IVA2);
            
            double tot2=totalsin+iv2;
            String tota2=String.valueOf(tot2);
            total.setText(tota2);
            
            TDes.setText("0");
            Des.setBackground(Color.white);
            Des.setText("0"); }
 }
}



			

                 
        
          


        
        
      
