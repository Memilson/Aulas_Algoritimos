/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int soma = 0;
	    for(int i = 25; i <= 200; i++){
	        if (i % 2 == 0 ){
	            soma += 1;
	        }
	    }
		 System.out.println("A soma dos números pares entre 25 e 200 é: " + soma);
	}
}
