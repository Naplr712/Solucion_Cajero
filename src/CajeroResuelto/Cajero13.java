package CajeroResuelto;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Cajero13 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		
		String[] arrcodigo = {"111", "222", "333", "444", "555", "666", "777", "888"};
		String[] arrclave = {"111", "222", "333", "444", "555", "666", "777", "888"};
		
		String[] arrnombre = {"Juan Gomez", "Sergio Cardenas", "Juana Gomez","Felipe Ramos",
	              "Pedro Lopez", "Felipe Torres", "Juan Lopez", "Luis Quinua"};
		int [] arrnota= {1300, 800, 1800, 1000, 1500, 400, 1005, 756};
		int [] arrdolar= {1299,1209, 1329, 1412, 1518, 1128, 1228, 580};
        int m = 0;
        int e = 0;
		int t = 0;
		int c = 0;
		int d = 0;
		int l = 0;
		int b = 0;
       int rg = 0;
       int rl = 0;
       int rm=0;  int rn=0;  int rk=0; int rj=0; int rb=0; int rh =0, ra=0;
		
		String codigo ="";
		String clave ="";
		System.out.println("\n------------------------------------");
		System.out.println("-------------BANCO------------------");
		System.out.println("------------------------------------");
		
		System.out.print("\nIngrese tarjeta: ");
		
		codigo = x.nextLine();
		
		
		int posicion = -1;
		for (int i=0; i< arrcodigo.length; i++) {   
			if(arrcodigo [i].equals(codigo)) {
				posicion = i;
				break;
			
				}
			}
		
		if (posicion == -1) {
			System.out.println("==================");
			System.out.println("Tarjeta no valida");
			System.out.println("==================");
			return;
		}

		System.out.print("Ingrese Clave: ");
		clave = x.nextLine();
		int posicion1 = -1;
		int posicion2 = -1;
		int posicion3 = -1;
		for (int i=0; i< arrclave.length; i++) {
		if(arrclave [i].equals(clave)) {
			posicion1 = i;
			break;
			}
		}
		
		
		if (posicion1 == -1) {
			System.out.println("\n======================================");
			System.out.println("Clave incorrecta, te quedan 2 intentos");
			System.out.println("======================================");
			
			System.out.print("\nIngrese Clave: ");
			clave = x.nextLine();
			
			for (int i=0; i< arrclave.length; i++) {
			if(arrclave [i].equals(clave)) {
				posicion2 = i;
				break;
				}
			}
		
			if (posicion2 == -1) {
				System.out.println("\n======================================");
				System.out.println("Clave incorrecta, te quedan 1 intentos");
				System.out.println("======================================");
				
				System.out.print("\nIngrese Clave: ");
				clave = x.nextLine();
				
				for (int i=0; i< arrclave.length; i++) {
				if(arrclave [i].equals(clave)) {
					posicion3 = i;
					break;
					}
				}
				
				if (posicion3 == -1) {
					System.out.println("\n===================================================");
					System.out.println("Clave incorrecta, << TU TARJETA A SIDO BLOQUEADA >>");
					System.out.println("===================================================");
					return;
				}
				
			}
			
		}
		
		String rp = "S";
		int nr = 0;
		while (rp.equals("S") || rp.equals("s")) {

		
		do {
	
			rg++;
			System.out.println("\n******");
			System.out.println("Bienvenido : "+arrnombre[posicion]);
			System.out.println("1. Depositar Soles ");
			System.out.println("2. Depositar dolares ");
			System.out.println("3. Retirar Soles ");
			System.out.println("4. Retirar dolares ");
			System.out.println("5. Ver Saldo ");
			System.out.println("6. Ver Saldo en dolares ");
			System.out.println("7. Ver movimiento ");
			System.out.println("8. Pago de impuestos y servicios ");
			System.out.println("9. Atencion al cliente");
			System.out.println("*******");
			System.out.print("Elija una opcion: ");
			
			t = x.nextInt();
			
			
			switch(t)
			{
			case 1:
			{
				rl++;
				System.out.println("==================");
				System.out.print("Ingrese cantidad a depositar : S/");
				   int nota = x.nextInt();
				   System.out.println("==================");
				if (posicion1 != -1) {
					System.out.println("Dinero Anterior: S/"+arrnota[posicion1]  );
					arrnota[posicion1]=arrnota[posicion1]+ nota;
					System.out.println("Dinero Disponible : S/"+(arrnota[posicion1]) );
					System.out.println("------------------------------------");
					}
				if (posicion2 != -1) {
					System.out.println("Dinero Anterior: S/"+arrnota[posicion2]  );
					arrnota[posicion2]=arrnota[posicion2]+ nota;
					System.out.println("Dinero Disponible : S/"+(arrnota[posicion2]) );
					System.out.println("------------------------------------");
					}
				if (posicion3 != -1) {
					System.out.println("Dinero Anterior: S/"+arrnota[posicion3]  );
					arrnota[posicion3]=arrnota[posicion3]+ nota;
					System.out.println("Dinero Disponible : S/"+(arrnota[posicion3]) );
					System.out.println("------------------------------------");
					}
				break;
			}
			case 2:
			{
				rm++;
				System.out.println("==================");
				System.out.print("Ingrese cantidad a depositar : $/");
				int nota = x.nextInt();
				   System.out.println("==================");
				if (posicion1 != -1) {
					System.out.println("Dinero Anterior: $/"+arrdolar[posicion1]  );
					arrdolar[posicion1]=arrdolar[posicion1]+ nota;
					System.out.println("Dinero Disponible : $/"+(arrdolar[posicion1]) );
					System.out.println("------------------------------------");
					}
				if (posicion2 != -1) {
					System.out.println("Dinero Anterior: $/"+arrdolar[posicion2]  );
					arrdolar[posicion2]=arrdolar[posicion2]+ nota;
					System.out.println("Dinero Disponible : $/"+(arrdolar[posicion2]) );
					System.out.println("------------------------------------");
					}
				if (posicion3 != -1) {
					System.out.println("Dinero Anterior: $/"+arrdolar[posicion3]  );
					arrdolar[posicion3]=arrdolar[posicion3]+ nota;
					System.out.println("Dinero Disponible : $/"+(arrdolar[posicion3]) );
					System.out.println("------------------------------------");
					}
				break;
			}
				
			case 3:
			{
				rn++;
				System.out.println("\n*******");
				System.out.println("1. Cuenta en Soles ");
				System.out.println("2. Cuenta en dolares ");
				System.out.println("*******");
				System.out.print("Elija una opcion: ");
				   
				c = x.nextInt();
				
				
				switch(c) {
				case (1):
				{
					System.out.println("--------------");
					System.out.println("1. Retirar 20 ");
					System.out.println("2. Retirar 50 ");
					System.out.println("3. Retirar 100 ");
					System.out.println("4. Retirar 200 ");
					System.out.println("5. Retirar 500 ");
					System.out.println("6. Otros montos:  ");
					System.out.println("--------------");
					System.out.print("Elija una opcion: ");
					
					d = x.nextInt();
					
					if (posicion1 != -1) {
						switch(d) 
						{
						case (1):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion1] );
							arrnota[posicion1]=arrnota[posicion1] - 20;
							System.out.println("Nuevo Saldo : S/"+(arrnota[posicion1]) );
							System.out.println("------------------------------------");
							break;
						}
						case (2):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion1] );
							arrnota[posicion1]=arrnota[posicion1] - 50;
							System.out.println("Nuevo Saldo : S/"+(arrnota[posicion1]) );
							System.out.println("------------------------------------");
							break;
						}
						case (3):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion1] );
							arrnota[posicion1]=arrnota[posicion1] - 100;
							System.out.println("Nuevo Saldo : S/"+(arrnota[posicion1] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (4):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion1] );
							arrnota[posicion1]=arrnota[posicion1] - 200;
							System.out.println("Nuevo Saldo : S/"+(arrnota[posicion1] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (5):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion1] );
							arrnota[posicion1]=arrnota[posicion1] - 500;
							System.out.println("Nuevo Saldo : S/"+(arrnota[posicion1] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (6):
						{
							System.out.println("==================");
							System.out.print("Ingrese cantidad a retirar : S/");
							   int nota = x.nextInt();
							   System.out.println("\n==================");
							if (posicion1 != -1) {
								if(nota<=1000) {
									if(nota<=arrnota[posicion1]) {
										System.out.println("Dinero Anterior : S/"+arrnota[posicion1] );
										arrnota[posicion1]=arrnota[posicion1]- nota;
										System.out.println("Nuevo Saldo : S/"+(arrnota[posicion1]- nota) );
										System.out.println("------------------------------------");
										   }
								}
								if(nota>=arrnota[posicion1]) {
									System.out.println("El monto a retirar es mayor al monto disponible");
								}
								if(nota>1000) {
									System.out.println("El monto maximo a retirar es S/1000 ");
								}
							}
							break;
						}
						}
					}
					if (posicion2 != -1) {
						switch(d) 
						{
						case (1):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion2] );
							arrnota[posicion2]=arrnota[posicion2] - 20;
							System.out.println("Nuevo Saldo : S/"+(arrnota[posicion2] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (2):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion2] );
							arrnota[posicion2]=arrnota[posicion2] - 50;
							System.out.println("Nuevo Saldo : S/"+(arrnota[posicion2]) );
							System.out.println("------------------------------------");
							break;
						}
						case (3):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion2] );
							arrnota[posicion2]=arrnota[posicion2] - 100;
							System.out.println("Nuevo Saldo : S/"+(arrnota[posicion2] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (4):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion2] );
							arrnota[posicion2]=arrnota[posicion2] - 200;
							System.out.println("Nuevo Saldo : S/"+(arrnota[posicion2] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (5):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion2] );
							arrnota[posicion2] = arrnota[posicion2] - 500;
							System.out.println("Nuevo Saldo : S/"+(arrnota[posicion2] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (6):
						{
							System.out.println("==================");
							System.out.print("Ingrese cantidad a retirar : S/");
							   int nota = x.nextInt();
							   System.out.println("\n==================");
							if (posicion2 != -1) {
								if(nota<=1000) {
									if(nota<=arrnota[posicion2]) {
										System.out.println("Dinero Anterior : S/"+arrnota[posicion2] );
										arrnota[posicion2]=arrnota[posicion2]- nota;
										System.out.println("Nuevo Saldo : S/"+(arrnota[posicion2]) );
										System.out.println("------------------------------------");
										   }
								}
								if(nota>=arrnota[posicion2]) {
									System.out.println("El monto a retirar es mayor al monto disponible");
								}
								if(nota>1000) {
									System.out.println("El monto maximo a retirar es S/1000 ");
								}
							}
							break;
						}
						}
					}
					if (posicion3 != -1) {
						switch(d) 
						{
						case (1):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion3] );
							arrnota[posicion3] =arrnota[posicion3] - 20;
							System.out.println("Nuevo Saldo : S/"+(arrnota[posicion3]) );
							System.out.println("------------------------------------");
							break;
						}
						case (2):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion3] );
							arrnota[posicion3]=arrnota[posicion3] - 50;
							System.out.println("Nuevo Saldo : S/"+(arrnota[posicion3] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (3):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion3] );
							arrnota[posicion3]=arrnota[posicion3] - 100;
							System.out.println("Nuevo Saldo : S/"+(arrnota[posicion3] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (4):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion3] );
							arrnota[posicion3]=arrnota[posicion3] - 200;
							System.out.println("Nuevo Saldo : S/"+(arrnota[posicion3]) );
							System.out.println("------------------------------------");
							break;
						}
						case (5):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion3] );
							arrnota[posicion3]=arrnota[posicion3] - 500;
							System.out.println("Nuevo Saldo : S/"+(arrnota[posicion3] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (6):
						{
							System.out.println("==================");
							System.out.print("Ingrese cantidad a retirar : S/");
							   int nota = x.nextInt();
							   System.out.println("\n==================");
							if (posicion3 != -1) {
								if(nota<=1000) {
									if(nota<=arrnota[posicion3]) {
										System.out.println("Dinero Anterior : S/"+arrnota[posicion3] );
										arrnota[posicion3]=arrnota[posicion3]- nota;
										System.out.println("Nuevo Saldo : S/"+(arrnota[posicion3]) );
										System.out.println("------------------------------------");
										   }
								}
								if(nota>=arrnota[posicion3]) {
									System.out.println("El monto a retirar es mayor al monto disponible");
								}
								if(nota>1000) {
									System.out.println("El monto maximo a retirar es S/1000 ");
								}
							}
							break;
						}
						}
					}
					break;
				}
				case (2):
				{
					System.out.println("--------------");
					System.out.println("1. Retirar 20 ");
					System.out.println("2. Retirar 50 ");
					System.out.println("3. Retirar 100 ");
					System.out.println("4. Retirar 200 ");
					System.out.println("5. Retirar 500 ");
					System.out.println("6. Otros montos:  ");
					System.out.println("--------------");
					System.out.print("Elija una opcion: ");
					
					d = x.nextInt();
					
					if (posicion1 != -1) {
						switch(d) 
						{
						case (1):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion1] );
							arrdolar[posicion1]=(int) (arrdolar[posicion1] - 20/3.7);
							System.out.println("Nuevo Saldo : $/"+ df.format (arrdolar[posicion1]) );
							System.out.println("------------------------------------");
							break;
						}
						case (2):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion1] );
							arrdolar[posicion1]=(int) (arrdolar[posicion1] - 50/3.7);
							System.out.println("Nuevo Saldo : $/"+ df.format (arrdolar[posicion1] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (3):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion1] );
							arrdolar[posicion1] =(int) (arrdolar[posicion1] - 100/3.7);
							System.out.println("Nuevo Saldo : $/"+ df.format (arrdolar[posicion1] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (4):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion1] );
							arrdolar[posicion1]=(int) (arrdolar[posicion1] - 200/3.7);
							System.out.println("Nuevo Saldo : $/"+ df.format (arrdolar[posicion1]) );
							System.out.println("------------------------------------");
							break;
						}
						case (5):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion1] );
							arrdolar[posicion1]=(int) (arrdolar[posicion1] - 500/3.7);
							System.out.println("Nuevo Saldo : $/"+ df.format (arrdolar[posicion1] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (6):
						{
							System.out.println("==================");
							System.out.print("Ingrese cantidad a retirar : S/");
							   int nota = x.nextInt();
							   System.out.println("\n==================");
							if (posicion1 != -1) {
								if(nota<=1000) {
									if(nota<=arrdolar[posicion1]) {
										System.out.println("Dinero Anterior : $/"+arrdolar[posicion1] );
										arrdolar[posicion1]=(int) (arrdolar[posicion1]- nota/3.7);
										System.out.println("Nuevo Saldo : $/"+ df.format (arrdolar[posicion1]) );
										System.out.println("------------------------------------");
										   }
								}
								if(nota>=arrdolar[posicion1]) {
									System.out.println("El monto a retirar es mayor al monto disponible");
								}
								if(nota>1000) {
									System.out.println("El monto maximo a retirar es S/1000 ");
								}
							}
							break;
						}
						}
					}
					if (posicion2 != -1) {
						switch(d) 
						{
						case (1):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion2] );
							arrdolar[posicion2]=(int) (arrdolar[posicion2] - 20/3.7);
							System.out.println("Nuevo Saldo : $/"+ df.format (arrdolar[posicion2] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (2):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion2] );
							arrdolar[posicion2]=(int) (arrdolar[posicion2] - 50/3.7);
							System.out.println("Nuevo Saldo : $/"+ df.format (arrdolar[posicion2]) );
							System.out.println("------------------------------------");
							break;
						}
						case (3):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion2] );
							arrdolar[posicion2]=(int) (arrdolar[posicion2] - 100/3.7);
							System.out.println("Nuevo Saldo : $/"+ df.format (arrdolar[posicion2] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (4):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion2] );
							arrdolar[posicion2]=(int) (arrdolar[posicion2] - 200/3.7);
							System.out.println("Nuevo Saldo : $/"+ df.format (arrdolar[posicion2] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (5):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion2] );
							arrdolar[posicion2]=(int) (arrdolar[posicion2] - 500/3.7);
							System.out.println("Nuevo Saldo : $/"+ df.format (arrdolar[posicion2] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (6):
						{
							System.out.println("==================");
							System.out.print("Ingrese cantidad a retirar : S/");
							   int nota = x.nextInt();
							   System.out.println("\n==================");
							if (posicion2 != -1) {
								if(nota<=1000) {
									if(nota<=arrdolar[posicion2]) {
										System.out.println("Dinero Anterior : $/"+arrdolar[posicion2] );
										arrdolar[posicion2]=(int) (arrdolar[posicion2]- nota/3.7);
										System.out.println("Nuevo Saldo : $/"+ df.format (arrdolar[posicion2]) );
										System.out.println("------------------------------------");
										   }
								}
								if(nota>=arrdolar[posicion2]) {
									System.out.println("El monto a retirar es mayor al monto disponible");
								}
								if(nota>1000) {
									System.out.println("El monto maximo a retirar es S/1000 ");
								}
							}
							break;
						}
						}
					}
					if (posicion3 != -1) {
						switch(d) 
						{
						case (1):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion3] );
							arrdolar[posicion3]=(int) (arrdolar[posicion3] - 20/3.7);
							System.out.println("Nuevo Saldo : $/"+ df.format (arrdolar[posicion3]) );
							System.out.println("------------------------------------");
							break;
						}
						case (2):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion3] );
							arrdolar[posicion3] = (int) (arrdolar[posicion3] - 50/3.7);
							System.out.println("Nuevo Saldo : $/"+ df.format (arrdolar[posicion3] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (3):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion3] );
							arrdolar[posicion3] = (int) (arrdolar[posicion3] - 100/3.7);
							System.out.println("Nuevo Saldo : $/"+ df.format (arrdolar[posicion3] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (4):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion3] );
							arrdolar[posicion3]=(int) (arrdolar[posicion3] - 200/3.7);
							System.out.println("Nuevo Saldo : $/"+ df.format (arrdolar[posicion3] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (5):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion3] );
							arrdolar[posicion3]=(int) (arrdolar[posicion3] - 500/3.7);
							System.out.println("Nuevo Saldo : $/"+ df.format (arrdolar[posicion3]) );
							System.out.println("------------------------------------");
							break;
						}
						case (6):
						{
							System.out.println("==================");
							System.out.print("Ingrese cantidad a retirar : S/");
							   int nota = x.nextInt();
							   System.out.println("\n==================");
							if (posicion3 != -1) {
								if(nota<=1000) {
									if(nota<=arrdolar[posicion3]) {
										System.out.println("Dinero Anterior : $/"+arrdolar[posicion3] );
										arrdolar[posicion3]=(int) (arrdolar[posicion3]- nota/3.7);
										System.out.println("Nuevo Saldo : $/"+ df.format (arrdolar[posicion3]) );
										System.out.println("------------------------------------");
										   }
								}
								if(nota>=arrdolar[posicion3]) {
									System.out.println("El monto a retirar es mayor al monto disponible");
								}
								if(nota>1000) {
									System.out.println("El monto maximo a retirar es S/1000 ");
								}
							}
							break;
						}
						}
					}
					break;
				}
				}
				break;
			}
			case 4:
			{
				rk++;
				System.out.println("\n*******");
				System.out.println("1. Cuenta en Soles ");
				System.out.println("2. Cuenta en dolares ");
				System.out.println("*******");
				System.out.print("Elija una opcion: ");
				   
				l = x.nextInt();
				
				
				switch(l) {
				case (1):
				{
					System.out.println("--------------");
					System.out.println("1. Retirar 20 ");
					System.out.println("2. Retirar 40 ");
					System.out.println("3. Retirar 60 ");
					System.out.println("4. Retirar 80 ");
					System.out.println("5. Retirar 100 ");
					System.out.println("6. Otros montos:  ");
					System.out.println("--------------");
					System.out.print("Elija una opcion: ");
					
					b = x.nextInt();
					
					if (posicion1 != -1) {
						switch(b)
						{
						case (1):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion1] );
							arrnota[posicion1]=(int) (arrnota[posicion1] - 20*3.7);
							System.out.println("Nuevo Saldo : S/"+ df.format (arrnota[posicion1] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (2):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion1] );
							arrnota[posicion1]=(int) (arrnota[posicion1] - 40*3.7);
							System.out.println("Nuevo Saldo : S/"+ df.format (arrnota[posicion1]) );
							System.out.println("------------------------------------");
							break;
						}
						case (3):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion1] );
							arrnota[posicion1]=(int) (arrnota[posicion1] - 60*3.7);
							System.out.println("Nuevo Saldo : S/"+ df.format (arrnota[posicion1]) );
							System.out.println("------------------------------------");
							break;
						}
						case (4):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion1] );
							arrnota[posicion1]=(int) (arrnota[posicion1] - 80*3.7);
							System.out.println("Nuevo Saldo : S/"+ df.format (arrnota[posicion1]) );
							System.out.println("------------------------------------");
							break;
						}
						case (5):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion1] );
							arrnota[posicion1]=(int) (arrnota[posicion1] - 100*3.7);
							System.out.println("Nuevo Saldo : S/"+ df.format (arrnota[posicion1] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (6):
						{
							System.out.println("==================");
							System.out.print("Ingrese cantidad a retirar : $/");
							   int nota = x.nextInt();
							   System.out.println("\n==================");
							if (posicion1 != -1) {
								if(nota<=400) {
									if(nota<=arrnota[posicion1]) {
										System.out.println("Dinero Anterior : S/"+arrnota[posicion1] );
										arrnota[posicion1]=(int) (arrnota[posicion1]- nota*3.7);
										System.out.println("Nuevo Saldo : S/"+ df.format (arrnota[posicion1]) );
										System.out.println("------------------------------------");
										   }
								}
								if(nota>=arrnota[posicion1]) {
									System.out.println("El monto a retirar es mayor al monto disponible");
								}
								if(nota>400) {
									System.out.println("El monto maximo a retirar es $/400 ");
								}
							}
							break;
						}
						}
					}
					if (posicion2 != -1) {
						switch(b)
						{
						case (1):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion2] );
							arrnota[posicion2]=(int) (arrnota[posicion2] - 20*3.7);
							System.out.println("Nuevo Saldo : S/"+ df.format (arrnota[posicion2] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (2):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion2] );
							arrnota[posicion2]=(int) (arrnota[posicion2] - 40*3.7);
							System.out.println("Nuevo Saldo : S/"+ df.format (arrnota[posicion2] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (3):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion2] );
							arrnota[posicion2] =(int) (arrnota[posicion2] - 60*3.7);
							System.out.println("Nuevo Saldo : S/"+ df.format (arrnota[posicion2] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (4):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion2] );
							arrnota[posicion2]=(int) (arrnota[posicion2] - 80*3.7);
							System.out.println("Nuevo Saldo : S/"+ df.format (arrnota[posicion2] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (5):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion2] );
							arrnota[posicion2] =(int) (arrnota[posicion2] - 100*3.7);
							System.out.println("Nuevo Saldo : S/"+ df.format (arrnota[posicion2] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (6):
						{
							System.out.println("==================");
							System.out.print("Ingrese cantidad a retirar : $/");
							  int nota = x.nextInt();
							   System.out.println("\n==================");
							if (posicion2 != -1) {
								if(nota<=400) {
									if(nota<=arrnota[posicion2]) {
										System.out.println("Dinero Anterior : S/"+arrnota[posicion2] );
										arrnota[posicion2]=(int) (arrnota[posicion2]- nota*3.7);
										System.out.println("Nuevo Saldo : S/"+ df.format (arrnota[posicion2]) );
										System.out.println("------------------------------------");
										   }
								}
								if(nota>=arrnota[posicion2]) {
									System.out.println("El monto a retirar es mayor al monto disponible");
								}
								if(nota>400) {
									System.out.println("El monto maximo a retirar es $/400 ");
								}
							}
							break;
						}
						}
					}
					if (posicion3 != -1) {
						switch(b)
						{
						case (1):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion3] );
							arrnota[posicion3]=(int) (arrnota[posicion3] - 20*3.7);
							System.out.println("Nuevo Saldo : S/"+ df.format (arrnota[posicion3] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (2):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion3] );
							arrnota[posicion3] =(int) (arrnota[posicion3] - 40*3.7);
							System.out.println("Nuevo Saldo : S/"+ df.format (arrnota[posicion3] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (3):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion3] );
							arrnota[posicion3]=(int) (arrnota[posicion3] - 60*3.7);
							System.out.println("Nuevo Saldo : S/"+ df.format (arrnota[posicion3] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (4):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion3] );
							arrnota[posicion3]=(int) (arrnota[posicion3] - 80*3.7);
							System.out.println("Nuevo Saldo : S/"+ df.format (arrnota[posicion3] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (5):
						{
							System.out.println("Dinero Anterior : S/"+arrnota[posicion3] );
							arrnota[posicion3]=(int) (arrnota[posicion3] - 100*3.7);
							System.out.println("Nuevo Saldo : S/"+ df.format (arrnota[posicion3]) );
							System.out.println("------------------------------------");
							break;
						}
						case (6):
						{
							System.out.println("==================");
							System.out.print("Ingrese cantidad a retirar : $/");
							   int nota = x.nextInt();
							   System.out.println("\n==================");
							if (posicion3 != -1) {
								if(nota<=400) {
									if(nota<=arrnota[posicion3]) {
										System.out.println("Dinero Anterior : S/"+arrnota[posicion3] );
										arrnota[posicion3]=(int) (arrnota[posicion3]- nota*3.7);
										System.out.println("Nuevo Saldo : S/"+ df.format (arrnota[posicion3]) );
										System.out.println("------------------------------------");
										   }
								}
								if(nota>=arrnota[posicion3]) {
									System.out.println("El monto a retirar es mayor al monto disponible");
								}
								if(nota>400) {
									System.out.println("El monto maximo a retirar es $/400 ");
								}
							}
							break;
						}
						}
					}
					break;
				}
				case (2):
				{
					System.out.println("--------------");
					System.out.println("1. Retirar 20 ");
					System.out.println("2. Retirar 40 ");
					System.out.println("3. Retirar 60 ");
					System.out.println("4. Retirar 80 ");
					System.out.println("5. Retirar 100 ");
					System.out.println("6. Otros montos:  ");
					System.out.println("--------------");
					System.out.print("Elija una opcion: ");
					
					b = x.nextInt();
					
					if (posicion1 != -1) {
						switch(b)
						{
						case (1):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion1] );
							arrdolar[posicion1] =arrdolar[posicion1] - 20;
							System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion1] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (2):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion1] );
							arrdolar[posicion1]=arrdolar[posicion1] - 40;
							System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion1] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (3):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion1] );
							arrdolar[posicion1] =arrdolar[posicion1] - 60;
							System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion1] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (4):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion1] );
							arrdolar[posicion1]=arrdolar[posicion1] - 80;
							System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion1] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (5):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion1] );
							arrdolar[posicion1] =arrdolar[posicion1] - 100;
							System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion1]) );
							System.out.println("------------------------------------");
							break;
						}
						case (6):
						{
							System.out.println("==================");
							System.out.print("Ingrese cantidad a retirar : $/");
							   int nota = x.nextInt();
							   System.out.println("\n==================");
							if (posicion1 != -1) {
								if(nota<=400) {
									if(nota<=arrdolar[posicion1]) {
										System.out.println("Dinero Anterior : $/"+arrdolar[posicion1] );
										arrdolar[posicion1]=arrdolar[posicion1]- nota;
										System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion1]) );
										System.out.println("------------------------------------");
										   }
								}
								if(nota>=arrdolar[posicion1]) {
									System.out.println("El monto a retirar es mayor al monto disponible");
								}
								if(nota>400) {
									System.out.println("El monto maximo a retirar es $/400 ");
								}
							}
							break;
						}
						}
					}
					if (posicion2 != -1) {
						switch(b)
						{
						case (1):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion2] );
							arrdolar[posicion2] =arrdolar[posicion2] - 20;
							System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion2] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (2):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion2] );
							arrdolar[posicion2]=arrdolar[posicion2] - 40;
							System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion2]) );
							System.out.println("------------------------------------");
							break;
						}
						case (3):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion2] );
							arrdolar[posicion2]=arrdolar[posicion2] - 60;
							System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion2] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (4):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion2] );
							arrdolar[posicion2]=arrdolar[posicion2] - 80;
							System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion2] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (5):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion2] );
							arrdolar[posicion2]=arrdolar[posicion2] - 100;
							System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion2] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (6):
						{
							System.out.println("==================");
							System.out.print("Ingrese cantidad a retirar : $/");
							   int nota = x.nextInt();
							   System.out.println("\n==================");
							if (posicion2 != -1) {
								if(nota<=400) {
									if(nota<=arrdolar[posicion2]) {
										System.out.println("Dinero Anterior : $/"+arrdolar[posicion2] );
										arrdolar[posicion2]=arrdolar[posicion2]- nota;
										System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion2]) );
										System.out.println("------------------------------------");
										   }
								}
								if(nota>=arrdolar[posicion2]) {
									System.out.println("El monto a retirar es mayor al monto disponible");
								}
								if(nota>400) {
									System.out.println("El monto maximo a retirar es $/400 ");
								}
							}
							break;
						}
						}
					}
					if (posicion3 != -1) {
						switch(b)
						{
						case (1):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion3] );
							arrdolar[posicion3]=arrdolar[posicion3] - 20;
							System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion3] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (2):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion3] );
							arrdolar[posicion3]=arrdolar[posicion3] - 40;
							System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion3] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (3):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion3] );
							arrdolar[posicion3] =arrdolar[posicion3] - 60;
							System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion3]) );
							System.out.println("------------------------------------");
							break;
						}
						case (4):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion3] );
							arrdolar[posicion3]=arrdolar[posicion3] - 80;
							System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion3] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (5):
						{
							System.out.println("Dinero Anterior : $/"+arrdolar[posicion3] );
							arrdolar[posicion3]=arrdolar[posicion3] - 100;
							System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion3] ) );
							System.out.println("------------------------------------");
							break;
						}
						case (6):
						{
							System.out.println("==================");
							System.out.print("Ingrese cantidad a retirar : $/");
							   int nota = x.nextInt();
							   System.out.println("\n==================");
							if (posicion3 != -1) {
								if(nota<=400) {
									if(nota<=arrdolar[posicion3]) {
										System.out.println("Dinero Anterior : $/"+arrdolar[posicion3] );
										arrdolar[posicion3]=arrdolar[posicion3]- nota;
										System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion3]) );
										System.out.println("------------------------------------");
										   }
								}
								if(nota>=arrdolar[posicion3]) {
									System.out.println("El monto a retirar es mayor al monto disponible");
								}
								if(nota>400) {
									System.out.println("El monto maximo a retirar es $/400 ");
								}
							}
							break;
						}
						}
					}
					break;
				}
				}
				break;
			}
			case 5:
			{
				rj++;
				if (posicion1 != -1) {
					System.out.println("===========================");
					System.out.println("Dinero Disponible: S/"+ arrnota[posicion1] );
					}
				if (posicion2 != -1) {
					System.out.println("===========================");
					System.out.println("Dinero Disponible: S/"+ arrnota[posicion2] );
					}
				if (posicion3 != -1) {
					System.out.println("===========================");
					System.out.println("Dinero Disponible: S/"+ arrnota[posicion3] );
					}
				break;
				
			}
			case 6:
			{
				rb++;
				if (posicion1 != -1) {
					System.out.println("===========================");
					System.out.println("Dinero Disponible: $/"+ arrdolar[posicion1] );
					}
				if (posicion2 != -1) {
					System.out.println("===========================");
					System.out.println("Dinero Disponible: $/"+ arrdolar[posicion2] );
					}
				if (posicion3 != -1) {
					System.out.println("===========================");
					System.out.println("Dinero Disponible: $/"+ arrdolar[posicion3] );
					}
				break;
				
			}
			case 7:{
				System.out.println("Hubo " + (rg - 1) + "  movimientos en su tarjeta");
				System.out.println("Hubo " + (rl) + "  movimientos de Depositar Soles");
				System.out.println("Hubo " + (rm) + "  movimientos de Depositar Dolares");
				System.out.println("Hubo " + (rn) + "  movimientos de Retirar Soles");
				System.out.println("Hubo " + (rk) + "  movimientos de Retirar Dolares");
				System.out.println("Hubo " + (rj) + "  movimientos de Ver Saldo");
				System.out.println("Hubo " + (rb) + "  movimientos de Ver Saldo en Dolares");
			}
				
				
			break;
			
			case 8:
			{
				ra++;
				System.out.println("\n*******");
				
				System.out.println("1.Pago en soles---> S/400 ");
				System.out.println("2.Pago en Dolares-> $/108");
				System.out.print("Elija una opcion: ");
				d = x.nextInt();
				if (posicion1 != -1) 
				switch(d) 
				{
				case (1):
				{
					
					System.out.println("Dinero Anterior : S/"+arrnota[posicion1] );
					arrnota[posicion1]=arrnota[posicion1] - 400;
					System.out.println("Nuevo Saldo : S/"+(arrnota[posicion1]) );
					System.out.println("------------------------------------");
					break;
					}
				case (2):
				{
					System.out.println("Dinero Anterior : $/"+arrdolar[posicion1] );
					arrdolar[posicion1]=(int) (arrdolar[posicion1] - 108);
					System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion1]) );
					System.out.println("------------------------------------");
					break;
						
			}
				}
				
				if (posicion2 != -1) {
					switch(d) 
					{
					case (1):
					{
						System.out.println("Dinero Anterior : S/"+arrnota[posicion2] );
						arrnota[posicion2]=arrnota[posicion2] - 400;
						System.out.println("Nuevo Saldo : S/"+(arrnota[posicion2]) );
						System.out.println("------------------------------------");
						break;
					}
					case (2):
					{
						System.out.println("Dinero Anterior : $/"+arrdolar[posicion2] );
						arrdolar[posicion2]=(int) (arrdolar[posicion2] - 108*3.7);
						System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion2]) );
						System.out.println("------------------------------------");
						break;
					}
					}
					
				}
				
			
				if (posicion3 != -1) {
					switch(d)
					{
					case (1):
					{
						System.out.println("Dinero Anterior : S/"+arrnota[posicion3] );
					    arrnota[posicion3]=arrnota[posicion3] - 400;
					    System.out.println("Nuevo Saldo : S/"+(arrnota[posicion3]) );
					    System.out.println("------------------------------------");
					    break;
					}
					case (2):
					{
						System.out.println("Dinero Anterior : $/"+arrdolar[posicion3] );
					    arrdolar[posicion3]=(int) (arrdolar[posicion3] - 108*3.7);
					    System.out.println("Nuevo Saldo : $/"+(arrdolar[posicion3]) );
					    System.out.println("------------------------------------");
					    break;
						}
					}
					}
				}break;
	
			case 9:
			{
				ra++;
				System.out.println("\n************************************************");
				
				System.out.println("Telefono fijo:...: (01)5986525   ");
				System.out.println("Celular..........: 986589652");
				System.out.println("whatsapp:........: 985621442");
				System.out.println("Pagina web:......: www.bankosenati.com/atencionalcliente ");
			
			}
			break;
			
		

			
				
			default:
			{
				System.out.println("Opcion no disponible");
				return;
			}
			
			}
			
			x.nextLine();
	        
			System.out.print("\nContinua? [S][N] : ");
			rp = x.nextLine();	
			if (rp.equals("N") || rp.equals("n")) {
				System.out.println("\n<< GRACIAS POR SU TIEMPO >> ");
				return;
				
			}
		
			
		} while (t!=9);
			System.out.println("\n<< GRACIAS POR SU TIEMPO >> ");
			
			
			}
	}

}
