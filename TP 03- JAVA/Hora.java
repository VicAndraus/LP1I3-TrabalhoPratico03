/*
TRABALHO PRÁTICO 03: Construir a classe Hora, conforme especificação
abaixo, este exercício comporá a avaliação final, portanto será obrigatória sua
elaboração para a prova final.
Exercício 01
Crie a classe Hora conforme especificado abaixo:
Hora
- hora: int
- min: int
- seg: int
+ Hora()
+ Hora(int h, int m, int s)
+ setHor(int h)
+ setMin(int m)
+ setSeg(int s)
+ setHor()
+ setMin()
+ setSeg()
+ getHor(): int
+ getMin(): int
+ getSeg(): int
+ getHora1(): String
+ getHora2(): String
+ getSegundos(): int

 O construtor Hora() deve permitir ao usuário digitar os valores de hora, minuto e
segundos e com eles inicializar os atributos da classe. Os valores digitados deverão ser
consistidos e só aceitos se válidos, caso contrário, exigir ao usuário redigitar;
 O construtor Hora(int h, int m, int s) deverá receber os valores de hora, minuto e
segundos e com eles inicializa as propriedades da classe;
 Os métodos setHor(int h), setMin(int m) e setSeg(int s) devem receber um valor e
atribuí-lo ao respectivo atributo;
 Os métodos setHor(), setMin() e setSeg() devem permitir que o usuário digite um
valor e atribuí-lo ao respectivo atributo. Os valores digitados deverão ser consistidos e
só aceitos se válidos, caso contrário, exigir ao usuário redigitar;
 Os métodos getHor(), getMin() e getSeg() devem devolver as respectivas
propriedades;
 O método getHora1() deve nos devolver a hora no formato: hh:mm:ss;
 O método getHora2() deve nos devolver a hora no formato: hh:mm:ss (AM/PM);
 O método getSegundos() deve nos devolver a quantidade de segundos expressa na
hora em questão, (exemplo: 01:00:01 = 3601 segundos) .
 Conveniente colocar tratamento de exceção para as possíveis inconsistências na
entrada de dados.
Exercício 02
Agora, desenvolva um programa capaz de testar a classe e os métodos desenvolvidos no
exercício anterior.

Victória Andraus Canoilas Castro
Marcella Costa Tavares
 */



import java.util.Scanner;

class Hora{
	private int hora, minuto, segundo, totalSegundos = 0;

		int getHora(){
			return hora;	
		}

		int getMinuto(){
			return minuto;	
		}

		int getSegundo(){
			return segundo;	
		}
	

	void setHora(){
		Scanner Teclado = new Scanner(System.in);
		do{
			System.out.println("Digite as horas:");
				this.hora = Teclado.nextInt();
			if (hora < 0 || hora > 23){
				System.out.println("Horas inválidas, digite novamente:");
				}	
		  	}
		while(hora < 0 || hora > 23);	
		  }

      void setHora(int h){
		this.hora = h;
		}

	void setMinuto(){
		Scanner Teclado = new Scanner(System.in);
		do{
			System.out.println("Digite os minutos:");
				this.minuto = Teclado.nextInt(); 
			if (minuto < 0 || minuto > 59) {
				System.out.println("Minutos inválidos, digite novamente");}	
		  	}
		while(minuto < 0 || minuto > 59);	
		  }

	void setMinuto(int m){
		this.minuto = m;
		}

	void setSegundo() {
		Scanner Teclado = new Scanner(System.in);
		do{
			System.out.println("Digite os segundos:");
			this.segundo = Teclado.nextInt();
			if (segundo < 0 || segundo > 59) {
				System.out.println("Segundos inválidos, digite novamente:");}		
		 	}
		while(segundo < 0 || segundo > 59);	
		  }

	void setSegundo(int s){
		this.segundo = s;
	}

	public Hora(int h, int m, int s){
		Scanner Teclado = new Scanner(System.in);
		
		while (h > 23 || h < 0) {
			System.out.println("Horas inválidas, digite novamente:");
			h = Teclado.nextInt();
		}

		while (m > 59 || m < 0) {
			System.out.println("Minutos inválidos, digite novamente:");
			m = Teclado.nextInt();
		}

		while (s > 59 || s < 0) {
			System.out.println("Segundos inválidos, digite novamente:");
			s = Teclado.nextInt();
		}
		
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
	}

	public Hora() {
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Digite as horas:");
			hora = teclado.nextInt();
			if (hora < 0 || hora > 23) {
				System.out.println("Horas inválidas, digite novamente:");
				}	
		   }
		while(hora < 0 || hora > 23);

		do {
			System.out.println("Digite os minutos:");
			minuto = teclado.nextInt(); 
			if (minuto < 0 || minuto > 59) {
				System.out.println("Minutos inválidos, digite novamente:");}	
		}
		while(minuto < 0 || minuto > 59);

		do {
			System.out.println("Digite os segundos:");
			segundo = teclado.nextInt();
			if (segundo < 0 || segundo > 59) {
				System.out.println("Segundos inválidos, digite novamente:");}		
		 }
		while(segundo < 0 || segundo > 59);
	}

	public int getSegundos() {
		totalSegundos = (hora * 3600) + (minuto * 60) + segundo;
		return totalSegundos;
	}

	public String getHora1() {
		return "São: " + hora + ":" + minuto + ":" + segundo;
	}

	public String getHora2() {
		int horaAMPM = hora;
		String AMPM = "AM";

		if (hora > 12) {
			horaAMPM = hora - 12;
			AMPM = "PM";
		}
		if (hora == 0) {
			horaAMPM = 12;
		}

		return "São: " + horaAMPM + ":" + minuto + ":" + segundo + AMPM;
	}

}