package sprint_labProrgamacao;

import java.util.Scanner;

public class sprintExeRobo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = 0, y = 0,
		bateria = 0, distancia = 0,
		distanciaTotal = 0, bateriaNecessaria = 0;
		String comando = " ";
		char resp = 'S';
		
		do {
		
		
		System.out.println("Seja bem vindo(a) ao controlador do robo!");
		System.out.println("Para manipular a movimentação do robo use os comandos:");
		System.out.println("FRENTE, TRAS, DIREITA, ESQUERDA.");
		System.out.println("Não esqueça de digitar a distância também (ex: 5, 7, 10.");
		System.out.println();
		
		System.out.println("Quanto de bateria o robo possui?");
		bateria = scanner.nextInt();
		
		if (bateria < 40) {
			System.out.println("Bote o robo para carregar!");
			break;
		}
		
		
		
		
		while (!(x == 10) && !(y==1)) {
		
		System.out.println("Comando: ");
		comando = scanner.next();
		
		while (!(comando.equalsIgnoreCase("FRENTE")) &&
				!(comando.equalsIgnoreCase("TRAS")) &&
				!(comando.equalsIgnoreCase("ESQUERDA")) &&
				!(comando.equalsIgnoreCase("DIREITA")) ) {
			System.out.println("Comando inválido!");
			System.out.println("FRENTE, TRAS, DIREITA ou ESQUERDA: ");
			comando = scanner.next();
			
		}
		
//		 if (comando.equalsIgnoreCase("FRENTE")) {
//		        y += distancia;
//		    } else if (comando.equalsIgnoreCase("TRAS")) {
//		        y -= distancia;
//		    } else if (comando.equalsIgnoreCase("ESQUERDA")) {
//		        x -= distancia;
//		    } else if (comando.equalsIgnoreCase("DIREITA")) {
//		        x += distancia;
//		    }
		 
		 
		 
//		 primeira linha
		 
		 while (!(comando.equalsIgnoreCase("FRENTE"))) {
			 System.out.println("Digite o comando correto para a linha: ");
			 comando = scanner.next();
			 
		 }
		
			if (comando.equalsIgnoreCase("FRENTE")) {
			 System.out.println("Digite a distância: ");
			 distancia = scanner.nextInt();
			 if (distancia == 9) {
				 y = 1;
				 x = 4;
				 y += distancia;
				 distanciaTotal += distancia;
				 System.out.println("Primeira linha concluída!");
				 System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
				 
			 } else {
				 System.out.println("O robo ficou preso em uma armadilha!");
				 break;
			 }
			 
			}
		 
			System.out.println();
			comando = "";
			System.out.println("Comando: ");
			comando = scanner.next();
			
			

//			segunda linha
			 while (!(comando.equalsIgnoreCase("DIREITA"))) {
				 System.out.println("Digite o comando correto para a linha: ");
				 comando = scanner.next();
				
			 }	 
				if (comando.equalsIgnoreCase("DIREITA")) {
				 System.out.println("Digite a distância: ");
				 distancia = scanner.nextInt();
				 if (distancia == 5) {
					 x = 4;
					 x += distancia;
					 distanciaTotal += distancia;
					 System.out.println("Segunda linha concluída!");
					 System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
				
				 } else {
					 System.out.println("O robo ficou preso em uma armadilha!");
					 break;
				 }
				 
				}
				
				System.out.println();
				comando = "";
				System.out.println("Comando: ");
				comando = scanner.next();
				
				
//				terceira linha
				while (!(comando.equalsIgnoreCase("FRENTE"))) {
					 System.out.println("Digite o comando correto para a linha: ");
					 comando = scanner.next();
					
				 }	 
					if (comando.equalsIgnoreCase("FRENTE")) {
					 System.out.println("Digite a distância: ");
					 distancia = scanner.nextInt();
					 if (distancia == 4) {
						 y += distancia;
						 distanciaTotal += distancia;
						 System.out.println("Terceira linha concluída!");
						 System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
				
					 } else {
						 System.out.println("O robo ficou preso em uma armadilha!");
						 break;
					 }
					 
					}
					
					System.out.println();
					comando = "";
					System.out.println("Comando: ");
					comando = scanner.next();
					

					
// 					quarta linha
					while (!(comando.equalsIgnoreCase("DIREITA"))) {
						 System.out.println("Digite o comando correto para a linha: ");
						 comando = scanner.next();
						
					 }	 
						if (comando.equalsIgnoreCase("DIREITA")) {
						 System.out.println("Digite a distância: ");
						 distancia = scanner.nextInt();
						 if (distancia == 5) {
							 x += distancia;
							 distanciaTotal += distancia;
							 System.out.println("Quarta linha concluída!");
							 System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
		
						 } else {
							 System.out.println("O robo parou para trocar uma ideia!");
							 break;
						 }
						 
						}
						
						System.out.println();
						comando = "";
						System.out.println("Comando: ");
						comando = scanner.next();
						
//						quinta linha
						
						while (!(comando.equalsIgnoreCase("TRAS"))) {
							 System.out.println("Digite o comando correto para a linha: ");
							 comando = scanner.next();
							
						 }	 
							if (comando.equalsIgnoreCase("TRAS")) {
							 System.out.println("Digite a distância: ");
							 distancia = scanner.nextInt();
							 if (distancia == 10) {
								 y -= distancia;
								 distanciaTotal += distancia;
								 System.out.println("Quinta linha concluída!");
								 System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
			
							 } else {
								 System.out.println("O robo deitou e dormiu!");
								 break;
							 }
							 
							}
							
						System.out.println();
						comando = "";
						System.out.println("Comando: ");
						comando = scanner.next();
							
//							sexta linha
							
						while (!(comando.equalsIgnoreCase("ESQUERDA"))) {
							 System.out.println("Digite o comando correto para a linha: ");
								comando = scanner.next();
								
						 }	 
							if (comando.equalsIgnoreCase("ESQUERDA")) {
								System.out.println("Digite a distância: ");
								distancia = scanner.nextInt();
								if (distancia == 4) {
									x -= distancia;
									distanciaTotal += distancia;
									System.out.println("Sexta linha concluída!");
									System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
				
								} else {
									System.out.println("O robo parou para tomar um chá!");
									break;
								 }
								 
								}
								
							System.out.println();
							comando = "";
							System.out.println("Comando: ");
							comando = scanner.next();
								
							
//							sétima linha
								
							while (!(comando.equalsIgnoreCase("TRAS"))) {
									System.out.println("Digite o comando correto para a linha: ");
									comando = scanner.next();
									
								}	 
								if (comando.equalsIgnoreCase("TRAS")) {
									System.out.println("Digite a distância: ");
									distancia = scanner.nextInt();
									if (distancia == 3) {
										y -= distancia;
										distanciaTotal += distancia;
										System.out.println("Sétima linha concluída!");
										System.out.println("Posição atual do robo: " + "(" + x + ")" + "," + "(" + y + ")");
					
									} else {
										System.out.println("O robo parou para trocar uma ideia!");
									}
									 
								}
								
						
								

		 } 
		
		//fora do while
		bateriaNecessaria = bateria - distanciaTotal;
		
		if (x == 10 && y == 1) {
		System.out.println();
		System.out.println("Parabéns!!!! Você terminou o jogo.");
		System.out.println("Posição final do robo: " + "(" + x + ")" + "," + "(" + y + ")");
		System.out.println("Bateria usada: " + bateriaNecessaria + "%");
		break;
		} else {
			System.out.println("Você perdeu!");
			System.out.println("Posição de  onde perdeu: " + "(" + x + ")" + "," + "(" + y + ")");
			
			System.out.println("Tentar de novo?");
			resp = scanner.next().toUpperCase().charAt(0);
			
		} 
		
		
		} while (resp == 'S');
		
		if (bateria < 40) {
			System.out.println("Quem sabe na próxima...");
		} else {
			
			System.out.println("Obrigado por jogar!");
		}

		
		}
	
	}
		 
		
//		 1° comando: FRENTE, 9
//		 2° comando: DIREITA, 5
//		 3° comando : FRENTE, 4
//		 4° comando : DIREITA, 5
//		 5° comando : TRAS, 10
//		 6° comando : ESQUERDA, 4
// 		 7° comando : TRAS, 3
//		 bateria total gasta = 40
		 
		 


		
				
		
			
		
		
		
		
		
		



